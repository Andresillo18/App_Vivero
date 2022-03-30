package AccesoDatos;

import Entidades.Categoria;
import Entidades.ClasPlanta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 30-3-22
 *
 * @author Andrés Villalobos
 */
public class ADClasPlanta {

    //VARIABLE GLOBAL
    private Connection _conexion; // Para conectarse a la BD

    //ATRIBUTOS
    private String _mensaje;

    //PROPIEDADES
    public String getMensaje() {
        return _mensaje;
    }

    public ADClasPlanta() throws Exception {
        try {
            String url = Config.config.getConectionString(); // Se obtiene la cadena de conexión

            _conexion = DriverManager.getConnection(url); // Se usa el driver para conectar con la BD
            _mensaje = "";
        } catch (Exception e) {
            throw e;
        }
    }

// <editor-fold desc="MÉTODOS" defaultstate="collapsed">    
    
    // Método1
    public int Insertar(ClasPlanta clasPlanta1) throws Exception {
        int cod_clasificacion = -1; // el -1 significa que no existe, por ahora
        String sentencia = "INSERT INTO Clasificacion_Planta (COD_CLASIFICACION,COD_PLANTA, COD_CATEGORIA) VALUES (?,?, ?)";

        try {
            PreparedStatement PS = _conexion.prepareStatement(sentencia, PreparedStatement.RETURN_GENERATED_KEYS); // Envía la sentencia según la entidad y regresa las llaves auto generadas

            //Se registra los argumentos de la consulta
            PS.setInt(1, clasPlanta1.getCod_clasificacion());
            PS.setInt(2, clasPlanta1.getCod_planta());
            PS.setInt(3, clasPlanta1.getCod_categoria());
            

            PS.execute(); // Se ejecuta la sentencia- retorna true o false 

            ResultSet rs = PS.getGeneratedKeys(); // El ResultSet es de una celda porque obtiene los identity de un INSERT

            if (rs != null && rs.next()) {
                cod_clasificacion = rs.getInt(1); //busca el unico registro de la unica columna
                _mensaje = "Clasificación ingresado satisfactoriamente";
            }

        } catch (Exception e) {
        } finally {
            _conexion.close(); // Siempre debe cerrar conexiones
        }
        return cod_clasificacion;
    }

    //Método2
    public int Modificar(Categoria categoria) throws Exception {
        int result = 0; // No ha obtenido ningún resultado        
        String sentencia = "UPDATE Categoria SET NOMBRE_CATEGORIA = ?, DESCRIPCION =? WHERE COD_CATEGORIA = ? ";

        try {
            PreparedStatement ps = _conexion.prepareStatement(sentencia);

            ps.setString(1, categoria.getNombre_categoria());
            ps.setString(2, categoria.getDescripcion());
            ps.setInt(3, categoria.getCod_categoria());

            result = ps.executeUpdate();

            if (result > 0) { // devuelve las fulas afectadas y si hubo mas de una avisa
                _mensaje = "Registro modificado!";
            }
        } catch (Exception e) {
            throw e;
        } finally {
            _conexion.close(); // Se cerrará siempre que se manipule la BD
        }

        return result;
    }

    //Método3
    public int Eliminar(Categoria categoria) throws Exception {
        int result = 0;
        String sentencia = "DELETE Categoria WHERE COD_CATEGORIA = ?";

        try {
            PreparedStatement ps = _conexion.prepareStatement(sentencia);

            ps.setInt(1, categoria.getCod_categoria());

            result = ps.executeUpdate();

            if (result > 0) {
                _mensaje = "Registro eliminado!";
            }
        } catch (Exception e) {
            throw e;
        } finally {
            _conexion.close();
        }

        return result;
    }

    //Método4
    public ResultSet ListaRegistros(String condicion, String orden) throws Exception {
        ResultSet rs = null; // Tendrá la tabla

        try {
            Statement Stm = _conexion.createStatement(); // Se usa un statement ya que lo que se enviará no tendrá un parámetro de entrada
            String sentencia = "SELECT COD_CATEGORIA, NOMBRE_CATEGORIA, DESCRIPCION FROM Categoria";

            if (!condicion.equals("")) { // Si se envío una condición
                sentencia = String.format("%s WHERE %s", sentencia, condicion); // Interpolación de Strings 
            }

            if (!orden.equals("")) {
                sentencia = String.format("%s ORDER BY %s", sentencia, orden);
            }

            rs = Stm.executeQuery(sentencia);

        } catch (Exception e) {
            throw e;
        } finally {
            _conexion.close();
        }

        return rs;
    }

    //Método5
    // Devuelve una lista con objetos Categoria
    public List<Categoria> ListaRegistros(String condicion) throws Exception {
        List<Categoria> list1 = new ArrayList();
        ResultSet rs = null;

        try {
            Statement Stm = _conexion.createStatement(); // Siempre se debe estable esta conexión con la BD

            String sentencia = "SELECT COD_CATEGORIA, NOMBRE_CATEGORIA, DESCRIPCION FROM Categoria";

            if (!condicion.equals("")) { // Si se envío una condición
                sentencia = String.format("%s WHERE %s", sentencia, condicion); // Interpolación de Strings 
            }

            rs = Stm.executeQuery(sentencia);

            // Se usa un bucle siempre para saber lo que tiene un ResultSet
            while (rs.next()) { // Esto solo leerá el único registro que tiene
                list1.add(new Categoria(rs.getInt(1), rs.getString(2), rs.getString(3))); // Solo le envía un objeto
            }
        } catch (Exception e) {
            throw e;
        } finally {
            _conexion.close();
        }

        return list1;
    }

    //Método6
    public Categoria ObtenerRegistro(String condicion) throws Exception {
        Categoria categoria1 = new Categoria(); // este es el objeto que devolverá 
        ResultSet rs = null;

        try {
            String sentencia = "SELECT COD_CATEGORIA, NOMBRE_CATEGORIA, DESCRIPCION FROM Categoria";
            Statement Stm = _conexion.createStatement(); // Se usa create ya que no envía parametros a la sentencia

            if (!condicion.equals("")) {
                sentencia = String.format("%s WHERE %s", sentencia, condicion); // Interpolación de Strings 
            }

            rs = Stm.executeQuery(sentencia);

            // Lo que devuelve la columna se establece a los atributos de su entidad (se usan las propiedades de encapsulamiento)
            if (rs.next()) { // Solo devolverá un registro
                categoria1.setCod_categoria(rs.getInt(1));
                categoria1.setNombre_categoria(rs.getString(2));
                categoria1.setDescripcion(rs.getString(3));
                categoria1.setExiste(true);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            _conexion.close();
        }

        return categoria1;
    }
// </editor-fold>

}

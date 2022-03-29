package Config;

/**
 *28-09-22
 * @author Andrés Villalobos
 */
public class config {
    public static String get;
    
    // el throws hace posible que el metodo mande excepciones
    public static String getConectionString() throws ClassNotFoundException{
        //Registrar el driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //En versiones más nuevas de JDK no es necesario el Class.forName
        return "jdbc:sqlserver://localhost;databaseName=BD_VIVERO;user=sa;password=sa";
    }
}

package project.LiquibaseTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.database.DatabaseFactory;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.LiquibaseException;
import liquibase.resource.ClassLoaderResourceAccessor;


public class App 
{
    public static void main( String[] args ) throws SQLException, LiquibaseException
    {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","root");
        Database db = DatabaseFactory.getInstance().findCorrectDatabaseImplementation(new JdbcConnection(con));
        Liquibase lb = new Liquibase("db.changelog.xml", new ClassLoaderResourceAccessor(), db);
        lb.update("");
        
    }
}

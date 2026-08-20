package connection;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DatabaseConnection {


    public Connection connectToPostgres(){
        try{
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/dbdump",
                    "tahianafenosoa",
                    "Tahiana09"
            );

            return con;
        }catch(SQLException e){
            System.out.println("Erro is : " + e.getMessage());
            throw new RuntimeException("Error occured in db connection");
        }
    }
}

import java.sql.SQLException;

public class CreateTable {
    public static void main(String[] args){
        try(Connection c = mySQLConnection.getConnection()){
            Statement statement = c.createStatement();
            String query = "CREATE TABLE users (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY,"+
                    "name VARCHAR(50) NOT NULL, " +
                    "email VARCHAR(100) NOT NULL)";
            statement.execute(query);
            System.out.println("Table created successfully. ");
        }catch(SQLException e ){
            e.printStackTrace();
        }
    }
}

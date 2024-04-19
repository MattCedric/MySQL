import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {

    public static void main(String[] args){
        try(Connection c = mySQLConnection.getConnection();
            PreparedStatement statement = c.prepareStatement("INSERT INTO users (name,email) VALUES (?,?)")){
            String name = "Matt Ybanez";
            String email = "matt@cit.edu";
            statement.setString(1, name);
            statement.setString(2, email);
            statement.executeUpdate();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}

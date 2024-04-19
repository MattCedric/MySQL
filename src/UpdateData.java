import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
    public static void main(String args){
        try(Connection c = mySQLConnection.getConnection();
            PreparedStatement statement = c.prepareStatement("Update users SET name =? WHERE id=?")){
            String name = "Matt";
            int id = 2;
            statement.setString(1, name);
            statement.setInt(2, id);
            int rows = statement.executeUpdate();
            System.out.println("Rows updated: " + rows);

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}

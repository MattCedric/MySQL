import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {

    public static void main(String[] args){
        try(Connection c = mySQLConnection.getConnection();
            PreparedStatement statement = c.prepareStatement("DELETE FROM users WHERE id=? RETURNING *")){
            int id = 1;
            statement.setInt(1, id);
            int rows = statement.executeUpdate();
            ResultSet res = statement.getResultSet();
            if(res.next()){
                System.out.println("Name: " + res.getString("name"));
                System.out.println("Email: " +res.getString("email"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}

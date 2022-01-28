import java.awt.dnd.DragGestureEvent;
import java.sql.*;

/**
 * @author - LeeN
 * PROJECT NAME: JDBCTESTS
 * CREATED ON: Friday 28 January 2022 - 6:05 AM
 */
public class BetterSQLCode {

    private static final String db_url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String db_user = "postgres";
    private static final String db_password = "733securex";




    public static void main(String[] args) {

        User user = new User(23, "Lee", "Ndegwa", 29683413, "778", "kdjkf");
        BetterSQLCode code = new BetterSQLCode();

        code.create_users_schema();
        code.register_users(user);
        code.get_users();

    }


    public void create_users_schema() {

        String create_users_schema = "CREATE TABLE IF NOT EXISTS users_fix" +
                "(id INTEGER not null," +
                "first_name VARCHAR(255) not null," +
                "last_name VARCHAR(255) not null," +
                "national_id INTEGER not null," +
                "phone_number VARCHAR(255)," +
                "email VARCHAR(255) NOT NULL)";

        try (Connection conn = DriverManager.getConnection(db_url, db_user, db_password)) {
            conn.createStatement().executeUpdate(create_users_schema);
        } catch (SQLException e) {
            System.out.println(e.getNextException());
        }
    }


    public void register_users(User user) {

        String sql_users_registry = "INSERT INTO users_fix VALUES(?,?,?,?,?,?)";

        try (Connection conn = DriverManager.getConnection(db_url, db_user, db_password)) {

            PreparedStatement ps = conn.prepareStatement(sql_users_registry);

            ps.setInt(1, user.getId());
            ps.setString(2, user.getFirst_name());
            ps.setString(3, user.getLast_name());
            ps.setInt(4, user.getNational_id());
            ps.setString(5, user.getPhone_number());
            ps.setString(6, user.getEmail_address());
            ps.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void get_users(){
        String sql_get_users = "SELECT * FROM users_fix";

        try(Connection conn = DriverManager.getConnection(db_url, db_user, db_password)){
            PreparedStatement ps = conn.prepareStatement(sql_get_users);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2).concat(" ").concat(rs.getString(3));

                System.out.println(id + " " + name);
            }


        }catch (SQLException e){
            e.printStackTrace();
        }
    }


}

import java.sql.*;

/**
 * @author - LeeN
 * PROJECT NAME: JDBCTESTS
 * CREATED ON: Wednesday 26 January 2022 - 9:14 AM
 */
public class JDBC1 {

    static final String db_url = "jdbc:postgresql://localhost:5432/postgres";
    static final String db_user = "postgres";
    static final String db_password = "733securex";


    public static void main(String[] args){

        try(Connection conn	=	DriverManager.getConnection(db_url, db_user, db_password)){

            String sql_create_users_table = "CREATE TABLE if not exists users " +
                                                "(id INTEGER not null, " +
                                                "firstname VARCHAR(255)," +
                                                "lastname VARCHAR(255) )";

            conn.createStatement().executeUpdate(sql_create_users_table);

            var sql_insert_users = "INSERT INTO users VALUES(10, 'Lee N', 'WM')";
            System.out.println(conn.prepareStatement(sql_insert_users).executeUpdate());

            var	sql_get_users	=	"SELECT	*	FROM	users";

            var ps = conn.prepareStatement(sql_get_users);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                String name = rs.getString("firstname");
                String lastN = rs.getString("lastname");

                System.out.println("My Name is: " + name + " " + lastN);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }



}



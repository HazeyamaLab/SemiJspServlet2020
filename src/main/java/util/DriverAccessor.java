package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverAccessor {
    private final static String DRIVER_NAME = "com.mysql.jdbc.Driver";

    //自分のmysqlのユーザー名
    private final static String USER_NAME = "root";
    //自分のmysqlのパスワード
    private final static String PASSWORD = "root";
    public Connection createConnection() {
        String DRIVER_URL = System.getenv("DRIVER_URL");
        if(DRIVER_URL != null){
            System.out.println("リモート");
        }else{
            DRIVER_URL = "jdbc:mysql://localhost:9203/semi?useUnicode=true&characterEncoding=UTF-8&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=GMT%2B9:00&rewriteBatchedStatements=true";
            System.out.println("ローカル");
        }
        try {
            Class.forName(DRIVER_NAME);
            Connection con = DriverManager.getConnection(DRIVER_URL, USER_NAME, PASSWORD);
            return con;
        } catch (ClassNotFoundException e) {
            System.out.println("Can't Find JDBC Driver.\n");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void closeConnection(Connection con) {
        try {
            con.close();
        } catch (Exception ex) {
        }
    }
}
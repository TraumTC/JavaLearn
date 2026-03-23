package JavaWeb.day06;

import java.sql.*;

public class JDBCtest {
    static void main(String[] args) {
        String URL="jdbc:mysql://localhost:3306/test";
        String username="root";
        String password="123456";

        Connection conn=null;
        try {
            conn= DriverManager.getConnection(URL,username,password);
            System.out.println("连接成功");
            System.out.println(conn);
            String sql="insert into user(id,name) values(2,'小汤')";
            Statement stmt=conn.createStatement();
            boolean execute= stmt.execute(sql);
            System.out.println(execute);

            String sql1="select * from user";
            ResultSet rs=stmt.executeQuery(sql1);
            while(rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                System.out.print(id);
                System.out.print(' ' + name + '\n');
            }
        } catch (SQLException e) {
            System.out.println("数据库连接失败，原因为：");
            e.printStackTrace();
        }
    }
}

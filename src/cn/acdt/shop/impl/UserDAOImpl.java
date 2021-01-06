package cn.acdt.shop.impl;

import cn.acdt.shop.DAO.UserDAO;
import cn.acdt.shop.bean.User;
import java.sql.*;

/**
 * @Package: cn.acdt.shop.impl
 * @ClassName: UserDAOImpl
 * @Author: jojo
 * @Data: 2020/12/30 18:03
 * @Description :
 */

public class UserDAOImpl implements UserDAO {
    protected static final String CLASS_NAME = "com.mysql.cj.jdbc.Driver";
    protected static final String URL = "jdbc:mysql://localhost:3308/fruitshop?serverTimezone=UTC";
    protected static final String SQL_NAME = "root";
    protected static final String SQL_PWD = "root";
//1.导jar包,(mysql-connector-java-版本号.jar)

    //用户注册方法
/*    @Override
    public boolean insert(user user) throws Exception {
        Connection conn=null;
        try {
            Class.forName(CLASS_NAME);
            conn= DriverManager.getConnection(URL, SQL_NAME, SQL_PWD);
            String sql ="insret into user(userName,userPwd) values(?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(1, user.getPswd());

            ps.execute();
            conn.close();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }
*/
    //用户登录验证方法
    @Override
    public boolean selectUser(User user)throws Exception {
        Connection conn = null;
        try {
            Class.forName(CLASS_NAME);
            conn = DriverManager.getConnection(URL, SQL_NAME, SQL_PWD);
            String sql = "select * from user where userName=? and userPwd=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, user.getName());
            pst.setString(2, user.getPswd());
            pst.execute();
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                conn.close();
                return true;
            } else {
                conn.close();
                return false;
            }
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }finally {
            if(conn!=null) {
                conn.close();
            }
        }
    }
}
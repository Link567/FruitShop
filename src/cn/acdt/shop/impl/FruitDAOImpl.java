package cn.acdt.shop.impl;

import cn.acdt.shop.DAO.FruitDAO;
import cn.acdt.shop.bean.Fruit;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FruitDAOImpl implements FruitDAO {
    protected static final String CLASS_NAME = "com.mysql.cj.jdbc.Driver";
    protected static final String URL = "jdbc:mysql://localhost:3308/fruitshop?serverTimezone=UTC";
    protected static final String SQL_NAME = "root";
    protected static final String SQL_PWD = "root";

    @Override
    public boolean addFruit(Fruit fruit)throws Exception {
        Connection conn = null;
        try {
            Class.forName(CLASS_NAME);
            conn = DriverManager.getConnection(URL, SQL_NAME, SQL_PWD);
            String sql = "insert into fruit values(?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, fruit.getName());
            pst.setDouble(2, fruit.getNum());
            pst.setDouble(3, fruit.getPrice());
            pst.setDouble(4, fruit.getDiscount());
//            pst.setDate(5, fruit.getTime());
pst.setDate(5, new Date(System.currentTimeMillis()));

            pst.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }finally {
            if(conn!=null) {
                conn.close();
            }
        }
    }

    @Override
    public boolean delete(String deletename)throws Exception {
        Connection conn = null;
        try {
            Class.forName(CLASS_NAME);
            conn = DriverManager.getConnection(URL, SQL_NAME, SQL_PWD);
            String sql = "delete from fruit where name=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, deletename);

            pst.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }finally {
            if(conn!=null) {
                conn.close();
            }
        }
    }
}

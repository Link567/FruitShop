package cn.acdt.shop.DAO;

import cn.acdt.shop.bean.Fruit;

/**
 * @Package: cn.acdt.shop.DAO
 * @ClassName: FruitDAO
 * @Author: jojo
 * @Data: 2021/1/6 8:32
 * @Description : 水果信息接口
 */
public interface FruitDAO {
    boolean addFruit(Fruit fruit)throws Exception ;
    boolean delete(String deletename)throws Exception;
}

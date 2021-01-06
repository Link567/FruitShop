package cn.acdt.shop.DAO;

import cn.acdt.shop.bean.User;

/**
 * @Package: cn.acdt.shop.DAO
 * @ClassName: UserDAO
 * @Author: jojo
 * @Data: 2020/12/30 18:01
 * @Description :
 */
public interface UserDAO {
//    boolean insert(user user)throws Exception;
    boolean selectUser(User user)throws Exception;
}

package cn.acdt.shop.bean;

/**
 * @Package: cn.acdt.shop.bean
 * @ClassName: User
 * @Author: jojo
 * @Data: 2021/1/5 9:36
 * @Description :
 */
public class User {
    private String name;
    private String pswd;

    //get方法
    public String getName() {
        return name;
    }

    public String getPswd() {
        return pswd;
    }

    //set方法
    public void setName(String name) {
        this.name = name;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }
}


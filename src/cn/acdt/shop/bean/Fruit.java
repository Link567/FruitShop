package cn.acdt.shop.bean;

import java.sql.Date;

/**
 * @Package: cn.acdt.shop.bean
 * @ClassName: Fruit
 * @Author: jojo
 * @Data: 2021/1/3 14:31
 * @Description : 水果bean
 */
public class Fruit {
private String name;
private double num;
private double price;
private double discount;
private Date time;

//get方法
    public String getName() {
        return name;
    }

    public double getNum() {
        return num;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public Date getTime() {
        return time;
    }

    //set方法

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}

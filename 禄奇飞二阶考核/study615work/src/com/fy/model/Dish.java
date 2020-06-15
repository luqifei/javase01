package com.fy.model;
/**
 *`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '菜品编号',
  `dishname` varchar(255) DEFAULT NULL COMMENT '菜名',
  `price` double DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
 * @author lqf
 * @Date   2020年6月15日
 */
public class Dish {
	private int id;
	private String dishname;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDishname() {
		return dishname;
	}
	public void setDishname(String dishname) {
		this.dishname = dishname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Dish(int id, String dishname, double price) {
		this.id = id;
		this.dishname = dishname;
		this.price = price;
	}
	public Dish() {
	}
	@Override
	public String toString() {
		return "Dish [id=" + id + ", dishname=" + dishname + ", price=" + price + "]";
	}
	
}

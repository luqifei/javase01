package com.fy.model;
/**
 * CREATE TABLE `order` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订购编号',
  `ordername` varchar(255) DEFAULT NULL COMMENT '订购套餐名',
  `orderprice` double DEFAULT NULL COMMENT '价格',
  `orderdish` varchar(255) DEFAULT NULL COMMENT '菜名',
  `seatNum` int(11) DEFAULT NULL COMMENT '座位数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
 * @author lqf
 * @Date   2020年6月15日
 */
public class Order {
	private int id;
	private String ordername;
	private double orderprice;
	private String orderdish;
	private int seatNum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public double getOrderprice() {
		return orderprice;
	}
	public void setOrderprice(double orderprice) {
		this.orderprice = orderprice;
	}
	public String getOrderdish() {
		return orderdish;
	}
	public void setOrderdish(String orderdish) {
		this.orderdish = orderdish;
	}
	public int getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	public Order(int id, String ordername, double orderprice, String orderdish, int seatNum) {
		super();
		this.id = id;
		this.ordername = ordername;
		this.orderprice = orderprice;
		this.orderdish = orderdish;
		this.seatNum = seatNum;
	}
	public Order() {
		super();
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", ordername=" + ordername + ", orderprice=" + orderprice + ", orderdish="
				+ orderdish + ", seatNum=" + seatNum + "]";
	}
}

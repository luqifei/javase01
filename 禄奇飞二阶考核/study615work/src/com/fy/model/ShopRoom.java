package com.fy.model;
/**
 * CREATE TABLE `shoproom` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '门店编号',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `tel` int(11) DEFAULT NULL COMMENT '电话',
  `seat` int(11) DEFAULT NULL COMMENT '座位',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

 * @author lqf
 * @Date   2020年6月15日
 */
public class ShopRoom {
	private int id;
	private String address;
	private int tel;
	private int seat;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public ShopRoom(int id, String address, int tel, int seat) {
		super();
		this.id = id;
		this.address = address;
		this.tel = tel;
		this.seat = seat;
	}
	public ShopRoom() {
		super();
	}
	@Override
	public String toString() {
		return "ShopRoom [id=" + id + ", address=" + address + ", tel=" + tel + ", seat=" + seat + "]";
	}
	
	
}

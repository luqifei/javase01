package com.fy.model;
/**
 * CREATE TABLE `appraise` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '评价编号',
  `commer` varchar(1024) DEFAULT NULL COMMENT '评语',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

 * @author lqf
 * @Date   2020年6月15日
 */
public class Apprise {
	private int id;
	private String commer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCommer() {
		return commer;
	}
	public void setCommer(String commer) {
		this.commer = commer;
	}
	public Apprise(String commer) {
		this.commer = commer;
	}
	public Apprise() {
	}
	@Override
	public String toString() {
		return "Apprise [ commer=" + commer + "]";
	}
	
}	

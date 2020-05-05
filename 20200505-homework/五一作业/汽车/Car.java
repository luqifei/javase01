package com.fy.homewoer;
/**
 * 车类
 * 1）车类，（写一个子类，然后分别写两个方法），一个显示车类信息的方法，一个根据油耗和里程计算剩余油量的方法
 * 2）剩余油量=（公里数/100）*油耗
 *   //double kilomRe公里数=(kilometer里程数/100)*fuel燃料;
 *   //remainOli剩余油量	=(int)(remainOli-kilomRe公里数)
 * 3）Car字段有（品牌，车型，价格，油耗，里程数，邮箱容量，剩余油量）
 *   燃油数量L➗行驶公里数✖100=百公里油耗
 *   燃油数量=容量-剩余油量
 *   百公里油耗=燃油数量➗里程数✖100
 * @author lqf
 * @Date   2020年5月2日
 */
public class Car {
	//成员变量
    private String brand;//品牌
    private String type;//车型
    private String color;//颜色
    private String gearbox;//变速箱
    private String engine;//发动机
    private String ROHS;//环保标准
    private double price;//价格
    private double oliCon;//油耗
    private double kilomenter;//里程数
    private double oliTank;//邮箱容量
    private double remainOil;//剩余油量
    //set get 设置，获取
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getGearbox() {
		return gearbox;
	}
	public void setGearbox(String gearbox) {
		this.gearbox = gearbox;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getROHS() {
		return ROHS;
	}
	public void setROHS(String rOHS) {
		ROHS = rOHS;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getOliCon() {
		return oliCon;
	}
	public void setOliCon(double oliCon) {
		this.oliCon = oliCon;
	}
	public double getKilomenter() {
		return kilomenter;
	}
	public void setKilomenter(double kilomenter) {
		this.kilomenter = kilomenter;
	}
	public double getOliTank() {
		return oliTank;
	}
	public void setOliTank(double oliTank) {
		this.oliTank = oliTank;
	}
	public double getRemainOil() {
		return remainOil;
	}
	public void setRemainOil(double remainOil) {
		this.remainOil = remainOil;
	}
	//构造方法
	public Car(){
	}
	public Car(String brand, String type, String color, String gearbox, String engine, String rOHS, double price,
			double oliCon) {
		super();
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.gearbox = gearbox;
		this.engine = engine;
		ROHS = rOHS;
		this.price = price;
		this.oliCon = oliCon;
	}
	public Car(double oliCon, double kilomenter, double oliTank) {
		super();
		this.oliCon = oliCon;
		this.kilomenter = kilomenter;
		this.oliTank = oliTank;
	}
	
}

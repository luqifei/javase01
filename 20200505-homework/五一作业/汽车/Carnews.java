package com.fy.homewoer;
/**
 *  品牌，车型，价格，油耗，里程数，邮箱容量，剩余油量
 * 车类信息 
 * @author lqf
 * @Date   2020年5月3日
 */
public class Carnews {
	
	public static void main(String[] args) {
		Car news = new Car("长安跨越", "跨越王X5", "珍珠白", "手动5挡", "DK15C", "国六", 5.2, 8.2);
		System.out.println("******车辆信息******");
		System.out.println("品牌："+news.getBrand()+"  车型："+news.getType()+"  价格："+news.getPrice()+"万  油耗："+news.getOliCon()+"L");
		System.out.println("颜色："+news.getColor()+"  变速箱："+news.getGearbox()+"  发动机："+news.getEngine()+" 环保标准:"+news.getROHS());	
	}

}

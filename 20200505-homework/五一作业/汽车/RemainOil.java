package com.fy.homewoer;
/**
 * 一个根据油耗和里程计算剩余油量的方法
 * 2）剩余油量=（公里数/100）*油耗
 *   //double kilomRe公里数=(kilometer里程数/100)*fuel燃料;
 *   //remainOli剩余油量	=(int)(remainOli-kilomRe公里数)
 * 3）Car字段有（品牌，车型，价格，油耗，里程数，邮箱容量，剩余油量）
 *   燃油数量L➗行驶公里数✖100=百公里油耗
 *   燃油数量=容量-剩余油量
 *   百公里油耗=燃油数量➗里程数✖100
 * @author lqf
 * @Date   2020年5月4日
 */
public class RemainOil {

	public static void main(String[] args) {
		Car remainOil = new Car(8.2, 30, 25);//油耗,里程,邮箱容量
		//remainOil=(oliTank-kilomenter/100*oilCon);
		double reOil;
		reOil =(int)(remainOil.getOliTank()-(remainOil.getKilomenter()/100*remainOil.getOliCon()));
		if (remainOil.getKilomenter()>280||remainOil.getKilomenter()<0) {
			System.out.println("警告，车辆即将没油。。。");
		    System.out.println(reOil+" L");//剩余油量=邮箱容量-（公里数/100）*油耗，
	    }else {
			System.out.println(reOil+" L");
		}
	}

}

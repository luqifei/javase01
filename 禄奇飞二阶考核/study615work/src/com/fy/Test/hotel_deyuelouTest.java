package com.fy.Test;

import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.fy.Dao.DishDao;
import com.fy.model.Apprise;
import com.fy.model.Dish;
import com.fy.model.Order;
import com.fy.model.ShopRoom;
import com.fy.util.CommDBUtil;

/**
 * 
 * @author lqf
 * @Date   2020年6月15日
 */
public class hotel_deyuelouTest {

	public static void main(String[] args) {
		System.out.println("欢迎光临得月酒店");
		System.out.println("请输入账号密码");
		Scanner user = new Scanner(System.in);
		String us = user.next();
		String pwd = user.next();
		if ("name".equals(us)&&"123456".equals(pwd)) {
			System.out.println("欢迎光临得月酒店");
		
			SqlSession session = CommDBUtil.getSqlSession();
			DishDao dishDao = session.getMapper(DishDao.class);
			//1.查询菜单;2.产品订购;3.门店信息4.用户点评
			Scanner sc = new Scanner(System.in);
			String a = sc.next();
			switch (a) {
			case "1":
				getDish(dishDao);getshoproom(dishDao);break;
			case "2":
				getDish(dishDao);
			case "3":
				getorder(dishDao);
			case "4":
				getappraise(dishDao);
				session.flushStatements();
				getappraiseshow(dishDao);
			default:
				break;
			}
			CommDBUtil.close(session);
		} else {
			System.out.println("账号密码输入错误,请重新输入");
		}
	}
	public static void getshoproom(DishDao dishDao) {
		List<ShopRoom> shopRoom = dishDao.getShopRoomAll();
		for (ShopRoom shopRooms : shopRoom) {
			System.out.println(shopRooms);
		}	
	}
	public static void getorder(DishDao dishDao) {
		List<Order> order = dishDao.getOrderAll();
		for (Order orders : order) {
			System.out.println(orders);
		}
	}
	public static void getDish(DishDao dishDao) {
		List<Dish> dish = dishDao.getDishAll();
		for (Dish dishs : dish) {
			System.out.println(dishs);
		}
	}
	public static void getappraise(DishDao dishDao) {
		int appraises = dishDao.getapprise();
		Apprise apprise = new Apprise("味道好极了,非常棒...");
		System.out.println(appraises>0? "评论成功":"评论失败");
	}
	private static void getappraiseshow(DishDao dishDao) {
		List<Apprise> apprises = dishDao.getappriseshow();
		for (Apprise apprise : apprises) {
			System.out.println(apprise);
		}
	}
}

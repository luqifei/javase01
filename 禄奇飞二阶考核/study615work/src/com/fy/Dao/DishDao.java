package com.fy.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.fy.model.Apprise;
import com.fy.model.Dish;
import com.fy.model.Order;
import com.fy.model.ShopRoom;
import com.sun.javafx.geom.AreaOp.IntOp;

public interface DishDao {

	@Select(value = { "select * from dish" })
	public List<Dish> getDishAll();
	@Select(value = { "select * from orders" })
	public List<Order> getOrderAll();
	@Select(value = { "select * from shoproom" })
	public List<ShopRoom> getShopRoomAll();
	@Insert(value = { "insert into appraise(commer) values(#{commer})" }) 
	public int getapprise();
	@Select(value = { "select * from appraise" })
	public List<Apprise> getappriseshow();
	
}

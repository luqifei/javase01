

/**
 * 
 * @author lqf
 * @Date   2020年4月15日
 */
public class Homework { 
	
	public static void main(String[] args) {
		userNum();
	}
	public static void userNum (){
		switch (5) {//预约次数
		case 1:
		case 2:
		case 3:
			System.out.println("预约成功。。。");
			break;
		default:
			{System.out.println("预约失败，请半小时后尝试。。。");
			break;
			}
		}
		
		
	}

}

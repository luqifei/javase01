import javax.print.attribute.standard.PrinterLocation;

/**
 * 
 * @author lqf
 * @Date   2020年4月10日
 */
public class Train_t {

	public static void main(String[] args) {
		String trainNum="K123";//trainNUM=车次
		String start="北京";//start=始发站
		String end="上海";//end=终点站
		int num=222;//num=载客数
		double price=222.5;//price=票价
		char unit='元';//unit=人民币
		
		System.out.println("车次:"+trainNum);
		System.out.print("始发站:"+start);
		System.out.print("→");
		System.out.println("终点站:"+end);
		System.out.println("载客数:"+num);
		System.out.print("票价:"+price);
		System.out.println(""+unit);

	}

}

package com.fy.homewoer;
/**
 * 高铁G7029
 *1.南京2.镇江3.丹阳4.常州5.无锡6.苏州7.上海
 *一等：0，44.5，64.5，99.5，129.5，159.5，219.5
 *二等：0，29.5，39.5，64.5，79.5，99.5，139.5
 * 输出对应价格
 * @author lqf
 * @Date   2020年5月3日
 */
public class HighTrainPPay {

	public static void main(String[] args) {
		String [][] hTp ={{"南京","0","0"},
	                      {"镇江","44.5","29.5"},
                          {"丹阳","64.5","39.5"},
	                      {"常州","99.5","64.5"},
	                      {"无锡","129.5","79.5"},
	                      {"苏州","159.5","99.5"},
	                      {"上海","219.5","139.5"}};
        //输入x值为想去的城市，0.南京,1.镇江,2.丹阳,3.常州,4.无锡,5.苏州,6.上海
		int x =2;//x为始发站,
		int n =6;//n为终点站,
		int y =2;//输入y值，1：一等座，2：二等座
		if(x<7&&x>0&&y<3&&y>0&&n<7&&n>0){
			System.out.println("欢迎乘坐G7029");
			//进行数据转换，终点站减始发站计算出票价
			String i = hTp[x][y];
			String j = hTp[n][y]; 
			double f = Double.parseDouble(j);
			double e = Double.parseDouble(i);
			double num = f-e;
			//System.out.println(num);
			System.out.println(hTp[x][0]+"💨→"+hTp[n][0]);
			System.out.println((hTp[1][y].equals(hTp[1][1])?"一等座":"二等座    ")+" 票价:"+num+"元");
		}else{
			System.out.println("输入有误，请重新数入。。。");
	    }
		     
		
		
		
		
		/*int x=5;//如何使为始发站，然后相差计算出票价
        //输入y值，1：一等座，2：二等座
        int y=1;
        if(x<7&&x>0){
        	//判断输入n是否合理
	        
	         if(y<3&&y>0){//判断输入n是否合理
		      //System.out.println(hTp[x][0]);
		     System.out.println("终点:"+hTp[x][0]+"  "+hTp[0][y]+"  票价:"+hTp[x][y]);
	    }else{
		     System.out.println("输入有误，请重新数入。。。");
		}
        }else{
	         System.out.println("输入有误，请重新数入。。。");
        }*/
	}

}

public class ForDetail {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//for(;循环判断条件；)
		//中的初始化和变量迭代可以写到其他地方，但是两边的分号不能省略
		
		//使用for循环控制
		int i = 1;//循环变量初始化
		for(; i <= 10 ; ) {
			System.out.println("hello，韩顺平教育" + i);
			i++;
		}
		
		System.out.println("i=" + i);//11 ok
		
		//int j = 1;
		//补充
		//for(;;) {//表示一个无限循环，死循环+break
	    //System.out.println("ok~" + (j++)) ;
		}
	}

public class ContinueDetail {
	
    //编写一个main方法
	public static void main(String[] args) {
		
		label1:
		for(int j = 0; j < 2; j++) {
			label2:
				for(int i = 0; i < 10; i++) {
				if(i == 2) {
					//看看分别输出什么值，并分析
					//continue ; // 等价于 continue label2
					//continue label2;//等价 continue
					continue label1;//输出2次[0,1]
				}
			System.out.println("i =" + i);//输出2次[0,1,2,3,4,5,6,7,8,9]
			//结合流程分析图，分析内存执行情况，强烈建议小伙伴自己画内存分析图。
			
			
		}
		
	}
		
}

}
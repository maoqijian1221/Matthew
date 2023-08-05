
import java.util.Scanner;
public class SwitchExercise {
	
	//编写一个main方法
	public static void main(String[] args) {
	
	//编写 switch 把小写类型的char型转为大写（键盘输入）。
	//只转换 a->A,b->B,c,d,e. 其他的输出 "other"。
	
	//创建Scanner对象
	Scanner myScanner = new Scanner(System.in);
	System.out.println("请输入a-e");
	char c1 = myScanner.next().charAt(0);
	switch(c1) {
	case 'a' :
		System.out.println("A");
		break;
	case 'b' :
		System.out.println("B");
		break;	
	case 'c' :
		System.out.println("C");
		break;
	case 'd' :
		System.out.println("D");
		break;
	case 'e' :
		System.out.println("E");
		break;
	default :
		System.out.println("你的输入有误~");
		
	}
	
	}
}

import java.util.Scanner;
public class SwitchExercise2 {
	
	public static void main(String[] args) {
	
	double score = 50;
			
	//使用if-else 保证输入的成绩有效的 0-100
	//看了老师的分析和代码演示后，自己一定要独立完成（不看老韩代码也能写）
	if( score >= 0 && score <= 100) {
		switch((int)(score / 60)) {
		case 0 :
			System.out.println("不合格");
			break;
		case 1 :
			System.out.println("合格");
			break;
		default :
			System.out.println("输入有误");
		}
	} else {
		System.out.println("输入的成绩在0-100");
	}
	
	
   }
}
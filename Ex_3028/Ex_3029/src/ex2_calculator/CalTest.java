package ex2_calculator;

public class CalTest {

	public void getResult(int x, int y, String op) {
		switch(op) {
		case "+" :
			System.out.printf("%d + %d = %d\n",x,y,x+y);
			break;
		case "-" : 
			System.out.printf("%d - %d = %d\n",x,y,x-y);
			break;
 		case "*" :
 			System.out.printf("%d * %d = %d\n",x,y,x*y);
 			break;
		case "/" :
			System.out.printf("%d / %d = %d\n",x,y,x/y);
			break;
		}
	}	
}

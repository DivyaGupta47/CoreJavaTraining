package CoreJavaTraining;

//FOR LOOP: block run untill and unless condition full fill when condition is not full fill it will terminate the block
//FOR loop SYNTAX: for(initialization;Condition;Incre/decrement){}
public class ForLoopExample {

	public static void main(String[] args) {
		ForLoopExample forLoopExample = new ForLoopExample();
		forLoopExample.forLoopExample1();
		forLoopExample.forLoopExample2();

	}

	public void forLoopExample1() {

		for (int i = 0; i < 10; i = i + 3) {
			if (i == 9) // if the value of i is 8 then come to this block
			{
				System.out.println("9 is displayed");
			} else {
				System.out.println("Not found 8");
			}
		}
	}
	
	public void forLoopExample2() {
		for (int i=0; i<5; i++)
		{
			System.out.println(i);
			//i = 0, check condition 0<5 =0
			//i = 1, check condition 0<5 =1
			//i = 2, check condition 0<5 =2
			//i = 3, check condition 0<5 =3
			//i = 4, check condition 0<5 =4
			//i = 5, check condition 0<5 =5 which is not less than 5 and terminate
		}
	}

}

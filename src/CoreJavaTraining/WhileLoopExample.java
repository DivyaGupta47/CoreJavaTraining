package CoreJavaTraining;

//if boolean is true it will go inside the loop		
//make sure there is boolean var and do some operation on that vriable
// operation is liek inc/dec if you not perform any operation there is no use of
// loop
// otherwise it run infinite time.
public class WhileLoopExample {

	public static void main(String[] args) {

		int i = 0;
		// while(boolean) {}
		while (i < 10) {
			System.out.println(i);
			i++;
		}

		while (i > 10) {
			System.out.println(i);
			i--;
		}
	}

}

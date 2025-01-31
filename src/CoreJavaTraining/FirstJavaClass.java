package CoreJavaTraining; //rgtClk>new>Project,Package,Class

//cntr+shft+F for the allignmnt

//starting brace_File name and class name should be same
public class FirstJavaClass {

	static int a = 4; // explicitly give data type i.e int

	public static void main(String[] args) {
		// All code should place in this block
		// Java control come to this block only
		// Main block only responsible for execution
		//Mo methods are allowed inside the main block.

		// syso Cntl+enter
		System.out.println("Hello, It is resposible for print any msg in NEW line"); // Need to print anything in the
																						// o/p in the new line
		System.out.print("Hello, It is resposible for print any msg in SAME line");

		// use (//) for comment any msg, Java will not read this line

		System.out.println(a); // already value present in variable(a) thats why we are not using " "

	}

	// Method: it is a block in java class example 10 lines of code in every 100
	// page.
	public void getData() {
		// block name getData
		// void return type which is null
		System.out.println("I am in getData method");
	}

} // ending brace

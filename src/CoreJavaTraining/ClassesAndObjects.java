package CoreJavaTraining;

//Object: are the instances/referances of the class, you can call method and class with the help of object
//one of the encapsulation example
public class ClassesAndObjects {

	int a = 5; // You can Call/Access variable using object

	public static void main(String[] args) {

		// Object creation:
		// Return type(Class name) objectName = new (allocate memory) className
		ClassesAndObjects classesAndObjects = new ClassesAndObjects();
		// to access the method of ClassesAndObjects you just use objec(.)
		classesAndObjects.getData();

		System.out.println(classesAndObjects.a);

		// If you want to call method of other class you have to create of object of
		// particular that class.
		SecondJavaClass secondJavaClass = new SecondJavaClass();
		secondJavaClass.setData();

	}

	// Method: it is a block in java class example 10 lines of code in every 100
	// page.
	public void getData() {
		// block name getData
		// void return type which is null
		// Access/Call the method with the help of object
		System.out.println("I am in getData method");
	}

}

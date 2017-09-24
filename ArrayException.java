package array;
//Package is a grouping of related types providing access protection and name 
//space management
//create package name as array
public class ArrayException  {
	//public keyword is used in the declaration of a class,method or 
//field;public classes,method and fields can be accessed by the 
//members of any class.
//class defines instance and class fields,methods and inner classes as
//well as specifying the interfaces the class implements and the 
	//immediate superclass of the class

//created class name as ArrayException

	public static void main(String[] args)
	//static is used for memory management
//void is used to define the return type of the method
//String[] args is actually an array of java.lang.String type and it's name is args here
			{
		// TODO Auto-generated method stub
		int a[]=new int[5];//creating an array with size of index 5
		//declaring and initializing array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(a[5]=70);
		//here we are trying to print element 6 but we can't we get 
		//ArrayOutOfBoundException
	}

}

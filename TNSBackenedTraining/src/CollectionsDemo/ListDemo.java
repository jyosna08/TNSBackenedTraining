package CollectionsDemo;
import java.util.ArrayList;
//demo for ArrayList and LinkedList
public class ListDemo {

	public static void main(String[] args) {
		
//		ArrayList a1=new ArrayList();
//		a1.add(10);
//		a1.add("Hello");
//		a1.add("Hello");
//		a1.add(23.09f);
//		a1.add("");
//		
//		System.out.println("The data in the ArrayList");
//		System.out.println(a1);
//		
		//wrapper class
		//int--Integer
		//float--Float
		//double--Double
		
	    ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(10);
		a2.add(23);
		a2.add(67);
	
		
		System.out.println("The data in the ArrayList");
		System.out.println(a2);
		
//		
//		
//		for(int a:a1)
//			System.out.println("a");
		
		a2.remove(0);
		System.out.println("The data in the arraylist after removing");
		System.out.println(a2);
		
				

	}

}

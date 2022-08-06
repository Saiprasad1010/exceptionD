package Arrey;
import java.util.ArrayList;
import java.util.List;

public class CollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List list=new ArrayList();
			list.add(1);
			list.add("Saiprasad");
			list.add("long");
			list.add("Hi");
			list.add(1000.00);
			list.add("Kolhapur");
			System.out.println(list);
			
			for(Object object : list){
				System.out.println("All elements:" +object);
			}
			System.out.println(" Pearticular Element:"+list.get(3));
			
			
			list.add(7);
			System.out.println(list);
			
			list.add(3);
			System.out.println(list);
			
			
	}

}

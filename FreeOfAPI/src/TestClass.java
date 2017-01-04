import java.util.ArrayList;
import java.util.List;


public class TestClass {
	
	public static void main(String[] args) {
		
		
		List list = new ArrayList();
		list.add("kishan");
		list.add("sudhir");
		list.add("JD");
		list.add("Bindu");
		System.out.println(list.get(0));
		
		
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	
	
	
	
}

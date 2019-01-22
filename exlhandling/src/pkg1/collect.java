package pkg1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class collect {

	public  List list1() {
	
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(32);
		ls.add(34);
		ls.add(3);
		ls.add(3);	

		return ls;
	}
	
public Map Map1() {
	
	Map mp=new HashMap();
	mp.put("test", "first");
	mp.put("test2", "second");
	
	
	return mp;
}
	
public static void main(String[] args) {
		
	collect cs=new collect();
	List l=cs.list1();
	System.out.println(l.size());	
System.out.println(l.get(2));
	
	for(int i=0;i<l.size();i++) {
		
		System.out.println(l.get(i));
	}
	
	Map m=cs.Map1();
	System.out.println(m.get("key value is" +m));
	
	
	}


}

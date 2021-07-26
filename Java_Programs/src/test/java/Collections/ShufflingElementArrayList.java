package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShufflingElementArrayList {
public static void main(String[] args) {
		
		List<String> name=new ArrayList<String>();
		name.add("Arpita");
		name.add("pratiksha");
		name.add("niharika");
		name.add("divist");
		
		System.out.println("original list :"+name);
		Collections.shuffle(name);
		System.out.println("Shuffled list :"+name);
		
		
	}


}

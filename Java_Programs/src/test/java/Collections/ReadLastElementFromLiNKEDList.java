package Collections;

import java.util.LinkedList;

public class ReadLastElementFromLiNKEDList {
public static void main(String[] args) {
		
		LinkedList<String> ar=new LinkedList<String>();
		
		ar.add("Arpita");
		ar.add("Pratiksha");
		ar.add("Niharika");
		ar.add("Divist");
		System.out.println("Last Element: "+ar.getLast());
		System.out.println("Last Element: "+ar.peekLast());
		
		
}

}

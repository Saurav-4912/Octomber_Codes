
import java.util.*;

public class FirstAndLastElement{

	public static void main(String[] args) {

		ArrayList<Integer> AL = new ArrayList<>();

		AL.add(11);
		AL.add(22);
		AL.add(33);
		AL.add(44);
		AL.add(55);

		int first = AL.get(0);
		int last = AL.get(AL.size()-1);

		  System.out.println("First Element: " + first);
            System.out.println("Last Element: " + last);
		
	}
}
package solution4;

//import java.util.ArrayList;
import java.util.Collection;
//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Demo05 {

	public static void main(String[] args) {
		//Collection<String> c = new ArrayList<>();
		//Collection<String> c = new HashSet<>();
		Collection<String> c = new LinkedHashSet<>();
		//Collection<String> c = new TreeSet<>();
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		//c.add(null);
		//c.add(null);
		//c.add(null);
		System.out.println(c.toString());
	}

}

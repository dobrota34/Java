package laba1;
import java.util.ArrayList;

public class ManyTours {
	public static ArrayList<String> tours = new ArrayList<String>();
	public static void tours (int code) {
		if (code == 1){
			tours.add("OutCountryTour");
		}
		System.out.print( tours + "\n");
		if (code == 2){
			tours.add("Sanatorium");
		}
		System.out.print( tours + "\n");
		if (code == 3){
			tours.add("ChildrenCamp");
		}
		System.out.print( tours + "\n");
	}
	
}

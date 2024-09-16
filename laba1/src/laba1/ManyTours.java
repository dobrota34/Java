package laba1;
import java.util.ArrayList;

public class ManyTours {
	public static ArrayList<String> tour = new ArrayList<String>();
	public static void tours (int code) {
		if (code == 1){
			tour.add("OutCountryTour");
		}
		if (code == 2){
			tour.add("Sanatorium");
		}
		if (code == 3){
			tour.add("ChildrenCamp");
		}
	}
	public void prits() {
		System.out.print(tour);
	}
}



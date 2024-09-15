package laba1;
public class OutCountryTour extends SalesTour {
	String international_passport = "25.05.2015";
	String insurance = "Yes";
	

	
		@Override
	public String toString() {
		System.out.print(super.toString());
		return "\nзагран паспорт до - " + international_passport + "\nНаличие страховки - " + insurance + "\n";
	}

}

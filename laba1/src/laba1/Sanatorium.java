package laba1;

public class Sanatorium extends SalesTour {
	String policy = "Yes";
	String referral_to_hospital = "Yes";
	String diagnosis  = "Covid - 19";
	@Override
	public String toString() {
		System.out.print(super.toString());
		return "\nМед полис - " + policy + "\nНаправление в больницу - " + referral_to_hospital +
				"\nДиагноз - " + diagnosis+ "\n";
	}

}

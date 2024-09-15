package laba1;

public class SalesTour {
	private String datecome;
	private String dateout;
	private int manypeople;
	private double price;
	private int code;
	private String secondname;
	private String hotel;
	private int room;
	private String typeHotel;
	
	public void tour() {
		ManyTours p = new ManyTours();
		p.tours(code);
	}

	public void dataoftour(int code, String secondname, String hotel, int room, String typeHotel) {
		this.code = code;
		this.secondname = secondname;
		this.hotel = hotel;
		this.room = room;
		this.typeHotel = typeHotel;
		tour();
	
		
	}
	public void setdatecome(String datecome) {
		this.datecome = datecome;
	}
	public void setdateout(String dateout) {
		this.dateout = dateout;
	}
	public void setmanypeople(int manypeople) {
		this.manypeople = manypeople;
	}
	public void setprice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "Код путевки - " + code + "\nФамилия гостя - " + secondname + "\nДата заезда - " + datecome + "\nДата выезда - " + dateout +
				"\nКоличество Чел. - " + manypeople+ "\nНазвание пансионата - " + hotel + "\nВид жилья - " + typeHotel+ "\nЦена - " + price;
	}

}

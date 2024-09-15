package laba1;

public class laba1 {
	public static void main(String args[]) {
		OutCountryTour c = new OutCountryTour();
		c.dataoftour(1, "Малахов", "Парадиз", 546, "hotel");
		c.setdatecome("25.10.2024");
		c.setdateout("01.11.2024");
		c.setprice(345.4);
		c.setmanypeople(4);
		System.out.print(c.toString()+ "\n");
				
		Sanatorium v = new Sanatorium();
		v.dataoftour(2, "Малахов", "Парадиз", 546, "hotel");
		v.setdatecome("25.10.2024");
		v.setdateout("01.11.2024");
		v.setprice(345.4);
		v.setmanypeople(4);
		System.out.print(v.toString()+ "\n");
		
		ChildrenCamp z = new ChildrenCamp();
		z.dataoftour(3, "Малахов", "Парадиз", 546, "hotel");
		z.setdatecome("25.10.2024");
		z.setdateout("01.11.2024");
		z.setprice(345.4);
		z.setmanypeople(4);
		System.out.print(z.toString()+ "\n");
		
	}

}

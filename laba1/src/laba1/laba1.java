package laba1;

import static laba1.ManyTours.tours;

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

		OutCountryTour cc = new OutCountryTour();
		cc.dataoftour(1, "Малахов", "Парадиз", 546, "hotel");
		cc.setdatecome("25.10.2024");
		cc.setdateout("01.11.2024");
		cc.setprice(345.4);
		cc.setmanypeople(4);
		System.out.print(cc.toString()+ "\n");

		Sanatorium vv = new Sanatorium();
		vv.dataoftour(2, "Малахов", "Парадиз", 546, "hotel");
		vv.setdatecome("25.10.2024");
		vv.setdateout("01.11.2024");
		vv.setprice(345.4);
		vv.setmanypeople(4);
		System.out.print(vv.toString()+ "\n");

		ChildrenCamp zz = new ChildrenCamp();
		zz.dataoftour(3, "Малахов", "Парадиз", 546, "hotel");
		zz.setdatecome("25.10.2024");
		zz.setdateout("01.11.2024");
		zz.setprice(345.4);
		zz.setmanypeople(4);
		System.out.print(zz.toString()+ "\n");

		ManyTours xx = new ManyTours();
		xx.prits();


		
	}


}

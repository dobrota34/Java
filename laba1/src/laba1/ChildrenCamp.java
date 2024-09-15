package laba1;

public class ChildrenCamp extends SalesTour {
	int age = 15;
	String license_born = "Yes";
	String sex  = "M";
	@Override
	public String toString() {
		System.out.print(super.toString());
		return "\nВозраст - " + age + "\nСвидетелство о рождении - " + license_born + "\nПол - " + sex + "\n";
	}

}

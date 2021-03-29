package Numbers;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2017;
		if (year % 400 == 0) {
			System.out.println("leap year");
		} else if (year % 100 == 0) {
			System.out.println("not leap year");
		}else if (year % 4 == 0) {
			System.out.println(" leap year");
		}else {
			System.out.println(" not leap year");
		}
	}

}


public class Exercise3_4 {

	public static void main(String[] args) {
		int month = (int)(System.currentTimeMillis() % 12);
		switch (month) {
		case 0: System.out.println("Month 1 is January"); break;
		case 1: System.out.println("Month 2 is February"); break;
		case 2: System.out.println("Month 3 is March"); break;
		case 3: System.out.println("Month 4 is April."); break;
		case 4: System.out.println("Month 5 is May."); break;
		case 5: System.out.println("Month 6 is June."); break;
		case 6: System.out.println("Month 7 is July."); break;
		case 7: System.out.println("Month 8 is August."); break;
		case 8: System.out.println("Month 9 is September."); break;
		case 9: System.out.println("Month 10 is October."); break;
		case 10: System.out.println("Month 11 is November."); break;
		case 11: System.out.println("Month 12 is December."); break;
		}

	}

}

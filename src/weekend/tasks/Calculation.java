package weekend.tasks;

public class Calculation {

	public int square(int n) {

		int b = n*n;

		System.out.println("The square value of "+ b);
		return b;


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cal = new Calculation();
		cal.square(10);

	}

}

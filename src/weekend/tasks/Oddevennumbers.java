package weekend.tasks;

public class Oddevennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {7,2,8,6,9,2};
		System.out.println("even numbers");
		for (int i : a) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		System.out.println("odd numbers");
		for (int i : a) {
			if(i % 2 !=0) {
				System.out.println(i);


			}

		}

	}

}

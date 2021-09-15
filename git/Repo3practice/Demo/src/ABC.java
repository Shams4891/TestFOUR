  import java.util.Scanner;

  public class ABC {

	public static void main(String[] args) {

		System.out.println("Hello Shams");

		Scanner input = new Scanner(System.in);

		int age = input.nextInt();

		if ((age >= 25) && (age <= 40)) {
			System.out.println("Get a job");

		}

		else if ((age >= 10) && (age < 25)) {

			System.out.println("Get Married");

		}

		else if ((age > 25) && (age <= 60)) {

			System.out.println("just work");

		 } else {
			System.out.println("Just Chill");
		 }
	 }

  }

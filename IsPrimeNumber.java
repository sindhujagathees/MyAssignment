package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int num = 12; 
        int i;

        if (num <= 1) {
            System.out.println(num + " is NOT a Prime Number.");
        } else {
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is NOT a Prime Number.");
                    break;
                }
            }

            if (i == num) {
                System.out.println(num + " is a Prime Number.");
            }
        }
    }
}
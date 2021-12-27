package assign2;

import java.util.Scanner;
interface FindNextEvenNumber{
    int result(long a);
}

public class NextEvenNumber {
    public static void main(String... args) {
        System.out.println("Enter a odd number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        FindNextEvenNumber findeven = (a) -> (int) (a + 2 - (a % 2));
        System.out.println("The next even number is: " + findeven.result(num));
    }
}

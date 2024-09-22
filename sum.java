package javabasic;

public class sum {

    public static void main(String[] args) {

        int n = 334;

        int sum = 0;

        while (n != 0) {
            int rem = n % 10;

            sum += rem;

            n /= 10;
        }

        System.out.println(sum);
    }
}

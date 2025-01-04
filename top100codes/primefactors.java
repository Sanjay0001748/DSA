package top100codes;

public class primefactors {
    public static void main(String[] args) {
        print(15);
    }

    public static void print(int num) {
        // finding prime factors of a number
        for (int i = 2; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (i % j == 0) {
                    break;
                }

            }
            if (num % i == 0) {
                System.out.print(  i);
            }

        }
    }
}

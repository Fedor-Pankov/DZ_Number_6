import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Первая задача + Вторая задача:

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println(numbers[numbers.length - 1]);

        double[] one = {1.57, 7.654, 9.986};
        for (int d = 0; d < one.length - 1; d++) {
            System.out.print(one[d] + ", ");
        }
        System.out.println(one[one.length - 1]);

        float[] two = {12.7f, 22.54f, 923.1f};
        for (int f = 0; f < two.length - 1; f++) {
            System.out.print(two[f] + ", ");
        }
        System.out.println(two[two.length - 1]);

        //Третья задача:

        int q = numbers.length - 1;
        while (q > 0) {
            System.out.print(numbers[q] + ", ");
            q--;
        }
        System.out.println(numbers[0]);

        int w = one.length - 1;
        while (w > 0) {
            System.out.print(one[w] + ", ");
            w--;
        }
        System.out.println(one[0]);

        int e = two.length - 1;
        while (e >= 0) {
            System.out.print(two[e] + ", ");
            e--;
        }
            //Четвертая задача:
        System.out.print("\n");
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) numbers[i]++;
                System.out.print(numbers[i] + ", ");
            }
        }
    }


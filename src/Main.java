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

        double[] arrayDouble = {1.57, 7.654, 9.986};
        for (int d = 0; d < arrayDouble.length - 1; d++) {
            System.out.print(arrayDouble[d] + ", ");
        }
        System.out.println(arrayDouble[arrayDouble.length - 1]);

        float[] arrayFloat = {12.7f, 22.54f, 923.1f};
        for (int f = 0; f < arrayFloat.length - 1; f++) {
            System.out.print(arrayFloat[f] + ", ");
        }
        System.out.println(arrayFloat[arrayFloat.length - 1]);

        //Третья задача:

        int anotherNumbers = numbers.length - 1;
        while (anotherNumbers > 0) {
            System.out.print(numbers[anotherNumbers] + ", ");
            anotherNumbers--;
        }
        System.out.println(numbers[0]);

        int anotherDouble = arrayDouble.length - 1;
        while (anotherDouble > 0) {
            System.out.print(arrayDouble[anotherDouble] + ", ");
            anotherDouble--;
        }
        System.out.println(arrayDouble[0]);

        int anotherFloat = arrayFloat.length - 1;
        while (anotherFloat >= 0) {
            System.out.print(arrayFloat[anotherFloat] + ", ");
            anotherFloat--;
        }
            //Четвертая задача:
        System.out.print("\n");
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) numbers[i]++;
                System.out.print(numbers[i] + ", ");
            }
        }
    }


import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

        //Task 1

// Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }
        public static void task1() {
            int [] arr = generateRandomArray();
            int sum = Arrays.stream(arr).sum();
            System.out.println("Сумма трат за месяц составила "+ sum + " рублей." );

        }

        public static void task2() {
            int [] arr = generateRandomArray();
            OptionalInt sumMin = Arrays.stream(arr).min();
            OptionalInt sumMax = Arrays.stream(arr).max();
            System.out.println("Минимальная сумма трат за месяц составила "+ sumMin + " рублей." );
            System.out.println("Максимальная сумма трат за месяц составила "+ sumMax + " рублей." );

    }

        public static void task3() {
            int [] arr = generateRandomArray();
            OptionalDouble averageSum = Arrays.stream(arr).average();
            System.out.println("Средняя сумма трат за месяц составила "+ averageSum + " рублей." );
    }
        public static void task4() {
        char [] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
    }
    }


}
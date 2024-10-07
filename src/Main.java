import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberUtils sorted = new NumberUtils();
        System.out.print("Введите кол-во чисел в массиве - ");

        int countIteration = scanner.nextInt();
        int[] array = new int[countIteration];

        System.out.println("Введите числа которые будут в массиве");
        for (int i = 0; i < countIteration; i++){
            int value = scanner.nextInt();
            array[i] = value;
        }

        System.out.println("Нужен ли вам порог значения? 1 - Да / 0 - Нет");
        int check = scanner.nextInt();

        if (check == 0){
            sorted.SortedArray(array);
        }
        else{
            System.out.println("Введите порог");
            int porogIndex = scanner.nextInt();
            sorted.SortedArray(array, porogIndex);
        }
    }
}
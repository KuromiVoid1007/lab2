public class NumberUtils{
    public static void SortedArray(int[] arr){
        int[] newArray1 = arr;
        int[] newArray = BubleSort(newArray1);

        System.out.println("Ваш отсортированный массив: ");

        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i]);
        }
    }

    public static void SortedArray(int[] arr, int numberPorog){
        int[] newArray1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > numberPorog){
                newArray1[i] = arr[i];
            }
            else{
                continue;
            }
        }

        int[] newArray = BubleSort(newArray1);

        System.out.println("Ваш отсортированный массив: ");

        for (int i = 0; i < newArray.length; i++){
            if (newArray[i] != 0) System.out.println(newArray[i]);
        }
    }

    public static int[] BubleSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
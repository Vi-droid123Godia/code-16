import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static void reverse (int[] array){
        for(int i=0;i<(array.length/2); i++){
            int temp =array[i];
            array[i] =array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
    }
    public static void main(String[] args){
        System.out.print("Enter the number of elements in the array = ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int myArray[] = new int[n];
        for(int i=0; i<myArray.length; i++){
            System.out.print("Enter the element " + (i+1) + " :");
            myArray[i]=scanner.nextInt();
            scanner.nextLine();
        }System.out.println("The non reversed Array  is :");
        for(int i=0; i<myArray.length; i++){
            System.out.print(myArray[i] + "\t");
        }
        System.out.print("\n Reversed array be \n ");

        reverse(myArray);
        for(int i=0;i<myArray.length; i++){
            System.out.print(myArray[i] + "\t");
        }
    }
}

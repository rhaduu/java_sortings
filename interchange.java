import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []array = new int[100];

        System.out.print("Set the array's dimension: "); int dim = scan.nextInt();
        System.out.println("Please insert values in the array: ");

        for (int index=0; index<dim; index++){
            System.out.print("\tarray["+index+"] = ");
            array[index] = scan.nextInt();
        }
        interchange(dim, array);

        System.out.println("The sorted array is: ");
        for (int index = 0; index<dim; index++){
            System.out.print("\t"+array[index]+" ");
        }
        System.out.println();

    }
    //static function to sort the array with the interchange sorting algorithm
   static void interchange(int dim, int[]array){
        for(int index1=0; index1<dim; index1++){
            for (int index2=index1+1; index2<dim; index2++)
                if (array[index1] > array[index2]){
                    //the interchange itself
                    int temp = array[index1];
                    array[index1] = array[index2];
                    array[index2] = temp;
                }
        }
    }
}
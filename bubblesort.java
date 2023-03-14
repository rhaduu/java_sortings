import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] array = new int[100];

        System.out.print("Set the array's dimension: "); int dim = scan.nextInt();
        System.out.println("Please insert values in the array: ");

        for (int index=0; index<dim; index++){
            System.out.print("\tarray["+index+"] = ");
            array[index] = scan.nextInt();
        }
        bubblesort(dim, array);

        System.out.println("The sorted array is: ");
        for (int index=0; index<dim; index++){
            System.out.print("\t"+array[index]+" ");
        }
        System.out.println();

    }
//method to do the bubblesort algorithm
    static void bubblesort(int dim, int[] array){
        boolean modif = true;

        do{
            modif = false;
            for (int index1 = 0; index1<dim-1; index1++){
                if (array[index1] > array[index1+1]){
                    int temp = array[index1];
                    array[index1] = array[index1+1];
                    array[index1+1] = temp;
                    modif = true;
                }
            }
        }while(modif == true);
    }
}
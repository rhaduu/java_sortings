import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] array = new int[100];

        System.out.print("Set the array's dimension: "); int dim = scan.nextInt();
        System.out.println("Please insert values in the array: ");

        for (int index=0; index<dim; index++){
            System.out.print("\tarray["+index+"] = ");
            array[index] = scan.nextInt();
        }
        selection(dim, array);

        System.out.println("The sorted array is: ");
        for (int index=0; index<dim; index++){
            System.out.print("\t"+array[index]+" ");
        }
        System.out.println();

    }
    //the method for the minimum selection algorithm
    static void selection(int dim, int[]array){
        int position, min;
        //setting up the min value for the first element in the array and it's position
        for(int index1=0; index1<dim; index1++){
            min = array[index1];
            position = index1;
            //checks every other element in the array for a smaller value
            for (int index2=index1+1; index2<dim; index2++)
                if (array[index2]<min){
                    min = array[index2];
                    position = index2;
                }
            //doing the interchange
            int temp = array[index1];
            array[index1]=array[position];
            array[position] = temp;
        }
    }
}
import java.util.Scanner;

// array stores in continous memory
public class Arrays {
    public static void main(String[] args) {


        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        for(int i=0;i<=n-1;i++) {
            System.out.println("Provide input for the index" + i);
            arr[i]= sc.nextInt();
        }
        System.out.println("Your array is");

        for(int val:arr){
            System.out.println(val);
        }
//        int arr[];
//        arr = new int[5];
//        int brr[] = {1,2,3};
//
//        System.out.println(brr[0]);
//        System.out.println(brr[1]);
//        System.out.println(brr[2]);




    }
}

import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter array size");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter array elements in unsorted way");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp;
                if(arr[i]>arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;

                }
            }
        }

        System.out.println("Enter array elements in unsorted way");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}

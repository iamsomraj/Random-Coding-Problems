import java.util.*;
class Main
{
    public static void main(String args[])
    {
        //int arr[] = {16,19,4,3,8,3};
        int arr[];
        System.out.println("Enter the elements no of the elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elements one by one: ");
        arr = new int[n];
        for(int i =0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nThe Leader Elements are displayed one by one: \n\n");
        for(int i = 0; i<=arr.length-2; i++)
        {
            int k = i;
            for(int j = i + 1; j<=arr.length-1; j++)
            {
                if(arr[i]>arr[j])
                {
                    k++;
                    continue;
                }
                else
                {
                    break;
                }
            }
            if(k==arr.length-1)
            {
                System.out.println("Element is "+ arr[i]);
            }
        }
        System.out.println("Element is "+ arr[arr.length-1]);

        
    }
}
import java.util.*;

class Large
{
    int a[];
    
    Large(int arr[])
    {
        this.a = new int[arr.length];
        int k = 0;
        for(int i :  arr)
        {
            a[k] = i;
            k++;
        }
    }
    
    
    public void calculateDiff()
    {
        int min = a[0];
        int maxDiff = a[1] - a[0];
        for(int i = 1; i<a.length; i++ )
        {
            if(a[i] - min > maxDiff)
            {
                maxDiff = a[i] - min;
            }
            if(a[i]<min)
            {
                min = a[i];
            }
        }
        if(maxDiff<0)
        {
            System.out.println("The array is sorted in decreasing order! ");
        }
        else
        {
            System.out.println("Maximum Difference of the above array is "+ maxDiff);
        }
    }
    
}

public class Main
{
    public static void main(String args[])
    {
        
        //If array is [2, 3, 10, 6, 4, 8, 1] then returned value should be 8 (Diff between 10 and 2). 
        //If array is [ 7, 9, 5, 6, 3, 2 ] then returned value should be 2 (Diff between 7 and 9)
        int arr[];
        int n;
        System.out.println("\nEnter the number of the elements : \n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("\nEnter the elements one by one :\n");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        Large lar = new Large(arr);
        
        lar.calculateDiff();
    }
}
import java.util.*;

class Marks
{
    private int marks[];
    private int total = 0;
    
    public void setMarks(int arr[])
    {
        marks = new int[arr.length];
        int k = 0;
        for(int i : arr)
        {
            marks[k] = i;
            k++;
        }
    }
    
    public int getTotal()
    {
        return total; 
    }
    
    public void calculate()
    {
        for(int i: marks)
        {
            if(i==1)
            {
                total = total + 3;
            }
            else
            {
                total = total - 1;
            }
        }
    }
    
}

public class Main
{
    public static void main(String args[])
    {
        
    
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number of subjects ");
        int n =  sc.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter the elements one by one: ");
        for(int i = 0; i<n ; i++)
        {
            marks[i] = sc.nextInt();
        }
        Marks mar = new Marks();
        mar.setMarks(marks);
        mar.calculate();
        System.out.println("Total marks obtained by students : "+mar.getTotal());
        
    }
}
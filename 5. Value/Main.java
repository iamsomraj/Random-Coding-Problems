import java.util.*;


public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String input = sc.nextLine();
        Parsing par = new Parsing(input);
        par.calculate();
    }
}
class Parsing
{
    String input = new String();
    Parsing(String input)
    {
        this.input = input;
    }
    
    public void calculate()
    {
        char arr[] = input.toCharArray();
        for(int i = 0; i<arr.length-1; i=i+2)
        {
            switch(arr[i+1])
            {
                case 'A':
                    int ans = Integer.parseInt(String.valueOf(arr[i])) & Integer.parseInt(String.valueOf(arr[i+2]));
                    arr[i+2] = (ans == 0) ? '0' : '1';
                    break;
                case 'B':
                    ans = Integer.parseInt(String.valueOf(arr[i])) | Integer.parseInt(String.valueOf(arr[i+2]));
                    arr[i+2] = (ans == 0) ? '0' : '1';
                    break;
                case 'C':
                    ans = Integer.parseInt(String.valueOf(arr[i])) ^ Integer.parseInt(String.valueOf(arr[i+2]));
                    arr[i+2] = (ans == 0) ? '0' : '1';
                    break;
            }
        }
        System.out.println("The output is ");
        System.out.println(arr[(arr.length)-1]);
    }
}


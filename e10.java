import java.util.Scanner;

public class e10 {
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);
        int x = cin.nextInt();

        int[] v = new int[10];
        for(int i=0;i<10;i++)
            v[i] = 0;

        while(x != 0)
        {
            v[x%10]++;
            x /= 10;
        }

        for(int i=1;i<10;i++)
            if(v[i] != 0)
            {
                x =i;
                v[i]--;
                break;
            }
        
        for(int i=0;i<10;i++)
            while(v[i] != 0)
            {
                x = x*10 + i;
                v[i]--;
            }
        System.out.println(x);
    }
}

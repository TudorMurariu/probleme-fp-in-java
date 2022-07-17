import java.util.*;

public class e1
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int a;

        // incercam sa citim numarul 
        try{
            a = cin.nextInt();
        }
        catch(Exception e) {
            System.out.println(" Introduceti un nr intreg!");
            cin.close();
            return;
        }

        // cautam nr prim
        a++;
        while(true)
        {
            if(isPrime(a))
                break;
            a++;
        }


        System.out.println(a);
        cin.close();
    }

    public static boolean isPrime(int x)
    {
        if(x < 2)
            return false;
        for(int d=2;d*d<=x;d++)
            if(x%d == 0)
                return false;
        return true;
    }
}
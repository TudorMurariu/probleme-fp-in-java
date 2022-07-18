import java.util.*;

public class e4 {

    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);
        int x = cin.nextInt();

        Map<Integer, Boolean> isPrime = new HashMap<Integer, Boolean>();
        isPrime.put(0, false);
        isPrime.put(1, false);
        // Eratostene
        for(int i=2;i<x;i++)
            if(!isPrime.containsKey(i))
            {
                isPrime.put(i, true);
                for(int j=i*i;j<x;j+=i)
                    isPrime.put(j, false);
            }

        for(int i=2;i<x;i++)
            if(isPrime.get(i) && isPrime.get(x-i))
            {
                System.out.println(i + " " + (x-i));
                cin.close();
                return;
            }
        
        System.out.println("Nu exista!");
        cin.close();
    }
}

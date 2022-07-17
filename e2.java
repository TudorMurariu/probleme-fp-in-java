import java.util.*;

public class e2 {
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        String input = cin.nextLine();

        //Date acest_moment = new Date(); // current date
        Calendar cal = Calendar.getInstance();
        int day = Integer.parseInt(input.substring(0,2));
        int month = Integer.parseInt(input.substring(3, 5));
        int year = Integer.parseInt(input.substring(6, 10));
        
        //11/02/2002
        int age = cal.get(Calendar.YEAR) - year;
        if(cal.get(Calendar.MONTH) < month)
            age--;
        else if(cal.get(Calendar.MONTH) == month && cal.get(Calendar.DAY_OF_MONTH) < day)
            age--;

        System.out.println(Calendar.DAY_OF_MONTH + " " + Calendar.MONTH + " " + Calendar.YEAR);
        System.out.println(age);
        cin.close();
    }
}

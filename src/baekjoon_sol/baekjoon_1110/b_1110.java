package baekjoon_sol.baekjoon_1110;
import java.util.Scanner;

public class b_1110 {
    public static void main(String[]main){

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        Sol2.cycle(num);

    }

}
class Sol{
    public static int first = -1;
    public static int count = 0;
    public static void cycle(int num){

        if(count == 0){
            first = num;
        }

        count++;

        String num_str = String.valueOf(num);
        int temp = 0;
        int num_new = 0;

        if(num<10){
            num_str = "0" + num_str;
        }

        temp = Character.getNumericValue(num_str.charAt(0)) + Character.getNumericValue(num_str.charAt(1));
        if(temp>=10)
            temp = temp%10;

        num_new = Integer.valueOf(num_str.charAt(1)+String.valueOf(temp));

        if(num_new == first){
            System.out.println("Done, " + count);
        }else {
            cycle(num_new);
        }



    }
}   //failed    원인을 모르겠음

class Sol2{
    static int count = 0;
    static int first = 0;
    public static void cycle(int num){
        if(count==0)
            first = num;

        count++;
        int temp;
        int num_new = 0;
        String num_str = String.valueOf(num);

        if(num_str.length()<2)
            num_str = "0" + num_str;

        String a = Character.toString(num_str.charAt(0));
        String b = Character.toString(num_str.charAt(1));

        temp = Integer.parseInt(a) + Integer.parseInt(b);
        String temp_0 = Integer.toString(temp);

        num_new = Integer.parseInt(b + Character.getNumericValue(temp_0.charAt(temp_0.length()-1)));

        if(first == num_new) {
            System.out.println(count);
        }else {
            cycle(num_new);
        }
    }
}
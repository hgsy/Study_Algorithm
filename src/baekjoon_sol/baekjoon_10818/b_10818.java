package baekjoon_sol.baekjoon_10818;
import java.util.Scanner;

public class b_10818 {
    public static void main(String[] main){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num[] = new int[n];
        for(int i=0;i<n;i++)
            num[i] = s.nextInt();

        Sol.sol(num);

    }
}

class Sol{
    static int count = 0;
    static int max;
    static int min;
    public static void sol(int[] num){
        if(count==0){
            max = num[0];
            min = num[0];
        }

        if(max<num[count])
            max = num[count];

        if(min>num[count])
            min = num[count];

        if(count!=num.length-1) {
            count++;
            sol(num);
        }
        else
            System.out.println(min + " " + max);

    }
}

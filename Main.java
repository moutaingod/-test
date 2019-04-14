
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        System.out.println(main.digitCounts(k, n));
    }
    public int digitCounts(int k, int n) {
        int total=0;
        if(n%10>=k)total++;
        for(int i=10;i<=n;i*=10){
            total+=n/i*i/10;
            if((n%(i*10))/i==k)total+=n%i+1;
            if((n%(i*10))/i>k)total+=i;
            if(k==0)total-=i;
        }
        return total;
    }


}

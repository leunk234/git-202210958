import java.util.Scanner;
public class Homework4 {
   public static int gcd(int m, int n) {
        if (n == 0) { return m; }
        else if (m < n) { return gcd(m, n%m); }
        else { return gcd(n,m%n ); }
    }
    public static int forgcd(int m, int n){
        int temp;
           for(;n!=0;){
               temp=n;
               n=m%n;
               m=temp;
           }
           return m;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("두 수를 입력하세요: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.printf("두 수의 최대공약수는 %d입니다.\n",gcd(a,b));
        System.out.printf("for문으로 돌렸을 때: %d \n",forgcd(a,b));
    }
}

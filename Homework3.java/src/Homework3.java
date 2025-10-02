import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇개의 정수를 입력할 예정인가요? ");
        int n = sc.nextInt();
        Num[] num = new Num[n];
        System.out.print("수를입력하세요: ");
        for (int i = 0; i < n; i++) {
            num[i] = new Num();
            num[i].setnum(sc.nextInt());
        }
        int max=num[0].num;
        int min=num[0].num;
        for (int i = 0; i < n; i++) {
            if (num[i].num > max) max = num[i].num;
            if (num[i].num < min) min = num[i].num;
        }
        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);
    }
}


    class Num{
    int num;
    void setnum(int k){num=k;}
}

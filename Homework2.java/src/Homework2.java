import java.util.Scanner;
class Student{
    int ID;
    String name;
    String major;
    long phone_number;
    void setID(int i) {ID=i;}
    int getID() {return ID;}
    void setName(String n) {name=n;}
    String getName() {return name;}
    void setMajor(String m) {major=m;}
    String getMajor() {return major;}
    void setPhone_number(long p) {phone_number=p;}
    String getPhone_number() {
        String p=Long.toString(phone_number);
        String pstr="0"+p.substring(0,2)+"-"+p.substring(2,6)+"-"+p.substring(6,10);
        return pstr;}

}
public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] Students = new Student[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            Students[i] = new Student();
            Students[i].setID(sc.nextInt());
            Students[i].setName(sc.next());
            Students[i].setMajor(sc.next());
            Students[i].setPhone_number(sc.nextLong());
        }
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + "번째 학생: " +
                    Students[i].getID() + " " +
                    Students[i].getName() + " " +
                    Students[i].getMajor() + " " +
                    Students[i].getPhone_number());
        }
    }
}
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Homework9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,String> loginMap = new HashMap<String, String>();
        try{
            Scanner fc = new Scanner(new File("db.txt"));
            if (fc.hasNext()){
                fc.nextLine();
            }
            while(fc.hasNext()){
                String id = fc.next();
                String password = fc.next();
                loginMap.put(id, password);
            }
            fc.close();
        } catch (FileNotFoundException e){
            System.out.println("db.txt 파일을 찾을 수 없습니다.");
            return;
        } catch(Exception e){
            e.printStackTrace();
        }
        while(true){
            System.out.println("id와 password를 입력해주세요.");
            System.out.printf("id : ");
            String id = sc.nextLine().trim();
            if(!loginMap.containsKey(id)){
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }
            System.out.printf("password : ");
            String password = sc.nextLine().trim();
            if(!loginMap.get(id).equals(password)){
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                continue;
            }
            System.out.println("id와 비밀번호가 일치합니다.");
            break;
        }
    }
}
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("이름을 입력하시오 : ");

        String userName = myObj.nextLine();
        System.out.println("입력받은 이름은 " + userName + "입니다.");
    }
}

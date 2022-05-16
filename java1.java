import java.util.*;

public class java1 {
    public static void main(String args[]) {
        int age;
        System.out.println("Enter the age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        try {
            if (age <= 18) {
                MyException me = new MyException();
                throw me;

            } else {
                System.out.println("eligible for vote:");
            }
        }

        catch (Exception e) {
            System.out.println(e);

        }
    }
}

class MyException extends RuntimeException {
    public String toString() {
        // toString method will get Override here
        return "Age must be greater then 18";
    }
}
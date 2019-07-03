package homework;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {

        Random random = new Random();
        int result = random.nextInt(30);
        String email = "srilatha" + result + "@gmail.com";
        email(email,"srilatha");
    }

    public static void email(String email,String password){
        System.out.println(email+" "+password);
    }
}

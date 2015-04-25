package ua.org.oa.angelikskors;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailChecker {
    public static boolean a = true;

    public static void main(String[] args) {
        System.out.println("Please write down your e-mail");

        check();

    }

    public static boolean check() {
        while (a) {

            Scanner scan = new Scanner(System.in);
            String name = scan.nextLine();
            Pattern p = Pattern
                    .compile("^[a-z0-9_-]{1,15}+@[a-zA-Z]+\\.(\\w)+\\.(com|ua|ru)");
            Pattern p1 = Pattern
                    .compile("^[a-z0-9_-]{1,15}+@[a-zA-Z]+\\.(com|ua|ru)");
            Matcher m = p.matcher(name);
            Matcher m1 = p1.matcher(name);
            if (m.matches() || m1.matches()) {
                System.out.print("<- The following e-mail is correct");
                break;
            } else {
                System.out
                        .println("Try again. The written e-mail is incorrect  ");
            }
        }
        return a;
    }
}

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class NewMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string.");
        String userInput = sc.nextLine();
        System.out.println("You entered " + userInput + ".");
        System.out.println(StringUtils.isNumeric(userInput));
        System.out.println(StringUtils.swapCase(userInput));
        System.out.println(StringUtils.reverse(userInput));
    }
}

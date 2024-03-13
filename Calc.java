import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        int result = 0;
        String numbers[];
        if (str.indexOf("+") > 0) {
            numbers = str.split("\s\\+\s");
            result = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        } else if (str.indexOf("-") > 0) {
            numbers = str.split("\s\\-\s");
            result = Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
        } else if (str.indexOf("*") > 0) {
            numbers = str.split("\s\\*\s");
            result = Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]);
        } else if (str.indexOf("/") > 0) {
            numbers = str.split("\s\\/\s");
            result = Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1]);
        } else {

        }
        System.out.println(result);
    }
}

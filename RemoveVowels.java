import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        String resultString = removeVowels(inputString);
        System.out.println("String after removing vowels: " + resultString);
    }

    public static String removeVowels(String inputString) {
        return inputString.replaceAll("[aeiouAEIOU]", "");
    }
}

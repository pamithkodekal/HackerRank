import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lineNumber = 1;
        int limit = 5;

        while (sc.hasNextLine() && lineNumber <= limit) {
            String line = sc.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }

        sc.close();
    }
}
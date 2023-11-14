import del1g.CharAndLineCounter;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CharAndLineCounter counter = new CharAndLineCounter();
        System.out.println("If you want to quit, type stop.");

        while(true) {
            String userString = scan.nextLine();
            if (counter.isStopWord(userString)) {
                break;
            }
            else {
                counter.count(userString);
            }
        }

        System.out.println("lineCount: " + counter.getLineCounter());
        System.out.println("charCount: " + counter.getCharCounter());


    }

}
package file_read_andWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("file.txt");
        Scanner scanner=new Scanner(file);
        while (scanner.hasNextLine()){
            System.out.println("scanner.hasNextLine() = " + scanner.nextLine());

        }
        scanner.close();
        file=new File("file.txt");
        scanner=new Scanner(file);
        while (scanner.hasNextLine()){

            System.out.println("scanner.hasNextLine() = " + scanner.next());
        }
    }
}

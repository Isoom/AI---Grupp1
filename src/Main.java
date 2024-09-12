import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        Program program = new Program(new Scanner(new File(args[0])));
        program.displayKBInfo();
    }


}




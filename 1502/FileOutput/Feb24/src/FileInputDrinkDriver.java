//step 1
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;


public class FileInputDrinkDriver {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the name of the file you would like to input?");
        String fileName = keyboard.nextLine();
        File inputFile = new File ("input/"+fileName);
        System.out.println(inputFile.getAbsolutePath());

        //step 2
        ArrayList <String> orderList = new ArrayList<String>();
        Scanner fileScanner = new Scanner(inputFile);
        fileScanner.nextLine();
        
        while(fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            System.out.println("file line: " + line);
            orderList.add(line);
        }
        System.out.println(orderList);
        fileScanner.close();

        //step 3
        String strOutputFilename = "output/echo.txt";
        FileWriter fw = new FileWriter(strOutputFilename,true); // true: adds to file, false: overrites all data in the file
        PrintWriter pw = new PrintWriter(fw);
        
        for (String line:orderList) {
            pw.println(line);
        }
        pw.close();
        fw.close();

        keyboard.close();
    }
}

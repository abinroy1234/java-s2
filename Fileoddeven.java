package fileoddeven;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
public class Fileoddeven {
    
static String data = "";
    static File dataFile = new File("example.txt");

    
    public static void main(String[] args) {
        
        try {
            FileWriter evenFile;
            try (FileWriter oddFile = new FileWriter("odd.txt", true)) {
                evenFile = new FileWriter("even.txt", true);
                try (Scanner dataRead = new Scanner(dataFile)) {
                    while (dataRead.hasNextLine()) {
                        data += dataRead.nextLine();
                    }
                }
                String values[] = data.split(" ");
                int valuesInt[] = new int[values.length + 1];
                int count = 0;
                for (String i : values) {
                    valuesInt[count++] = Integer.parseInt(i);
                    //System.out.println(Integer.parseInt(i));
                    if (Integer.parseInt(i) % 2 == 0) {
                        evenFile.write(i+" ");
                        
                    } else {
                        oddFile.write(i+" ");
                    }
                }
            }
            evenFile.close();
        } catch (IOException ex) {
            System.out.println("An error occured !");
        } catch (NumberFormatException ex) {
            System.out.print("An error occured : ");
            System.out.println(ex.getMessage());
        }

    }
    
}






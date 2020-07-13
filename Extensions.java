import java.io.*;
import java.util.Scanner;

class Extensions{
    public static void main(String [] ak){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\nEnter File name: ");
        String filename = scan.next();
        
        System.out.print("Enter Custom Extension: ");
        String extension = scan.next();
        
        try{
            FileWriter fw = new FileWriter(filename+"."+extension);
            fw.write("File Created!! with custom extension: ."+extension);
            fw.close();
            
            readFile(filename, extension);
            
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    static void readFile(String filename, String extension)throws Exception{
        File file = new File(filename+"."+extension);
        Scanner scanner = new Scanner(file);
            
        String line = scanner.nextLine();
            
        System.out.println("\n"+line);
    }
}
import java.io.*;
import java.util.Scanner;
public class FileOperation 
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Creating File:");
        CreateFile();
        System.out.println("Enter the data which you want to enter in the file:");
        String s=sc.nextLine();
        WriteFile(s);
        ReadFile();
        sc.close();
    }
    public static void CreateFile()
    {
        try {
            File myObj=new File("/home/risrivastavatek/Simplilearn/File.txt");
            if(myObj.createNewFile())
            {
                System.out.println("File Created" + myObj.getName());
            }
            else{
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println("Excpetion Occurred:" + e);
            e.printStackTrace();
        }
    }
    public static void WriteFile(String str)
    {
        try {
            FileWriter Write=new FileWriter("/home/risrivastavatek/Simplilearn/File.txt");
            Write.write(str);
            Write.close();
            System.out.println("Writing into the file now");
            System.out.println("File has been successfully written");
        } catch (Exception e) {
            System.out.println("An error occurred while writing to the file");
            e.printStackTrace();
        }
    }
    public static void ReadFile()
    {
        try {
            File myFile=new File("/home/risrivastavatek/Simplilearn/File.txt");
            Scanner myReader= new Scanner(myFile);
            System.out.println("REading the file now");
            while(myReader.hasNextLine()){
                String data=myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("Error occurred while reading file");
            e.printStackTrace();
        }
    }
}
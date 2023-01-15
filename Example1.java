package Exercise15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//how to open a file in java. There are following ways to open a file in java
//Java desktop class, Java FileInputStream class, Java BufferedReader class, Java FileReader class
//Java Scanner class, Java nio package
//Below is an example of Java BufferedReader class
public class Example1 {

    public static void main(String[] args) {

        try{
            File file = new File("C:\\input.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            System.out.println("file content: ");
            int r = 0;
            while((r = br.read())!=-1){
                System.out.print((char)r);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

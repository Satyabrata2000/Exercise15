package Exercise15;

import java.io.FileReader;

//how to open a file in java. There are following ways to open a file in java
//Java desktop class, Java FileInputStream class, Java BufferedReader class, Java FileReader class
//Java Scanner class, Java nio package
//Below is an example of Java FileReader class
public class Example2 {

    public static void main(String[] args) {

        try{
            FileReader fr = new FileReader("C:\\input.txt");
            System.out.println("file content: ");
            int r = 0;
            while ((r = fr.read()) != -1) {
                System.out.print((char) r);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

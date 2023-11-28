package Java15;
import java.io.*;
public class Java15_3 {
        public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("data txt");
            fw.write("hello!");
            fw.close();
        }catch(IOException e){  // Exceptionの子孫をどれでもキャッチ
        System.out.println("何らかのエラーが発生しました");
        }
    }
}

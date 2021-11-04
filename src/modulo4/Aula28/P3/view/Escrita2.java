package P3.view;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Escrita2 {
    public static void main(String[] args) {
        PrintWriter ps = null;
        try {
            ps = new PrintWriter(".txt");
            ps.println("123");
            ps.println("456"); 
            ps.println("789");
            ps.println("101"); 
        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel encontrar o arquivo");
        } finally{
            ps.close();
        }
    }
}

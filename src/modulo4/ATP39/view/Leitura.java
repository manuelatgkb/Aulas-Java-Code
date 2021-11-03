package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Leitura{

    public static void main(String[] args) {    
        try {
            Scanner sc = new Scanner(new File("P3/dados/molho.txt"));
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try{
            FileOutputStream fos = new FileOutputStream("dados/arquivo2.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
    
            bw.write("Algumas Linhas");
            bw.newLine();
            bw.write("Mais algumas linhas");
    
            bw.close();
    
            }catch(FileNotFoundException e){
                System.out.println("Não foi possível encontrar o arquivo.");
            }catch(IOException e){
                System.out.println("Não é possível escrever no arquivo.");
        }
    }
}
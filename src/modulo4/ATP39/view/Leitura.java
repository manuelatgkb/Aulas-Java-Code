package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class Leitura{

    public static void main(String[] args) {  
        FileWriter fw = null;

        try{
            //InputStream fis = System.in;
            //Reader r = new InputStreamReader(fis);
            //BufferedReader br = new BufferedReader(r);

            OutputStream fos = new FileOutputStream("src/modulo4/ATP39/dados/Arquivo2.txt");
            Writer osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            Scanner sc = new Scanner(new File("src/modulo4/ATP39/dados/Arquivo1.txt"));
            while(sc.hasNextLine()){
                //br.read("dados/Arquivo1.txt");
                bw.write(sc.nextLine());
                bw.newLine();
                fw = new FileWriter("src/modulo4/ATP39/dados/Arquivo3.txt", true);
                fw.write("Limao\n");
                fw.write("Framboesa\n"); 
                fw.write("Chocolate\n");
                fw.write("Pistache\n"); 
                fw.close();

            }
            //r.close();
            bw.close();
    
            }catch(FileNotFoundException e){
                System.out.println("Não foi possível encontrar o arquivo.");
            }catch(IOException e){
                System.out.println("Não é possível escrever no arquivo.");
        }
    }
}
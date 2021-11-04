package modulo4.ATP39.view;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Escrita {
    public static void main(String[] args) {
        
    try{
        FileOutputStream fos = new FileOutputStream("src/modulo4/Arquivo2.txt");
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

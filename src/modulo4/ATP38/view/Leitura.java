package view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.stream.FileImageInputStream;

public class Leitura{
    public static void main(String[] args) {
    
        try{
            FileImageInputStream fis = new FileImageInputStream("dados/arquivo1.txt");
            System.out.println(fis.read());
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            while(br.readLine()){
                String linha = br.readLine();
                System.out.println(linha);
            }
            br.close();
        }catch(FileNotFoundException e){
            System.out.println("O arquivo não foi encontrado");
        }catch(IOException e){
            System.out.println("Não foi possível ler o arquivo.");
        }
    }
}
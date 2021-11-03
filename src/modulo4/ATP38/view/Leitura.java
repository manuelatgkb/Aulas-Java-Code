package view;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura{
    public static void main(String[] args) {
    
        try{
            FileInputStream fis = new FileInputStream("dados/arquivo1.txt");
            //System.out.println(fis.read());
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            while(br.ready()){
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
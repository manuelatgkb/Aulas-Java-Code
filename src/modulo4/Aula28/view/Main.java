package view;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        //java.io

        // criando o fluxo de entrada através de um arquivo
        try{
            FileInputStream fis = new FileInputStream("dados/pratos.txt");
            //System.out.println(fis.read());
            InputStreamReader isr = new InputStreamReader(fis);
            //char[]dados = new char[5];
            //isr.read(dados, 0, 5);
            //System.out.println(dados);
            BufferedReader br = new BufferedReader(isr);
            while(br.ready()){
                String linha = br.readLine();
                System.out.println(linha);
            }
            br.close();

            System.out.println("Arquivo aberto com sucesso!");
        }catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado.");
        }catch(IOException e){
            System.out.println("Não foi possível ler o arquivo.");
        }
    }
}

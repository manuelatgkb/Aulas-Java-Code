package view;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import Repositório_Novo.model.cadastro;

public class Escrita {
    public static void main(String[] args) {

        try{
        FileOutputStream fos = new FileOutputStream("dados/molhos.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(fos);

        bw.write("Sugo");
        bw.newLine();
        bw.write("Branco");

        bw.close();

        }catch(FileNotFoundException e){
            System.out.println("Não foi possível encontrar o arquivo.");
        }catch(IOException e){
            System.out.println("Não foi possível escrever no arquivo.");
        }

    }
}

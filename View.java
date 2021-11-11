import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.PriorityBlockingQueue;

import modulo4.ATP40.ex1.Empresa;

public class View {
    private static String fileName = "ex1/empresas.csv";
    public static void main(String[] args) {
    
        Empresa empresa = new Empresa();
        empresa.nome = "Art Adviserie";
        empresa.cnpj = "05026992641";
        empresa.ramo = "Conselho em investimento em obras de arte";
        
        //Dao - Object -> String
        String empresastring = String.format("%s; %s: %s \n", empresa.nome, empresa.cnpj, empresa.ramo);

        //Escrita
        try{
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write(empresastring);
            fileWriter.close();
        }catch(IOException e){
            System.out.println("O arquivo não pode ser aberto.");
        }   
        //Leitura
        try{
            Scanner sc = new Scanner(fileName);
            while(sc.hasNextLine()){
                sc.nextLine();
            }
        }catch(FileNotFoundException e){
            System.out.println();
        }
        }
}

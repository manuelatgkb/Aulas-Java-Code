package P2.view;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class EscritaOutros {
    
    public static void main(String[] args) {
        try{

            InputStream fis = new FileInputStream("P2/dados/pratos.txt");
            //System.out.println(fis.read());
            Reader isr = new InputStreamReader(fis);
            //char[]dados = new char[5];
            //isr.read(dados, 0, 5);
            //System.out.println(dados);
            BufferedReader br = new BufferedReader(isr);

            OutputStream fos = new FileOutputStream("P2/dados/molhos.txt");
            Writer osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
        
            while(br.ready()){
            String linha = br.readLine();
            bw.write(linha);
            bw.newLine();
            
        }
        bw.close();
        br.close();
        
    }catch(FileNotFoundException e){
                System.out.println("Não foi possível encontrar o arquivo.");
    }catch(IOException e){
                System.out.println("Não foi possível escrever no arquivo.");
        }
    }
}

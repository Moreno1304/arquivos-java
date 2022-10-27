
package arquivos;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Arquivos {

    
    public static void main(String[] args) {
       // Precisamos do caminho do arquivo que vamos manipular
       String caminho = "C:\\Users\\22283401\\Java-hj\\teste.txt";
       
       //Abrir o arquivo em modo escrito
        Path path = Paths.get(caminho);
        
        try {
            // Criar um Buffer de escrita
            BufferedWriter bw = Files.newBufferedWriter(
                    path, StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            bw.write("Olá, conteúdo gravado!");
            bw.newLine();
            bw.write("Olá, conteúdo gravado!");
            bw.newLine();
            bw.close();
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "O arquivo não exite!");
        }
    }
    
}

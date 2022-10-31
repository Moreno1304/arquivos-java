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
        Calculo c = new Calculo();
        c.dividendo = 10;
        c.divisor = 2;

        try {
            System.out.println(c.getResultado());
        } catch (Exception e) {
            e.printStackTrace();
        }

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
            bw.write("100;Jandira;Senai;Centro;(11)6532-9856");
            bw.close();
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "O arquivo não exite!");
        }
    }

}

package controller;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class JSONOps {

    public JSONOps() {
        super();
    }

    public void lerJSON(String nomeSymbol) throws Exception {

        File arq = new File("C:\\Temp","btc.json");

        if (arq.exists() && arq.isFile()) {
            FileInputStream fluxo = new FileInputStream(arq);
            InputStreamReader read = new InputStreamReader(fluxo);
            BufferedReader buffer = new BufferedReader(read);
            String linha = buffer.readLine();

            String[] linhaJSON = linha.split("}");
            for (String elemento : linhaJSON) {
                if (elemento.contains(nomeSymbol)) {
                    String[] atributos = elemento.split(",");
                    for (String atributo : atributos) {
                        if (atributo.contains("lastPrice")) {
                            System.out.println(atributo);
                        }
                    }
                }
            }

            buffer.close();
            read.close();
            fluxo.close();
        } else {
            throw new IOException("Arquivo inexistente");
        }
    }

}
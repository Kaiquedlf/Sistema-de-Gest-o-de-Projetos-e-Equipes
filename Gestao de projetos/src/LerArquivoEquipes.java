import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class LerArquivoEquipes{

    public static List<Equipe> lerEquipes() {

        List<Equipe> equipes = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("src/bancoequipes.data")
            );

            String linha;

            while ((linha = br.readLine()) != null) {

                if (!linha.trim().isEmpty()) {

                    String[] dados = linha.split(",");

                    Equipe e = new Equipe(
                            dados[0], // nome_equipe
                            dados[1], // descricao
                            dados[2] // membros


                    );

                    equipes.add(e);
                }
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return equipes;
    }
}
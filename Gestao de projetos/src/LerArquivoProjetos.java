import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class LerArquivoProjetos {

    public static List<Projeto> lerProjetos() {

        List<Projeto> projetos = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("src/bancoprojetos.data")
            );

            String linha;

            while ((linha = br.readLine()) != null) {

                if (!linha.trim().isEmpty()) {

                    String[] dados = linha.split(",");

                    Projeto p = new Projeto(
                            dados[0], // nome_projeto
                            dados[1], // nome_responsavel
                            dados[2], // descricao
                            dados[3], // data_inicio
                            dados[4], // data_termino_previsto
                            dados[5], // status
                            dados[6] // equipe


                    );

                    projetos.add(p);
                }
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return projetos;
    }
}
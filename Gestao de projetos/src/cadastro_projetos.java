import java.io.FileWriter;
import java.util.List;

public class cadastro_projetos {
    String nome_projeto;
    String nome_responsavel;
    String descricao;
    String data_inicio;
    String data_termino_previsto;
    String status;
    String equipe;

    public void salvar_projetos(){
        try {
            FileWriter writer = new FileWriter("src/bancoprojetos.data", true);

            writer.write(
                    nome_projeto + "," +
                            nome_responsavel + "," +
                            descricao + "," +
                            data_inicio + "," +
                            data_termino_previsto + "," +
                            status + "," +
                            equipe + "\n"

            );
            writer.close();
            System.out.println("Projeto salvo");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void reescreverProjetos(List<Projeto> projetos) {
        try {
            FileWriter writer = new FileWriter("src/bancoprojetos.data", false);

            for (Projeto p : projetos) {
                writer.write(
                        p.nome_projeto + "," +
                                p.nome_responsavel + "," +
                                p.descricao + "," +
                                p.data_inicio + "," +
                                p.data_termino_previsto + "," +
                                p.status + "," +
                                p.equipe + "\n"
                );
            }

            writer.close();
            System.out.println("Projetos atualizados com sucesso");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

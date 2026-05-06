import java.io.FileWriter;

public class cadastro_equipes {
    String nome_equipe;
    String descricao;
    String membros;

    public void salvar_equipes(){
        try {
            FileWriter writer = new FileWriter("src/bancoequipes.data", true);

            writer.write(
                    nome_equipe + "," +
                            descricao + "," +
                            membros + "\n"


            );
            writer.close();
            System.out.println("Equipe salva");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

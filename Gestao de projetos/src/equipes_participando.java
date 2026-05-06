import java.util.List;

public class equipes_participando {

    public void  equipesparticipando(List<Equipe> equipes, String[] usuarioLogado) {
        boolean equipe_encontrada = false;
        for (Equipe e : equipes){
            String[] membrosequipe = e.membros.split(";");

            for (String m : membrosequipe){
                if (usuarioLogado[4].equals(m)){
                    System.out.println("Equipes: " + e.nome_equipe);
                    System.out.println(" ");
                    equipe_encontrada = true;
                }
            }
        }

        if (!equipe_encontrada){
            System.out.println("Nenhuma equipe cadastrada");
            System.out.println(" ");
        }
    }
}

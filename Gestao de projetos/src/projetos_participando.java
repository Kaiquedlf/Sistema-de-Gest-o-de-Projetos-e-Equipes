import java.util.List;

public class projetos_participando {

    public void  projetosparticipando(List<Equipe> equipes,List<Projeto> projetos ,String[] usuarioLogado) {
        boolean equipe_encontrada = false;
        for (Equipe e : equipes){
            String[] membrosequipe = e.membros.split(";");

            for (String m : membrosequipe){
                for (Projeto p : projetos){
                    if (usuarioLogado[4].equals(m) && p.equipe.equals(e.nome_equipe)){
                        System.out.println("Nome do projeto: " + p.nome_projeto + ", Equipe: " + e.nome_equipe +  ", Gerente: " + p.nome_responsavel);
                        System.out.println(" ");
                        equipe_encontrada = true;
                    }

                }

            }
        }

    }
}

class Projeto {
    String nome_projeto;
    String nome_responsavel;
    String descricao;
    String data_inicio;
    String data_termino_previsto;
    String status;
    String equipe;

    public Projeto(String nome_projeto, String nome_responsavel, String descricao, String data_inicio, String data_termino_previsto, String status, String equipe) {
        this.nome_projeto = nome_projeto;
        this.nome_responsavel = nome_responsavel;
        this.descricao = descricao;
        this.data_inicio = data_inicio;
        this.data_termino_previsto = data_termino_previsto;
        this.status = status;
        this.equipe = equipe;
    }
}
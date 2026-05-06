import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class cadastro_usuarios {
    String nome;
    String cpf;
    String email;
    String cargo;
    String login;
    String senha;
    String perfil;

    public cadastro_usuarios (String nome, String cpf, String email, String cargo, String login, String senha, String perfil){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    public cadastro_usuarios (){
    }

    public void salvar_usuario(){
        try {
            FileWriter writer = new FileWriter("src/bancousuarios.data", true);

            writer.write(
                    nome + "," +
                            cpf + "," +
                            email + "," +
                            cargo + "," +
                            login + "," +
                            senha + "," +
                            perfil + "\n"
            );
            writer.close();
            System.out.println("Usuario criado");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public int contar_usuarios(){
        int count = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/bancousuarios.data"));
            while (br.readLine() != null) {
                count++;
            }
            br.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }
}



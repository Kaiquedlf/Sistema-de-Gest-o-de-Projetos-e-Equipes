import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class LerArquivoUsuarios {

    public static List<Usuario> lerUsuarios() {

        List<Usuario> usuarios = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("src/bancousuarios.data")
            );

            String linha;

            while ((linha = br.readLine()) != null) {

                if (!linha.trim().isEmpty()) {

                    String[] dados = linha.split(",");

                    Usuario u = new Usuario(
                            dados[0], // nome
                            dados[1], // cpf
                            dados[2], // email
                            dados[3], // cargo
                            dados[4], // login
                            dados[5], // senha
                            dados[6] // perfil

                    );

                    usuarios.add(u);
                }
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return usuarios;
    }
}
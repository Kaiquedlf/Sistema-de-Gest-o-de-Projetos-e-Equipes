import java.io.FileWriter;
import java.util.List;

public class cadastro_perfil {

    public void salvar_Perfil(List<Usuario> usuarios) {
        try {
            FileWriter writer = new FileWriter("src/bancousuarios.data");

            for (Usuario u : usuarios) {
                writer.write(
                        u.nome + "," +
                                u.cpf + "," +
                                u.email + "," +
                                u.cargo + "," +
                                u.login + "," +
                                u.senha + "," +
                                u.perfil + "\n"
                );
            }

            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

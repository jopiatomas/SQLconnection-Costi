import models.Usuario;
import views.UsuarioView;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        UsuarioView uv = new UsuarioView();
        Usuario usuario = uv.solicitarDatosUsuario();
        System.out.println(usuario);
    }
}
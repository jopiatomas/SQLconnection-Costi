package views;


import models.Usuario;

import java.util.Scanner;

public class UsuarioView {

    public UsuarioView() {
    }

    Scanner teclado = new Scanner(System.in);
    public Usuario solicitarDatosUsuario(){
        Usuario usuario = new Usuario();
        System.out.print("\nIngrese el nombre del usuario: ");
        usuario.setNombre(teclado.nextLine());
        System.out.print("Ingrese el email: ");
        usuario.setEmail(teclado.nextLine());
        System.out.print("Ingrese el rol[Cliente, Recepcionista, Administrador]: ");
        String rolTeclado = teclado.nextLine().toUpperCase();


        try {
            usuario.setRol(Usuario.Rol.valueOf(rolTeclado)); // Convertir la cadena a un valor del enum
        } catch (IllegalArgumentException e) {
            System.out.println("Rol no válido. Asignando el rol por defecto: CLIENTE.");
            usuario.setRol(Usuario.Rol.CLIENTE); // Valor por defecto si la entrada es incorrecta
        }

        return usuario;

    }
}

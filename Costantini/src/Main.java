import java.sql.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        int control;

        Connection conexion = ConexionBD.getInstancia().getConexion();
        String query;
        try{
            do{
                System.out.print("Ingrese el ejercicio: ");
                control = teclado.nextInt();
                teclado.nextLine();
                switch (control){
                    case 1:
                        try{
                            query = "SELECT id, nombre FROM alumnos;";
                            PreparedStatement ps = conexion.prepareStatement(query);
                            ResultSet rs = ps.executeQuery();

                            while(rs.next()){
                                System.out.println("ID: " + rs.getInt("id") + ", Nombre: " + rs.getString("nombre"));
                            }
                            rs.close();
                            ps.close();
                        } catch (SQLException sqe){
                            System.out.println(sqe.getMessage());
                        }

                        break;
                    case 2:
                        try{
                            query = "INSERT INTO alumnos (nombre, apellido, edad, email) VALUES (?,?,?,?);";
                            PreparedStatement ps = conexion.prepareStatement(query);
                            ps.setString(1, "Sebastian");
                            ps.setString(2, "Aguilera");
                            ps.setInt(3, 20);
                            ps.setString(4, "aguileraSebastian@gmail.com");

                            ps.executeUpdate();
                            ps.close();


                        } catch (SQLException e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        try{
                            query = "INSERT INTO direcciones (calle, altura, alumno_id) VALUES (?,?,?);";
                            PreparedStatement ps = conexion.prepareStatement(query);
                            ps.setString(1, "9 de julio");
                            ps.setInt(2, 5600);
                            ps.setInt(3, 6);

                            ps.executeUpdate();
                            ps.close();

                        } catch (SQLException e){
                            System.out.println(e.getMessage());
                        }

                        break;
                    case 4:
                        try{
                            query = "SELECT * FROM alumnos;";
                            PreparedStatement ps = conexion.prepareStatement(query);
                            ResultSet rs = ps.executeQuery();

                            while(rs.next()){
                                System.out.println("ID: " + rs.getInt("id") + ", Nombre: " + rs.getString("nombre") +
                                        ", Apellido: " + rs.getString("apellido") + ", Edad: " + rs.getInt("edad") +
                                        ", Email: " + rs.getString("email"));
                            }
                            ps.close();
                            rs.close();

                        } catch(SQLException e){
                            System.out.println(e.getMessage());
                        }

                        break;
                    case 5:
                        try{
                            query = "SELECT * FROM direcciones d LEFT JOIN alumnos a ON d.alumno_id = a.id WHERE a.id = 3;";
                            PreparedStatement ps = conexion.prepareStatement(query);
                            ResultSet rs = ps.executeQuery();

                            while(rs.next()){
                                System.out.println("ID: " + rs.getInt("id") +
                                        ", Calle: " + rs.getString("calle") +
                                        ", Altura: " + rs.getInt("altura") +
                                        ", Alumno ID: " + rs.getInt("alumno_id"));
                            }

                            ps.close();
                            rs.close();

                        } catch(SQLException e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 6:
                        try{
                            query = "UPDATE alumnos SET edad = ? WHERE id = ?;";
                            PreparedStatement ps = conexion.prepareStatement(query);
                            ps.setInt(1, 25);
                            ps.setInt(2, 6);

                            ps.executeUpdate();
                            ps.close();

                        } catch(SQLException e){
                            System.out.println(e.getMessage());
                        }

                        break;
                    case 7:
                        try{
                            query = "DELETE FROM alumnos WHERE id = ?;";
                            PreparedStatement ps = conexion.prepareStatement(query);
                            ps.setInt(1,6);
                            ps.executeUpdate();
                            ps.close();

                        } catch(SQLException e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 8:
                        try{
                            query = "DELETE FROM direcciones WHERE id = ?;";
                            PreparedStatement ps = conexion.prepareStatement(query);
                            ps.setInt(1, 2);
                            ps.executeUpdate();
                            ps.close();

                        } catch (SQLException e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("No existe ese ejercicio");
                        break;
                }

            }while (control != 0);


        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            ConexionBD.getInstancia().cerrarConexion();
        }

    }
}
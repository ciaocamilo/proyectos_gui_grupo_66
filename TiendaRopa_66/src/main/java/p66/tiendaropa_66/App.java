package p66.tiendaropa_66;

import p66.tiendaropa_66.conexion.SqliteConnection;
import p66.tiendaropa_66.vista.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("*La Tienda de Ropa**");
        /*Se crea conexión a la base de datos*/
        SqliteConnection conexionBD = new SqliteConnection();
        Menu menuPrincipal = new Menu();
        menuPrincipal.generarMenu(conexionBD);
    }

}

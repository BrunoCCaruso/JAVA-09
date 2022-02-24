package exercise_02;

import java.util.Locale;
import java.util.Scanner;

public class JuegoServicio {
    private Juego juego = new Juego();
    private Jugador jugador = new Jugador();
    private RevolverDeAgua revolver = new RevolverDeAgua();

    public JuegoServicio() {
    }

    public JuegoServicio(Juego juego, Jugador jugador, RevolverDeAgua revolver) {
        this.juego = juego;
        this.jugador = jugador;
        this.revolver = revolver;
    }

    public void menu(){
        System.out.println
                (
                        "|-------------- RuletaRusaDeAgua: The game -----------------|\n"
                        +"----------------------- MENU ------------------------------\n"
                        +"a- Ingresar jugadores.\n"
                        +"b- Ver lista de Jugadores.\n"
                        +"c- Iniciar Juego.\n"
                        +"d- Salir.\n"
                        +"-----------------------------------------------------------|\n"
                );
        respuestaUsuario();
    }

    private static Scanner entrada = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    public void respuestaUsuario(){
        System.out.print("Opción elegida: ");
        String resp = entrada.next();
        seleccionadorOpciones(resp);
    }
    public void seleccionadorOpciones(String resp){
        switch (resp.toLowerCase()){
            case "a":
                    juego.cargaDeJugadores();
                    menu();
                break;
            case "b":
                    juego.verJugadores();
                    menu();
                break;
            case "c":
                    juego.ronda();
                System.out.println("\n --------------- JUEGO FINALIZADO ------------------ \n");
                    menu();
                break;
            case "d":
                System.out.println("\nSalió con éxito!\n");
                break;
            default:
                System.out.println("\n||||| Ingrese una opcion válida.|||||\n");
                menu();
                break;
        }

    }


}

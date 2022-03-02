package exercise_03;

import java.util.*;

public class Baraja {
    private ArrayList<Carta> mazoCartas = new ArrayList<>();
    private ArrayList<Carta> mazoCartasAux = new ArrayList<>();


    public void crearMazo() {
        BarajasPalos arr[] = BarajasPalos.values();

        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                for (BarajasPalos palo : arr) {
                    System.out.println("Numero de carta:  " + i + ", Palo: " + palo.name());
                    Carta carta = new Carta(i, palo.name());
                    mazoCartas.add(carta);
                }
            }
        }

    }

    public void barajar() {
        Collections.shuffle(mazoCartas);
        for (Carta carta : mazoCartas) {
            System.out.println(carta);
        }
    }

    public void siguienteCarta() {
        Iterator<Carta> it = mazoCartas.iterator();
        if (it.hasNext()) {
            mazoCartasAux.add(it.next());
            it.remove();
        } else {
            System.out.println("Ya no quedan cartas en el maso.");
        }


    }

    public void cartasDisponibles() {
        System.out.println("Quedan: " + (mazoCartas.size() + 1) + " cartas en el mazo.");
    }

    private static Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);


    public void darCartas() {
        System.out.println("Cuantas cartas desea retirar del mazo?");
        int resp = entrada.nextInt();

        int cont = 0;

        if (mazoCartas.size() > 0) {
            if (mazoCartas.size() >= resp) {
                Iterator<Carta> it = mazoCartas.iterator();
                do {
                    if (it.hasNext()) {
                        mazoCartasAux.add(it.next());
                        System.out.println(it.next());
                        it.remove();
                        cont++;
                    }
                } while (cont < resp);
            } else {
                System.out.println("No hay suficientes cartas. Quedan actualmente: " + (mazoCartas.size() + 1) + " cartas.");
            }

        }


    }

    public void cartasMonton() {
        if (mazoCartasAux.size() > 0) {
            System.out.println("CARTAS QUE QUITÓ:");
            for (Carta carta : mazoCartasAux) {
                System.out.println(carta);
            }
        } else {
            System.out.println("No quitó ninguna carta.");
        }
    }

    public void mostrarBaraja() {
        if (mazoCartas.size() > 0) {
            for (Carta carta : mazoCartas) {
                System.out.println(carta);
            }
        } else {
            System.out.println("No hay cartas en el mazo.");
        }
    }


}






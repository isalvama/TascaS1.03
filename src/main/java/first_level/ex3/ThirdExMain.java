package first_level.ex3;

/*
Un cop carregades les dades, el programa demanarà el nom de l’usuari/ària i començarà el joc.

El funcionament consisteix a realitzar 10 preguntes, escollint aleatòriament 10 països diferents del HashMap. En cada ronda, es mostrarà el nom d’un país i l’usuari/ària haurà d’introduir el nom de la seva capital. Si la resposta és correcta (tenint en compte majúscules i minúscules si cal), es sumarà un punt a la seva puntuació. Al final de les 10 preguntes, es mostrarà la puntuació total obtinguda.

En finalitzar les 10 preguntes, el programa guardarà el nom de l’usuari/ària i la seva puntuació en un fitxer anomenat classificacio.txt.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class ThirdExMain {
    public static void main(String[] args) {

        Game game = GameProgram.program();

    }


}

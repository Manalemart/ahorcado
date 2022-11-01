/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package el.ahorcado;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.NumberFormatException;

/**
 *
 * @author Manel
 */
public class ElAhorcado {

    public static void main(String[] args) {
        /* Definimos nuestras variables de juego, Primero definimos las palabras
        con las que jugará el jugador al ahorcado
         */
        final String p1 = "Zafa";
        final String p2 = "Juan";
        final String p3 = "Pizza";
        final String p4 = "Cala";
        final String p5 = "Gala";
        final String p6 = "Torno";
        final String p7 = "Casa";
        final String p8 = "Asa";
        //Nombre del juego para la introducción
        String game = "Ahorcado";
        String name;
        // Variable para solicitar el nuemero de palabras
        int numeroPalabras = 0;
        boolean nocorrecto = false;
        // Puntuación
        int intentos = 0;
        // variables funcionales necesarias para la ejecución del programa
        boolean newGame = false;
        int contador;
        final int nIntentos = 5;
        int puntuacionOficial = 0;
        int puntuacionJugador = 0;
        int caracteres;

        //Scanners necesarios para el juego
        Scanner sc = new Scanner(System.in);
        // Variable para la enttrada de respuesta del jugador
        String respuesta = null;

        //Empezamos el juego 
        System.out.println("Bienvenidos al juego del " + game
                + "\nContra quien estoy jugando?");
        name = sc.nextLine();
        System.out.println("Bienvenido seas pues a este juego " + name);
        // Iniciamos un bucle para solicitar el numero de preguntas. Si el valor no corresponde saltara error y volvera a solicitar preguntas    
        do {
            System.out.println("Me gustaria saber cuantas palabras quieres adivinar.\n "
                    + "El número mínimo es 1 y el nivel más dificil es 6.\n");

            do {
                try {
                    sc = new Scanner(System.in);
                    numeroPalabras = sc.nextInt();
                    nocorrecto = false;
                    if (numeroPalabras < 1 || numeroPalabras > 6) {
                        System.out.println("El numero introducido debe ser mayor o igual a 1 y menor o igual a 6.");
                        nocorrecto = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Introduce un numero:");
                }

            } while (nocorrecto == true);
            sc = new Scanner(System.in);

            for (contador = 0; contador < numeroPalabras; contador++) { // Creo un bucle para el numero de palabras que se van a adivinar.
                int numRamdom = (int) (Math.random() * contador + 1);   // Casteo la variable numRandom para obtener numeros enteros aleatorios, que apuntaran a un case concreto dentro del switch.
                switch (numRamdom) {
                    // Cada case corresponde a una pregunta y tiene su verificador para ver si es correcta o no

                    case 1 -> {
                        do {
                            caracteres = p1.length();
                            System.out.println(name + " la palabra tiene " + caracteres + " letras. Cual es tu respuesta:");
                            respuesta = sc.nextLine();
                            ++intentos;      // En caso que la respuesta sea correcta se suma 1 a la variable intentos para posteriormente sacar el %
                            int comparacion = p1.compareToIgnoreCase(respuesta);// gastamos el compareToIgnoreCase de la clase Sting para comparar resultados sin tener en cuenta mayusculas
                            // Si resultado 0 = Correcto, si resultado < 0 anterior alfabeticamente, si resultado > 0 posterior alfabeticamente
                            if (comparacion == 0) {
                                System.out.println("Respuesta correcta\n");
                            } else if (comparacion < 0) {
                                System.out.println("La palbara es anterior alfabeticamente a " + respuesta);
                            } else if (comparacion > 0) {
                                System.out.println("La palbara es posteior alfabeticamente a " + respuesta);
                            }

                        } while (p1.equalsIgnoreCase(respuesta));
                    }
                    case 2 -> {
                        do {
                            caracteres = p2.length();
                            System.out.println(name +" la palabra tiene " + caracteres + " letras. Cual es tu respuesta:");
                            respuesta = sc.nextLine();
                            ++intentos;      // En caso que la respuesta sea correcta se suma 1 a la variable intentos para posteriormente sacar el %
                            int comparacion = p2.compareToIgnoreCase(respuesta);// gastamos el compareToIgnoreCase de la clase Sting para comparar resultados sin tener en cuenta mayusculas
                            // Si resultado 0 = Correcto, si resultado < 0 anterior alfabeticamente, si resultado > 0 posterior alfabeticamente
                            if (comparacion == 0) {
                                System.out.println("Respuesta correcta\n");
                            } else if (comparacion < 0) {
                                System.out.println("La palbara es anterior alfabeticamente a " + respuesta);
                            } else if (comparacion > 0) {
                                System.out.println("La palbara es posteior alfabeticamente a " + respuesta);
                            }

                        } while (p2.equalsIgnoreCase(respuesta));
                    }
                    case 3 -> {
                        do {
                            caracteres = p3.length();
                            System.out.println(name +" la palabra tiene " + caracteres + " letras. Cual es tu respuesta:");
                            respuesta = sc.nextLine();
                            ++intentos;      // En caso que la respuesta sea correcta se suma 1 a la variable intentos para posteriormente sacar el %
                            int comparacion = p3.compareToIgnoreCase(respuesta);// gastamos el compareToIgnoreCase de la clase Sting para comparar resultados sin tener en cuenta mayusculas
                            // Si resultado 0 = Correcto, si resultado < 0 anterior alfabeticamente, si resultado > 0 posterior alfabeticamente
                            if (comparacion == 0) {
                                System.out.println("Respuesta correcta\n");
                                ++intentos;      // En caso que la respuesta sea correcta se suma 1 a la variable intentos para posteriormente sacar el % 
                            } else if (comparacion < 0) {
                                System.out.println("La palbara es anterior alfabeticamente a " + respuesta);
                            } else if (comparacion > 0) {
                                System.out.println("La palbara es posteior alfabeticamente a " + respuesta);
                            }

                        } while (p3.equalsIgnoreCase(respuesta));
                    }
                    case 4 -> {
                        do {
                            caracteres = p4.length();
                            System.out.println(name + " la palabra tiene " + caracteres + " letras. Cual es tu respuesta:");
                            respuesta = sc.nextLine();
                            ++intentos;      // En caso que la respuesta sea correcta se suma 1 a la variable intentos para posteriormente sacar el %
                            int comparacion = p4.compareToIgnoreCase(respuesta);// gastamos el compareToIgnoreCase de la clase Sting para comparar resultados sin tener en cuenta mayusculas
                            // Si resultado 0 = Correcto, si resultado < 0 anterior alfabeticamente, si resultado > 0 posterior alfabeticamente
                            if (comparacion == 0) {
                                System.out.println("Respuesta correcta\n");
                                ++intentos;      // En caso que la respuesta sea correcta se suma 1 a la variable intentos para posteriormente sacar el % 
                            } else if (comparacion < 0) {
                                System.out.println("La palbara es anterior alfabeticamente a " + respuesta);
                            } else if (comparacion > 0) {
                                System.out.println("La palbara es posteior alfabeticamente a " + respuesta);
                            }

                        } while (p4.equalsIgnoreCase(respuesta));
                    }
                    case 5 -> {
                        do {
                            caracteres = p5.length();
                            System.out.println(name + " la palabra tiene " + caracteres + " letras. Cual es tu respuesta:");
                            respuesta = sc.nextLine();
                            ++intentos;      // En caso que la respuesta sea correcta se suma 1 a la variable intentos para posteriormente sacar el %
                            int comparacion = p5.compareToIgnoreCase(respuesta);// gastamos el compareToIgnoreCase de la clase Sting para comparar resultados sin tener en cuenta mayusculas
                            // Si resultado 0 = Correcto, si resultado < 0 anterior alfabeticamente, si resultado > 0 posterior alfabeticamente
                            if (comparacion == 0) {
                                System.out.println("Respuesta correcta\n");
                            } else if (comparacion < 0) {
                                System.out.println("La palbara es anterior alfabeticamente a " + respuesta);
                            } else if (comparacion > 0) {
                                System.out.println("La palbara es posteior alfabeticamente a " + respuesta);
                            }

                        } while (p5.equalsIgnoreCase(respuesta));
                    }
                    case 6 -> {
                        do {
                            caracteres = p6.length();
                            System.out.println(name + " la palabra tiene " + caracteres + " letras. Cual es tu respuesta:");
                            respuesta = sc.nextLine();
                            ++intentos;      // En caso que la respuesta sea correcta se suma 1 a la variable intentos para posteriormente sacar el %
                            int comparacion = p6.compareToIgnoreCase(respuesta);// gastamos el compareToIgnoreCase de la clase Sting para comparar resultados sin tener en cuenta mayusculas
                            // Si resultado 0 = Correcto, si resultado < 0 anterior alfabeticamente, si resultado > 0 posterior alfabeticamente
                            if (comparacion == 0) {
                                System.out.println("Respuesta correcta\n");

                            } else if (comparacion < 0) {
                                System.out.println("La palbara es anterior alfabeticamente a " + respuesta);
                            } else if (comparacion > 0) {
                                System.out.println("La palbara es posteior alfabeticamente a " + respuesta);
                            }

                        } while (p6.equalsIgnoreCase(respuesta));

                    }
                    case 7 -> {
                        do {
                            caracteres = p7.length();
                            System.out.println(name + " la palabra tiene " + caracteres + " letras. Cual es tu respuesta:");
                            respuesta = sc.nextLine();
                            ++intentos;      // En caso que la respuesta sea correcta se suma 1 a la variable intentos para posteriormente sacar el %
                            int comparacion = p7.compareToIgnoreCase(respuesta);// gastamos el compareToIgnoreCase de la clase Sting para comparar resultados sin tener en cuenta mayusculas
                            // Si resultado 0 = Correcto, si resultado < 0 anterior alfabeticamente, si resultado > 0 posterior alfabeticamente
                            if (comparacion == 0) {
                                System.out.println("Respuesta correcta\n");

                            } else if (comparacion < 0) {
                                System.out.println("La palbara es anterior alfabeticamente a " + respuesta);
                            } else if (comparacion > 0) {
                                System.out.println("La palbara es posteior alfabeticamente a " + respuesta);
                            }

                        } while (p7.equalsIgnoreCase(respuesta));

                    }

                    case 8 -> {
                        do {
                            caracteres = p8.length();
                            System.out.println(name + " la palabra tiene " + caracteres + " letras. Cual es tu respuesta:");
                            respuesta = sc.nextLine();
                            ++intentos;      // En caso que la respuesta sea correcta se suma 1 a la variable intentos para posteriormente sacar el %
                            int comparacion = p8.compareToIgnoreCase(respuesta);// gastamos el compareToIgnoreCase de la clase Sting para comparar resultados sin tener en cuenta mayusculas
                            // Si resultado 0 = Correcto, si resultado < 0 anterior alfabeticamente, si resultado > 0 posterior alfabeticamente
                            if (comparacion == 0) {
                                System.out.println("Respuesta correcta\n");

                            } else if (comparacion < 0) {
                                System.out.println("La palbara es anterior alfabeticamente a " + respuesta);
                            } else if (comparacion > 0) {
                                System.out.println("La palbara es posteior alfabeticamente a " + respuesta);
                            }

                        } while (p8.equalsIgnoreCase(respuesta));

                    }
                }

            }
            // Calculamos primero el numero óptimo de respuesta Numero de palabras *5
            puntuacionOficial = (numeroPalabras * nIntentos);
            // Calculamos el numero de intentos del jugador
            puntuacionJugador = (numeroPalabras * intentos);
            // Calculamos el porcentaje final entre respuestas de jugador y optimas
            int porcentaje = (puntuacionJugador * 100) / puntuacionOficial;
            System.out.println("Has usado un total de " + intentos + "para " + numeroPalabras + ", deberias haber usasdo " + puntuacionOficial
                    + "\n Representa el " + porcentaje + "%.");

            // Se pregunta si quiere jugar otra partida. En caso afirmativo se modifica el valor boolenao de la variable otraPartida y se reinicia el bucle doWhile.
            System.out.println("\n¿Quieres jugar otra partida? (V/F)");
            respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("v")) {
                System.out.println("Genial!! Vamos a ello.");
                newGame = true;
            } else {
                System.out.println("Hasta la vista " + name + "!!");
            }
        } while (newGame == false);
    }

}

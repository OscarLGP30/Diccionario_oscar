package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Diccionario {
    //Crea y devuelve una tabla hash vacía con la cantidad de elementos, determinado por el tamaño ingresado por el usuario.

    public static String[] crearTabla(int tamaño) {
        String[] tabla = new String[tamaño];
        return tabla;
    }

    //Agrega el elemento a la tabla en la posición determinada por la función hash, si se produce una colisión se deberá reubicar el elemento con una función de sondeo y si es una tabla encadenada deberá utilizar una función extra para insertarla en la estructura auxiliar.

    public static void agregarElemento(String[] tabla, String elemento) {
        int posicion = funcionHash(elemento, tabla.length);
        if (tabla[posicion] == null) {
            tabla[posicion] = elemento;
        } else {
            //Colisión
            //Reubicar elemento
            //Función de sondeo
            //Función extra para insertar en la estructura auxiliar
        }
    }


    //Elimina y devuelve el elemento de la tabla en la posición indicada por la función hash, puede requerir además aplicar la función utilizada en la inserción para resolver colisiones para encontrar dicho elemento o una función extra si es una tabla encadenada. Si devuelve None significa que no se encontró el dato en la tabla –y por ende no se elimina ningún elemento– o que la tabla está vacía.

    public static String eliminarElemento(String[] tabla, String elemento) {
        int posicion = funcionHash(elemento, tabla.length);
        if (tabla[posicion] == null) {
            return null;
        } else {
            //Colisión
            //Reubicar elemento
            //Función de sondeo
            //Función extra para insertar en la estructura auxiliar
        }
        return null;
    }

    //Devuelve la posición de la tabla en la que se encuentra el elemento busca- do, puede requerir utilizar la función utilizada en la inserción para resolver las colisiones –si es una tabla hash cerrada– o una función extra si es una tabla hash encadenada. Si devuelve None significa que no se encontró la clave en la lista.

    public static int buscarElemento(String[] tabla, String elemento) {
        int posicion = funcionHash(elemento, tabla.length);
        if (tabla[posicion] == null) {
            return -1;
        } else {
            //Colisión
            //Reubicar elemento
            //Función de sondeo
            //Función extra para insertar en la estructura auxiliar
        }
        return -1;
    }

    //Devuelve la posición que le corresponde al dato en el vector. Es probable que se disponga de más de una función hash dado que no se utilizará siempre la misma y dependerá del dominio de los datos.

    public static int funcionHash(String elemento, int tamaño) {
        int posicion = 0;
        for (int i = 0; i < elemento.length(); i++) {
            posicion += elemento.charAt(i);
        }
        return posicion % tamaño;
    }

    //Devuelve la nueva posición que le corresponde al dato en la tabla, para poder resolver las colisiones, o estructura auxiliar que permita resolver las colisiones que ocurran en la tabla hash.

    public static int funcionSondeo(String elemento, int tamaño) {
        int posicion = 0;
        for (int i = 0; i < elemento.length(); i++) {
            posicion += elemento.charAt(i);
        }
        return posicion % tamaño;
    }

    //Devuelve la cantidad de elementos en la tabla, puede requerir utilizar alguna función extra si es una tabla encadenada para contar los elementos de la estructura auxiliar que se encuentren en cada posición de la tabla.

    public static int cantidadElementos(String[] tabla) {
        int cantidad = 0;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] != null) {
                cantidad++;
            }
        }
        return cantidad;
    }

    //hacer un método que imprima la tabla hash con los elementos que se encuentran en cada posición.

    public static void imprimirTabla(String[] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] != null) {
                System.out.println("Posición " + i + ": " + tabla[i]);
            }
        }
    }


    //Libreria de un diccionario en java de la real academia española (RAE) para poder utilizarlo en el programa principal.

    public static String[] diccionarioRAE() {
        String[] diccionario = new String[93000];
        diccionario[0] = "a";
        diccionario[1] = "abaco";
        diccionario[2] = "abdomen";
        diccionario[3] = "abeja";
        diccionario[4] = "abierto";
        diccionario[5] = "abogado";
        diccionario[6] = "abono";
        diccionario[7] = "aborto";
        diccionario[8] = "abrazo";
        diccionario[9] = "abrir";
        diccionario[10] = "abuelo";
        diccionario[11] = "abuso";
        diccionario[12] = "acabar";
        diccionario[13] = "academia";
        diccionario[14] = "acceso";
        diccionario[15] = "acción";
        diccionario[16] = "aceite";
        diccionario[17] = "acelga";
        diccionario[18] = "acento";
        diccionario[19] = "aceptar";
        diccionario[20] = "año";
        diccionario[21] = "aeropuerto";
        diccionario[22] = "afectar";
        diccionario[23] = "afición";
        diccionario[24] = "afinar";
        diccionario[25] = "afirmar";
        diccionario[26] = "ágil";
        diccionario[27] = "agitar";
        diccionario[28] = "agonía";
        diccionario[29] = "agosto";
        diccionario[30] = "agotar";
        diccionario[31] = "agregar";
        diccionario[32] = "agrio";
        diccionario[33] = "agua";
        diccionario[34] = "agudo";
        diccionario[35] = "águila";
        diccionario[36] = "aguja";
        diccionario[37] = "ahogo";
        diccionario[38] = "ahorro";
        diccionario[39] = "aire";
        diccionario[40] = "aislar";
        diccionario[41] = "ajedrez";
        diccionario[42] = "ajeno";
        diccionario[43] = "ajuste";
        diccionario[44] = "alacrán";
        diccionario[45] = "alambre";
        diccionario[46] = "alarma";
        diccionario[47] = "alba";
        diccionario[48] = "álbum";
        diccionario[49] = "alcalde";
        diccionario[50] = "aldea";
        diccionario[51] = "alegre";
        diccionario[52] = "alejar";
        diccionario[53] = "alerta";
        diccionario[54] = "aleta";
        diccionario[55] = "alfiler";
        diccionario[56] = "alga";
        diccionario[57] = "algodón";
        diccionario[58] = "aliado";
        diccionario[59] = "aliento";
        diccionario[60] = "alivio";
        diccionario[61] = "alma";
        diccionario[62] = "almeja";
        diccionario[63] = "almíbar";
        diccionario[64] = "altar";
        diccionario[65] = "alteza";
        diccionario[66] = "altivo";
        diccionario[67] = "alto";
        diccionario[68] = "altura";
        diccionario[69] = "alumno";
        diccionario[70] = "alzar";
        diccionario[71] = "amable";
        diccionario[72] = "amante";
        diccionario[73] = "amapola";
        diccionario[74] = "amargo";
        diccionario[75] = "amasar";
        diccionario[76] = "ámbar";
        diccionario[77] = "ámbito";
        diccionario[78] = "ameno";
        diccionario[79] = "amigo";
        diccionario[80] = "amistad";
        diccionario[81] = "amor";
        diccionario[82] = "amparo";
        diccionario[83] = "amplio";
        diccionario[84] = "ancho";
        diccionario[85] = "anciano";
        diccionario[86] = "ancla";
        diccionario[87] = "andar";
        diccionario[88] = "andén";
        diccionario[89] = "anemia";
        diccionario[90] = "ángulo";
        diccionario[91] = "anillo";
        diccionario[92] = "ánimo";
        diccionario[93] = "anís";
        diccionario[94] = "anotar";
        diccionario[95] = "antena";
        diccionario[96] = "antiguo";
        diccionario[97] = "antojo";
        diccionario[98] = "anual";
        diccionario[99] = "anular";
        diccionario[100] = "anuncio";
        diccionario[101] = "añadir";
        diccionario[102] = "añejo";
        diccionario[103] = "año";
        diccionario[104] = "apagar";
        diccionario[105] = "aparato";
        diccionario[106] = "apetito";
        diccionario[107] = "apio";
        diccionario[108] = "aplicar";
        diccionario[109] = "apodo";
        diccionario[110] = "aporte";
        diccionario[111] = "apoyo";
        diccionario[112] = "aprender";
        diccionario[113] = "aprobar";
        diccionario[114] = "apuesta";
        diccionario[115] = "apuro";
        diccionario[116] = "arado";
        diccionario[117] = "aranía";
        diccionario[118] = "arar";
        diccionario[119] = "árbitro";
        diccionario[120] = "árbol";
        diccionario[121] = "arbusto";
        diccionario[122] = "archivo";
        diccionario[123] = "arco";
        diccionario[124] = "arder";
        diccionario[125] = "ardilla";
        diccionario[126] = "arduo";
        diccionario[127] = "área";
        diccionario[128] = "árido";
        diccionario[129] = "aries";
        diccionario[130] = "armonía";
        diccionario[131] = "arnés";
        diccionario[132] = "aroma";
        diccionario[133] = "arpa";
        diccionario[134] = "arpón";
        diccionario[135] = "arreglo";
        diccionario[136] = "arroz";
        diccionario[137] = "arruga";
        diccionario[138] = "arte";
        diccionario[139] = "artista";
        diccionario[140] = "asa";
        diccionario[141] = "asado";
        diccionario[142] = "asalto";
        diccionario[143] = "ascenso";
        diccionario[144] = "asegurar";
        diccionario[145] = "aseo";
        diccionario[146] = "asesor";
        diccionario[147] = "asiento";
        diccionario[148] = "asilo";
        diccionario[149] = "asistir";
        diccionario[150] = "asno";
        diccionario[151] = "asombro";
        diccionario[152] = "áspero";
        diccionario[153] = "astilla";
        diccionario[154] = "astro";
        diccionario[155] = "astuto";
        diccionario[156] = "asumir";
        diccionario[157] = "asunto";
        diccionario[158] = "atajo";
        diccionario[159] = "ataque";
        diccionario[160] = "atar";
        diccionario[161] = "atento";
        diccionario[162] = "ateo";
        diccionario[163] = "ático";
        diccionario[164] = "atleta";
        diccionario[165] = "átomo";
        diccionario[166] = "atraer";
        diccionario[167] = "atroz";
        diccionario[168] = "atún";
        diccionario[169] = "audaz";
        diccionario[170] = "audio";
        diccionario[171] = "auge";
        diccionario[172] = "aula";
        diccionario[173] = "aumento";
        diccionario[174] = "ausente";
        diccionario[175] = "autor";
        diccionario[176] = "aval";
        diccionario[177] = "avance";
        diccionario[178] = "avaro";
        diccionario[179] = "ave";
        diccionario[180] = "avellana";
        diccionario[181] = "avena";
        diccionario[182] = "avestruz";
        diccionario[183] = "avión";
        diccionario[184] = "aviso";
        diccionario[185] = "ayer";
        diccionario[186] = "ayuda";
        diccionario[187] = "ayuno";
        diccionario[188] = "azafrán";
        diccionario[189] = "azar";
        diccionario[190] = "azote";
        diccionario[191] = "azúcar";
        diccionario[192] = "azufre";
        diccionario[193] = "azul";
        //relleno automatico del diccionario con las palabras de la RAE.
        for (int i = 0; i < diccionario.length; i++) {
            if (diccionario[i] == null) {
                diccionario[i] = "palabra" + i;
            }
        }


        return diccionario;

    }
    //hacer un menu para buscar palabras, añadir palabras, eliminar palabras, salir del programa y mostrar el diccionario, y que el usuario pueda elegir que hacer, y que el programa se repita hasta que el usuario decida salir, con las palabras del metodo diccionarioRae().

    public static void main(String[] args) {
        // TODO code application logic here
        String[] diccionario = diccionarioRae();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Buscar palabra");
            System.out.println("2. Añadir palabra");
            System.out.println("3. Eliminar palabra");
            System.out.println("4. Mostrar diccionario");
            System.out.println("5. Salir");
            System.out.println("Elige una opcion");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce la palabra a buscar con la a");
                    String palabra = sc.next();
                    for (int i = 0; i < diccionario.length; i++) {
                        if (diccionario[i].equals(palabra)) {
                            System.out.println("La palabra " + palabra + " esta en la posicion " + i);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Introduce la palabra a añadir");
                    String palabraAñadir = sc.next();
                    for (int i = 0; i < diccionario.length; i++) {
                        if (diccionario[i].equals(palabraAñadir)) {
                            System.out.println("La palabra " + palabraAñadir + " ya esta en la posicion " + i);
                        } else {
                            diccionario[i] = palabraAñadir;
                            System.out.println("La palabra " + palabraAñadir + " se ha añadido en la posicion " + i);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Introduce la palabra a eliminar");
                    String palabraEliminar = sc.next();
                    for (int i = 0; i < diccionario.length; i++) {
                        if (diccionario[i].equals(palabraEliminar)) {
                            diccionario[i] = null;
                            System.out.println("La palabra " + palabraEliminar + " se ha eliminado de la posicion " + i);
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < diccionario.length; i++) {
                        System.out.println(diccionario[i]);
                    }
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion != 5);

    }

    private static String[] diccionarioRae() {

        String[] diccionario = new String[93000];
        diccionario[0] = "a";
        diccionario[1] = "abaco";
        diccionario[2] = "abdomen";
        diccionario[3] = "abeja";
        diccionario[4] = "abierto";
        diccionario[5] = "abogado";
        diccionario[6] = "abono";
        diccionario[7] = "aborto";
        diccionario[8] = "abrazo";
        diccionario[9] = "abrir";
        diccionario[10] = "abuelo";
        diccionario[11] = "abuso";
        diccionario[12] = "acabar";
        diccionario[13] = "academia";
        diccionario[14] = "acceso";
        diccionario[15] = "acción";
        diccionario[16] = "aceite";
        diccionario[17] = "acelga";
        diccionario[18] = "acento";
        diccionario[19] = "aceptar";
        diccionario[20] = "año";
        diccionario[21] = "aeropuerto";
        diccionario[22] = "afectar";
        diccionario[23] = "afición";
        diccionario[24] = "afinar";
        diccionario[25] = "afirmar";
        diccionario[26] = "ágil";
        diccionario[27] = "agitar";
        diccionario[28] = "agonía";
        diccionario[29] = "agosto";
        diccionario[30] = "agotar";
        diccionario[31] = "agregar";
        diccionario[32] = "agrio";
        diccionario[33] = "agua";
        diccionario[34] = "agudo";
        diccionario[35] = "águila";
        diccionario[36] = "aguja";
        diccionario[37] = "ahogo";
        diccionario[38] = "ahorro";
        diccionario[39] = "aire";
        diccionario[40] = "aislar";
        diccionario[41] = "ajedrez";
        diccionario[42] = "ajeno";
        diccionario[43] = "ajuste";
        diccionario[44] = "alacrán";
        diccionario[45] = "alambre";
        diccionario[46] = "alarma";
        diccionario[47] = "alba";
        diccionario[48] = "álbum";
        diccionario[49] = "alcalde";
        diccionario[50] = "aldea";
        diccionario[51] = "alegre";
        diccionario[52] = "alejar";
        diccionario[53] = "alerta";
        diccionario[54] = "aleta";
        diccionario[55] = "alfiler";
        diccionario[56] = "alga";
        diccionario[57] = "algodón";
        diccionario[58] = "aliado";
        diccionario[59] = "aliento";
        diccionario[60] = "alivio";
        diccionario[61] = "alma";
        diccionario[62] = "almeja";
        diccionario[63] = "almíbar";
        diccionario[64] = "altar";
        diccionario[65] = "alteza";
        diccionario[66] = "altivo";
        diccionario[67] = "alto";
        diccionario[68] = "altura";
        diccionario[69] = "alumno";
        diccionario[70] = "alzar";
        diccionario[71] = "amable";
        diccionario[72] = "amante";
        diccionario[73] = "amapola";
        diccionario[74] = "amargo";
        diccionario[75] = "amasar";
        diccionario[76] = "ámbar";
        diccionario[77] = "ámbito";
        diccionario[78] = "ameno";
        diccionario[79] = "amigo";
        diccionario[80] = "amistad";
        diccionario[81] = "amor";
        diccionario[82] = "amparo";
        diccionario[83] = "amplio";
        diccionario[84] = "ancho";
        diccionario[85] = "anciano";
        diccionario[86] = "ancla";
        diccionario[87] = "andar";
        diccionario[88] = "andén";
        diccionario[89] = "anemia";
        diccionario[90] = "ángulo";
        diccionario[91] = "anillo";
        diccionario[92] = "ánimo";
        diccionario[93] = "anís";
        diccionario[94] = "anotar";
        diccionario[95] = "antena";
        diccionario[96] = "antiguo";
        diccionario[97] = "antojo";
        diccionario[98] = "anual";
        diccionario[99] = "anular";
        diccionario[100] = "anuncio";
        diccionario[101] = "añadir";
        diccionario[102] = "añejo";
        diccionario[103] = "año";
        diccionario[104] = "apagar";
        diccionario[105] = "aparato";
        diccionario[106] = "apetito";
        diccionario[107] = "apio";
        diccionario[108] = "aplicar";
        diccionario[109] = "apodo";
        diccionario[110] = "aporte";
        diccionario[111] = "apoyo";
        diccionario[112] = "aprender";
        diccionario[113] = "aprobar";
        diccionario[114] = "apuesta";
        diccionario[115] = "apuro";
        diccionario[116] = "arado";
        diccionario[117] = "aranía";
        diccionario[118] = "arar";
        diccionario[119] = "árbitro";
        diccionario[120] = "árbol";
        diccionario[121] = "arbusto";
        diccionario[122] = "archivo";
        diccionario[123] = "arco";
        diccionario[124] = "arder";
        diccionario[125] = "ardilla";
        diccionario[126] = "arduo";
        diccionario[127] = "área";
        diccionario[128] = "árido";
        diccionario[129] = "aries";
        diccionario[130] = "armonía";
        diccionario[131] = "arnés";
        diccionario[132] = "aroma";
        diccionario[133] = "arpa";
        diccionario[134] = "arpón";
        diccionario[135] = "arreglo";
        diccionario[136] = "arroz";
        diccionario[137] = "arruga";
        diccionario[138] = "arte";
        diccionario[139] = "artista";
        diccionario[140] = "asa";
        diccionario[141] = "asado";
        diccionario[142] = "asalto";
        diccionario[143] = "ascenso";
        diccionario[144] = "asegurar";
        diccionario[145] = "aseo";
        diccionario[146] = "asesor";
        diccionario[147] = "asiento";
        diccionario[148] = "asilo";
        diccionario[149] = "asistir";
        diccionario[150] = "asno";
        diccionario[151] = "asombro";
        diccionario[152] = "áspero";
        diccionario[153] = "astilla";
        diccionario[154] = "astro";
        diccionario[155] = "astuto";
        diccionario[156] = "asumir";
        diccionario[157] = "asunto";
        diccionario[158] = "atajo";
        diccionario[159] = "ataque";
        diccionario[160] = "atar";
        diccionario[161] = "atento";
        diccionario[162] = "ateo";
        diccionario[163] = "ático";
        diccionario[164] = "atleta";
        diccionario[165] = "átomo";
        diccionario[166] = "atraer";
        diccionario[167] = "atroz";
        diccionario[168] = "atún";
        diccionario[169] = "audaz";
        diccionario[170] = "audio";
        diccionario[171] = "auge";
        diccionario[172] = "aula";
        diccionario[173] = "aumento";
        diccionario[174] = "ausente";
        diccionario[175] = "autor";
        diccionario[176] = "aval";
        diccionario[177] = "avance";
        diccionario[178] = "avaro";
        diccionario[179] = "ave";
        diccionario[180] = "avellana";
        diccionario[181] = "avena";
        diccionario[182] = "avestruz";
        diccionario[183] = "avión";
        diccionario[184] = "aviso";
        diccionario[185] = "ayer";
        diccionario[186] = "ayuda";
        diccionario[187] = "ayuno";
        diccionario[188] = "azafrán";
        diccionario[189] = "azar";
        diccionario[190] = "azote";
        diccionario[191] = "azúcar";
        diccionario[192] = "azufre";
        diccionario[193] = "azul";
        return diccionario;
    }



}

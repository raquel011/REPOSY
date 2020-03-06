/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Crear un mapa ordenado cuyos elementos son las cotas montañosas de una provincia y su
//respectiva altura en metros.
package SEMANA03_PRACTICA;

import java.util.AbstractMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.*;


/**
 *
 * @author ESTHER
 */
public class MapadeArbol{
public static void main(String[] args){
String [] montan ={"Teleno", "Melarita", "Ocejon", "Peñahueca", "Almanara",
"Ocenillo", "Bustarano", "Reinosa", "Urbieta", "Galarita"};
int [] alto ={1789, 1235, 1790, 2211, 2200, 1780, 1450, 2507, 1478, 2010};
TreeMap mapa;
mapa = new TreeMap(); // mapa vacío
for (int i = 0; i < montan.length; i++)
mapa.put(montan[i], new Integer(alto[i]));
System.out.println("\t Mapa creado \n" + mapa);
SortedMap su1, su2, su3;
su1 = mapa.subMap("B", "R"); // desde 'B' hasta 'R' (exclusive)
System.out.println("\t Submapa en el rango [B ... R) \n” + su1");
su2 = mapa.headMap("R"); // claves menores que 'R'
System.out.println("\t Submapa de claves menores que R \n" + su2);
su3 = mapa.tailMap("R"); // claves mayores o iguales que 'R'
System.out.println("\t Submapa de claves mayores que R \n" + su3);
System.out.println("Borra primer elemento: " +
mapa.remove(mapa.firstKey())); // borra el primer elemento
System.out.println("\t Mapa actual \n" + mapa);
}
}

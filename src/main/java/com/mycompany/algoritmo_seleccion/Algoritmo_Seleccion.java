/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo_seleccion;

import java.util.Scanner;




/**
 *
 * @author KAREN
 */
public class Algoritmo_Seleccion {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de atletas: ");
        int n = scanner.nextInt();

        int[] tiemposDeLlegada = new int[n];

        System.out.println("Ingrese los tiempos de llegada de los atletas:");
        for (int i = 0; i < n; i++) {
            System.out.print("Tiempo de llegada del corredor " + (i + 1) + ": ");
            tiemposDeLlegada[i] = scanner.nextInt();
        }

        System.out.println("Tiempos de llegada antes de ordenar:");
        imprimirArray(tiemposDeLlegada);

        ordenarPorSeleccion(tiemposDeLlegada);

        System.out.println("Tiempos de llegada después de ordenar:");
        imprimirArray(tiemposDeLlegada);

        scanner.close();
    }

    public static void ordenarPorSeleccion(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int indiMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[indiMinimo]) {
                    indiMinimo = j;
                }
            }

            // Intercambiar el elemento mínimo encontrado con el primer elemento no ordenado
            int temp = arr[indiMinimo];
            arr[indiMinimo] = arr[i];
            arr[i] = temp;
        }
    }

    public static void imprimirArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
        
                
                }


            
            
        
    




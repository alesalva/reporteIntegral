package org.alesalva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"
        System.out.println("Por favor ingrese el nombre del reporte");//Se pide un dato al usuario
        String reportOrder = br.readLine(); //Se lee el nombre con readLine() que retorna un String con el dato
        System.out.println("Por favor ingrese el nombre del reporte");//Se pide un dato al usuario
        String reportAdjudication = br.readLine();
        System.out.println("Por favor ingrese el nombre del reporte");//Se pide un dato al usuario
        String reportRegister = br.readLine();
        System.out.println("Por favor ingrese el nombre del reporte");//Se pide un dato al usuario
        String reportPayment = br.readLine();

        System.out.printf("Usted ha seleccionado los archivos: %s %s %s %s%n", reportOrder, reportAdjudication, reportRegister, reportPayment);
    }
}

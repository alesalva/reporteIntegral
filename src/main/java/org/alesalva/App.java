package org.alesalva;

import org.apache.poi.hssf.usermodel.*;

import org.apache.poi.ss.usermodel.Workbook;

import java.io.*;

public class App 
{
    private static final String NAME_ARCHIVE = "NameArchive.xls";
    private static final int FIRSTNUMROW = 0;

    public static void main(String[] args ) throws IOException {
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

        Workbook book = new HSSFWorkbook();

        HSSFSheet paper = (HSSFSheet) book.createSheet();
        HSSFRow file = paper.createRow(FIRSTNUMROW);

        file.createCell (0) .setCellValue ("Fecha de ingreso de pedido");
        file.createCell (1) .setCellValue ("Número de  pedido");
        file.createCell (2) .setCellValue ("Fecha de devolución");
        file.createCell (3) .setCellValue ("Dependencia");
        file.createCell (4) .setCellValue ("Importe");
        file.createCell (5) .setCellValue ("Número de adjudicación");
        file.createCell (6) .setCellValue ("Fecha pase adj");
        file.createCell (7) .setCellValue ("Fecha vuelta adj");
        file.createCell (8) .setCellValue ("Num Orden de compra");
        file.createCell (9) .setCellValue ("Fecha pase");
        file.createCell (10) .setCellValue ("Fuente financiam");
        file.createCell (11) .setCellValue ("Proveedor n°");
        file.createCell (12) .setCellValue ("Factura N°");
        file.createCell (13) .setCellValue ("Importe");
        file.createCell (14) .setCellValue ("Fecha pase");
        file.createCell (15) .setCellValue ("Fecha vto");
        file.createCell (16) .setCellValue ("N° IR");
        file.createCell (17) .setCellValue ("Importe IR");

        try {
            FileOutputStream out = new FileOutputStream(NAME_ARCHIVE);
            book.write(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

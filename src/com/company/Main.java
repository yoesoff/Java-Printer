package com.company;

public class Main {

    public static void main(String[] args) {
        var printerName = "Generic-Text-Only";
        System.out.println("test printer");

        PrinterService printerService = new PrinterService();
        System.out.println(printerService.getPrinters());
        printerService.printString(printerName, "testing testing 1 2 3eeeee \n test lagi kawann");
        printerService.printString(printerName, "testing testing 1 2 3eeeee");
        printerService.printString(printerName, "testing testing 1 2 3eeeee");
        printerService.printString(printerName, "testing testing 1 2 3eeeee");

        byte[] cutP = new byte[] { 0x1d, 'V', 1 };
        printerService.printBytes("Generic-Text-Only", cutP);

    }
}

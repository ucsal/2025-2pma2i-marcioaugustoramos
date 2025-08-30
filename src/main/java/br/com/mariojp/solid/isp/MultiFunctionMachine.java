package br.com.mariojp.solid.isp;

public class MultiFunctionMachine implements Printer, Scanner {
    @Override
    public void print(String content) {
        System.out.println("Imprimindo: " + content);
    }

    @Override
    public void scan(String targetFile) {
        System.out.println("Escaneando para: " + targetFile);
    }
}

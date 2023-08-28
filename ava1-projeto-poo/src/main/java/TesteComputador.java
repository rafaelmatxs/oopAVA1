import java.util.Scanner;

public class TesteComputador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Computador pc1 = new Computador("ASUS GEFORCE RTX 4080 TUF", "KINGSTON FURY BEAST RGB 64GB", 2048, 25000.0, "Intel i9");
        
        Computador pc2 = new Computador("ASUS RX 7900 XTX TUF GAMING OC", "CORSAIR VENGEANCE RGB RT 256GB", 2048, 13000.0, "Intel i7");
        
        Computador pc3 = new Computador();
        System.out.println("Os computadores 1 e 2 já foram salvos.");
        System.out.println("Informe os dados do Computador 3:");
        System.out.print("Placa de Vídeo: ");
        pc3.setVga(scanner.nextLine());
        System.out.print("Memória: ");
        pc3.setMemoria(scanner.nextLine());
        System.out.print("Hd (gigabytes): ");
        pc3.setHd(scanner.nextInt());
        System.out.print("Preço: ");
        pc3.setPreco(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Processador: ");
        pc3.setProcessador(scanner.nextLine());
        
        Computador pc4 = new Computador();
        System.out.println("\nInforme os dados do Computador 4:");
        System.out.print("Placa de Vídeo: ");
        pc4.setVga(scanner.nextLine());
        System.out.print("Memória: ");
        pc4.setMemoria(scanner.nextLine());
        System.out.print("Hd (gigabytes): ");
        pc4.setHd(scanner.nextInt());
        System.out.print("Preço: ");
        pc4.setPreco(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Processador: ");
        pc4.setProcessador(scanner.nextLine());
        
        System.out.println("\nDados do Computador 1:");
        pc1.imprimir();
        
        System.out.println("\nDados do Computador 2:");
        pc2.imprimir();
        
        System.out.println("\nDados do Computador 3:");
        pc3.imprimir();
        
        System.out.println("\nDados do Computador 4:");
        pc4.imprimir();
        
        scanner.close();
    }
}

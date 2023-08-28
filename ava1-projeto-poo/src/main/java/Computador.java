public class Computador {
    private String vga;
    private String memoria;
    private int hd;
    private double preco;
    private String processador;
    
    public Computador() {
    }
    
    public Computador(String vga, String memoria, int hd, double preco, String processador) {
        this.vga = vga;
        this.memoria = memoria;
        this.hd = hd;
        this.preco = preco;
        this.processador = processador;
    }
    public String getVga() {
        return vga;
    }
    
    public String getMemoria() {
        return memoria;
    }

    public int getHd() {
        return hd;
    }

    public double getPreco() {
        return preco;
    }

    public String getProcessador() {
        return processador;
    }

    public void setVga(String vga) {
        this.vga = vga;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
    
    
    public void imprimir() {
        System.out.println("Placa de Vídeo: " + vga);
        System.out.println("Memória(s): " + memoria);
        System.out.println("Hd: " + hd + " Gb");
        System.out.println("Preço: " + preco);
        System.out.println("Processador: " + processador);
    }
}
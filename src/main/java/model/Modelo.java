package main.java.model;

public enum Modelo {
    IPHONE3s("Cinza", "16gb", "2gb"),
    IPHONE4s("Branco", "32gb", "4gb"),
    IPHONE6("Dourado", "64gb", "4gb");

    private String cor, rom, ram;

    private Modelo(String cor, String rom, String ram) {
        this.cor = cor;
        this.rom = rom;
        this.ram = ram;
    }

    public String getCor() {
        return cor;
    }

    public String getRom() {
        return rom;
    }

    public String getRam() {
        return ram;
    }
}

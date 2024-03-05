public class Animale {
    private int puntiVita;
    private String nome;
    private Type type;

    public Animale(int puntiVita, Type type) {
        this.puntiVita = puntiVita;
        this.type = type;
    }

    public int getPuntiVita() {
        return puntiVita;
    }

    public String getNome() {
        String nome = "";
        switch (type) {
            case CANE:
                nome = "cane";
                break;
            case GATTO:
                nome = "gatto";
                break;
            case TOPO:
                nome = "topo";
                break;
            default:
                nome = "";
        }
        return nome;
    }

    public Type getType() {
        return this.type;
    }

    public void setPuntiVita(int puntiVita) {
        this.puntiVita = puntiVita;
    }
}

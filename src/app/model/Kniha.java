package app.model;

public class Kniha {
    private String nazov;
    private String autor;
    private int rokVydania;

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRokVydania() {
        return rokVydania;
    }

    public void setRokVydania(int rokVydania) {
        this.rokVydania = rokVydania;
    }

    public Kniha() {
    }

    public Kniha(String nazov, String autor, int rokVydania) {
        this.nazov = nazov;
        this.autor = autor;
        this.rokVydania = rokVydania;
    }

    @Override
    public String toString() {
        return "Kniha{" +
                "nazov='" + nazov + '\'' +
                ", autor='" + autor + '\'' +
                ", rokVydania=" + rokVydania +
                '}';
    }
}

package arraysclass;

public enum Lenguajes {

    JAVA(2),
    PHP(3),
    PYTHON(5);

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    private int anios;

    private Lenguajes(int anios) {
        this.anios = anios;
    }
}

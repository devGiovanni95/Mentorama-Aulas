package src.um;

public class Segunda{

    private void metodoPrivado() {
        Primeiro primeiro = new Primeiro();
        primeiro.metodoPublico();
        primeiro.metodoPrivado();
        primeiro.metodoProtected();
        primeiro.metodoDefault();
    }
}
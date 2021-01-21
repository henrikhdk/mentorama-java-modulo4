package um;

public class Segunda {

    private void metodoPrivado() {
        Primeiro primeiro = new Primeiro();
        primeiro.metodoPublico();
        primeiro.metodoProtected();
        Primeiro.metodoEstatico();
    }
}

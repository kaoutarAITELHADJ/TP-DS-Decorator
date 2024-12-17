package boissons;

public class Jus extends Boisson {
    public Jus (){
        description = "Jus";
    }

    @Override
    public double cout() {
        return 20;
    }
}

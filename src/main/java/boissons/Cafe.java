package boissons;

public class Cafe extends Boisson{
    public Cafe (){
        description = "Cafe";
    }

    @Override
    public double cout() {
        return 14;
    }
}

package boissons;

public class Cola extends Boisson{
        public Cola () {
            description = "Cola";
        }

        @Override
        public double cout() {
            return 10;
        }
    }



package pl.kkiljan.lesson18;

public enum Computation {

    MULTIPY{
        @Override
        public double perform(double x, double y) {
            return x*y;
        }
    },
    DIVIDE{
        @Override
        public double perform(double x, double y) {
            return x/y;
        }
    },
    ADD{
        @Override
        public double perform(double x, double y) {
            return x+y;
        }
    },
    SUBTRACT {
        @Override
        public double perform(double x, double y) {
            return x-y;
        }
    };



    public abstract double perform (double x, double y);


}

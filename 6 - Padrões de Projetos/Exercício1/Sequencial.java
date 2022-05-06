package Exercício1;

public final class Sequencial {
    private static long seq = 0;
    private static Sequencial instance;

    private Sequencial(){
    }

    public static Sequencial getInstance(){
//      if (instance == null) {
//          instance = new Sequencial();
//      }
//      return instance;
        return instance == null ? new Sequencial() : instance;
    }

    public long next() {
//      seq++;
//      return seq;
        return seq++;
    }

}

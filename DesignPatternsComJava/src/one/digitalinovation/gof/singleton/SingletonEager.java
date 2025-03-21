package one.digitalinovation.gof.singleton;

/**
 * Singleton "apressado"
 * 
 * @author gigi-tr
 */

 public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}

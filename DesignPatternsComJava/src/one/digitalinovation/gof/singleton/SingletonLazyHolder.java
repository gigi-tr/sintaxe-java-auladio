package one.digitalinovation.gof.singleton;

/**
 * Singleton "Lazy Holder"
 * 
 * @author gigi-tr
 */

 public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
        
    } 

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
package singleton;


public class Singleton {

    private static Singleton mySingleton;

    private Singleton() {}

    public static Singleton getInstance() {
        if(mySingleton == null) {
            mySingleton = new Singleton();
        }
        return mySingleton;
    }

    public void drawShape() {
        System.out.println("draw shape");
    }

}

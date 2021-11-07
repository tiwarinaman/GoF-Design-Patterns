package creational.singleton;

public class Singleton {
    private static Singleton singletonInstance;

    private Singleton() {
    }

    public static Singleton getSingletonInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }


    public static void main(String[] args) {
        int hashCode = Singleton.getSingletonInstance().hashCode();
        int hashCode1 = Singleton.getSingletonInstance().hashCode();
        System.out.println(hashCode);
        System.out.println(hashCode1);
    }
}
package Singleton.LazySingleton;

public class Driver {
    public static void main(String[] args) {
        LazySingleton lz = LazySingleton.getInstance();
        LazySingleton lz2 = LazySingleton.getInstance();
        if (lz == lz2) {
            System.out.println("True");
        }
    }


}

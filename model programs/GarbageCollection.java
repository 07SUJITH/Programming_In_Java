
public class GarbageCollection {
    public void finalize() {
        System.out.println("Object memory released ");
    }

    public static void main(String[] args) {
        GarbageCollection sample = new GarbageCollection();
        sample = null;
        System.gc();
    }
}

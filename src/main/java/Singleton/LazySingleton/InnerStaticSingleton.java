package Singleton.LazySingleton;

//This approach allows to avoid to take advantage of synchronized and is thread safe!!!
public class InnerStaticSingleton {
    private InnerStaticSingleton() {
    }

    private static class Impl {
        private static final InnerStaticSingleton Instance = new InnerStaticSingleton();
    }

    public InnerStaticSingleton getInstance() {
        return Impl.Instance;
    }
}

public class LazyInitalizedSingleton {
    private static LazyInitalizedSingleton instance;

    private LazyInitalizedSingleton(){};

    public static LazyInitalizedSingleton getInstance(){
        if (instance == null){
            instance = new LazyInitalizedSingleton();

        }
        return instance;
    }
}

/**
 * 非线程安全单例
 */
public class SingletonObjUnsafe {
    private static SingletonObjUnsafe instance;

    public static SingletonObjUnsafe getInstance() {
        if (instance == null) {
            instance = new SingletonObjUnsafe();
        }
        return instance;
    }
}

/**
 * 双检锁线程安全单例
 */
public class SingletonObjDcl {
    private static volatile SingletonObjDcl instance;

    public static SingletonObjDcl getInstance() {
        if (instance == null) {
            synchronized (SingletonObjDcl.class) {
                if (instance == null) {
                    instance = new SingletonObjDcl();
                }
            }
        }
        return instance;
    }
}

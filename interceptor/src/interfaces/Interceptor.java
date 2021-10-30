package interfaces;

public interface Interceptor {

    /**
     * 前处理
     * @param invocation 调用实例
     */
    void before(Invocation invocation);

    /**
     * 拦截调用
     * @return
     */
    Object intercept(Invocation invocation);

    /**
     * 后处理
     * @param invocation 调用实例
     */
    void after(Invocation invocation);

}

import interfaces.Interceptor;
import interfaces.Invocation;

public class InterceptorA implements Interceptor {
    @Override
    public void before(Invocation invocation) {
        System.out.println("interceptor A before invoke.");
    }

    @Override
    public Object intercept(Invocation invocation) {
        this.before(invocation);
        Object result = invocation.invoke();
        this.after(invocation);
        return result;
    }

    @Override
    public void after(Invocation invocation) {
        System.out.println("interceptor A after invoke.");
    }
}

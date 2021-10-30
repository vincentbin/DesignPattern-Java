import interfaces.Interceptor;
import interfaces.Invocation;

public class InterceptorB implements Interceptor {
    @Override
    public void before(Invocation invocation) {
        System.out.println("interceptor B before invoke.");
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
        System.out.println("interceptor B after invoke.");
    }
}

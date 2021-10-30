import interfaces.Interceptor;
import interfaces.Invocation;

import java.util.ArrayList;
import java.util.List;

public class InvocationHandler implements Invocation {
    private List<Interceptor> interceptors;
    private int index;

    public InvocationHandler() {
        this.interceptors = new ArrayList<>();
        this.interceptors.add(new InterceptorA());
        this.interceptors.add(new InterceptorB());
    }

    public Object invoke()  {
        if (this.index == this.interceptors.size()) {
            return this.businessLogic();
        }
        Interceptor interceptor = this.interceptors.get(index++);
        return interceptor.intercept(this);
    }

    /**
     * 最终执行的核心逻辑
     * @return
     */
    public String businessLogic() {
        System.out.println("execute core logic.");
        return "yanyibin";
    }
}

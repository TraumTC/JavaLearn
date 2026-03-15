package day19;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {

    private  Object obj=null;

    /**
     * 返回代理对象
     * 根据传入的委托对象创建动态代理类，在获取动态代理类的对象并返回
     * @param obj
     * @return
     */
    public Object bind(Object obj){
        this.obj=obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理启动了");
        Object result = method.invoke(obj, args);
        return result;
    }
}

package main.learn_list;
import java.util.Collection;

public class Collections {
    //容器类型一般叫作泛型（generic type），使用下述方式声明：
    interface Box<T> {
        void box(T t);
        //<T> 句法有个专门的名称——类型参数,因此，泛型还有一个名称--数化类型（parameterized type）。
        T unbox();
    }
    /*上述代码表明，Box 接口是通用结构，可以保存任意类型的负载。这不是一个完整的接口，
    更像是一系列接口的通用描述，每个接口对应的类型都能用在T 的位置上。 */
    interface List<E> extends Collection<E> {
        boolean add(E e);
        E get(int index);
    }
}

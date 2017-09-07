package main.learn_list2;

public class LinkedStack {
    // 这个静态成员接口定义如何链接对象
// static关键字是可选的，因为所有嵌套接口都是静态类型
    static interface Linkable {
        public Linkable getNext();
        public void setNext(Linkable node);
    }
    // 链表的头节点是一个Linkable对象
    Linkable head;
    // 方法主体省略了
    public void push(Linkable node) {  }
}


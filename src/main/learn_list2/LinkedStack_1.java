package main.learn_list2;

import java.util.Iterator;

public class LinkedStack_1 {
    // 静态成员接口
    public interface Linkable {
        public Linkable getNext();
        public void setNext(Linkable node);
    }
    // 链表的头节点
    private Linkable head;
    // 方法主体省略了
    //   public void push(Linkable node) { ... }
    //   public Linkable pop() { ... }
    // 这个方法返回一个Iterator对象，供LinkedStack类使用
    public Iterator<Linkable> iterator() { return new LinkedIterator(); }
    // 实现Iterator接口
// 定义为一个非静态成员类
    protected class LinkedIterator implements Iterator<Linkable> {
        Linkable current;
        // 构造方法用到了外层类的一个私有字段
        public LinkedIterator() { current = head; }
        // 下面三个方法由Iterator接口定义
        public boolean hasNext() { return current != null; }
        public Linkable next() {
            if (current == null)
                throw new java.util.NoSuchElementException();
            Linkable value = current;
            current = current.getNext();
            return value;
        }
        public void remove() { throw new UnsupportedOperationException(); }
    }
}

package main.learn_list2;
// 这个类实现前面定义的静态成员接口
class LinkableInteger implements LinkedStack.Linkable {
    // 这里是节点的数据和构造方法
    int i;
    public LinkableInteger(int i) { this.i = i; }
    // 这些是实现这个接口所需的数据和方法
    LinkedStack.Linkable next;
    public LinkedStack.Linkable getNext() { return next; }
    public void setNext(LinkedStack.Linkable node) { next = node; }
}
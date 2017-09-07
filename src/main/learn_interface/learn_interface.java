package main.learn_interface;

public class learn_interface {
    interface Centered{
        /* 定义接口 interface
        1.接口中所有强制方法都隐式使用abstract声明，不能有方法，要使用分号，可以用abstract,习惯省略
        2.接口定义公开的API,接口中的所有成员都隐式使用public声明，习惯省略public，接口使用protected/private定义，导致编译错误
        3.接口不能定义仁和实例字段,字段是实现细节,接口是规格不是实现，接口只能定义同时使用static和final声明的常量
        4.接口不能定义方法
        5.接口可以包含嵌套类型，嵌套类隐式使用public/static
        6.Java8 开始，接口可以包含静态方法,之前的Java版本不能用
        */
        void setCenter(double x,double y);
        double getCenterX();
        double getCenterY();
    }
    interface Positionable extends Centered {
        /* 拓展接口， extends
        1.接口拓展另外一个接口时，会继承父接口中的所有方法和常量，可以定义新方法和常量
        2.extends可以包含多个父接口
        3.拓展多个接口的接口，会继承每个父接口中的所有方法和常量，而且可以定义属于自己的方法和常量
        */
        void setUpperRightCorner(double x, double y);
        double getUpperRightX();
        double getUpperRightY();
    }
    public abstract class CenteredRetangle extends learn_Rectangle implements Centered{
        /*implement列出支持的一个或者多个接口
        1.这个类要为接口中的每个强制方法提供实现，如果没有提供实现，这个类从接口中继承未实现的抽象方法
        2.一个类实现多个接口，必须实现每个接口中的所有强制办法（否则需要使用abstract声明）
        3.在Java 中，接口和类一样，也是数据类型。如果一个类实现了一个接口，那么这个类的实例可以赋值给这个接口类型的变量
        */
        private double cx,cy;
        public CenteredRetangle(double cx,double cy,double w,double h){
            super(w,h);
            this.cx=cx;
            this.cy=cx;
        }
        public void setCenter(double x,double y){cx=x;cy=y;}
        public double getCenterX(){return cx;}
        public double getCenterY(){return cy;}
    }
    public interface Positionables extends Centered{
        /*
           1,.java 7之前是向后兼容性 (其中一个约束是，新发布的接口不能添加新的强制方法
           2.实现接口的类可以（但不是必须）实现默认方法
           3.如果实现接口的类实现了默认方法，那么使用这个类中的实现
           4.如果找不到其他实现，就使用默认实现
         */
        void setUpperRightCorner(double x,double y);
        double getUpperRightX();
        double getUpperRightY();
        void setLowerLeftCorner(double x,double y);
        double getLowerLeftX();
        double getLowerLeftY();
    }
    /*java.io.Serializable 接口就是一种标记接口
    实现Serializable 接口的类告诉ObjectOutputStream 类，这个类的实例可以安全地序列化。
    java.util.RandomAccess 也是标记接口：java.util.List 接口实现了这个接口，表明这个接口能快速随机访问列表中的元素。
    * */
}

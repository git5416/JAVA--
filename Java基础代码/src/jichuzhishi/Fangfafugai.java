package jichuzhishi;

/*
 * 回顾Java语言当中方法的重载：
 *     1.方法重载又称Overload
 *     2.方法重载什么时候使用？
 *         当在同一个类当中，方法完成的功能是相似的，建议方法名相同，这样方便程序员的编程
 *         就像在调用一个方法似的。代码美观。
 *     3.什么条件满足之后构成方法重载？
 *         * 在同一个类中
 *         * 方法名相同
 *         * 参数列表不同：类型、顺序、个数
 *
 *     4.方法重载和什么无关？
 *         * 和方法的返回值类型无关
 *         * 和方法的修饰符列表无关
 *
 * 关于Java语言当中方法的覆盖
 *     1.方法覆盖又被称为方法重写，英语：override【官方】
 *
 *     2.什么时候方法重写？
 *
 *         当父类中的方法已经无法满足当前子类的业务需求，
 *         子类有必要将父类中继承过来的方法进行重新编写，
 *         这个重写编写的过程称为方法重写/方法覆盖。
 *
 *     3.什么条件满足之后方法会发生重写呢？【代码满足什么条件之后，就构成方法的覆盖呢？】
 *
 *         方法重写发生在具有继承父子关系的父子类之间
 *         返回值类型相同，方法名相同，形参列表相同
 *         访问权限不能更低，可以更高。（比如public高于private）
 *         抛出异常不能更多，可以更少
 *
 *     4.建议方法重写的时候直接复制粘贴后再做修改，不然容易出错。
 *
 *     5.注意：
 *         私有方法不能继承，所以不能覆盖。
 *         构造方法不能继承，所以不能覆盖。
 *         静态方法不存在覆盖。
 *         覆盖只针对方法，不谈属性。
 */
public class Fangfafugai {

    public static void main(String[] args) {
        Fangfafugaitest f1 = new Fangfafugaitest();
        f1.move();
        Fangfafugaitest1 f2 = new Fangfafugaitest1();
        f2.move();
    }

}

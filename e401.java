import java.util.Scanner;

class A {
    // 父类Object类型
    Object get() {
        /* TODO：返回一个空对象 */
        A c = new A();
        return c;
    }
}

class B extends A {
    // 子类Integer类型
    Integer get() {
        System.out.println("请输入一个数");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt(); /* TODO：返回一个Integer对象 */
        Integer c = new Integer(s);
        return c;
    }
}

/*
 * 子类重写方法可以返回父类的子类型。父类Object类型，子类Integer类型，输入一个数，输出这个数。
 */
public class e401 {
    public static void main(String args[]) {
        B b = new B();
        Integer t = b.get();
        System.out.println(t.intValue());
    }
}

package lxy.DesignModel;
/*
    单例模式有两种创建方法，一种是饿汉单例模式，
    一种是懒汉单例模式。饿汉单例模式在单例类被加载的时候，就实例化一个对象交给自己使用；
    懒汉单例模式在调用取得实例方法的时候才会实例化对象。

【1】饿汉单例模式
 */
public class DanliMoshi {
    private DanliMoshi(){
        System.out.println("构造函数");

    }
    private static final DanliMoshi s = new DanliMoshi();

    private static DanliMoshi getInstance(){
        return s;
    }

    public static void main(String[] args) {
        DanliMoshi test = DanliMoshi.getInstance();

    }
}

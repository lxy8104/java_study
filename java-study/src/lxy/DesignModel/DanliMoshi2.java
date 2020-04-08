package lxy.DesignModel;

public class DanliMoshi2 {
    private DanliMoshi2(){
        System.out.println("构造函数");
    }
    private static DanliMoshi2 danliMoshi2 = null;

    private static DanliMoshi2 getInstance() {
        if(danliMoshi2==null){
            danliMoshi2 = new DanliMoshi2();
        }
        return danliMoshi2;
    }

    public static void main(String[] args) {
        DanliMoshi2 test2 = DanliMoshi2.getInstance();
        DanliMoshi2 test3 = new DanliMoshi2();
//        DanliMoshi test4 = new DanliMoshi();
    }
}

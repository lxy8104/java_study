package lxy.abstractFactoryModel;

public class MercedesWheelFactory implements WheelFactory {
    @Override
    public String createWheel() {
        System.out.println("奔驰轮胎工厂生产轮胎");
        return "奔驰轮胎";
    }
}

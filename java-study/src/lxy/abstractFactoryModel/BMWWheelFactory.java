package lxy.abstractFactoryModel;

public class BMWWheelFactory implements WheelFactory {
    @Override
    public String createWheel() {
        System.out.println("宝马轮胎工厂生产轮胎");
        return "宝马轮胎";
    }
}

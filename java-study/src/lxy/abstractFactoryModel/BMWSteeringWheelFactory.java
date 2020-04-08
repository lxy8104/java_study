package lxy.abstractFactoryModel;

public class BMWSteeringWheelFactory implements SteeringWheelFactory {
    @Override
    public String createSteeringWheel() {
        System.out.println("宝马方向盘工厂生产方向盘");
        return "宝马方向盘";
    }
}

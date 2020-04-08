package lxy.abstractFactoryModel;

public class MercedesSteeringWheelFactory implements SteeringWheelFactory {

    @Override
    public String createSteeringWheel() {
        System.out.println("奔驰方向盘工厂生产方向盘");
        return "奔驰方向盘";
    }
}

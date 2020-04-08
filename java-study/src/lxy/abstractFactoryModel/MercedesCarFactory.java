package lxy.abstractFactoryModel;

public class MercedesCarFactory implements AbstractFactory {
    @Override
    public void installWheel() {
        WheelFactory wheelFactory = new MercedesWheelFactory();
        String wheel = wheelFactory.createWheel();
        System.out.println("安装轮胎"+wheel);
    }

    @Override
    public void installSteeringWheel() {
        SteeringWheelFactory steeringWheelFactory = new MercedesSteeringWheelFactory();
        String steeringWheel = steeringWheelFactory.createSteeringWheel();
        System.out.println("安装方向盘"+steeringWheel);
    }
}

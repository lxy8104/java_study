package lxy.abstractFactoryModel;

public class BMWCarFactory implements AbstractFactory {
    @Override
    public void installWheel() {
        WheelFactory wheelFactory = new BMWWheelFactory();
        String wheel = wheelFactory.createWheel();
        System.out.println("安装轮胎"+wheel);
    }

    @Override
    public void installSteeringWheel() {
        SteeringWheelFactory steeringWheelFactory = new BMWSteeringWheelFactory();
        String steeringWheel = steeringWheelFactory.createSteeringWheel();
        System.out.println("安装方向盘"+steeringWheel);
    }
}

package lxy.abstractFactoryModel;

public class AbstractModelTest {
    public static void main(String[] args) {
        AbstractFactory bwmFactory = new BMWCarFactory();
        bwmFactory.installSteeringWheel();
        bwmFactory.installWheel();

        AbstractFactory mercedesCarFactory = new MercedesCarFactory();
        mercedesCarFactory.installWheel();
        mercedesCarFactory.installSteeringWheel();
    }
}

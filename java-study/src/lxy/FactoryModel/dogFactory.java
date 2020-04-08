package lxy.FactoryModel;

public class dogFactory implements Factory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}

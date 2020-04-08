package lxy.FactoryModel;

public class catFactory implements Factory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}

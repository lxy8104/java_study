package lxy.FactoryModel;

public class Test {
    public static void main(String[] args) {
        Factory catfactory = new catFactory();
        Animal cat = catfactory.createAnimal();
        Factory dogfactory = new catFactory();
        Animal dog = dogfactory.createAnimal();
        cat.eat();
        dog.eat();
    }
}

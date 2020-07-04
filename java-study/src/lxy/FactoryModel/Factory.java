package lxy.FactoryModel;

public interface Factory {
    int in = 1;



    public abstract Animal createAnimal();
    default int res(){
        return 1;
    }
    static int test(){
        return 0;
    }
}

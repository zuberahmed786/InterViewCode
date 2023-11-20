package designPattern;

public class FactoryMain {

    public static void main(String[] args) {
        FactoryProduct factoryProductA = new ConProdFactoryA();
        Product product = factoryProductA.createFactory();
        product.create();

        FactoryProduct factoryProductB = new ConProdFactoryB();
        Product product1 = factoryProductB.createFactory();
        product1.create();
    }
}

interface Product{
    void create();
}

class ProductA implements Product{

    @Override
    public void create() {
        System.out.println("Product A is created..");
    }
}

class ProductB implements Product{
    public void create(){
        System.out.println("Product B is Created..");
    }
}

// factory interface

interface FactoryProduct{
     Product createFactory();
}

class ConProdFactoryA implements FactoryProduct{


    @Override
    public Product createFactory() {
        return new ProductA();
    }
}
class ConProdFactoryB implements FactoryProduct{

    public Product createFactory(){
        return new ProductB();
    }
}
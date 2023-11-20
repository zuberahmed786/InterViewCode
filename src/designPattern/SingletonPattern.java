package designPattern;

 public class SingletonPattern {

    private static SingletonPattern singletonPattern;

    private SingletonPattern(){

    }

    public static SingletonPattern getInstance(){

        if (singletonPattern==null){
           singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }
}

 class Example{
     public static void main(String[] args) {
         SingletonPattern ins1 = SingletonPattern.getInstance();
         SingletonPattern ins2 = SingletonPattern.getInstance();

         System.out.println(ins1==ins2);
     }

}

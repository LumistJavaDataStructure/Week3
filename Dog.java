package Animal;

public class Dog extends Animal implements CanSleep, CanEat{



    @Override
    public void sleep(int seconds) {
        System.out.println("The dog has slept" + seconds + "s");
    }

    @Override
    public void eat(String food) {
        System.out.println("The dog has eaten " + food);
    }

    @Override
    public void greeting() {
        System.out.println("Wang wang wang");
    }
}

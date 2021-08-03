package Animal;

public class Cat extends Animal implements CanEat, CanSleep{


    @Override
    public void eat(String food) {
        System.out.println("The cat has eaten " + food);
    }

    @Override
    public void sleep(int seconds) {
        System.out.println("The cat has slept " + seconds + "s");
    }

    @Override
    public void greeting() {
        System.out.println("Meow meow meow");
    }
}

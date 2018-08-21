public class Dog extends Animal implements Pet{
    int size;
    String breed;
    String name;

    void bark() {
        System.out.println("Гав! Гав! Гав!");
    }

    @Override
    public void beFriendlyd() {
        System.out.println("Friend dog");
    }

    @Override
    public void play() {
        System.out.println("Ham ham");

    }
}

public class AnimalTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog a = new Dog();
        Cat c  = new Cat("Liusi");
        Duck d = new Duck(42);
        list.add(a);
        list.add(c);
        list.add(d);

        if( a.equals(c)) {
            System.out.println("true");
            } else System.out.println("false");
        System.out.println(c.hashCode());
        System.out.println(c.toString());
        System.out.println(c.getClass());
        Hippo h = new Hippo("Baffi");
        System.out.println(h.getName());
        System.out.println(c.getName());
        list.add(h);

    }
}

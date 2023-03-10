package Laboratory.Lab06.Task04;

public class Child extends Parent {
    public Child(Integer number) {
        super(number);
    }

    public void printNumber() {
        System.out.println(super.number);
    }
}

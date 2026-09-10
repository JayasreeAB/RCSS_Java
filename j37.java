class J38{
    private T value;
    Box(T value) {
        this.value = value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public void display() {
        System.out.println("Value: " + value);
    }
}
public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(10);
        intBox.display();

        // String type
        Box<String> strBox = new Box<>("Hello");
        strBox.display();
    }
}

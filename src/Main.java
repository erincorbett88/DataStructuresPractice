public class Main {
    public static void main(String[] args) {
        Array newArray = new Array(3);
        newArray.print();
        newArray.insert(10);
        newArray.insert(20);
        newArray.insert(30);
        newArray.insert(40);
        newArray.removeAt(1);
        newArray.print();
    }
}
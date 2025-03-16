public class Main {
    public static void main(String[] args) {
        Array newArray = new Array(3);
        newArray.insert(10);
        newArray.insert(20);
        newArray.insert(30);
        newArray.print();
        System.out.println(newArray.indexOf(30));
        System.out.println(newArray.indexOf(23));
    }
}
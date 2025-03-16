public class Array {
    //we are storing our array items in a regular java array
    private int[] items;

    private int count;

    //initializer
    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        //if array is full, resize it
        //add new item at the end of current array
        items[count] = item;
        count++;
        //can also say items[count++]=item;

    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }


}

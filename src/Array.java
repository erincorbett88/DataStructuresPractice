public class Array {
    //we are storing our array items in a regular java array
    private int[] items;

    private int count;

    //initialize
    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count*2];
            System.out.println("resized array to " + count*2);
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count] = item;
        count++;
    }

    public void removeAt(int index){
        //validate index is in correct range (ie can't be negative one, or bigger than size of array)
        if ( index < 0 || index >= count )
            throw new IllegalArgumentException();
        // i - index just copy
        // at index, items[i] = items i++
        // if index==count, i = 0
        for (int i=index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
        //this count-- will change what is printed in the print function
        //actual array items holds on to this value unless changed to zerp
    }

    public int indexOf(int index) {
        for (int i=0; i < count; i++) {
            if (index == items[i]) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }


}

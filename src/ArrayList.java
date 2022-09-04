import java.util.ArrayList;
import java.util.List;

class ArrayListDemo {

    public static void main(String[] args) {
        List colours = new ArrayList();
        // add element in array
//        colours.add("red");
//        colours.add("blue");
//        colours.add("green");
//        colours.add("hi");
//        colours.add("ji",3)
//        colours.add("hi");
        colours.add(5);
        colours.add(30);
        colours.set(1,3);

        System.out.println(" colours = " +  colours);
    }
}

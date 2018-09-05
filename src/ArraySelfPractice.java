import java.awt.*;

public class ArraySelfPractice {
    public static void main(String[] args) {
        int[] array = {4, 8, 12, 16, 20};
        
        String[] stringArray = {"Hi", "Hello", "Hey"};
        
        for (int element: array) {
            System.out.println(element);
        }
        
        array[4]=24;
        for (int element: array) {
            System.out.println(element);
        }
        
        for (String element: stringArray) {
            System.out.println(element);
        }
        
        int[] newArray = {2, 4, 6, 8};
        for (int element: newArray) {
            System.out.println(element);
        }
        
    }
}

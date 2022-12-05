import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Random random = new Random();
        int[] array = new int[6];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 1)  +0);
            System.out.println(array[i]);


        }
    }
}
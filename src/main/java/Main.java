import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        printStartEnd(2,10);

        System.out.println(printList(2,9));

        //listStartEnd(1,5);
    }

    //A method that prints the numbers from A to B
    public static void printStartEnd(int start, int end) {

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
    }

    //A method that returns a list containing the numbers from A to B

    public static List<Integer> printList(int start, int end) {

        List<Integer> result = new ArrayList<Integer>();
        for (int i = start; i <= end; i++) {
            result.add(i);
        }
        return result;
    }

    /** another solution
    public static void listStartEnd(int start, int end) {

        List<Integer> numbers = Arrays.asList(2,4,5,7,9,11);
        for (int number : numbers) {
            //System.out.print(number + " ");
            if (number == end) {
                break;
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            int n = numbers.get(i);
            //System.out.println(n);
            if (n == end) {
                break;
            }
        }
    }
    */
}




import java.util.ArrayList;
import java.util.List;

public class Exercise {

    private int first;
    private int last;
    private int noLast;
    private int noFirst;

    public Exercise(int start, int end) {
        this.first = start;
        this.last = end;
        this.noLast = end - 1;
        this.noFirst = start + 1;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }

    public int getNoLast() {
        return noLast;
    }

    public void setNoLast(int noLast) {
        this.noLast = noLast;
    }
    public int getNoFirst() {
        return noFirst;
    }

    public void setNoFirst(int noFirst) {
        this.noFirst = noFirst;
    }

    //A method that prints the numbers from A to B

    public void printFirstToLast() {

        for (int i = first; i <= last; i++) {
            System.out.println(i);
        }
    }


    //A method that returns a list containing the numbers from A to B

    public List<Integer> printList() {

        List<Integer> result = new ArrayList<Integer>();
        for (int i = first; i <= last; i++) {
            result.add(i);
        }
        return result;
    }

    //Think of a way to choose whether you want to include A and/or B in
    // the lists you print/return. For example, let's say A is 3 and B is 7,
    // and you want to include A but exclude B. The resulting
    // list would be 3, 4, 5, 6. (the 7 won't be included).
    // You may add more fields to your class.

    public List<Integer> listNoLast() {

        List<Integer> result = new ArrayList<Integer>();
        for (int i = first; i < last; i++) {
            result.add(i);
        }
        return result;
    }

    public List<Integer> listNoFirstLast() {

        List<Integer> result = new ArrayList<Integer>();
        for (int i = noFirst; i <= noLast; i++) {
            result.add(i);
        }
        return result;
    }

    public List<Integer> listNoFirst() {

        List<Integer> result = new ArrayList<Integer>();
        for (int i = noFirst; i <= last ; i++) {
            result.add(i);
        }
        return result;
    }



    /** another solution
     public static void listStartEnd(int first, int last) {

     List<Integer> numbers = Arrays.asList(2,4,5,7,9,11);
     for (int number : numbers) {
     //System.out.print(number + " ");
     if (number == last) {
     break;
     }
     }

     for (int i = 0; i < numbers.size(); i++) {
     int n = numbers.get(i);
     //System.out.println(n);
     if (n == last) {
     break;
     }
     }
     }
     */
}


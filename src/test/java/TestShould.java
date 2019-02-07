import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class TestShould {

    @Test
    public void correct_test_list() {

        Exercise test = new Exercise(2,5);

        List<Integer> actual = test.printList();

        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void incorrect_test_list(){

        Exercise test = new Exercise(2,9);

        List<Integer> actual = test.printList();

        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);

        Assert.assertNotEquals(expected,actual);
    }

    @Test
    public void correct_list_no_last() {

        Exercise test = new Exercise(3,7);

        List<Integer> actual = test.listNoLast();

        List<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void correct_list_no_first() {

        Exercise test = new Exercise(3,7);

        List<Integer> actual = test.listNoFirst();

        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void correct_list_no_first_last() {

        Exercise test = new Exercise(3,7);

        List<Integer> actual = test.listNoFirstLast();

        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        expected.add(5);
        expected.add(6);

        Assert.assertEquals(expected,actual);
    }
}



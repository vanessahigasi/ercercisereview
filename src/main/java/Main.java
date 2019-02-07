public class Main {

    public static void main(String[] args) {

        Exercise e = new Exercise(3,7);

        e.printFirstToLast();

        System.out.println(e.listNoLast());
        System.out.println(e.listNoFirst());
        System.out.println(e.listNoFirstLast());

        e.setFirst(15);
        e.setLast(22);

        System.out.println(e.printList());
    }

}




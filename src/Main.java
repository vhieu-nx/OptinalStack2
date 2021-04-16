import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IntStack is = new IntStack(10);
        //push things in stack
        is.push(4);
        is.push(5);
        is.push(8);
        is.push(7);
        is.push(8);
        is.push(3);
        is.push(10);
        System.out.println("Value Delete");
        int k = is.pop();
        System.out.println(k);

        System.out.println("Array Stack");
        is.print();


        System.out.println("Bottom");
        //Rachel -- reverse stack
        IntStack is_rev = is.reverseStack();
        int bottom = is_rev.pop();
        System.out.println(bottom);
//
//        //Rachel -- sort
//        IntStack is_sort = is.sort();
//        is_sort.print();
//
//        //testing peek all method
//        int[] mm = is.peekAll();
//        System.out.println(Arrays.toString(mm));
//        //testing peek at position 2
//        int p = is.peekAt(2);
//        System.out.println(p);
//
//        // tests for depth:
//        int d = is.depth();
//        System.out.println(d);
//
//        //peek all
//        int[] mmm = is.peekAll();
//        System.out.println(Arrays.toString(mmm));
//        //restoring stack
//        is.push(7);
//        is.push(5);
//        is.push(3);
//        is.push(2);
//        //peek all
//        int[] mmmm = is.peekAll();
//        System.out.println(Arrays.toString(mmmm));
//        //tests for popall:
//
//        is.push(4);
//        is.push(5);
//        is.push(6);
//
//        int[] j = is.popAll(); //i expect an array of size 3 with 6,5,4
//        System.out.println(Arrays.toString(j));
//        // test for ascend
//        is.push(4);
//        is.push(5);
//        is.push(6);
//
//        int[] l = is.ascend(); // i expect an array of size 3 with 4,5,6
//        System.out.println(Arrays.toString(l));
//        //test for descend
//        is.push(4);
//        is.push(5);
//        is.push(6);
//        int[] m = is.descend(); // i expect an array of size 3 with 6,5,4
//        System.out.println(Arrays.toString(m));


    }
}

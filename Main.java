
import java.util.*;
class Main {
  public static void main(String[] args) {
    
    Set<Integer> Numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Set<Integer> NumbersEven = new HashSet<>(Arrays.asList(2, 4, 6, 8, 10, 12));
        Set<Integer> NumbersOdd = new HashSet<>(Arrays.asList(1, 3, 5, 7, 9));

        //Difference between Numbers and NumbersOdd
        Set<Integer> C1 = new HashSet<Integer>();
        C1.addAll(Numbers);
        System.out.println("Numbers before difference: " + C1);
        C1.removeAll(NumbersOdd);
        System.out.println("Numbers after difference with NumberOdd set: " + C1);

        //Difference between Numbers and NumbersEven
        Set<Integer> C2 = new HashSet<Integer>();
        C2.addAll(Numbers);
        System.out.println("Numbers before difference: " + C2);
        C2.removeAll(NumbersEven);
        System.out.println("Numbers after difference with NumberEven set: " + C2);

        //Remove 4 from all sets  boolean isremoved = newset.remove("Easy");
        boolean isremoved1 = Numbers.remove(4);
        System.out.println("Four is removed from Numbers set: " + isremoved1);
        boolean isremoved2 = NumbersEven.remove(4);
        System.out.println("Four is removed from NumbersEven set: " + isremoved2);
        boolean isremoved3 = NumbersOdd.remove(4);
        System.out.println("Four is removed from NumbersOdd set: " + isremoved3);
        boolean isremoved4 = C1.remove(4);
        System.out.println("Four is removed from C1 set: " + isremoved4);
        boolean isremoved5 = C2.remove(4);
        System.out.println("Four is removed from C2 set: " + isremoved5);

        //Determine is NumbersEven is a subset of Numbers

        if (Numbers.containsAll(NumbersEven))
            System.out.println("NumbersEven is a subset of Numbers");
        else
            System.out.println("NumbersEven is not a subset of Numbers");

        //Determine is NumbersOdd is a subset of Numbers
        if (Numbers.containsAll(NumbersOdd))
            System.out.println("NumbersOdd is a subset of Numbers");
        else
            System.out.println("NumbersOdd is not a subset of Numbers");


  }
}
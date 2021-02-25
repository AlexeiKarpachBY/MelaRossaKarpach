package OOP.HW_Sets;

import java.util.*;


public class SetOperations {



    public SetOperations() {
    }

    public void union(HashSet a, HashSet b) {

        a.addAll(b);
    }

    public void minus(HashSet a, HashSet b) {
        a.removeAll(b);
    }

    public void intersection(HashSet a, HashSet b) {
        a.retainAll(b);
    }

  /*  public void difference(HashSet a, HashSet b) {
        a.containsAll(b);
    }*/


    public String toString() {
        return "SetOperations{}";
    }


}











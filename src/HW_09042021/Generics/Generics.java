package HW_09042021.Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    List list = new ArrayList();

    public void returnElement(int a) {
        list.add(3);
        list.add(0.3);
        list.add("List");
        list.add("Arrays");
        list.add(3.1415926535897932384626433832795);
        list.add(324234241234L);
        System.out.println(list.get(a));
    }
}

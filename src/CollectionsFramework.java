import java.util.*;
import java.io.*;
public class CollectionsFramework
{
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add(1, "Charan");
        list.add(2, "Vignesh");
        System.out.println(list);
        list.remove("Hello");
        list.set(1,"Vignesh");
        System.out.println(list.contains("Charan"));
        System.out.println(list);
    }
}

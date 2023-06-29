package Charan.JavaCourse;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
    List<T> list = new ArrayList<>();
    public void addElem(T elem){
        list.add(elem);
    }
    public void delElem(T elem){
        list.remove(elem);
    }
    public T getElem(int index){
        return list.get(index);
    }
    public void setElem(int index,  T elem){
        list.set(index, elem);
    }
    public String toString(){
        return list.toString();
    }

}


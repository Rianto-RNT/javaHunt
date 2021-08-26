package javaHunts;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(string[] args){
        LinkedList list= new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list.contains(10));
        System.out.println(list.indexOf(10));
        System.out.println(list.size());
        var array = list.toArray();
        System.out.println(Arrays.toString(Array));
    }
}
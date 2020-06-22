/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author User
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        List list2 = new ArrayList();
        list.add(1);
        list.add("Hello");
        list.add(100.45);
        list.add(true);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        
        List<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(20);
        list3.add(30);
        //print
        for(Integer i : list3){
            System.out.print("   " + i);
        }
        //print 2
        Iterator<Integer> ito = list3.iterator();
        //print 3
        while(ito.hasNext()){
            System.out.print("   " + ito.next());
        }
    }
    
}

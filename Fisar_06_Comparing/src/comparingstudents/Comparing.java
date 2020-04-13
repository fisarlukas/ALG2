/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparingstudents;

import static comparingstudents.MyCompairing.print;
import static comparingstudents.MyCompairing.sort;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Luky3
 */
public class Comparing {
    public static void main(String[] args) {
        Student[] students = Datasource.loadDataAsArray();
        print(students);
        System.out.println("");
        System.out.println("Sort by number:");
        //sortByNumber(students);
        Arrays.sort(students); //students musi byt typově komapatibilní
        print(students);
        
        List<Student> students1 = Datasource.loadDataAsList();
        print(students1);
        System.out.println("");
        System.out.println("Sort by number:");
        //sortByNumber(students);
        Collections.sort(students1); //students musi byt typově komapatibilní
        print(students);
    }
}

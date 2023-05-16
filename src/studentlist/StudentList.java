/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

import java.util.Scanner;

/**
 *
 * @author Juan Alvarez
 */
public class StudentList {

    //hello this is comment
    //hello this is rollback/revert commit
    public static void main(String[] args) {
      Student s1 = new Student("Ronak", "s1");
      //Scanner input = new Scanner(System.in);
      Student[] studentList = new Student[3];
      studentList[0]=s1;
      studentList[1]= new Student("abc", "s2");
      studentList[2]= new Student("def", "s3");
      
      for(int i = 0; i<studentList.length; i++){
          System.out.println(studentList[i].getSname());
      }
      
    }
    
}

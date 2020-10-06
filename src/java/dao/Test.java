/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Academic_Program;
import domain.Department;
import domain.Faculity;
import domain.Gender;
import domain.Health_Status;
import domain.Payment_Mode;
import domain.Student;
import java.util.Date;

/**
 *
 * @author kpeng Emmanuel
 */
public class Test {

    public static void main(String[] args) {
        
        Activities<Student> dao = new Activities<>();
        Department sta = new Department(new Faculity(1), "Accounting");
        
        
        
        //Department dep = new Department(new Faculity(1), "Accounting");
        //Student sta = new Student(new Department(1),
                //3, 
                //"Ntaganda", 
                //"gerard", 
                //new Date(), 
                //Academic_Program.Evening, 
                //Health_Status.Excellent, 
                //Payment_Mode.OtherMode, 
                //Gender.MALE, 
                //"enmkagawa@gmail",
                //"1997895678");
               // "Arstide",
                //"Messi",
                //new Date(),
                //Academic_Program.Evening,
                //Health_Status.Excellent,
                //Payment_Mode.OtherMode,
                //Gender.MALE,
                //"1997095678");
        
                
                
        //dao.registerStudent(sta);
        //dao.updateStudent(sta);
        
    }
    //public static void main(String[] args) {
    //new dao.Activities<>()
    //.registerStudent(new Student(new Department(1),"KP", "BUDUNYURI PUPURI", new Date(), Academic_Program.Evening, Health_Status.Excellent, Payment_Mode.OtherMode, Gender.MALE, "1990"));
    // }
    
}

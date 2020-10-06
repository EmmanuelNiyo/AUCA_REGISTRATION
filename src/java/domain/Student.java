/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author kpeng Emmanuel
 */
@Entity
public class Student implements Serializable {

    @ManyToOne
    private Department department;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNumber;
    private String firstname;
    private String othername;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dob;
    @Enumerated(EnumType.STRING)
    private Academic_Program academic_Program;
    @Enumerated(EnumType.STRING)
    private Health_Status health_Status;
    @Enumerated(EnumType.STRING)
    private Payment_Mode payment_Mode;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String email;
    private String nationalId;
    private boolean approved = false;
    public Student() {
    }

    public Student(Department department, String firstname, String othername, Date dob, Academic_Program academic_Program, Health_Status health_Status, Payment_Mode payment_Mode, Gender gender,String email, String nationalId) {
        this.department = department;
        this.firstname = firstname;
        this.othername = othername;
        this.dob = dob;
        this.academic_Program = academic_Program;
        this.health_Status = health_Status;
        this.payment_Mode = payment_Mode;
        this.gender = gender;
        this.email = email;
        this.nationalId = nationalId;
    }

    public Student(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Student(Department department, int rollNumber, String firstname, String othername, Date dob, Academic_Program academic_Program, Health_Status health_Status, Payment_Mode payment_Mode, Gender gender,String email, String nationalId) {
        this.department = department;
        this.rollNumber = rollNumber;
        this.firstname = firstname;
        this.othername = othername;
        this.dob = dob;
        this.academic_Program = academic_Program;
        this.health_Status = health_Status;
        this.payment_Mode = payment_Mode;
        this.gender = gender;
        this.email = email;
        this.nationalId = nationalId;
    }
    
    
    
    
    
    

    

    
    
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getOthername() {
        return othername;
    }

    public void setOthername(String othername) {
        this.othername = othername;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
     public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
    
      public Academic_Program getAcademic_Program() {
        return academic_Program;
    }

    public void setAcademic_Program(Academic_Program academic_Program) {
        this.academic_Program = academic_Program;
    }

    public Health_Status getHealth_Status() {
        return health_Status;
    }

    public void setHealth_Status(Health_Status health_Status) {
        this.health_Status = health_Status;
    }

    public Payment_Mode getPayment_Mode() {
        return payment_Mode;
    }

    public void setPayment_Mode(Payment_Mode payment_Mode) {
        this.payment_Mode = payment_Mode;
    }
    
    

    

      
    
}

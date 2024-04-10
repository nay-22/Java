package com.example.test.demo.model;

public class User {
    private String fname;
    private String lname;
    private String email;
    private String pass;
    private String dob;
    private String gender;
    
    public String getFname() {
        return fname;
    }
    public String getLname() {
        return lname;
    }
    public String getEmail() {
        return email;
    }
    public String getPass() {
        return pass;
    }
    public String getDob() {
        return dob;
    }
    public String getGender() {
        return gender;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "User [fname=" + fname + ", lname=" + lname + ", email=" + email + ", pass=" + pass + ", dob=" + dob
                + ", gender=" + gender + "]";
    }
    
}

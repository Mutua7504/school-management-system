/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author sniper
 */
public class Lecture {
    private String name;
    private int age;
    private String gender;
    private String staffId;
    private String department;
    private String contactNumber;
    private String email;
    private List<Course> coursesTaught;

    public Lecturer(String name, int age, String gender, String staffId, String department,
                    String contactNumber, String email, List<Course> coursesTaught) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.staffId = staffId;
        this.department = department;
        this.contactNumber = contactNumber;
        this.email = email;
        this.coursesTaught = coursesTaught;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(List<Course> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    // Add a course to the lecturer's list of courses taught
    public void addCourseTaught(Course course) {
        this.coursesTaught.add(course);
    }

    // Remove a course from the lecturer's list of courses taught
    public void removeCourseTaught(Course course) {
        this.coursesTaught.remove(course);
    }
}

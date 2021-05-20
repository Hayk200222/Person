package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String sex;
    private String passportld;

    public String getPassportld() {
        return passportld;
    }

    public void setPassportld(String passportld) {
        if (passportld.charAt(0) == 'A' && passportld.charAt(1) == 'N' && passportld.length() < 9) {
            this.passportld = passportld;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() > 3 && firstName.length() < 15) {
            this.firstName = firstName;
        } else {
            System.out.println("firstName is invalid");

        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() > 6 && lastName.length() < 20) {
            this.lastName = lastName;
        } else {
            System.out.println("lastName is invalid");

        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18 && age < 99) {
            this.age = age;
        } else {
            System.out.println("Age is invalid");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        String male = "male";
        String female = "female";
        if (sex.compareToIgnoreCase(male) == 0 || sex.compareToIgnoreCase(female) == 0) {
            this.sex = sex;
        } else {
            System.out.println("sex is invalid");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", passportld='" + passportld + '\'' +
                '}';
    }

    public void display() {
        System.out.println(toString());


    }
}

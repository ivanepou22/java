package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100){
            age = 0;
        }
        this.age = age;
    }

    public boolean isTeen(){
        System.out.println(getAge());
        if (getAge() > 12 && getAge() < 20){
            return true;
        }
        return false;
    }

    public String getFullName(){
         String surName, givenName;
         surName = getFirstName();
         givenName = getLastName();
          if (surName.isEmpty() && givenName.isEmpty()){
              return "";
          } else if (givenName.isEmpty()){
              return surName;
          } else if (surName.isEmpty()){
              return givenName;
          } else {
              return surName + " " + givenName;
          }

    }
}

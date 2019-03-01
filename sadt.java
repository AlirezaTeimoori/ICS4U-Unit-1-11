
//---------------------------------------
//-- Created by:     Alireza Teimoori  --
//-- Created on:     Feb 12 2019       --
//-- Created for:    Unit 1-08         --
//-- Course Code:    ICS4U             --
//-- Teacher Name:   Chris Atkinson    --
//---------------------------------------
//-- This program generates random     --
//-- numbers and add them to array and --
//-- find the maximum and minimum in it--
//----------------------------------------

enum GRADES { // Intro type GRADES

    // parameters:
    JK(-1),
    SK(0),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    ELEVEN(11),
    TWELVE(12);

    private final Integer grade;

    Grades(String grade) {
        this.grade = grade;
    }

}

class Student { // Intro student class

    // Creating variables:
    public String _firstName;
    public String _lastName;
    public String _middleName;
    public String _Birth;
    public GRADES _grade;

}

class SADT { // Main class


    public static void main(String[] args) { // Main fucntion
        System.out.println("test!");
    }
}
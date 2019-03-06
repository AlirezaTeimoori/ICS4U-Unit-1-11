
//---------------------------------------
//-- Created by:     Alireza Teimoori  --
//-- Created on:     Feb 12 2019       --
//-- Created for:    Unit 1-11         --
//-- Course Code:    ICS4U             --
//-- Teacher Name:   Chris Atkinson    --
//---------------------------------------
//-- This program shows the use of enum--
//-- with classes and storing data     --
//----------------------------------------

import java.util.Scanner;
import java.util.ArrayList;

enum GRADES { // Intro type GRADES

    // Intro parameters:
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

    GRADES(Integer grade) { // Intro constructor

        // Assign variables:
        this.grade = grade;
    }
    
    public Integer getGrade(){ // Intro function

        // returns the grade
        return this.grade;
    }

}

class Student { // Intro student class

    // Create variables:
    public String _firstName;
    public String _lastName;
    public String _middleName;
    public String _birth;
    public GRADES _grade;

    // Intro constructor:
    public Student(String firstName, String lastName, String middleName, String birth, GRADES grade) {

        // Assign variables:
        _firstName = firstName;
        _lastName = lastName;
        _middleName = middleName;
        _birth = birth;
        _grade = grade;
        
    }
}

class sadt { // Main class
    public static void main(String[] args) { // Main fucntion

        // Intro the on/off swich of the program
        boolean moreStudents = true;
        
        // Create a List for students
        ArrayList<Student> studentList = new ArrayList<Student>();

        for (int counter = 0; moreStudents == true; counter ++){

            // Intro variables in appropriate scope :D
            String firstName;
            String lastName;
            String middleName;
            String birth;
            GRADES grade;
            String gradeString;

            // Create an instance of Scanner
            Scanner scanner = new Scanner(System.in);

            // Ask for and store data:
            System.out.print( "Student #" + ( counter + 1 ) + " first name: \n\t" );
            firstName = scanner.nextLine();
            System.out.print( "Student #" + ( counter + 1 ) + " last name: \n\t" );
            lastName = scanner.nextLine();
            System.out.print( "Student #" + ( counter + 1 ) + " middle name: \n\t" );
            middleName = scanner.nextLine();
            System.out.print( "Student #" + ( counter + 1 ) + " date of birth (DD/MM/YYYY): \n\t" );
            birth = scanner.nextLine();
            System.out.print( "Student #" + ( counter + 1 ) + " grade (as plain text: JK-TWELVE): \n\t" );
            gradeString = scanner.nextLine();
            
            // Convert String to GRADES
            grade = GRADES.valueOf(gradeString.toUpperCase());

            // Create new Student and pass the variables in
            Student thisStudent = new Student ( firstName, lastName, middleName, birth, grade);

            // Add the student created above to the List 
            studentList.add(thisStudent);

            // Output
            System.out.print("Current Students are: \n");

            for (Student student : studentList) { // For each student in the List
                
                // Print out the data in a comprehensible from
                System.out.println( "\t" + ( studentList.indexOf ( student ) + 1 ) + ") " + student._firstName + " " + student._middleName.charAt(0) + ". " + student._lastName);
                System.out.println( "\t   " + "Born on " + student._birth );
                System.out.println( "\t   Grade " + student._grade + "\n" );

            }

            // Ask to stop the program
            System.out.print(" Stop the Program? ( Y / N ): \t");
            // Store response in "now"
            String now = scanner.nextLine();

            // If the respone is "Y", it will switch the continuation of the program to false
            if (now.equals("Y")) moreStudents =  false;
        }
    }
}

package StudentManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Custom Exceptions
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

// Student Class
class Student {
    private String id;
    private String name;
    private int age;
    private char grade;

    public Student(String id, String name, int age, char grade) throws InvalidAgeException, InvalidGradeException {
        this.id = id;
        this.name = name;
        
        // Validate age
        if (age < 5 || age > 100) {
            throw new InvalidAgeException("Age must be between 5 and 100");
        }
        this.age = age;
        
        // Validate grade
        grade = Character.toUpperCase(grade);
        if (grade < 'A' || grade > 'F') {
            throw new InvalidGradeException("Grade must be between A and F");
        }
        this.grade = grade;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 5 || age > 100) {
            throw new InvalidAgeException("Age must be between 5 and 100");
        }
        this.age = age;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) throws InvalidGradeException {
        grade = Character.toUpperCase(grade);
        if (grade < 'A' || grade > 'F') {
            throw new InvalidGradeException("Grade must be between A and F");
        }
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}

// Student Management System Class
class StudentManagementSystem {
    private Map<String, Student> students;

    public StudentManagementSystem() {
        students = new HashMap<>();
    }

    // 1. Add Student
    public void addStudent(String id, String name, int age, char grade) 
            throws InvalidAgeException, InvalidGradeException {
        Student student = new Student(id, name, age, grade);
        students.put(id, student);
    }

    // 2. Remove Student
    public void removeStudent(String id) throws StudentNotFoundException {
        if (!students.containsKey(id)) {
            throw new StudentNotFoundException("Student with ID " + id + " not found");
        }
        students.remove(id);
    }

    // 3. Update Student Details
    public void updateStudent(String id, String name, Integer age, Character grade) 
            throws StudentNotFoundException, InvalidAgeException, InvalidGradeException {
        Student student = students.get(id);
        if (student == null) {
            throw new StudentNotFoundException("Student with ID " + id + " not found");
        }

        if (name != null) {
            student.setName(name);
        }
        if (age != null) {
            student.setAge(age);
        }
        if (grade != null) {
            student.setGrade(grade);
        }
    }

    // 4. Search Student by Name
    public List<Student> searchStudentByName(String name) {
        List<Student> result = new ArrayList<>();
        for (Student student : students.values()) {
            if (student.getName().equalsIgnoreCase(name)) {
                result.add(student);
            }
        }
        return result;
    }

    // 5. List All Students
    public List<Student> listAllStudents() {
        return new ArrayList<>(students.values());
    }

    // Helper method to get student by ID
    public Student getStudentById(String id) throws StudentNotFoundException {
        Student student = students.get(id);
        if (student == null) {
            throw new StudentNotFoundException("Student with ID " + id + " not found");
        }
        return student;
    }
}

// Main Class to Test the Student Management System
public class StudentManagement {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();

        try {
            // Add students
            sms.addStudent("S001", "Alice Johnson", 18, 'A');
            sms.addStudent("S002", "Bob Smith", 19, 'B');
            sms.addStudent("S003", "Charlie Brown", 20, 'C');

            // List all students
            System.out.println("All Students:");
            for (Student student : sms.listAllStudents()) {
                System.out.println(student);
            }

            // Search student by name
            System.out.println("\nSearch for 'Alice Johnson':");
            List<Student> searchResults = sms.searchStudentByName("Alice Johnson");
            for (Student student : searchResults) {
                System.out.println(student);
            }

            // Update student
            sms.updateStudent("S002", "Robert Smith", 20, 'A');
            System.out.println("\nAfter updating Bob Smith:");
            System.out.println(sms.getStudentById("S002"));

            // Remove student
            sms.removeStudent("S003");
            System.out.println("\nAfter removing Charlie Brown:");
            for (Student student : sms.listAllStudents()) {
                System.out.println(student);
            }

            // Test exceptions
            // sms.addStudent("S004", "David Wilson", 3, 'A'); // Will throw InvalidAgeException
            // sms.addStudent("S005", "Eva Green", 25, 'G'); // Will throw InvalidGradeException
            // sms.getStudentById("S999"); // Will throw StudentNotFoundException
            // sms.updateStudent("S999", "John Doe", 21, 'B'); // Will throw StudentNotFoundException

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
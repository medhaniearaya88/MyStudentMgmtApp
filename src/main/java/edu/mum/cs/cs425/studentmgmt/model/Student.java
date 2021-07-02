package edu.mum.cs.cs425.studentmgmt.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long studentId;
private String studentNumber;
private String firstName;
private String middleName;
private String lastName;
private double cgpa;
private LocalDate dateOfEnrollment;
@OneToOne(cascade = CascadeType.PERSIST)
@JoinColumn(name = "transcriptId",nullable = true)
private Transcript transcript;
@ManyToOne(cascade = CascadeType.PERSIST)
@JoinColumn(name = "classroomId",nullable = true)
private Classroom classroom;

    public Student() {
    }

    public Student(Long studentId, String studentNumber, String firstName, String middleName,
                   String lastName, double cgpa, LocalDate dateOfEnrollment) {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public Student(Long studentId, String studentNumber, String firstName, String middleName, String lastName,
                   double cgpa, LocalDate dateOfEnrollment, Transcript transcript, Classroom classroom) {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
        this.transcript=transcript;
        this.classroom=classroom;
    }

    public Student(String studentNumber, String firstName, String middleName, String lastName,
                   double cgpa, LocalDate dateOfEnrollment, Transcript transcript, Classroom classroom) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
        this.transcript = transcript;
        this.classroom = classroom;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Long getStudentId() {
        return studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getCgpa() {
        return cgpa;
    }

    public LocalDate getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cgpa=" + cgpa +
                ", dateOfEnrollment=" + dateOfEnrollment +
                '}';
    }
}

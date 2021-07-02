package edu.mum.cs.cs425.studentmgmt;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.repository.StudentRepository;
import edu.mum.cs.cs425.studentmgmt.repository.TranscriptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner {
    @Autowired
    private StudentRepository studentRepository;
    private TranscriptRepository transcriptRepository;
    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtAppApplication.class,args);
    }
    public void run(String...args) throws Exception{
        Transcript t1=new Transcript("BS Computer Science");
        Classroom c1=new Classroom("Maclaughlin building","M105");
        Student s1=new Student("000-61-0001","Anna","Lynn",
                "Smith",3.45, LocalDate.of(2019,5,24),t1,c1);
//        List<Student> studentList=new ArrayList<>();
//        studentList.add(s1);
       // c1.setStudents(studentList);
       // t1.setStudent(s1);
      //  saveTranscript(t1);
       //saveClassroom(c1);
        saveStudent(s1);
    }
    public void saveStudent(Student student){
        System.out.println("Saving Student");
        this.studentRepository.save(student);
    }
    public void saveTranscript(Transcript transcript){
        System.out.println("Saving Transcript");
        this.transcriptRepository.save(transcript);
    }
    public void saveClassroom(Classroom classroom){
        System.out.println("Saving ClassRoom");
    }

}

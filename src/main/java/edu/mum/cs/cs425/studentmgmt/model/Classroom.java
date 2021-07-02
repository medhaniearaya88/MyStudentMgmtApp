package edu.mum.cs.cs425.studentmgmt.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "classroom")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer classRoomId;
    private String buildingName;
    private String roomNumber;
    @OneToMany(mappedBy = "classroom")
    private List<Student> students;

    public Classroom(Integer classRoomId, String buildingName, String roomNumber) {
        this.classRoomId = classRoomId;
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
    }

    public Classroom(String buildingName, String roomNumber) {
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
    }

    public Classroom() {

    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public long getClassRoomId() {
        return classRoomId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public List<Student> getStudents() {
        return students;
    }
}

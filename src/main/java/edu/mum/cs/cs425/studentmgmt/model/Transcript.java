package edu.mum.cs.cs425.studentmgmt.model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="transcript")
public class Transcript {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transcriptId;
    private String degreeTitle;
    @OneToOne(mappedBy = "transcript")
    //@JoinColumn(name="studentId", nullable = true)
    private Student student;

    public Transcript() {
    }

    public Transcript(Integer transcriptId, String degreeTitle) {
        this.transcriptId = transcriptId;
        this.degreeTitle = degreeTitle;
    }

    public Transcript(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public long getTranscriptId() {
        return transcriptId;
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    @Override
    public String toString() {
        return "Transcript{" +
                "transcriptId=" + transcriptId +
                ", degreeTitle='" + degreeTitle + '\'' +
                '}';
    }
}

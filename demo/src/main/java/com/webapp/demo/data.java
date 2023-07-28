package com.webapp.demo;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student_Details")
public class data {
    private String id;
    private String name;
    private String DOB;
    private String branch;
    private String GPA;

    public data(String id, String name, String DOB, String branch,String GPA) {
        this.id = id;
        this.name = name;
        this.DOB = DOB;
        this.branch = branch;
        this.GPA=GPA;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getbranch() {
        return branch;
    }

    public void setbranch(String branch) {
        this.branch = branch;
    }

    public String getGPA() {
        return GPA;
    }

    public void setGPA(String GPA) {
        this.GPA = GPA;
    }

}

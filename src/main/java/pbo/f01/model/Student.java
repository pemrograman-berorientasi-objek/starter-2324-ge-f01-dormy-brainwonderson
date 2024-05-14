package pbo.f01.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity	
@Table(name = "students")
public class Student {
    @Id
    @Column(name = "id", nullable = false, length = 255)
    private String id;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "year", nullable = false, length = 255)
    private String year; // Changed from entranceYear

    @Column(name = "gender", nullable = false, length = 255)
    private String gender;

    @ManyToOne
    private Dorm dorm;

    public Student() {
        this.id = "";
        this.name = "";
        this.year = "";
        this.gender = "";
    }

    public Student(String id, String name, String year, String gender) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.gender = gender;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Dorm getDorm() {
        return dorm;
    }

    public void setDorm(Dorm dorm) {
        this.dorm = dorm;
    }

    @Override
    public String toString() {
        return id + "|" + name + "|" + year; // Adjusted to use year instead of entranceYear
    }    
}

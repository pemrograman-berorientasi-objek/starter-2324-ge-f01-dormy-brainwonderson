package pbo.f01.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "dorms")
public class Dorm {
    @Id
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Column(name = "capacity", nullable = false, length = 255)
    private int capacity;
    @Column(name = "gender", nullable = false, length = 255)
    private String gender;

    public Dorm() {
        this.name = "";
        this.capacity = 0;
        this.gender = "";
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Dorm [name=" + name + ", capacity=" + capacity + ", gender=" + gender + "]";
    }
}

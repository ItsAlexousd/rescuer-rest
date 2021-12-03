package fr.annette.rescuer.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Rescuer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private String jobTitle;
    private String imageUrl;
    private int rescues;

    public Rescuer() {}

    public Rescuer(String firstName, String lastName, String jobTitle, String imageUrl, int rescues) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.imageUrl = imageUrl;
        this.rescues = rescues;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getRescues() {
        return rescues;
    }

    public void setRescues(int rescues) {
        this.rescues = rescues;
    }

    @Override
    public String toString() {
        return "Rescuer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", rescues=" + rescues +
                '}';
    }
}
package com.nazzobricaria.model;

import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;

@Entity
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="status_id")
    private int statusID;
    private String status;

    public Status() {
    }

    public Status(int statusID, String status) {
        this.statusID = statusID;
        this.status = status;
    }

    public int getStatusID() {
        return statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Status{" +
                "statusID=" + statusID +
                ", status='" + status + '\'' +
                '}';
    }
}

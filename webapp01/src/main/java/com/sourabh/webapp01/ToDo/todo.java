package com.sourabh.webapp01.ToDo;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ToDo 
{
    public ToDo() {
    }

    private int id;
    private String userName;

    // @Size(min = 4, message = "Enter minimum 4 character")
    // @NotNull
    String description;
    private LocalDate targetDate;
    private boolean done;

    public ToDo(int id, String userName, String description, LocalDate targetDate, boolean done) 
    {
        super();
        this.id = id;
        this.userName = userName;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "ToDo [id=" + id + ", userName=" + userName + ", description=" + description + ", targetDate="
                + targetDate + ", done=" + done + "]";
    }  
    
}

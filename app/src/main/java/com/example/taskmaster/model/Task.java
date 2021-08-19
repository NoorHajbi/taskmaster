package com.example.taskmaster.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

//The state should be one of "new", "assigned", "in progress", or "complete".
@Entity
public class Task {

    @PrimaryKey(autoGenerate = true)
    long id;

    @ColumnInfo(name = "task_title")
    String title;
    String body;
    State state;

    public Task(String title, String body) {
        this.title = title;
        this.body = body;
        this.state = State.NEW;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}

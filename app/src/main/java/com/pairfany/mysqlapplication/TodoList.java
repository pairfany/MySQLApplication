package com.pairfany.mysqlapplication;

import java.io.Serializable;

/**
 * Created by user on 10/2/2560.
 * 57160498 Thitikamon Hassakhet
 */

public class TodoList implements Serializable{

    public int taskid;
    public String taskname;

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public int getTaskid() {
        return taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }
}
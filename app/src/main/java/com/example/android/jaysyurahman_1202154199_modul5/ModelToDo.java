package com.example.android.jaysyurahman_1202154199_modul5;

/**
 * Created by Jaysyurahman on 25/03/2018.
 */

public class ModelToDo {

    private int id;
    private String Name;
    private String Description;
    private int Priority;

    public ModelToDo(String name, String description, int priority) {
        Name = name;
        Description = description;
        Priority = priority;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPriority() {
        return Priority;
    }

    public void setPriority(int priority) {
        Priority = priority;
    }
}

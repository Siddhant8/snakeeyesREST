package com.example.spring;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Info {
    private @Id @GeneratedValue Long id;

    public String unit;
    public String content;


    public Info(String unit, String content){
        this.unit = unit;
        this.content = content;
    }

    public Info() {}

    public Long getId() {
        return this.id;
    }

    public String getUnit(){
        return this.unit;
    }

    public String getContent(){
        return this.content;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setContent(String content) {
        this.content = content;
    }





    @Override
    public String toString() {
        return "CSA{" + "id=" + this.id + ", Unit='" + this.unit + '\'' + ", Content='" + this.content + '\'' + '}';
    }

}
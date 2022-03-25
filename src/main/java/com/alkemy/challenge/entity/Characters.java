package com.alkemy.challenge.entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Characters {

    @Id
    @GeneratedValue(generator="uuid")
    @GenericGenerator(name="uuid",strategy="uuid2")
    private String id;
    private String img;
    private String name;
    private Integer age;
    private Integer weight;
    private String life ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getLife() {
        return life;
    }

    public void setLife(String life) {
        this.life = life;
    }
}

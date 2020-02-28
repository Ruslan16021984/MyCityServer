package com.gmail.carbit3333333.mycity.entity;

import javax.persistence.*;

@Entity
@Table(name = "news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "idowner")
    private String idowner;

    @Column(name = "titlenews")
    private String titlenews;

    @Column(name = "bodynews")
    private String bodynews;

    @Column(name = "linkphoto")
    private String linkphoto;

    public News() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdowner() {
        return idowner;
    }

    public void setIdowner(String idowner) {
        this.idowner = idowner;
    }

    public String getTitlenews() {
        return titlenews;
    }

    public void setTitlenews(String titlenews) {
        this.titlenews = titlenews;
    }

    public String getBodynews() {
        return bodynews;
    }

    public void setBodynews(String bodynews) {
        this.bodynews = bodynews;
    }

    public String getLinkphoto() {
        return linkphoto;
    }

    public void setLinkphoto(String linkphoto) {
        this.linkphoto = linkphoto;
    }
}

package com.gmail.carbit3333333.mycity.entity;

import javax.persistence.*;

@Entity
@Table(name = "phonesbook")
public class Phonesbook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "companyname")
    private String companyname;

    @Column(name = "tel")
    private String tel;

    public Phonesbook() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Phonesbook{" +
                "id=" + id +
                ", companyname='" + companyname + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}

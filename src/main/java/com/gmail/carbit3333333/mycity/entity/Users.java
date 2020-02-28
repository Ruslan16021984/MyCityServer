package com.gmail.carbit3333333.mycity.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "uniquenumuser")
    private String uniquenumuser;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "tel")
    private String tel;

    @Column(name = "linkphoto")
    private String linkphoto;

    public Users() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUniquenumuser() {
        return uniquenumuser;
    }

    public void setUniquenumuser(String uniquenumuser) {
        this.uniquenumuser = uniquenumuser;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getLinkphoto() {
        return linkphoto;
    }

    public void setLinkphoto(String linkphoto) {
        this.linkphoto = linkphoto;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", uniquenumuser='" + uniquenumuser + '\'' +
                ", nickname='" + nickname + '\'' +
                ", tel='" + tel + '\'' +
                ", linkphoto='" + linkphoto + '\'' +
                '}';
    }
}

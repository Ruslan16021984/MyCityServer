package com.gmail.carbit3333333.mycity.entity;

import javax.persistence.*;

@Entity
@Table(name = "sales")
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "idowner")
    private String idowner;

    @Column(name = "titlesale")
    private String titlesale;

    @Column(name = "bodysale")
    private String bodysale;

    @Column(name = "percentsale")
    private String percentsale;

    @Column(name = "pricesale")
    private String pricesale;

    @Column(name = "lat")
    private String lat;

    @Column(name = "lon")
    private String lon;

    @Column(name = "linkphoto")
    private String linkphoto;

    public Sales() {
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

    public String getTitlesale() {
        return titlesale;
    }

    public void setTitlesale(String titlesale) {
        this.titlesale = titlesale;
    }

    public String getBodysale() {
        return bodysale;
    }

    public void setBodysale(String bodysale) {
        this.bodysale = bodysale;
    }

    public String getPercentsale() {
        return percentsale;
    }

    public void setPercentsale(String percentsale) {
        this.percentsale = percentsale;
    }

    public String getPricesale() {
        return pricesale;
    }

    public void setPricesale(String pricesale) {
        this.pricesale = pricesale;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLinkphoto() {
        return linkphoto;
    }

    public void setLinkphoto(String linkphoto) {
        this.linkphoto = linkphoto;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "id=" + id +
                ", idowner='" + idowner + '\'' +
                ", titlesale='" + titlesale + '\'' +
                ", bodysale='" + bodysale + '\'' +
                ", percentsale='" + percentsale + '\'' +
                ", pricesale='" + pricesale + '\'' +
                ", lat='" + lat + '\'' +
                ", lon='" + lon + '\'' +
                ", linkphoto='" + linkphoto + '\'' +
                '}';
    }
}

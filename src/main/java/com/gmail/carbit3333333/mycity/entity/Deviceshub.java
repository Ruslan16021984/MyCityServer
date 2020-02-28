package com.gmail.carbit3333333.mycity.entity;

import javax.persistence.*;

@Entity
@Table(name = "deviceshub")
public class Deviceshub {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "idservice")
    private String idservice;

    @Column(name = "mqttlink")
    private String mqttlink;

    @Column(name = "mqttlogin")
    private String mqttlogin;

    @Column(name = "mqttpass")
    private String mqttpass;

    @Column(name = "mqtttopic")
    private String mqtttopic;

    public Deviceshub() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdservice() {
        return idservice;
    }

    public void setIdservice(String idservice) {
        this.idservice = idservice;
    }

    public String getMqttlink() {
        return mqttlink;
    }

    public void setMqttlink(String mqttlink) {
        this.mqttlink = mqttlink;
    }

    public String getMqttlogin() {
        return mqttlogin;
    }

    public void setMqttlogin(String mqttlogin) {
        this.mqttlogin = mqttlogin;
    }

    public String getMqttpass() {
        return mqttpass;
    }

    public void setMqttpass(String mqttpass) {
        this.mqttpass = mqttpass;
    }

    public String getMqtttopic() {
        return mqtttopic;
    }

    public void setMqtttopic(String mqtttopic) {
        this.mqtttopic = mqtttopic;
    }

    @Override
    public String toString() {
        return "Deviceshub{" +
                "id=" + id +
                ", idservice='" + idservice + '\'' +
                ", mqttlink='" + mqttlink + '\'' +
                ", mqttlogin='" + mqttlogin + '\'' +
                ", mqttpass='" + mqttpass + '\'' +
                ", mqtttopic='" + mqtttopic + '\'' +
                '}';
    }
}

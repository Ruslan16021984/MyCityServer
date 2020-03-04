package com.gmail.carbit3333333.mycity.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "datasweather")
public class Datasweather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "macdevice")
    private String macdevice;
    @Column(name = "nodeid")
    private String nodeid;
    @Column(name = "nodebat")
    private String nodebat;
    @Column(name = "data1")
    private String data1;
    @Column(name = "data2")
    private String data2;
    @Column(name = "data3")
    private String data3;
    @Column(name = "data4")
    private String data4;
    @Column(name = "rssi")
    private String rssi;
    @Column(name = "datetime")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date datetime;

    public Datasweather() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMacdevice() {
        return macdevice;
    }

    public void setMacdevice(String macdevice) {
        this.macdevice = macdevice;
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid;
    }

    public String getNodebat() {
        return nodebat;
    }

    public void setNodebat(String nodebat) {
        this.nodebat = nodebat;
    }

    public String getData1() {
        return data1;
    }

    public void setData1(String data1) {
        this.data1 = data1;
    }

    public String getData2() {
        return data2;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }

    public String getData3() {
        return data3;
    }

    public void setData3(String data3) {
        this.data3 = data3;
    }

    public String getData4() {
        return data4;
    }

    public void setData4(String data4) {
        this.data4 = data4;
    }

    public String getRssi() {
        return rssi;
    }

    public void setRssi(String rssi) {
        this.rssi = rssi;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "Datasweather{" +
                "id=" + id +
                ", macdevice='" + macdevice + '\'' +
                ", nodeid='" + nodeid + '\'' +
                ", nodebat='" + nodebat + '\'' +
                ", data1='" + data1 + '\'' +
                ", data2='" + data2 + '\'' +
                ", data3='" + data3 + '\'' +
                ", data4='" + data4 + '\'' +
                ", rssi='" + rssi + '\'' +
                ", datetime=" + datetime +
                '}';
    }
}

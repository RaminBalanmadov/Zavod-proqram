package com.kursisipervin.model;

public class DangerLimit {

    private int id;
    private String name;
    private double coxasagi;
    private double asagi;
    private double norma;
    private double yuxari;
    private double coxyuxari;
    private String dangerMaxParam;
    private String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCoxasagi() {
        return coxasagi;
    }

    public void setCoxasagi(double coxasagi) {
        this.coxasagi = coxasagi;
    }

    public double getAsagi() {
        return asagi;
    }

    public void setAsagi(double asagi) {
        this.asagi = asagi;
    }

    public double getNorma() {
        return norma;
    }

    public void setNorma(double norma) {
        this.norma = norma;
    }

    public double getYuxari() {
        return yuxari;
    }

    public void setYuxari(double yuxari) {
        this.yuxari = yuxari;
    }

    public double getCoxyuxari() {
        return coxyuxari;
    }

    public void setCoxyuxari(double coxyuxari) {
        this.coxyuxari = coxyuxari;
    }

   

    public String getDangerMaxParam() {
        return dangerMaxParam;
    }

    public void setDangerMaxParam(String dangerMaxParam) {
        this.dangerMaxParam = dangerMaxParam;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

package com.epidemic.epidemic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Simulation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String N;
    private long P;
    private long I;
    private double R;
    private double M;
    private int Ti;
    private int Tm;
    private int Ts;

    public Simulation(String n, long p, long i, double r, double m, int ti, int tm, int ts) {
        N = n;
        P = p;
        I = i;
        R = r;
        M = m;
        Ti = ti;
        Tm = tm;
        Ts = ts;
    }

    public Simulation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getN() {
        return N;
    }

    public void setN(String n) {
        N = n;
    }

    public long getP() {
        return P;
    }

    public void setP(long p) {
        P = p;
    }

    public long getI() {
        return I;
    }

    public void setI(long i) {
        I = i;
    }

    public double getR() {
        return R;
    }

    public void setR(float r) {
        R = r;
    }

    public double getM() {
        return M;
    }

    public void setM(float m) {
        M = m;
    }

    public int getTi() {
        return Ti;
    }

    public void setTi(short ti) {
        Ti = ti;
    }

    public int getTm() {
        return Tm;
    }

    public void setTm(short tm) {
        Tm = tm;
    }

    public int getTs() {
        return Ts;
    }

    public void setTs(short ts) {
        Ts = ts;
    }
}



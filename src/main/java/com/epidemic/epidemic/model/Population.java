package com.epidemic.epidemic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Population {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long Pi;
    private Long Pv;
    private Long Pm;
    private Long Pr;

    public Population(Long pi, Long pv, Long pm, Long pr) {
        Pi = pi;
        Pv = pv;
        Pm = pm;
        Pr = pr;
    }

    public Population() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPi() {
        return Pi;
    }

    public void setPi(Long pi) {
        Pi = pi;
    }

    public Long getPv() {
        return Pv;
    }

    public void setPv(Long pv) {
        Pv = pv;
    }

    public Long getPm() {
        return Pm;
    }

    public void setPm(Long pm) {
        Pm = pm;
    }

    public Long getPr() {
        return Pr;
    }

    public void setPr(Long pr) {
        Pr = pr;
    }
}

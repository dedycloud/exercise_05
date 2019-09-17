package com.enigma.model;

import java.util.Arrays;
import java.util.Objects;

public class People {
    String  namaTeman;

    public People(String namaTeman) {
        this.namaTeman = namaTeman;
    }

    public String getNamaTeman() {
        return ""+namaTeman + ",";
    }

    public void setNamaTeman(String namaTeman) {
        this.namaTeman = namaTeman;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return namaTeman.equals(people.namaTeman);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namaTeman);
    }


}

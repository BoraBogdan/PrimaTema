package com.borabogdan;

public class Buletin {
    private long cnp;
    private String adresa;

    public long getCnp() {
        return cnp;
    }

    public void setCnp(long cnp) {
        this.cnp = cnp;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "{" +
                "cnp=" + cnp +
                ", adresa='" + adresa + '\'' +
                '}';
    }
}

package com.company.data;

public class Magazine extends Objeto {

    private final String Org;
    private final Integer Vol;
    private final Integer numero;


    public Magazine(String name, Integer ano, String Org, Integer vol, Integer numero){
        super(name,ano);
        this.Org = Org;
        this.Vol = vol;
        this.numero = numero;

    }

    public String getOrg() {
        return Org;
    }

    public Integer getVol() {
        return Vol;
    }

    public Integer getNumero() {
        return numero;
    }

    public String toString() {
        return "Revista: " + super.getName() + ", " + + super.getAno() + ", " + getOrg()+ ", " + getVol()+ ", " + getNumero() + '\n';
    }

}

package gostyle.api.entities;
import javax.persistence.*;

import javax.persistence.*;


@Entity
    @Table(name = "promotions")

public class Promotion
{
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "code")
    private String code;
    @Column(name = "montant")
    private Float montant;
    @Column(name = "type_devise")
    private String type_devise;
    @Column(name = "url")
    private String url;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Float getMontant() {
        return montant;
    }

    public void setMontant(Float montant) {
        this.montant = montant;
    }

    public String getType_devise() {
        return type_devise;
    }

    public void setType_devise(String type_devise) {
        this.type_devise = type_devise;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}

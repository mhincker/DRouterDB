package com.renault.drouter.drouter.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Dealer {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column
    private String uid;
    @Column
    private String name;
    @Column
    @ElementCollection(targetClass=Service.class)
    private Set<Service> services;

    public Dealer() {}

    public Dealer(String uid, String name) {
        this.uid = uid;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "Dealer[id=%d, uid='%s', name='%s']",
                id, uid, name);
    }

    @ManyToMany(mappedBy = "dealers")
    public Set<Service> getServices() {
        return services;
    }

    public void setServices(Set<Service> services) {
        this.services = services;
    }
}

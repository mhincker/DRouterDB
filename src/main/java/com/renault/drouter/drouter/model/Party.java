package com.renault.drouter.drouter.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "r_party",uniqueConstraints=@UniqueConstraint(columnNames={"uid"}))
public class Party {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name="uid", nullable = false, length = 20)
    private String uid;
    @ManyToOne
    @JoinColumn(name = "dms_id")
    private Party dms;
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Party parent;
    @Column(length = 100)
    private String name;
    @Column(length = 50)
    private String type;
    @Column(length = 50)
    private String role;
    @OneToMany(mappedBy="dms")
    private Set<Route> routedByDms;
    @OneToMany(mappedBy="recipient")
    private Set<Route> routedByRecipient;
    @OneToMany(mappedBy="recipientSpe")
    private Set<Route> routedByRecipientSpe;
    @OneToMany(mappedBy="parent")
    private Set<Party> parentParty;

    public Party() {}


    public Party(String uid, Party dms, Party parent, String name, String type, String role) {
        this.uid = uid;
        this.dms = dms;
        this.parent = parent;
        this.name = name;
        this.type = type;
        this.role = role;

    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Party getDms() {
        return dms;
    }

    public void setDms(Party dms) {
        this.dms = dms;
    }

    public Party getParent() {
        return parent;
    }

    public void setParent(Party parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Set<Route> getRoutedByDms() {
        return routedByDms;
    }

    public void setRoutedByDms(Set<Route> routedByDms) {
        this.routedByDms = routedByDms;
    }

    public Set<Route> getRoutedByRecipient() {
        return routedByRecipient;
    }

    public void setRoutedByRecipient(Set<Route> routedByRecipient) {
        this.routedByRecipient = routedByRecipient;
    }

    public Set<Route> getRoutedByRecipientSpe() {
        return routedByRecipientSpe;
    }

    public void setRoutedByRecipientSpe(Set<Route> routedByRecipientSpe) {
        this.routedByRecipientSpe = routedByRecipientSpe;
    }

    public Set<Party> getParentParty() {
        return parentParty;
    }

    public void setParentParty(Set<Party> parentParty) {
        this.parentParty = parentParty;
    }

    @Override
    public String toString() {
        return String.format(
                "Party[id=%d, uid='%s', dms='%s', parent='%s', name='%s', type='%s', role='%s']",
                id, uid, dms, parent, name, type, role);
    }

}

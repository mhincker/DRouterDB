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
    private String uId;
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


    public Party(String uId, Party dms, Party parent, String name, String type, String role) {
        this.uId = uId;
        this.dms = dms;
        this.parent = parent;
        this.name = name;
        this.type = type;
        this.role = role;

    }

    @Override
    public String toString() {
        return String.format(
                "Party[id=%d, uId='%s', dms='%s', parent='%s', name='%s', type='%s', role='%s']",
                id, uId, dms, parent, name, type, role);
    }

}

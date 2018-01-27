package com.renault.drouter.drouter.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "dms_id")
    private Party dms;
    @ManyToOne
    @JoinColumn(name = "recipient_id")
    private Party recipient;
    @Column(length = 30)
    private String service;
    @Column(length = 30)
    private String application;
    @ManyToOne
    @JoinColumn(name = "recipient_spe_id")
    private Party recipientSpe;
    @Column(name = "x_route_1", length = 30)
    private String xRoute1;
    @Column(name = "x_route_2", length = 30)
    private String xRoute2;
    @Column(name = "x_route_3", length = 30)
    private String xRoute3;
    @Column(name = "x_route_4", length = 30)
    private String xRoute4;
    @Column(name = "x_route_5", length = 30)
    private String xRoute5;

    public Route() {
    }

    public Route(Party dms, Party recipient, String service, String application, Party recipientSpe, String xRoute1, String xRoute2, String xRoute3, String xRoute4, String xRoute5) {
        this.dms = dms;
        this.recipient = recipient;
        this.service = service;
        this.application = application;
        this.recipientSpe = recipientSpe;
        this.xRoute1 = xRoute1;
        this.xRoute2 = xRoute2;
        this.xRoute3 = xRoute3;
        this.xRoute4 = xRoute4;
        this.xRoute5 = xRoute5;


    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, dms='%s', recipient='%s', service='%s', application='%s', recipientSpe='%s', xRoute1='%s', xRoute2='%s', xRoute3='%s', xRoute4='%s', xRoute5='%s']",
                id, dms, recipient, service, application, recipientSpe, xRoute1, xRoute2, xRoute3, xRoute4, xRoute5);
    }
}


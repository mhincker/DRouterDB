package com.renault.drouter.drouter.model;

import javax.persistence.*;

@Entity
@Table(name = "r_route",uniqueConstraints=@UniqueConstraint(columnNames={"dms_id","recipient_id","service","application","recipient_spe_id","x_route_1","x_route_2","x_route_3","x_route_4","x_route_5"}))
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

    public Route(Party dms, Party recipient, String service, String application, Party recipientSpe) {
        this.dms = dms;
        this.recipient = recipient;
        this.service = service;
        this.application = application;
        this.recipientSpe = recipientSpe;
    }

    public Party getDms() {
        return dms;
    }

    public void setDms(Party dms) {
        this.dms = dms;
    }

    public Party getRecipient() {
        return recipient;
    }

    public void setRecipient(Party recipient) {
        this.recipient = recipient;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public Party getRecipientSpe() {
        return recipientSpe;
    }

    public void setRecipientSpe(Party recipientSpe) {
        this.recipientSpe = recipientSpe;
    }

    public String getxRoute1() {
        return xRoute1;
    }

    public void setxRoute1(String xRoute1) {
        this.xRoute1 = xRoute1;
    }

    public String getxRoute2() {
        return xRoute2;
    }

    public void setxRoute2(String xRoute2) {
        this.xRoute2 = xRoute2;
    }

    public String getxRoute3() {
        return xRoute3;
    }

    public void setxRoute3(String xRoute3) {
        this.xRoute3 = xRoute3;
    }

    public String getxRoute4() {
        return xRoute4;
    }

    public void setxRoute4(String xRoute4) {
        this.xRoute4 = xRoute4;
    }

    public String getxRoute5() {
        return xRoute5;
    }

    public void setxRoute5(String xRoute5) {
        this.xRoute5 = xRoute5;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, dms='%s', recipient='%s', service='%s', application='%s', recipientSpe='%s', xRoute1='%s', xRoute2='%s', xRoute3='%s', xRoute4='%s', xRoute5='%s']",
                id, dms, recipient, service, application, recipientSpe, xRoute1, xRoute2, xRoute3, xRoute4, xRoute5);
    }
}


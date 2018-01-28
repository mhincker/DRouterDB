package com.renault.drouter.drouter.model;

import javax.persistence.*;


@Entity
@Table(name = "r_list_of_val",uniqueConstraints=@UniqueConstraint(columnNames={"key","value","language"}))
public class ListOfValue {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name="key", nullable = false, length = 50)
    private String key;
    @Column(name="value", nullable = false, length = 50)
    private String value;
    @Column(name="language", nullable = false, length = 50)
    private String language;

    public ListOfValue() {}


    public ListOfValue(String key, String value, String language) {
        this.key = key;
        this.value = value;
        this.language = language;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return String.format(
                "Party[id=%d, key='%s', value='%s', language='%s']",
                id, key, value, language);
    }

}


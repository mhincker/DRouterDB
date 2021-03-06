    drop table r_party if exists

    drop table route if exists

    create table r_party (
        id bigint generated by default as identity,
        name varchar(100),
        role varchar(50),
        type varchar(50),
        uid varchar(20) not null,
        dms_id bigint,
        parent_id bigint,
        primary key (id)
    )

    create table route (
        id bigint generated by default as identity,
        application varchar(30),
        service varchar(30),
        x_route_1 varchar(30),
        x_route_2 varchar(30),
        x_route_3 varchar(30),
        x_route_4 varchar(30),
        x_route_5 varchar(30),
        dms_id bigint,
        recipient_id bigint,
        recipient_spe_id bigint,
        primary key (id)
    )

    alter table r_party
        add constraint FK88ffrem9m46fwo6h75g7w5esp
        foreign key (dms_id)
        references r_party

    alter table r_party
        add constraint FK70wakxk9ntvt39qh9a6y6vb34
        foreign key (parent_id)
        references r_party

    alter table route
        add constraint FKkiecb3grukqg2g8a001i4hac1
        foreign key (dms_id)
        references r_party

    alter table route
        add constraint FKt845hdn3i9f34imowpocnq9mk
        foreign key (recipient_id)
        references r_party

    alter table route
        add constraint FKqolmbosrtchpr0m128qwofyt6
        foreign key (recipient_spe_id)
        references r_party

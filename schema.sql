
    create table avaliacao (
       id integer generated by default as identity,
        data timestamp,
        descricao varchar(255),
        rating integer,
        id_cliente integer,
        id_produto integer,
        primary key (id)
    );

    create table empresa (
       id integer generated by default as identity,
        apresentacao varchar(255),
        cep varchar(255),
        endereco varchar(255),
        latitude double,
        logo varchar(255),
        longitude double,
        nome varchar(255),
        rating integer,
        url_facebook varchar(255),
        url_instagram varchar(255),
        url_tripadvisor varchar(255),
        url_twitter varchar(255),
        id_usuario integer,
        primary key (id)
    );

    create table favoritos (
       id integer generated by default as identity,
        ordem integer,
        id_usuario integer,
        id_produto integer,
        primary key (id)
    );

    create table produto (
       id integer generated by default as identity,
        exibir boolean,
        descricao varchar(255),
        foto varchar(255),
        nome varchar(255),
        rating integer,
        id_empresa integer,
        primary key (id)
    );

    create table usuario (
       id integer generated by default as identity,
        cep varchar(255),
        data_cadastro timestamp,
        email varchar(255),
        nome varchar(255),
        senha varchar(255),
        primary key (id)
    );

    alter table avaliacao 
       add constraint FK26ffa8tlpkdq1lse2wp0acnih 
       foreign key (id_cliente) 
       references usuario;

    alter table avaliacao 
       add constraint FK74kvbbmafxyto627ok8w9ekga 
       foreign key (id_produto) 
       references produto;

    alter table empresa 
       add constraint FKry3txwk27nut54r5wwd80mob2 
       foreign key (id_usuario) 
       references usuario;

    alter table favoritos 
       add constraint FK7r02f8nvb9xxqv76gvomi0abh 
       foreign key (id_usuario) 
       references usuario;

    alter table favoritos 
       add constraint FKj0ria0buc0jvh3vjh9t3n4xn3 
       foreign key (id_produto) 
       references produto;

    alter table produto 
       add constraint FKfgrypvh6luilaq30oiwl1hc14 
       foreign key (id_empresa) 
       references empresa;

    create table avaliacao (
       id integer generated by default as identity,
        data timestamp,
        descricao varchar(255),
        rating integer,
        id_cliente integer,
        id_produto integer,
        primary key (id)
    );

    create table empresa (
       id integer generated by default as identity,
        apresentacao varchar(255),
        cep varchar(255),
        endereco varchar(255),
        latitude double,
        logo varchar(255),
        longitude double,
        nome varchar(255),
        rating integer,
        url_facebook varchar(255),
        url_instagram varchar(255),
        url_tripadvisor varchar(255),
        url_twitter varchar(255),
        id_usuario integer,
        primary key (id)
    );

    create table favoritos (
       id integer generated by default as identity,
        ordem integer,
        id_usuario integer,
        id_produto integer,
        primary key (id)
    );

    create table produto (
       id integer generated by default as identity,
        exibir boolean,
        descricao varchar(255),
        foto varchar(255),
        nome varchar(255),
        rating integer,
        id_empresa integer,
        primary key (id)
    );

    create table usuario (
       id integer generated by default as identity,
        cep varchar(255),
        data_cadastro timestamp,
        email varchar(255),
        nome varchar(255),
        senha varchar(255),
        primary key (id)
    );

    alter table avaliacao 
       add constraint FK26ffa8tlpkdq1lse2wp0acnih 
       foreign key (id_cliente) 
       references usuario;

    alter table avaliacao 
       add constraint FK74kvbbmafxyto627ok8w9ekga 
       foreign key (id_produto) 
       references produto;

    alter table empresa 
       add constraint FKry3txwk27nut54r5wwd80mob2 
       foreign key (id_usuario) 
       references usuario;

    alter table favoritos 
       add constraint FK7r02f8nvb9xxqv76gvomi0abh 
       foreign key (id_usuario) 
       references usuario;

    alter table favoritos 
       add constraint FKj0ria0buc0jvh3vjh9t3n4xn3 
       foreign key (id_produto) 
       references produto;

    alter table produto 
       add constraint FKfgrypvh6luilaq30oiwl1hc14 
       foreign key (id_empresa) 
       references empresa;

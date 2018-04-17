# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table visit (
  id                            integer auto_increment not null,
  ip_address                    varchar(255),
  visit_date                    datetime(6),
  constraint pk_visit primary key (id)
);


# --- !Downs

drop table if exists visit;


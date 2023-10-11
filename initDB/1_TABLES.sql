create table Events
(
    id SERIAL PRIMARY KEY,
    id_orga INT,
    name TEXT not null,
    lieu TEXT not null,
    date date null,
    description TEXT not null,
    affiche bytea null
);

create table Avis
(
    id SERIAL PRIMARY KEY,
    id_part INT,
    id_event INT,
    id_orga INT,
    date date null,
    description TEXT not null,
    note INT
);

create table Orga
(
    id SERIAL PRIMARY KEY,
    pseudo TEXT not null,
    mail TEXT not null,
    entreprise TEXT not null,
    description TEXT not null,
    reseaux TEXT not null,
    affiche bytea null,
    pdp bytea null
);

create table Public
(
    id SERIAL PRIMARY KEY,
    pseudo TEXT not null,
    mail TEXT not null,
    pdp bytea null
);
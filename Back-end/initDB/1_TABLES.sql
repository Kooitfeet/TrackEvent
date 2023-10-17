create table Events
(
    id SERIAL PRIMARY KEY,
    id_orga INT,
    id_part INT,
    prix INT,
    theme TEXT not null,
    name TEXT not null,
    lieu TEXT not null,
    date date null,
    description TEXT not null,
    affiche TEXT not null
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
    affiche TEXT not null,
    pdp TEXT not null
);

create table Public
(
    id SERIAL PRIMARY KEY,
    pseudo TEXT not null,
    mail TEXT not null,
    pdp TEXT not null
);
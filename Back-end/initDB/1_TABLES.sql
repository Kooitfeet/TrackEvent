create table events
(
    id SERIAL PRIMARY KEY,
    id_orga INT,
    id_part INT,
    prix INT,
    name TEXT not null,
    theme TEXT not null,
    lieu TEXT not null,
    date date null,
    description TEXT not null,
    affiche TEXT not null
);

create table avis
(
    id SERIAL PRIMARY KEY,
    id_part INT,
    id_event INT,
    id_orga INT,
    date date null,
    description TEXT not null,
    note INT
);

create table orga
(
    id SERIAL PRIMARY KEY,
    id_event INT,
    id_avis INT,
    pseudo TEXT not null,
    mail TEXT not null,
    entreprise TEXT not null,
    description TEXT not null,
    reseaux TEXT not null,
    affiche TEXT not null,
    pdp TEXT not null
);

create table public
(
    id SERIAL PRIMARY KEY,
    score int,
    pseudo TEXT not null,
    mail TEXT not null,
    inter TEXT not null,
    participe TEXT not null,
    avis int,
    pdp TEXT not null
);
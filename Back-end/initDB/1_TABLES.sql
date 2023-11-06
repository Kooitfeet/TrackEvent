create table events
(
    id SERIAL PRIMARY KEY,
    orga INT,
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
    part INT,
    event INT,
    orga INT,
    date date null,
    description TEXT not null,
    note INT
);

create table orga
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

create table public
(
    id SERIAL PRIMARY KEY,
    score int,
    pseudo TEXT not null,
    mail TEXT not null,
    inter TEXT not null,
    participe int,
    avis int,
    pdp TEXT not null
);
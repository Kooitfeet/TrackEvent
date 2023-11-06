-- Pour les events
INSERT INTO events (id, orga, prix, theme, name, lieu, date, description, affiche) VALUES (1, 6, 10, 'Tech', 'Organic', 'Paris', '10/12/2023', 'Festival', 'images/affiche/image01.png');
INSERT INTO events (id, orga, prix, theme, name, lieu, date, description, affiche) VALUES (2, 4, 10, 'Pop', 'Solidays ', 'Paris', '10/10/2023', 'Festival', 'images/affiche/image01.png');
INSERT INTO events (id, orga, prix, theme, name, lieu, date, description, affiche) VALUES (3, 1, 10, 'Rap', 'Les Ardentes', 'Lille', '08/11/2023', 'Festival', 'images/affiche/image01.png');
INSERT INTO events (id, orga, prix, theme, name, lieu, date, description, affiche) VALUES (4, 1, 10, 'Disco', 'Les veilles Charues', 'Reims', '09/15/2023', 'Festival', 'images/affiche/image01.png');
INSERT INTO events (id, orga, prix, theme, name, lieu, date, description, affiche) VALUES (5, 5, 10, 'Pop', 'Lollapalooza ', 'Paris', '01/01/2023', 'Festival', 'images/affiche/image01.png');
INSERT INTO events (id, orga, prix, theme, name, lieu, date, description, affiche) VALUES (6, 1, 10, 'Tech', 'Macki Music', 'Lyon', '05/06/2023', 'Festival', 'images/affiche/image01.png');
INSERT INTO events (id, orga, prix, theme, name, lieu, date, description, affiche) VALUES (7, 4, 10, 'Tech', 'Marvellous Island ', 'Bordeaux', '02/07/2023', 'Festival', 'images/affiche/image01.png');

-- Pour les Avis
INSERT INTO avis (id, orga, part, event, date, description, note) VALUES (1, 0, 1, 5, '10/10/2023', 'Très bon festival', 10);
INSERT INTO avis (id, orga, part, event, date, description, note) VALUES (2, 5, 3, 0, '10/16/2023', 'Bof', 5);
INSERT INTO avis (id, orga, part, event, date, description, note) VALUES (3, 6, 6, 0, '10/15/2023', 'Pas bon', 4);
INSERT INTO avis (id, orga, part, event, date, description, note) VALUES (4, 0, 4, 2, '01/09/2023', 'Mauvais', 3);
INSERT INTO avis (id, orga, part, event, date, description, note) VALUES (5, 0, 5, 4, '05/08/2023', 'Top', 10);
INSERT INTO avis (id, orga, part, event, date, description, note) VALUES (6, 0, 5, 1, '10/02/2023', 'A refaire !', 10);

-- Pour les orgas
INSERT INTO orga (id, pseudo, mail, entreprise, description, reseaux, affiche, pdp) VALUES (1, 'michou', 'michou@gmail.com', 'michouSARL', 'SARL du Raps', 'site-web-michou.com', 'lien-image', 'lien-pdp');
INSERT INTO orga (id, pseudo, mail, entreprise, description, reseaux, affiche, pdp) VALUES (2, 'michel', 'michel@gmail.com', 'michelSARL', 'SARL du Disco', 'site-web-michel.com', 'lien-image', 'lien-pdp');
INSERT INTO orga (id, pseudo, mail, entreprise, description, reseaux, affiche, pdp) VALUES (3, 'fifi', 'fifi@gmail.com', 'fifiSARL', 'fifi company', 'site-web-fifi.com', 'lien-image', 'lien-pdp');
INSERT INTO orga (id, pseudo, mail, entreprise, description, reseaux, affiche, pdp) VALUES (4, 'GuiDev', 'GuiDev@gmail.com', 'GuiDev', 'SARL du kiff', 'site-web-GuiDev.com', 'lien-image', 'lien-pdp');
INSERT INTO orga (id, pseudo, mail, entreprise, description, reseaux, affiche, pdp) VALUES (5, 'Vivi', 'Vivi@gmail.com', 'ViviSARL', 'SARL de Vivi', 'site-web-Vivi.com', 'lien-image', 'lien-pdp');
INSERT INTO orga (id, pseudo, mail, entreprise, description, reseaux, affiche, pdp) VALUES (6, 'Lou', 'Lou@gmail.com', 'LouSARL', 'SARL du Lou', 'site-web-Lou.com', 'lien-image', 'lien-pdp');

-- Pour les publics
INSERT INTO public (id, score, pseudo, mail, inter, participe, avis, pdp) VALUES (1, 10, 'Lucas', 'lucas@gmail.com', 'solidays', 4, 4, 'lien-pdp');
INSERT INTO public (id, score, pseudo, mail, inter, participe, avis, pdp) VALUES (2, 10, 'Bertrand', 'Bertrand@gmail.com', 'solidays', 4, 5, 'lien-pdp');
INSERT INTO public (id, score, pseudo, mail, inter, participe, avis, pdp) VALUES (3, 10, 'Vincent', 'Vincent@gmail.com', 'solidays', 4, 1, 'lien-pdp');
INSERT INTO public (id, score, pseudo, mail, inter, participe, avis, pdp) VALUES (4, 10, 'Julie', 'julie@gmail.com', 'solidays', 4, 4, 'lien-pdp');
INSERT INTO public (id, score, pseudo, mail, inter, participe, avis, pdp) VALUES (5, 10, 'Alizée', 'Alizée@gmail.com', 'solidays', 4, 1, 'lien-pdp');
INSERT INTO public (id, score, pseudo, mail, inter, participe, avis, pdp) VALUES (6, 10, 'Florent', 'Florent@gmail.com', 'solidays', 4, 5, 'lien-pdp');
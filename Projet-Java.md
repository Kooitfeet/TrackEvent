# Projet Java
Dans ce dépôt GIT, vous pouvez retrouver le code source de notre application WEB "TrackEvent" développé par Guillaume BODARD et Maxence DUMONTIER. Notre application web s'inspire du site WEB "SHOTGUN" et vise à regrouper tous les événements musicaux tels que des festivals, des concerts et des soirées à thème.

Pour la mise en œuvre de notre projet, nous avons utilisé _Angular_ et _Java_. L'application permet aux utilisateurs de s'inscrire et de participer aux événements en tant que membre du _public_. Nous avons également intégré une fonctionnalité pour les _organisateurs_ qui peuvent créer des événements afin d'attirer l'attention du public.

N'hésitez pas à explorer notre code sur Git.

# Lancer le projet

## Back-end
### Base de données
Vérifier que le dossier *Back-end/pgdata* n'existe pas.
Pour démarrer la BDD, lancer l'application _Docker_ puis vous rendre dans le dossier *Back-End* du projet.
Entrez ensuite la commande suivante:
```bash
docker-compose up
```

Ensuite, lancez les scripts:
- 1_TABLES.sql
puis
- 2_DEFAULT_ENTRIES.sql

associé à la BDD PostGreSql

### Serveur Back-End
Dans le dossier ./Back-end, veuillez saisir la commande Maven suivante afin de démarrer le serveur *Back-End*:
```bash
mvn spring-boot:run
```

## Front-end
### Serveur Front-End
Pour démarrer le serveur *Front-End*, il vous suffit de lancer les commandes suivantes:
```bash
npm install

npm run start
```

L'application est alors disponible sur l'adresse suivante: **Localhost:4200**

# Fonctionnalités implémentées

## Visiteur

- Possibilité de naviguer sur les évènements populaires de la page d'accueil

- Cliquer pour avoir les détails d'un évènement

- Se connecter / s'inscrire

## Connexion / Inscription
(Le système de mot de passe n'est pas fonctionnel (Hash etc...) donc il faut se connecter avec le pseudo uniquement)
- Se connecter en tant que *public* (pseudo déjà existant: Alizée, Vincent, Florent, Julie, Lucas, Bertrand)
- S'inscrire en tant que public (pseudo required)

- Se connecter en tant que *orga* (organisateur) (pseudo existant: michou, michel, GuiDev, fifi, Vivi, Lou)

## Créer un évènement (Orga)

- Possibilité de créer un évènement dans **Créer un évènement**

## Participer à un évènement

- Participer à un event en allant sur sa fiche détail en cliquant sur l'image dans la page d'accueil, puis cliquer sur "Je participe"

- Afficher les évènement auxquels on participe dans **Mes Events**

- Se désinscrire d'un évènement en cliquant sur **Se désinscrire** dans *Mes Events*

## Afficher les détails d'un organisateur

- Cliquer sur le nom d'un organisateur (Page vide, non implémentée)

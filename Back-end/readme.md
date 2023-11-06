### Démarrer le serveur Back-End:
A lancer depuis le dossier Back
```comand
mvn spring-boot:run
```

### Adresse:
#### Find:
findById:
```url
http://localhost:8080/<model>/id:<id>
```
findByName:
```url
http://localhost:8080/<model>/name:<name>
```
DeleteById:
```url
http://localhost:8080/<model>/delete:<id>
```
save: (à tester avec un event créer)
```url
http://localhost:8080/<model>/save
```

### Base SQL
#### Avis
Avis relié à un event ou à un Orga (chose concerné)
Si l'avis est pour Event, Orga sera alors à 0
Avis est relié à un participant

#### Event
Event est relié à un orga

#### Orga
Orga n'est pas relié aux autres

#### Public
L'id des events se trouve dans la colonne "participes" qui est une liste d'entier


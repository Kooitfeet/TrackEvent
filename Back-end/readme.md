### Démarrer le serveur Back-End:
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
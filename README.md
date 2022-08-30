# Person search REST API
### Run:
```
mvnw spring-boot:run
```
### Endpoint:
```
localhost:8080/person/search/?personalId={personalId}&dateOfBirth={dateOfBirth}
```

Input:
- Personal Id
- Date of birth (YYYY-mm-dd)

Output:
- Personal Id
- First name
- Last name
- Gender (Male / female)
- Date of birth

### H2 Database
Database available at:
```
localhost:8080/h2-console/
```


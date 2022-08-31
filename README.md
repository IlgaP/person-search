# Person search REST API
### Run:
```
mvnw spring-boot:run
```
### Endpoint:
```
localhost:8080/person/search/?personalId={personalId}&dateOfBirth={dateOfBirth}
```

(example: localhost:8080/person/search/?personalId=852973-593341&dateOfBirth=1988-09-11)

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

### Log file
Service activities (information if the searched person is found or not) are logged in spring-boot-logger.log file (logs folder)
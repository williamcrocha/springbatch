
![banner](./assets/Spring.png)
## About The Project

The main goal is show how to import data from a comma delimited file to a Postgres Database.

## REFERENCES

* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring Batch](https://docs.spring.io/spring-batch/docs/current/reference/html/)
* [Flyway](https://flywaydb.org/)
* [PostgreSQL](https://www.postgresql.org/)

## OVERVIEW

In this project we use a Spring Batch to import a comma delimited file into a Postgres table. Spring Batch is a very powerfull tool with many capabilities. Check Spring Batch documentation for more info.

<br>

## TESTING

1. Start your servers instances with Docker. Open the terminal / command prompt, go to the application folder and type:
```shell
docker-compose up -d
```
2. Open another terminal, go to the application folder/target and type:
```shell
docker exec -it postgres bash OR docker exec -it <container id> bash 
```

3. Once inside, login into Postgres server:
```shell
psql -d testdb -U postgres
```

4. Checking if table is empty OR not exist:
```shell
SELECT * FROM person;
```

5. Open another terminal, go to the application folder/target and type:
```shell
java -jar importing-0.0.1-SNAPSHOT.jar --file.input=..\src\main\resources\idNomCpf.txt
```

6. Return to MySQL terminal and type:
```shell
SELECT * FROM person;
```


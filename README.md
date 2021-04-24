[![CircleCI](https://circleci.com/gh/ingjulianvega/mssc-asu-administration-method.svg?style=svg)](https://circleci.com/gh/ingjulianvega/mssc-asu-administration-method)

# ASU evidence type management microservice

### BOM

```
Bill Of Materials. A BOM is a special kind of POM that is used to control the versions of a project's dependencies and provide a central place to define and update those versions. 
BOM provides the flexibility to add a dependency to our module without worrying about the version that we should depend on
https://github.com/ingjulianvega/mssc-asu-bom
```

### OpenAPI

http://localhost:8094/asu/v1/administration-method/swagger-ui.html

### H2

http://localhost:8094/asu/v1/administration-method/h2-console

```
jdbc:h2:mem:testdb
```

### DockerHub

https://hub.docker.com/repository/docker/ingjulianvega/mssc-asu-administration-method

# oda-fhir-client

This is a ODA PHR Reference Client implementation.
Currently it contains two classes: PatientService.java and PhrClientExample.java.
The PatientService forms a connection to ODA-phr server and provides methods for
creating a new patient resource with given first and last name, and for querying
a patient resource with an id.

The actual ODA-phr server hosts also a web browser that support manual resource discovery.
You can access it at [oda-phr web link](https://oda.medidemo.fi/phr).
Further information on HAPI API supporting resource discovery and CRUD operations with Java
is available at [HAPI FHIR pages](http://hapifhir.io).

## Building

### In development
```
./gradlew clean build
```

## Running the service

In OSX / Linux
```
build/libs/oda-phr-client-0.0.1-SNAPSHOT.jar
```

In Windows (and OSX / Linux)
```
java -jar build/libs/oda-phr-client-0.0.1-SNAPSHOT.jar
```


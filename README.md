# oda-fhir-client

This is a ODA PHR Reference Client implementation.
Currently it contains two classes: PatientService.java and PhrClientExample.java.
The PatientService forms a connections to ODA-PHR server and provides methods for
creating a new patient resource with given first and last name, and for querying
a patient resource with a id.

## Building

### In development
```
./gradlew clean build

## Running the service

In OSX / Linux
```
build/libs/oda-phr-client-0.0.1-SNAPSHOT.jar
```

In Windows (and OSX / Linux)
```
java -jar build/libs/oda-phr-client-0.0.1-SNAPSHOT.jar
```


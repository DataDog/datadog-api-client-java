# datadog-api-client-java

This repository contains a Java API client for [Datadog API](https://docs.datadoghq.com/api/).  
The code is generated using [openapi-generator](https://github.com/OpenAPITools/openapi-generator)
and [apigentools](https://github.com/DataDog/apigentools). All modifications (except the
example application and unittests) should be changed directly in
[datadog-api-spec repo](https://github.com/DataDog/datadog-api-spec), which contains the OpenAPI
spec for the Datadog API as well as configuration for the tools used for code generation.

## Layout

It is the intention of this repository to contain per-major-version API client packages. Right
now, Datadog only has one API version - `v1` - so that is the only module present. If/when
there is another version of the API, we will add a different package for it. The end goal is
to be able to use API clients for different major versions of the API side-by-side.

## The Datadog API v1 Client

The client library for Datadog API v1 is located in the `v1` directory. It can be added
to dependencies of your project by adding following entry to your `pom.xml` dependencies:

```
    <dependency>
      <groupId>com.datadog.api.client</groupId>
      <artifactId>datadog-v1</artifactId>
      <version>${datadog-v1-client-version}</version>
      <scope>compile</scope>
    </dependency>
```

All the documentation for this package is available through `v1/README.md` and Javadocs
on Maven Central.
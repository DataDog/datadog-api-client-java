# datadog-api-client-java

This repository contains a Java API client for the [Datadog API](https://docs.datadoghq.com/api/).
The code is generated using [openapi-generator](https://github.com/OpenAPITools/openapi-generator)
and [apigentools](https://github.com/DataDog/apigentools).

## Layout

This repository contains per-major-version API client packages. Right
now, Datadog only has one API version - `v1` - so that is the only module present. If/when
there is another version of the API, we will add a different package for it. The end goal is
to be able to use API clients for different major versions of the API side-by-side.

## The Datadog API v1 Client

The client library for Datadog API v1 is located in the `v1` directory. It can be added
to dependencies of your project by adding following entry to your `pom.xml` dependencies:

```
    <dependency>
      <groupId>com.datadoghq</groupId>
      <artifactId>datadog-api-v1-client</artifactId>
      <version>${datadog-api-v1-client-version}</version>
      <scope>compile</scope>
    </dependency>
```

All the documentation for this package is available through `v1/README.md` and Javadocs
on Maven Central.

## Contributing

As most of the code in this repository is generated, we will only accept PRs for files
that are not modified by our code-generation machinery (changes to the generated files
would get overwritten). We happily accept contributions to files that are listed in:

* `v1/.openapi-generator-ignore`

as well as the following files:

* `v1/src/test/*`
* `v1/pom.xml`

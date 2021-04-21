# Releasing

This document summarizes the process of doing a new release of this project.
Release can only be performed by Datadog maintainers of this repository.

## Schedule
This project does not have a strict release schedule. However, we would make a release at least every 2 months.
  - No release will be done if no changes got merged to the `master` branch during the above mentioned window.
  - Releases may be done more frequently than the above mentioned window.

### Prerequisites
- Install [datadog_checks_dev](https://datadog-checks-base.readthedocs.io/en/latest/datadog_checks_dev.cli.html#installation) using Python 3
- Ensure all CIs are passing on the master branch that we're about to release.

## Release
Note that once the release process has started, nobody should be merging/pushing anything.

- See changes ready for release by running `ddev release show changes . --tag-prefix datadog-api-client-` at the root of this project. Add any missing labels to PRs if needed.
- Run `ddev release changelog . <NEW_VERSION> --tag-prefix datadog-api-client-` to update the `CHANGELOG.md` file at the root of this repository
    - In this same branch, remove the `-SNAPSHOT` from the project's version in the `pom.xml` file.
- Commit the changes to the repository in a release branch and get it approved/merged after you:
    - Make sure all tests in CIs are passing, as this is the commit we will be releasing!
- Create a Github release. ([Example](https://github.com/DataDog/datadog-api-client-java/releases/tag/datadog-api-client-1.0.0-beta10))
    - This will kick off a gitlab pipeline that will build and upload the JAR to sonatype.
    - Sign into sonatype and find the uploaded project [here](https://oss.sonatype.org/#stagingRepositories)
    - Check this project and click `Release`. Once confirmed this will start the sync and finalize the release.
      - Note the full sync may take some time but confirm the version is available [here](https://repo1.maven.org/maven2/com/datadoghq/datadog-api-client/)
- Finally, pull the recent changes and create a PR to begin the next dev cycle by bumping the project's version in `pom.xml` and adding back `-SNAPSHOT`.

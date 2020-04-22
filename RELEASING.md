# Releasing

This document summarizes the process of doing a new release of this project.
Release can only be performed by Datadog maintainers of this repository.

## Schedule
This project does not have a strict release schedule. However, we would make a release at least every 2 months.
  - No release will be done if no changes got merged to the `master` branch during the above mentioned window.
  - Releases may be done more frequently than the above mentioned window.

### Prerequisites
- Install [datadog_checks_dev](https://datadog-checks-base.readthedocs.io/en/latest/datadog_checks_dev.cli.html#installation) using Python 3
- Have [Java 1.8](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
- Ensure all CIs are passing on the master branch that we're about to release. 
- Set the `BINTRAY_USER` and `BINTRAY_API_KEY` environment variables so that the release process can deploy to Bintray. 

## Release
Note that once the release process is started, nobody should be merging/pushing anything.

### Commands

- See changes ready for release by running `ddev release show changes .` at the root of this project. Add any missing labels to PRs if needed.
- Run `ddev release changelog . <NEW_VERSION>` to update the `CHANGELOG.md` file at the root of this repository
- Commit the changes to the repository in a release branch and get it approved/merged after you:
    - Make sure that all CIs are passing, as this is the commit we will be releasing!

- Pull the latest changes after merging the above PR.
- Run `mvn --settings settings.xml clean release:prepare` and follow the prompts to update the version and tag the repository.
- Run `mvn --settings settings.xml release:perform` to deploy the artifact to Bintray. 
- Find the artifact in Bintray and publish to make it visible to all.
- TODO - Within Bintray, sync to maven central.

## Release

After merging the above PR, create a release on the [releases page](https://github.com/DataDog/datadog-api-client-java/releases).
- Choose the tag that was created by the `mvn release:prepare` step
- Place the changelog contents into the description of the release.
- Attach the built Jar file into the release
- Create/Publish the release, which will automatically create a tag on the `HEAD` commit. 

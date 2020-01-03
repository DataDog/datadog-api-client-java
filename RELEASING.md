# Releasing

This document summarizes the process of doing a new release of this project.
Release can only be performed by Datadog maintainers of this repository.

## Schedule
This project does not have a strict release schedule. However, we would make a release at least every 2 months.
  - No release will be done if no changes got merged to the `master` branch during the above mentioned window.
  - Releases may be done more frequently than the above mentioned window.
  - Create a pager duty schedule corresponding to this.
  - Create a google calendar schedule corresponding to this.

## Make Sure Everything Works

* Make sure tests are passing.
* Build the package locally (e.g. `mvn clean install`), and play around with it a bit.

## Update Changelog

### Prerequisite

- Install [datadog_checks_dev](https://datadog-checks-base.readthedocs.io/en/latest/datadog_checks_dev.cli.html#installation) using Python 3

### Commands

- See changes ready for release by running `ddev release show changes .` at the root of this project. Add any missing labels to PRs if needed.
- Run `ddev release changelog . <NEW_VERSION>` to update the `CHANGELOG.md` file at the root of this repository
- Commit the changes to the repository in a release branch and get it approved/merged.

## Release

Note that once the release process is started, nobody should be merging/pushing anything.
We don't want to trigger multiple rebuilds of docs and Docker images with that official final release version and different content - this would only create confusion.

## TODO
Update this section once we start releasing this project to maven

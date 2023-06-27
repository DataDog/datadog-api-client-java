# Releasing

This document summarizes the process of doing a new release of this project.
Release can only be performed by Datadog maintainers of this repository.

## Schedule
This project does not have a strict release schedule. However, we would make a release at least every 2 months.
  - No release will be done if no changes got merged to the `master` branch during the above mentioned window.
  - Releases may be done more frequently than the above mentioned window.

### Prerequisites
- Ensure all CIs are passing on the master branch that we're about to release.

## Release Process

The release process is controlled and run by GitHub Actions.

### Prerequisite

1. Make sure you have `write_repo` access.
1. Share your plan for the release with other maintainers to avoid conflicts during the release process.

### Update Changelog

1. Open [prepare release](https://github.com/DataDog/datadog-api-client-java/actions/workflows/prepare_release.yml) and click on `Run workflow` dropdown.
1. Enter new version identifier in the `New version number` input box (e.g. `1.9.0`).
1. Trigger the action by clicking on `Run workflow` button.

### Review

1. Review the generated pull-request for `release/<New version number>` branch.
1. If everything is fine, merge the pull-request.
1. Check that the [release](https://github.com/DataDog/datadog-api-client-java/actions/workflows/release.yml) action created new release on GitHub.
    - This will kick off a GitLab pipeline that will build and upload the JAR to sonatype.
      - If this job fails due to an expired GPG key, refresh the key using the `create_key` job, which uses the [agent-key-management-tools](https://github.com/DataDog/agent-key-management-tools/blob/master/gpg/README.md) image.
      - Make sure to set `EXPORT_TO_KEYSERVER: true` when manually starting the job to upload the public keys to the relevant keyservers.
    - Sign into sonatype and find the uploaded project [here](https://oss.sonatype.org/#stagingRepositories)
    - Check this project and click `Release`. Once confirmed this will start the sync and finalize the release.
      - Note the full sync may take some time but confirm the version is available [here](https://repo1.maven.org/maven2/com/datadoghq/datadog-api-client/)
1. Review and merge generated `Post release` pull-request with `SNAPSHOT` version bump.

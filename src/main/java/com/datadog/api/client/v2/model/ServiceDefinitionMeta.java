/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Metadata about a service definition. */
@JsonPropertyOrder({
  ServiceDefinitionMeta.JSON_PROPERTY_GITHUB_HTML_URL,
  ServiceDefinitionMeta.JSON_PROPERTY_INGESTED_SCHEMA_VERSION,
  ServiceDefinitionMeta.JSON_PROPERTY_INGESTION_SOURCE,
  ServiceDefinitionMeta.JSON_PROPERTY_LAST_MODIFIED_TIME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceDefinitionMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GITHUB_HTML_URL = "github-html-url";
  private String githubHtmlUrl;

  public static final String JSON_PROPERTY_INGESTED_SCHEMA_VERSION = "ingested-schema-version";
  private String ingestedSchemaVersion;

  public static final String JSON_PROPERTY_INGESTION_SOURCE = "ingestion-source";
  private String ingestionSource;

  public static final String JSON_PROPERTY_LAST_MODIFIED_TIME = "last-modified-time";
  private String lastModifiedTime;

  public ServiceDefinitionMeta githubHtmlUrl(String githubHtmlUrl) {
    this.githubHtmlUrl = githubHtmlUrl;
    return this;
  }

  /**
   * GitHub HTML URL.
   *
   * @return githubHtmlUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GITHUB_HTML_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGithubHtmlUrl() {
    return githubHtmlUrl;
  }

  public void setGithubHtmlUrl(String githubHtmlUrl) {
    this.githubHtmlUrl = githubHtmlUrl;
  }

  public ServiceDefinitionMeta ingestedSchemaVersion(String ingestedSchemaVersion) {
    this.ingestedSchemaVersion = ingestedSchemaVersion;
    return this;
  }

  /**
   * Ingestion schema version.
   *
   * @return ingestedSchemaVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INGESTED_SCHEMA_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIngestedSchemaVersion() {
    return ingestedSchemaVersion;
  }

  public void setIngestedSchemaVersion(String ingestedSchemaVersion) {
    this.ingestedSchemaVersion = ingestedSchemaVersion;
  }

  public ServiceDefinitionMeta ingestionSource(String ingestionSource) {
    this.ingestionSource = ingestionSource;
    return this;
  }

  /**
   * Ingestion source of the service definition.
   *
   * @return ingestionSource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INGESTION_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIngestionSource() {
    return ingestionSource;
  }

  public void setIngestionSource(String ingestionSource) {
    this.ingestionSource = ingestionSource;
  }

  public ServiceDefinitionMeta lastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Last modified time of the service definition.
   *
   * @return lastModifiedTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  /** Return true if this ServiceDefinitionMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDefinitionMeta serviceDefinitionMeta = (ServiceDefinitionMeta) o;
    return Objects.equals(this.githubHtmlUrl, serviceDefinitionMeta.githubHtmlUrl)
        && Objects.equals(this.ingestedSchemaVersion, serviceDefinitionMeta.ingestedSchemaVersion)
        && Objects.equals(this.ingestionSource, serviceDefinitionMeta.ingestionSource)
        && Objects.equals(this.lastModifiedTime, serviceDefinitionMeta.lastModifiedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(githubHtmlUrl, ingestedSchemaVersion, ingestionSource, lastModifiedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinitionMeta {\n");
    sb.append("    githubHtmlUrl: ").append(toIndentedString(githubHtmlUrl)).append("\n");
    sb.append("    ingestedSchemaVersion: ")
        .append(toIndentedString(ingestedSchemaVersion))
        .append("\n");
    sb.append("    ingestionSource: ").append(toIndentedString(ingestionSource)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Metadata about a service definition. */
@JsonPropertyOrder({
  ServiceDefinitionMeta.JSON_PROPERTY_GITHUB_HTML_URL,
  ServiceDefinitionMeta.JSON_PROPERTY_INGESTED_SCHEMA_VERSION,
  ServiceDefinitionMeta.JSON_PROPERTY_INGESTION_SOURCE,
  ServiceDefinitionMeta.JSON_PROPERTY_LAST_MODIFIED_TIME,
  ServiceDefinitionMeta.JSON_PROPERTY_ORIGIN,
  ServiceDefinitionMeta.JSON_PROPERTY_ORIGIN_DETAIL,
  ServiceDefinitionMeta.JSON_PROPERTY_WARNINGS
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

  public static final String JSON_PROPERTY_ORIGIN = "origin";
  private String origin;

  public static final String JSON_PROPERTY_ORIGIN_DETAIL = "origin-detail";
  private String originDetail;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<ServiceDefinitionMetaWarnings> warnings = null;

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

  public ServiceDefinitionMeta origin(String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * User defined origin of the service definition.
   *
   * @return origin
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public ServiceDefinitionMeta originDetail(String originDetail) {
    this.originDetail = originDetail;
    return this;
  }

  /**
   * User defined origin's detail of the service definition.
   *
   * @return originDetail
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGIN_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOriginDetail() {
    return originDetail;
  }

  public void setOriginDetail(String originDetail) {
    this.originDetail = originDetail;
  }

  public ServiceDefinitionMeta warnings(List<ServiceDefinitionMetaWarnings> warnings) {
    this.warnings = warnings;
    for (ServiceDefinitionMetaWarnings item : warnings) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ServiceDefinitionMeta addWarningsItem(ServiceDefinitionMetaWarnings warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    this.unparsed |= warningsItem.unparsed;
    return this;
  }

  /**
   * A list of schema validation warnings.
   *
   * @return warnings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ServiceDefinitionMetaWarnings> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<ServiceDefinitionMetaWarnings> warnings) {
    this.warnings = warnings;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ServiceDefinitionMeta
   */
  @JsonAnySetter
  public ServiceDefinitionMeta putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
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
        && Objects.equals(this.lastModifiedTime, serviceDefinitionMeta.lastModifiedTime)
        && Objects.equals(this.origin, serviceDefinitionMeta.origin)
        && Objects.equals(this.originDetail, serviceDefinitionMeta.originDetail)
        && Objects.equals(this.warnings, serviceDefinitionMeta.warnings)
        && Objects.equals(this.additionalProperties, serviceDefinitionMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        githubHtmlUrl,
        ingestedSchemaVersion,
        ingestionSource,
        lastModifiedTime,
        origin,
        originDetail,
        warnings,
        additionalProperties);
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
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    originDetail: ").append(toIndentedString(originDetail)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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

/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** The attributes associated with the archive. */
@JsonPropertyOrder({
  LogsArchiveCreateRequestAttributes.JSON_PROPERTY_DESTINATION,
  LogsArchiveCreateRequestAttributes.JSON_PROPERTY_INCLUDE_TAGS,
  LogsArchiveCreateRequestAttributes.JSON_PROPERTY_NAME,
  LogsArchiveCreateRequestAttributes.JSON_PROPERTY_QUERY,
  LogsArchiveCreateRequestAttributes.JSON_PROPERTY_REHYDRATION_MAX_SCAN_SIZE_IN_GB,
  LogsArchiveCreateRequestAttributes.JSON_PROPERTY_REHYDRATION_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsArchiveCreateRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESTINATION = "destination";
  private LogsArchiveCreateRequestDestination destination;

  public static final String JSON_PROPERTY_INCLUDE_TAGS = "include_tags";
  private Boolean includeTags = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_REHYDRATION_MAX_SCAN_SIZE_IN_GB =
      "rehydration_max_scan_size_in_gb";
  private JsonNullable<Long> rehydrationMaxScanSizeInGb = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_REHYDRATION_TAGS = "rehydration_tags";
  private List<String> rehydrationTags = null;

  public LogsArchiveCreateRequestAttributes() {}

  @JsonCreator
  public LogsArchiveCreateRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESTINATION)
          LogsArchiveCreateRequestDestination destination,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query) {
    this.destination = destination;
    this.unparsed |= destination.unparsed;
    this.name = name;
    this.query = query;
  }

  public LogsArchiveCreateRequestAttributes destination(
      LogsArchiveCreateRequestDestination destination) {
    this.destination = destination;
    this.unparsed |= destination.unparsed;
    return this;
  }

  /**
   * An archive's destination.
   *
   * @return destination
   */
  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsArchiveCreateRequestDestination getDestination() {
    return destination;
  }

  public void setDestination(LogsArchiveCreateRequestDestination destination) {
    this.destination = destination;
  }

  public LogsArchiveCreateRequestAttributes includeTags(Boolean includeTags) {
    this.includeTags = includeTags;
    return this;
  }

  /**
   * To store the tags in the archive, set the value "true". If it is set to "false", the tags will
   * be deleted when the logs are sent to the archive.
   *
   * @return includeTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIncludeTags() {
    return includeTags;
  }

  public void setIncludeTags(Boolean includeTags) {
    this.includeTags = includeTags;
  }

  public LogsArchiveCreateRequestAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The archive name.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LogsArchiveCreateRequestAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The archive query/filter. Logs matching this query are included in the archive.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public LogsArchiveCreateRequestAttributes rehydrationMaxScanSizeInGb(
      Long rehydrationMaxScanSizeInGb) {
    this.rehydrationMaxScanSizeInGb = JsonNullable.<Long>of(rehydrationMaxScanSizeInGb);
    return this;
  }

  /**
   * Maximum scan size for rehydration from this archive.
   *
   * @return rehydrationMaxScanSizeInGb
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getRehydrationMaxScanSizeInGb() {
    return rehydrationMaxScanSizeInGb.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REHYDRATION_MAX_SCAN_SIZE_IN_GB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getRehydrationMaxScanSizeInGb_JsonNullable() {
    return rehydrationMaxScanSizeInGb;
  }

  @JsonProperty(JSON_PROPERTY_REHYDRATION_MAX_SCAN_SIZE_IN_GB)
  public void setRehydrationMaxScanSizeInGb_JsonNullable(
      JsonNullable<Long> rehydrationMaxScanSizeInGb) {
    this.rehydrationMaxScanSizeInGb = rehydrationMaxScanSizeInGb;
  }

  public void setRehydrationMaxScanSizeInGb(Long rehydrationMaxScanSizeInGb) {
    this.rehydrationMaxScanSizeInGb = JsonNullable.<Long>of(rehydrationMaxScanSizeInGb);
  }

  public LogsArchiveCreateRequestAttributes rehydrationTags(List<String> rehydrationTags) {
    this.rehydrationTags = rehydrationTags;
    return this;
  }

  public LogsArchiveCreateRequestAttributes addRehydrationTagsItem(String rehydrationTagsItem) {
    if (this.rehydrationTags == null) {
      this.rehydrationTags = new ArrayList<>();
    }
    this.rehydrationTags.add(rehydrationTagsItem);
    return this;
  }

  /**
   * An array of tags to add to rehydrated logs from an archive.
   *
   * @return rehydrationTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REHYDRATION_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getRehydrationTags() {
    return rehydrationTags;
  }

  public void setRehydrationTags(List<String> rehydrationTags) {
    this.rehydrationTags = rehydrationTags;
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
   * @return LogsArchiveCreateRequestAttributes
   */
  @JsonAnySetter
  public LogsArchiveCreateRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogsArchiveCreateRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArchiveCreateRequestAttributes logsArchiveCreateRequestAttributes =
        (LogsArchiveCreateRequestAttributes) o;
    return Objects.equals(this.destination, logsArchiveCreateRequestAttributes.destination)
        && Objects.equals(this.includeTags, logsArchiveCreateRequestAttributes.includeTags)
        && Objects.equals(this.name, logsArchiveCreateRequestAttributes.name)
        && Objects.equals(this.query, logsArchiveCreateRequestAttributes.query)
        && Objects.equals(
            this.rehydrationMaxScanSizeInGb,
            logsArchiveCreateRequestAttributes.rehydrationMaxScanSizeInGb)
        && Objects.equals(this.rehydrationTags, logsArchiveCreateRequestAttributes.rehydrationTags)
        && Objects.equals(
            this.additionalProperties, logsArchiveCreateRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        destination,
        includeTags,
        name,
        query,
        rehydrationMaxScanSizeInGb,
        rehydrationTags,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArchiveCreateRequestAttributes {\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    includeTags: ").append(toIndentedString(includeTags)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    rehydrationMaxScanSizeInGb: ")
        .append(toIndentedString(rehydrationMaxScanSizeInGb))
        .append("\n");
    sb.append("    rehydrationTags: ").append(toIndentedString(rehydrationTags)).append("\n");
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

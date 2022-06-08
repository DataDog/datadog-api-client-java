/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** The attributes associated with the archive. */
@JsonPropertyOrder({
  LogsArchiveAttributes.JSON_PROPERTY_DESTINATION,
  LogsArchiveAttributes.JSON_PROPERTY_INCLUDE_TAGS,
  LogsArchiveAttributes.JSON_PROPERTY_NAME,
  LogsArchiveAttributes.JSON_PROPERTY_QUERY,
  LogsArchiveAttributes.JSON_PROPERTY_REHYDRATION_MAX_SCAN_SIZE_IN_GB,
  LogsArchiveAttributes.JSON_PROPERTY_REHYDRATION_TAGS,
  LogsArchiveAttributes.JSON_PROPERTY_STATE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsArchiveAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESTINATION = "destination";
  private LogsArchiveDestination destination;

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

  public static final String JSON_PROPERTY_STATE = "state";
  private LogsArchiveState state;

  public LogsArchiveAttributes() {}

  @JsonCreator
  public LogsArchiveAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESTINATION)
          LogsArchiveDestination destination,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query) {
    this.destination = destination;
    if (destination != null) {
      this.unparsed |= destination.unparsed;
    }
    this.name = name;
    this.query = query;
  }

  public LogsArchiveAttributes destination(LogsArchiveDestination destination) {
    this.destination = destination;
    if (destination != null) {
      this.unparsed |= destination.unparsed;
    }
    return this;
  }

  /**
   * An archive's destination.
   *
   * @return destination
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsArchiveDestination getDestination() {
    return destination;
  }

  public void setDestination(LogsArchiveDestination destination) {
    this.destination = destination;
  }

  public LogsArchiveAttributes includeTags(Boolean includeTags) {
    this.includeTags = includeTags;
    return this;
  }

  /**
   * To store the tags in the archive, set the value "true". If it is set to "false", the tags will
   * be deleted when the logs are sent to the archive.
   *
   * @return includeTags
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIncludeTags() {
    return includeTags;
  }

  public void setIncludeTags(Boolean includeTags) {
    this.includeTags = includeTags;
  }

  public LogsArchiveAttributes name(String name) {
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

  public LogsArchiveAttributes query(String query) {
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

  public LogsArchiveAttributes rehydrationMaxScanSizeInGb(Long rehydrationMaxScanSizeInGb) {
    this.rehydrationMaxScanSizeInGb = JsonNullable.<Long>of(rehydrationMaxScanSizeInGb);
    return this;
  }

  /**
   * Maximum scan size for rehydration from this archive.
   *
   * @return rehydrationMaxScanSizeInGb
   */
  @javax.annotation.Nullable
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

  public LogsArchiveAttributes rehydrationTags(List<String> rehydrationTags) {
    this.rehydrationTags = rehydrationTags;
    return this;
  }

  public LogsArchiveAttributes addRehydrationTagsItem(String rehydrationTagsItem) {
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
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REHYDRATION_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getRehydrationTags() {
    return rehydrationTags;
  }

  public void setRehydrationTags(List<String> rehydrationTags) {
    this.rehydrationTags = rehydrationTags;
  }

  public LogsArchiveAttributes state(LogsArchiveState state) {
    this.state = state;
    this.unparsed |= !state.isValid();
    return this;
  }

  /**
   * The state of the archive.
   *
   * @return state
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsArchiveState getState() {
    return state;
  }

  public void setState(LogsArchiveState state) {
    if (!state.isValid()) {
      this.unparsed = true;
    }
    this.state = state;
  }

  /** Return true if this LogsArchiveAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArchiveAttributes logsArchiveAttributes = (LogsArchiveAttributes) o;
    return Objects.equals(this.destination, logsArchiveAttributes.destination)
        && Objects.equals(this.includeTags, logsArchiveAttributes.includeTags)
        && Objects.equals(this.name, logsArchiveAttributes.name)
        && Objects.equals(this.query, logsArchiveAttributes.query)
        && Objects.equals(
            this.rehydrationMaxScanSizeInGb, logsArchiveAttributes.rehydrationMaxScanSizeInGb)
        && Objects.equals(this.rehydrationTags, logsArchiveAttributes.rehydrationTags)
        && Objects.equals(this.state, logsArchiveAttributes.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        destination, includeTags, name, query, rehydrationMaxScanSizeInGb, rehydrationTags, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArchiveAttributes {\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    includeTags: ").append(toIndentedString(includeTags)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    rehydrationMaxScanSizeInGb: ")
        .append(toIndentedString(rehydrationMaxScanSizeInGb))
        .append("\n");
    sb.append("    rehydrationTags: ").append(toIndentedString(rehydrationTags)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

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

/** The attributes associated with the archive order. */
@JsonPropertyOrder({LogsArchiveOrderAttributes.JSON_PROPERTY_ARCHIVE_IDS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsArchiveOrderAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARCHIVE_IDS = "archive_ids";
  private List<String> archiveIds = new ArrayList<>();

  public LogsArchiveOrderAttributes() {}

  @JsonCreator
  public LogsArchiveOrderAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ARCHIVE_IDS) List<String> archiveIds) {
    this.archiveIds = archiveIds;
  }

  public LogsArchiveOrderAttributes archiveIds(List<String> archiveIds) {
    this.archiveIds = archiveIds;
    return this;
  }

  public LogsArchiveOrderAttributes addArchiveIdsItem(String archiveIdsItem) {
    this.archiveIds.add(archiveIdsItem);
    return this;
  }

  /**
   * An ordered array of <code>&lt;ARCHIVE_ID&gt;</code> strings, the order of archive IDs in the
   * array define the overall archives order for Datadog.
   *
   * @return archiveIds
   */
  @JsonProperty(JSON_PROPERTY_ARCHIVE_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getArchiveIds() {
    return archiveIds;
  }

  public void setArchiveIds(List<String> archiveIds) {
    this.archiveIds = archiveIds;
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
   * @return LogsArchiveOrderAttributes
   */
  @JsonAnySetter
  public LogsArchiveOrderAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogsArchiveOrderAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArchiveOrderAttributes logsArchiveOrderAttributes = (LogsArchiveOrderAttributes) o;
    return Objects.equals(this.archiveIds, logsArchiveOrderAttributes.archiveIds)
        && Objects.equals(
            this.additionalProperties, logsArchiveOrderAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archiveIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArchiveOrderAttributes {\n");
    sb.append("    archiveIds: ").append(toIndentedString(archiveIds)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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

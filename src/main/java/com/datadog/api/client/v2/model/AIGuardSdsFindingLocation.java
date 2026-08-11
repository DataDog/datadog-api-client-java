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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The location of a sensitive data match within the evaluated request. */
@JsonPropertyOrder({
  AIGuardSdsFindingLocation.JSON_PROPERTY_END_INDEX_EXCLUSIVE,
  AIGuardSdsFindingLocation.JSON_PROPERTY_PATH,
  AIGuardSdsFindingLocation.JSON_PROPERTY_START_INDEX
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AIGuardSdsFindingLocation {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_END_INDEX_EXCLUSIVE = "end_index_exclusive";
  private Long endIndexExclusive;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public static final String JSON_PROPERTY_START_INDEX = "start_index";
  private Long startIndex;

  public AIGuardSdsFindingLocation() {}

  @JsonCreator
  public AIGuardSdsFindingLocation(
      @JsonProperty(required = true, value = JSON_PROPERTY_END_INDEX_EXCLUSIVE)
          Long endIndexExclusive,
      @JsonProperty(required = true, value = JSON_PROPERTY_PATH) String path,
      @JsonProperty(required = true, value = JSON_PROPERTY_START_INDEX) Long startIndex) {
    this.endIndexExclusive = endIndexExclusive;
    this.path = path;
    this.startIndex = startIndex;
  }

  public AIGuardSdsFindingLocation endIndexExclusive(Long endIndexExclusive) {
    this.endIndexExclusive = endIndexExclusive;
    return this;
  }

  /**
   * The end character index (exclusive) of the sensitive data match.
   *
   * @return endIndexExclusive
   */
  @JsonProperty(JSON_PROPERTY_END_INDEX_EXCLUSIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getEndIndexExclusive() {
    return endIndexExclusive;
  }

  public void setEndIndexExclusive(Long endIndexExclusive) {
    this.endIndexExclusive = endIndexExclusive;
  }

  public AIGuardSdsFindingLocation path(String path) {
    this.path = path;
    return this;
  }

  /**
   * The JSON path to the field containing the sensitive data.
   *
   * @return path
   */
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public AIGuardSdsFindingLocation startIndex(Long startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * The start character index of the sensitive data match.
   *
   * @return startIndex
   */
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Long startIndex) {
    this.startIndex = startIndex;
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
   * @return AIGuardSdsFindingLocation
   */
  @JsonAnySetter
  public AIGuardSdsFindingLocation putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AIGuardSdsFindingLocation object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AIGuardSdsFindingLocation aiGuardSdsFindingLocation = (AIGuardSdsFindingLocation) o;
    return Objects.equals(this.endIndexExclusive, aiGuardSdsFindingLocation.endIndexExclusive)
        && Objects.equals(this.path, aiGuardSdsFindingLocation.path)
        && Objects.equals(this.startIndex, aiGuardSdsFindingLocation.startIndex)
        && Objects.equals(
            this.additionalProperties, aiGuardSdsFindingLocation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endIndexExclusive, path, startIndex, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AIGuardSdsFindingLocation {\n");
    sb.append("    endIndexExclusive: ").append(toIndentedString(endIndexExclusive)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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

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

/** Attributes for a general investigation, not tied to a specific monitor alert. */
@JsonPropertyOrder({
  GeneralInvestigationAttributes.JSON_PROPERTY_DESCRIPTION,
  GeneralInvestigationAttributes.JSON_PROPERTY_END_TIME,
  GeneralInvestigationAttributes.JSON_PROPERTY_START_TIME,
  GeneralInvestigationAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GeneralInvestigationAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_END_TIME = "end_time";
  private Long endTime;

  public static final String JSON_PROPERTY_START_TIME = "start_time";
  private Long startTime;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public GeneralInvestigationAttributes() {}

  @JsonCreator
  public GeneralInvestigationAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description) {
    this.description = description;
  }

  public GeneralInvestigationAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A free-form description of the problem to investigate.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GeneralInvestigationAttributes endTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The end of the investigation window, in Unix milliseconds. Must be provided together with
   * <code>start_time</code>, or both omitted.
   *
   * @return endTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEndTime() {
    return endTime;
  }

  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  public GeneralInvestigationAttributes startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The start of the investigation window, in Unix milliseconds. Must be provided together with
   * <code>end_time</code>, or both omitted.
   *
   * @return startTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public GeneralInvestigationAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public GeneralInvestigationAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags scoping the investigation.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
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
   * @return GeneralInvestigationAttributes
   */
  @JsonAnySetter
  public GeneralInvestigationAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GeneralInvestigationAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralInvestigationAttributes generalInvestigationAttributes =
        (GeneralInvestigationAttributes) o;
    return Objects.equals(this.description, generalInvestigationAttributes.description)
        && Objects.equals(this.endTime, generalInvestigationAttributes.endTime)
        && Objects.equals(this.startTime, generalInvestigationAttributes.startTime)
        && Objects.equals(this.tags, generalInvestigationAttributes.tags)
        && Objects.equals(
            this.additionalProperties, generalInvestigationAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, endTime, startTime, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralInvestigationAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

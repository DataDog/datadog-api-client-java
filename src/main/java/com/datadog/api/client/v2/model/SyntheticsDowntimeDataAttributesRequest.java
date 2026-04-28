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

/** Attributes for creating or updating a Synthetics downtime. */
@JsonPropertyOrder({
  SyntheticsDowntimeDataAttributesRequest.JSON_PROPERTY_DESCRIPTION,
  SyntheticsDowntimeDataAttributesRequest.JSON_PROPERTY_IS_ENABLED,
  SyntheticsDowntimeDataAttributesRequest.JSON_PROPERTY_NAME,
  SyntheticsDowntimeDataAttributesRequest.JSON_PROPERTY_TAGS,
  SyntheticsDowntimeDataAttributesRequest.JSON_PROPERTY_TEST_IDS,
  SyntheticsDowntimeDataAttributesRequest.JSON_PROPERTY_TIME_SLOTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsDowntimeDataAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_IS_ENABLED = "isEnabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TEST_IDS = "testIds";
  private List<String> testIds = new ArrayList<>();

  public static final String JSON_PROPERTY_TIME_SLOTS = "timeSlots";
  private List<SyntheticsDowntimeTimeSlotRequest> timeSlots = new ArrayList<>();

  public SyntheticsDowntimeDataAttributesRequest() {}

  @JsonCreator
  public SyntheticsDowntimeDataAttributesRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_ENABLED) Boolean isEnabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEST_IDS) List<String> testIds,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIME_SLOTS)
          List<SyntheticsDowntimeTimeSlotRequest> timeSlots) {
    this.isEnabled = isEnabled;
    this.name = name;
    this.testIds = testIds;
    this.timeSlots = timeSlots;
  }

  public SyntheticsDowntimeDataAttributesRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * An optional description of the downtime.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SyntheticsDowntimeDataAttributesRequest isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Whether the downtime is enabled.
   *
   * @return isEnabled
   */
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public SyntheticsDowntimeDataAttributesRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the downtime.
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

  public SyntheticsDowntimeDataAttributesRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SyntheticsDowntimeDataAttributesRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * List of tags associated with a Synthetics downtime.
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

  public SyntheticsDowntimeDataAttributesRequest testIds(List<String> testIds) {
    this.testIds = testIds;
    return this;
  }

  public SyntheticsDowntimeDataAttributesRequest addTestIdsItem(String testIdsItem) {
    this.testIds.add(testIdsItem);
    return this;
  }

  /**
   * List of Synthetics test public IDs associated with a downtime.
   *
   * @return testIds
   */
  @JsonProperty(JSON_PROPERTY_TEST_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTestIds() {
    return testIds;
  }

  public void setTestIds(List<String> testIds) {
    this.testIds = testIds;
  }

  public SyntheticsDowntimeDataAttributesRequest timeSlots(
      List<SyntheticsDowntimeTimeSlotRequest> timeSlots) {
    this.timeSlots = timeSlots;
    for (SyntheticsDowntimeTimeSlotRequest item : timeSlots) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsDowntimeDataAttributesRequest addTimeSlotsItem(
      SyntheticsDowntimeTimeSlotRequest timeSlotsItem) {
    this.timeSlots.add(timeSlotsItem);
    this.unparsed |= timeSlotsItem.unparsed;
    return this;
  }

  /**
   * List of time slots for a Synthetics downtime create or update request.
   *
   * @return timeSlots
   */
  @JsonProperty(JSON_PROPERTY_TIME_SLOTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SyntheticsDowntimeTimeSlotRequest> getTimeSlots() {
    return timeSlots;
  }

  public void setTimeSlots(List<SyntheticsDowntimeTimeSlotRequest> timeSlots) {
    this.timeSlots = timeSlots;
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
   * @return SyntheticsDowntimeDataAttributesRequest
   */
  @JsonAnySetter
  public SyntheticsDowntimeDataAttributesRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsDowntimeDataAttributesRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsDowntimeDataAttributesRequest syntheticsDowntimeDataAttributesRequest =
        (SyntheticsDowntimeDataAttributesRequest) o;
    return Objects.equals(this.description, syntheticsDowntimeDataAttributesRequest.description)
        && Objects.equals(this.isEnabled, syntheticsDowntimeDataAttributesRequest.isEnabled)
        && Objects.equals(this.name, syntheticsDowntimeDataAttributesRequest.name)
        && Objects.equals(this.tags, syntheticsDowntimeDataAttributesRequest.tags)
        && Objects.equals(this.testIds, syntheticsDowntimeDataAttributesRequest.testIds)
        && Objects.equals(this.timeSlots, syntheticsDowntimeDataAttributesRequest.timeSlots)
        && Objects.equals(
            this.additionalProperties,
            syntheticsDowntimeDataAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description, isEnabled, name, tags, testIds, timeSlots, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsDowntimeDataAttributesRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    testIds: ").append(toIndentedString(testIds)).append("\n");
    sb.append("    timeSlots: ").append(toIndentedString(timeSlots)).append("\n");
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

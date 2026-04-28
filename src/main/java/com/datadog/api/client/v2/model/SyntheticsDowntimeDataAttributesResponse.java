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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of a Synthetics downtime response object. */
@JsonPropertyOrder({
  SyntheticsDowntimeDataAttributesResponse.JSON_PROPERTY_CREATED_AT,
  SyntheticsDowntimeDataAttributesResponse.JSON_PROPERTY_CREATED_BY,
  SyntheticsDowntimeDataAttributesResponse.JSON_PROPERTY_CREATED_BY_NAME,
  SyntheticsDowntimeDataAttributesResponse.JSON_PROPERTY_DESCRIPTION,
  SyntheticsDowntimeDataAttributesResponse.JSON_PROPERTY_IS_ENABLED,
  SyntheticsDowntimeDataAttributesResponse.JSON_PROPERTY_NAME,
  SyntheticsDowntimeDataAttributesResponse.JSON_PROPERTY_TAGS,
  SyntheticsDowntimeDataAttributesResponse.JSON_PROPERTY_TEST_IDS,
  SyntheticsDowntimeDataAttributesResponse.JSON_PROPERTY_TIME_SLOTS,
  SyntheticsDowntimeDataAttributesResponse.JSON_PROPERTY_UPDATED_AT,
  SyntheticsDowntimeDataAttributesResponse.JSON_PROPERTY_UPDATED_BY,
  SyntheticsDowntimeDataAttributesResponse.JSON_PROPERTY_UPDATED_BY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsDowntimeDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private String createdBy;

  public static final String JSON_PROPERTY_CREATED_BY_NAME = "createdByName";
  private String createdByName;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_IS_ENABLED = "isEnabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_TEST_IDS = "testIds";
  private List<String> testIds = new ArrayList<>();

  public static final String JSON_PROPERTY_TIME_SLOTS = "timeSlots";
  private List<SyntheticsDowntimeTimeSlotResponse> timeSlots = new ArrayList<>();

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_UPDATED_BY = "updatedBy";
  private String updatedBy;

  public static final String JSON_PROPERTY_UPDATED_BY_NAME = "updatedByName";
  private String updatedByName;

  public SyntheticsDowntimeDataAttributesResponse() {}

  @JsonCreator
  public SyntheticsDowntimeDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) String createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY_NAME) String createdByName,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_ENABLED) Boolean isEnabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<String> tags,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEST_IDS) List<String> testIds,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIME_SLOTS)
          List<SyntheticsDowntimeTimeSlotResponse> timeSlots,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_BY) String updatedBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_BY_NAME) String updatedByName) {
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.createdByName = createdByName;
    this.description = description;
    this.isEnabled = isEnabled;
    this.name = name;
    this.tags = tags;
    this.testIds = testIds;
    this.timeSlots = timeSlots;
    this.updatedAt = updatedAt;
    this.updatedBy = updatedBy;
    this.updatedByName = updatedByName;
  }

  public SyntheticsDowntimeDataAttributesResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp when the downtime was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public SyntheticsDowntimeDataAttributesResponse createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The UUID of the user who created the downtime.
   *
   * @return createdBy
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public SyntheticsDowntimeDataAttributesResponse createdByName(String createdByName) {
    this.createdByName = createdByName;
    return this;
  }

  /**
   * The display name of the user who created the downtime.
   *
   * @return createdByName
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedByName() {
    return createdByName;
  }

  public void setCreatedByName(String createdByName) {
    this.createdByName = createdByName;
  }

  public SyntheticsDowntimeDataAttributesResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the downtime.
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

  public SyntheticsDowntimeDataAttributesResponse isEnabled(Boolean isEnabled) {
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

  public SyntheticsDowntimeDataAttributesResponse name(String name) {
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

  public SyntheticsDowntimeDataAttributesResponse tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SyntheticsDowntimeDataAttributesResponse addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * List of tags associated with a Synthetics downtime.
   *
   * @return tags
   */
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public SyntheticsDowntimeDataAttributesResponse testIds(List<String> testIds) {
    this.testIds = testIds;
    return this;
  }

  public SyntheticsDowntimeDataAttributesResponse addTestIdsItem(String testIdsItem) {
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

  public SyntheticsDowntimeDataAttributesResponse timeSlots(
      List<SyntheticsDowntimeTimeSlotResponse> timeSlots) {
    this.timeSlots = timeSlots;
    for (SyntheticsDowntimeTimeSlotResponse item : timeSlots) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsDowntimeDataAttributesResponse addTimeSlotsItem(
      SyntheticsDowntimeTimeSlotResponse timeSlotsItem) {
    this.timeSlots.add(timeSlotsItem);
    this.unparsed |= timeSlotsItem.unparsed;
    return this;
  }

  /**
   * List of time slots in a Synthetics downtime response.
   *
   * @return timeSlots
   */
  @JsonProperty(JSON_PROPERTY_TIME_SLOTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SyntheticsDowntimeTimeSlotResponse> getTimeSlots() {
    return timeSlots;
  }

  public void setTimeSlots(List<SyntheticsDowntimeTimeSlotResponse> timeSlots) {
    this.timeSlots = timeSlots;
  }

  public SyntheticsDowntimeDataAttributesResponse updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The timestamp when the downtime was last updated.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public SyntheticsDowntimeDataAttributesResponse updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * The UUID of the user who last updated the downtime.
   *
   * @return updatedBy
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public SyntheticsDowntimeDataAttributesResponse updatedByName(String updatedByName) {
    this.updatedByName = updatedByName;
    return this;
  }

  /**
   * The display name of the user who last updated the downtime.
   *
   * @return updatedByName
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_BY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUpdatedByName() {
    return updatedByName;
  }

  public void setUpdatedByName(String updatedByName) {
    this.updatedByName = updatedByName;
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
   * @return SyntheticsDowntimeDataAttributesResponse
   */
  @JsonAnySetter
  public SyntheticsDowntimeDataAttributesResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsDowntimeDataAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsDowntimeDataAttributesResponse syntheticsDowntimeDataAttributesResponse =
        (SyntheticsDowntimeDataAttributesResponse) o;
    return Objects.equals(this.createdAt, syntheticsDowntimeDataAttributesResponse.createdAt)
        && Objects.equals(this.createdBy, syntheticsDowntimeDataAttributesResponse.createdBy)
        && Objects.equals(
            this.createdByName, syntheticsDowntimeDataAttributesResponse.createdByName)
        && Objects.equals(this.description, syntheticsDowntimeDataAttributesResponse.description)
        && Objects.equals(this.isEnabled, syntheticsDowntimeDataAttributesResponse.isEnabled)
        && Objects.equals(this.name, syntheticsDowntimeDataAttributesResponse.name)
        && Objects.equals(this.tags, syntheticsDowntimeDataAttributesResponse.tags)
        && Objects.equals(this.testIds, syntheticsDowntimeDataAttributesResponse.testIds)
        && Objects.equals(this.timeSlots, syntheticsDowntimeDataAttributesResponse.timeSlots)
        && Objects.equals(this.updatedAt, syntheticsDowntimeDataAttributesResponse.updatedAt)
        && Objects.equals(this.updatedBy, syntheticsDowntimeDataAttributesResponse.updatedBy)
        && Objects.equals(
            this.updatedByName, syntheticsDowntimeDataAttributesResponse.updatedByName)
        && Objects.equals(
            this.additionalProperties,
            syntheticsDowntimeDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        createdBy,
        createdByName,
        description,
        isEnabled,
        name,
        tags,
        testIds,
        timeSlots,
        updatedAt,
        updatedBy,
        updatedByName,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsDowntimeDataAttributesResponse {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdByName: ").append(toIndentedString(createdByName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    testIds: ").append(toIndentedString(testIds)).append("\n");
    sb.append("    timeSlots: ").append(toIndentedString(timeSlots)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updatedByName: ").append(toIndentedString(updatedByName)).append("\n");
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

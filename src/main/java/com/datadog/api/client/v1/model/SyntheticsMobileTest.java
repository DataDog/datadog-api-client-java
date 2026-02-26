/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Object containing details about a Synthetic mobile test. */
@JsonPropertyOrder({
  SyntheticsMobileTest.JSON_PROPERTY_CONFIG,
  SyntheticsMobileTest.JSON_PROPERTY_DEVICE_IDS,
  SyntheticsMobileTest.JSON_PROPERTY_MESSAGE,
  SyntheticsMobileTest.JSON_PROPERTY_MONITOR_ID,
  SyntheticsMobileTest.JSON_PROPERTY_NAME,
  SyntheticsMobileTest.JSON_PROPERTY_OPTIONS,
  SyntheticsMobileTest.JSON_PROPERTY_PUBLIC_ID,
  SyntheticsMobileTest.JSON_PROPERTY_STATUS,
  SyntheticsMobileTest.JSON_PROPERTY_STEPS,
  SyntheticsMobileTest.JSON_PROPERTY_TAGS,
  SyntheticsMobileTest.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsMobileTest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIG = "config";
  private SyntheticsMobileTestConfig config;

  public static final String JSON_PROPERTY_DEVICE_IDS = "device_ids";
  private List<String> deviceIds = null;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_MONITOR_ID = "monitor_id";
  private Long monitorId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private SyntheticsMobileTestOptions options;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SyntheticsTestPauseStatus status;

  public static final String JSON_PROPERTY_STEPS = "steps";
  private List<SyntheticsMobileStep> steps = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsMobileTestType type = SyntheticsMobileTestType.MOBILE;

  public SyntheticsMobileTest() {}

  @JsonCreator
  public SyntheticsMobileTest(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIG)
          SyntheticsMobileTestConfig config,
      @JsonProperty(required = true, value = JSON_PROPERTY_MESSAGE) String message,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_OPTIONS)
          SyntheticsMobileTestOptions options,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) SyntheticsMobileTestType type) {
    this.config = config;
    this.unparsed |= config.unparsed;
    this.message = message;
    this.name = name;
    this.options = options;
    this.unparsed |= options.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SyntheticsMobileTest config(SyntheticsMobileTestConfig config) {
    this.config = config;
    this.unparsed |= config.unparsed;
    return this;
  }

  /**
   * Configuration object for a Synthetic mobile test.
   *
   * @return config
   */
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsMobileTestConfig getConfig() {
    return config;
  }

  public void setConfig(SyntheticsMobileTestConfig config) {
    this.config = config;
  }

  public SyntheticsMobileTest deviceIds(List<String> deviceIds) {
    this.deviceIds = deviceIds;
    return this;
  }

  public SyntheticsMobileTest addDeviceIdsItem(String deviceIdsItem) {
    if (this.deviceIds == null) {
      this.deviceIds = new ArrayList<>();
    }
    this.deviceIds.add(deviceIdsItem);
    return this;
  }

  /**
   * Array with the different device IDs used to run the test.
   *
   * @return deviceIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getDeviceIds() {
    return deviceIds;
  }

  public void setDeviceIds(List<String> deviceIds) {
    this.deviceIds = deviceIds;
  }

  public SyntheticsMobileTest message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Notification message associated with the test.
   *
   * @return message
   */
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * The associated monitor ID.
   *
   * @return monitorId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMonitorId() {
    return monitorId;
  }

  public SyntheticsMobileTest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the test.
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

  public SyntheticsMobileTest options(SyntheticsMobileTestOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * Object describing the extra options for a Synthetic test.
   *
   * @return options
   */
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsMobileTestOptions getOptions() {
    return options;
  }

  public void setOptions(SyntheticsMobileTestOptions options) {
    this.options = options;
  }

  /**
   * The public ID of the test.
   *
   * @return publicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public SyntheticsMobileTest status(SyntheticsTestPauseStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Define whether you want to start (<code>live</code>) or pause (<code>paused</code>) a Synthetic
   * test.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestPauseStatus getStatus() {
    return status;
  }

  public void setStatus(SyntheticsTestPauseStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public SyntheticsMobileTest steps(List<SyntheticsMobileStep> steps) {
    this.steps = steps;
    for (SyntheticsMobileStep item : steps) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsMobileTest addStepsItem(SyntheticsMobileStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    this.unparsed |= stepsItem.unparsed;
    return this;
  }

  /**
   * Array of steps for the test.
   *
   * @return steps
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsMobileStep> getSteps() {
    return steps;
  }

  public void setSteps(List<SyntheticsMobileStep> steps) {
    this.steps = steps;
  }

  public SyntheticsMobileTest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SyntheticsMobileTest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Array of tags attached to the test.
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

  public SyntheticsMobileTest type(SyntheticsMobileTestType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the Synthetic test, <code>mobile</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsMobileTestType getType() {
    return type;
  }

  public void setType(SyntheticsMobileTestType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return SyntheticsMobileTest
   */
  @JsonAnySetter
  public SyntheticsMobileTest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsMobileTest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsMobileTest syntheticsMobileTest = (SyntheticsMobileTest) o;
    return Objects.equals(this.config, syntheticsMobileTest.config)
        && Objects.equals(this.deviceIds, syntheticsMobileTest.deviceIds)
        && Objects.equals(this.message, syntheticsMobileTest.message)
        && Objects.equals(this.monitorId, syntheticsMobileTest.monitorId)
        && Objects.equals(this.name, syntheticsMobileTest.name)
        && Objects.equals(this.options, syntheticsMobileTest.options)
        && Objects.equals(this.publicId, syntheticsMobileTest.publicId)
        && Objects.equals(this.status, syntheticsMobileTest.status)
        && Objects.equals(this.steps, syntheticsMobileTest.steps)
        && Objects.equals(this.tags, syntheticsMobileTest.tags)
        && Objects.equals(this.type, syntheticsMobileTest.type)
        && Objects.equals(this.additionalProperties, syntheticsMobileTest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        config,
        deviceIds,
        message,
        monitorId,
        name,
        options,
        publicId,
        status,
        steps,
        tags,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsMobileTest {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    deviceIds: ").append(toIndentedString(deviceIds)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    monitorId: ").append(toIndentedString(monitorId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

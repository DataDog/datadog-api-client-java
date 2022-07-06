/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Object containing details about your Synthetic test. */
@JsonPropertyOrder({
  SyntheticsTestDetails.JSON_PROPERTY_CONFIG,
  SyntheticsTestDetails.JSON_PROPERTY_CREATOR,
  SyntheticsTestDetails.JSON_PROPERTY_LOCATIONS,
  SyntheticsTestDetails.JSON_PROPERTY_MESSAGE,
  SyntheticsTestDetails.JSON_PROPERTY_MONITOR_ID,
  SyntheticsTestDetails.JSON_PROPERTY_NAME,
  SyntheticsTestDetails.JSON_PROPERTY_OPTIONS,
  SyntheticsTestDetails.JSON_PROPERTY_PUBLIC_ID,
  SyntheticsTestDetails.JSON_PROPERTY_STATUS,
  SyntheticsTestDetails.JSON_PROPERTY_STEPS,
  SyntheticsTestDetails.JSON_PROPERTY_SUBTYPE,
  SyntheticsTestDetails.JSON_PROPERTY_TAGS,
  SyntheticsTestDetails.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestDetails {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIG = "config";
  private SyntheticsTestConfig config;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private Creator creator;

  public static final String JSON_PROPERTY_LOCATIONS = "locations";
  private List<String> locations = null;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_MONITOR_ID = "monitor_id";
  private Long monitorId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private SyntheticsTestOptions options;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SyntheticsTestPauseStatus status;

  public static final String JSON_PROPERTY_STEPS = "steps";
  private List<SyntheticsStep> steps = null;

  public static final String JSON_PROPERTY_SUBTYPE = "subtype";
  private SyntheticsTestDetailsSubType subtype;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsTestDetailsType type;

  public SyntheticsTestDetails config(SyntheticsTestConfig config) {
    this.config = config;
    this.unparsed |= config.unparsed;
    return this;
  }

  /**
   * Configuration object for a Synthetic test.
   *
   * @return config
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestConfig getConfig() {
    return config;
  }

  public void setConfig(SyntheticsTestConfig config) {
    this.config = config;
  }

  /**
   * Object describing the creator of the shared element.
   *
   * @return creator
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Creator getCreator() {
    return creator;
  }

  public SyntheticsTestDetails locations(List<String> locations) {
    this.locations = locations;
    return this;
  }

  public SyntheticsTestDetails addLocationsItem(String locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

  /**
   * Array of locations used to run the test.
   *
   * @return locations
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getLocations() {
    return locations;
  }

  public void setLocations(List<String> locations) {
    this.locations = locations;
  }

  public SyntheticsTestDetails message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Notification message associated with the test.
   *
   * @return message
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMonitorId() {
    return monitorId;
  }

  public SyntheticsTestDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the test.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SyntheticsTestDetails options(SyntheticsTestOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * Object describing the extra options for a Synthetic test.
   *
   * @return options
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestOptions getOptions() {
    return options;
  }

  public void setOptions(SyntheticsTestOptions options) {
    this.options = options;
  }

  /**
   * The test public ID.
   *
   * @return publicId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public SyntheticsTestDetails status(SyntheticsTestPauseStatus status) {
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
  @javax.annotation.Nullable
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

  public SyntheticsTestDetails steps(List<SyntheticsStep> steps) {
    this.steps = steps;
    for (SyntheticsStep item : steps) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTestDetails addStepsItem(SyntheticsStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    this.unparsed |= stepsItem.unparsed;
    return this;
  }

  /**
   * For browser test, the steps of the test.
   *
   * @return steps
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsStep> getSteps() {
    return steps;
  }

  public void setSteps(List<SyntheticsStep> steps) {
    this.steps = steps;
  }

  public SyntheticsTestDetails subtype(SyntheticsTestDetailsSubType subtype) {
    this.subtype = subtype;
    this.unparsed |= !subtype.isValid();
    return this;
  }

  /**
   * The subtype of the Synthetic API test, <code>http</code>, <code>ssl</code>, <code>tcp</code>,
   * <code>dns</code>, <code>icmp</code>, <code>udp</code>, <code>websocket</code>, <code>grpc
   * </code> or <code>multi</code>.
   *
   * @return subtype
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestDetailsSubType getSubtype() {
    return subtype;
  }

  public void setSubtype(SyntheticsTestDetailsSubType subtype) {
    if (!subtype.isValid()) {
      this.unparsed = true;
    }
    this.subtype = subtype;
  }

  public SyntheticsTestDetails tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SyntheticsTestDetails addTagsItem(String tagsItem) {
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
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public SyntheticsTestDetails type(SyntheticsTestDetailsType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the Synthetic test, either <code>api</code> or <code>browser</code>.
   *
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestDetailsType getType() {
    return type;
  }

  public void setType(SyntheticsTestDetailsType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this SyntheticsTestDetails object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestDetails syntheticsTestDetails = (SyntheticsTestDetails) o;
    return Objects.equals(this.config, syntheticsTestDetails.config)
        && Objects.equals(this.creator, syntheticsTestDetails.creator)
        && Objects.equals(this.locations, syntheticsTestDetails.locations)
        && Objects.equals(this.message, syntheticsTestDetails.message)
        && Objects.equals(this.monitorId, syntheticsTestDetails.monitorId)
        && Objects.equals(this.name, syntheticsTestDetails.name)
        && Objects.equals(this.options, syntheticsTestDetails.options)
        && Objects.equals(this.publicId, syntheticsTestDetails.publicId)
        && Objects.equals(this.status, syntheticsTestDetails.status)
        && Objects.equals(this.steps, syntheticsTestDetails.steps)
        && Objects.equals(this.subtype, syntheticsTestDetails.subtype)
        && Objects.equals(this.tags, syntheticsTestDetails.tags)
        && Objects.equals(this.type, syntheticsTestDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        config, creator, locations, message, monitorId, name, options, publicId, status, steps,
        subtype, tags, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestDetails {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    monitorId: ").append(toIndentedString(monitorId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Object containing details about your Synthetic test, without test steps. */
@JsonPropertyOrder({
  SyntheticsTestDetailsWithoutSteps.JSON_PROPERTY_CONFIG,
  SyntheticsTestDetailsWithoutSteps.JSON_PROPERTY_CREATOR,
  SyntheticsTestDetailsWithoutSteps.JSON_PROPERTY_LOCATIONS,
  SyntheticsTestDetailsWithoutSteps.JSON_PROPERTY_MESSAGE,
  SyntheticsTestDetailsWithoutSteps.JSON_PROPERTY_MONITOR_ID,
  SyntheticsTestDetailsWithoutSteps.JSON_PROPERTY_NAME,
  SyntheticsTestDetailsWithoutSteps.JSON_PROPERTY_OPTIONS,
  SyntheticsTestDetailsWithoutSteps.JSON_PROPERTY_PUBLIC_ID,
  SyntheticsTestDetailsWithoutSteps.JSON_PROPERTY_STATUS,
  SyntheticsTestDetailsWithoutSteps.JSON_PROPERTY_SUBTYPE,
  SyntheticsTestDetailsWithoutSteps.JSON_PROPERTY_TAGS,
  SyntheticsTestDetailsWithoutSteps.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestDetailsWithoutSteps {
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

  public static final String JSON_PROPERTY_SUBTYPE = "subtype";
  private SyntheticsTestDetailsSubType subtype;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsTestDetailsType type;

  public SyntheticsTestDetailsWithoutSteps config(SyntheticsTestConfig config) {
    this.config = config;
    this.unparsed |= config.unparsed;
    return this;
  }

  /**
   * Configuration object for a Synthetic test.
   *
   * @return config
   */
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Creator getCreator() {
    return creator;
  }

  public SyntheticsTestDetailsWithoutSteps locations(List<String> locations) {
    this.locations = locations;
    return this;
  }

  public SyntheticsTestDetailsWithoutSteps addLocationsItem(String locationsItem) {
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getLocations() {
    return locations;
  }

  public void setLocations(List<String> locations) {
    this.locations = locations;
  }

  public SyntheticsTestDetailsWithoutSteps message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Notification message associated with the test.
   *
   * @return message
   */
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMonitorId() {
    return monitorId;
  }

  public SyntheticsTestDetailsWithoutSteps name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the test.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SyntheticsTestDetailsWithoutSteps options(SyntheticsTestOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * Object describing the extra options for a Synthetic test.
   *
   * @return options
   */
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public SyntheticsTestDetailsWithoutSteps status(SyntheticsTestPauseStatus status) {
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

  public SyntheticsTestDetailsWithoutSteps subtype(SyntheticsTestDetailsSubType subtype) {
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
  @jakarta.annotation.Nullable
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

  public SyntheticsTestDetailsWithoutSteps tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SyntheticsTestDetailsWithoutSteps addTagsItem(String tagsItem) {
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

  public SyntheticsTestDetailsWithoutSteps type(SyntheticsTestDetailsType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the Synthetic test, either <code>api</code> or <code>browser</code>.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
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
   * @return SyntheticsTestDetailsWithoutSteps
   */
  @JsonAnySetter
  public SyntheticsTestDetailsWithoutSteps putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestDetailsWithoutSteps object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestDetailsWithoutSteps syntheticsTestDetailsWithoutSteps =
        (SyntheticsTestDetailsWithoutSteps) o;
    return Objects.equals(this.config, syntheticsTestDetailsWithoutSteps.config)
        && Objects.equals(this.creator, syntheticsTestDetailsWithoutSteps.creator)
        && Objects.equals(this.locations, syntheticsTestDetailsWithoutSteps.locations)
        && Objects.equals(this.message, syntheticsTestDetailsWithoutSteps.message)
        && Objects.equals(this.monitorId, syntheticsTestDetailsWithoutSteps.monitorId)
        && Objects.equals(this.name, syntheticsTestDetailsWithoutSteps.name)
        && Objects.equals(this.options, syntheticsTestDetailsWithoutSteps.options)
        && Objects.equals(this.publicId, syntheticsTestDetailsWithoutSteps.publicId)
        && Objects.equals(this.status, syntheticsTestDetailsWithoutSteps.status)
        && Objects.equals(this.subtype, syntheticsTestDetailsWithoutSteps.subtype)
        && Objects.equals(this.tags, syntheticsTestDetailsWithoutSteps.tags)
        && Objects.equals(this.type, syntheticsTestDetailsWithoutSteps.type)
        && Objects.equals(
            this.additionalProperties, syntheticsTestDetailsWithoutSteps.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        config,
        creator,
        locations,
        message,
        monitorId,
        name,
        options,
        publicId,
        status,
        subtype,
        tags,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestDetailsWithoutSteps {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    monitorId: ").append(toIndentedString(monitorId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
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

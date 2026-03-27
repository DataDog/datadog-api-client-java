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

/** Object containing details about a Synthetic API test. */
@JsonPropertyOrder({
  SyntheticsAPITest.JSON_PROPERTY_CONFIG,
  SyntheticsAPITest.JSON_PROPERTY_LOCATIONS,
  SyntheticsAPITest.JSON_PROPERTY_MESSAGE,
  SyntheticsAPITest.JSON_PROPERTY_MONITOR_ID,
  SyntheticsAPITest.JSON_PROPERTY_NAME,
  SyntheticsAPITest.JSON_PROPERTY_OPTIONS,
  SyntheticsAPITest.JSON_PROPERTY_PUBLIC_ID,
  SyntheticsAPITest.JSON_PROPERTY_STATUS,
  SyntheticsAPITest.JSON_PROPERTY_SUBTYPE,
  SyntheticsAPITest.JSON_PROPERTY_TAGS,
  SyntheticsAPITest.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsAPITest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIG = "config";
  private SyntheticsAPITestConfig config;

  public static final String JSON_PROPERTY_LOCATIONS = "locations";
  private List<String> locations = new ArrayList<>();

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
  private SyntheticsAPITestType type = SyntheticsAPITestType.API;

  public SyntheticsAPITest() {}

  @JsonCreator
  public SyntheticsAPITest(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIG) SyntheticsAPITestConfig config,
      @JsonProperty(required = true, value = JSON_PROPERTY_LOCATIONS) List<String> locations,
      @JsonProperty(required = true, value = JSON_PROPERTY_MESSAGE) String message,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_OPTIONS) SyntheticsTestOptions options,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) SyntheticsAPITestType type) {
    this.config = config;
    this.unparsed |= config.unparsed;
    this.locations = locations;
    this.message = message;
    this.name = name;
    this.options = options;
    this.unparsed |= options.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SyntheticsAPITest config(SyntheticsAPITestConfig config) {
    this.config = config;
    this.unparsed |= config.unparsed;
    return this;
  }

  /**
   * Configuration object for a Synthetic API test.
   *
   * @return config
   */
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsAPITestConfig getConfig() {
    return config;
  }

  public void setConfig(SyntheticsAPITestConfig config) {
    this.config = config;
  }

  public SyntheticsAPITest locations(List<String> locations) {
    this.locations = locations;
    return this;
  }

  public SyntheticsAPITest addLocationsItem(String locationsItem) {
    this.locations.add(locationsItem);
    return this;
  }

  /**
   * Array of locations used to run the test.
   *
   * @return locations
   */
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getLocations() {
    return locations;
  }

  public void setLocations(List<String> locations) {
    this.locations = locations;
  }

  public SyntheticsAPITest message(String message) {
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

  public SyntheticsAPITest name(String name) {
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

  public SyntheticsAPITest options(SyntheticsTestOptions options) {
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
  public SyntheticsTestOptions getOptions() {
    return options;
  }

  public void setOptions(SyntheticsTestOptions options) {
    this.options = options;
  }

  /**
   * The public ID for the test.
   *
   * @return publicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public SyntheticsAPITest status(SyntheticsTestPauseStatus status) {
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

  public SyntheticsAPITest subtype(SyntheticsTestDetailsSubType subtype) {
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

  public SyntheticsAPITest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SyntheticsAPITest addTagsItem(String tagsItem) {
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

  public SyntheticsAPITest type(SyntheticsAPITestType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the Synthetic test, <code>api</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsAPITestType getType() {
    return type;
  }

  public void setType(SyntheticsAPITestType type) {
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
   * @return SyntheticsAPITest
   */
  @JsonAnySetter
  public SyntheticsAPITest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsAPITest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsAPITest syntheticsApiTest = (SyntheticsAPITest) o;
    return Objects.equals(this.config, syntheticsApiTest.config)
        && Objects.equals(this.locations, syntheticsApiTest.locations)
        && Objects.equals(this.message, syntheticsApiTest.message)
        && Objects.equals(this.monitorId, syntheticsApiTest.monitorId)
        && Objects.equals(this.name, syntheticsApiTest.name)
        && Objects.equals(this.options, syntheticsApiTest.options)
        && Objects.equals(this.publicId, syntheticsApiTest.publicId)
        && Objects.equals(this.status, syntheticsApiTest.status)
        && Objects.equals(this.subtype, syntheticsApiTest.subtype)
        && Objects.equals(this.tags, syntheticsApiTest.tags)
        && Objects.equals(this.type, syntheticsApiTest.type)
        && Objects.equals(this.additionalProperties, syntheticsApiTest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        config,
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
    sb.append("class SyntheticsAPITest {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

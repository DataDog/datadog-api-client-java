/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Object containing details about a Synthetic browser test.</p>
 */
@JsonPropertyOrder({
  SyntheticsBrowserTest.JSON_PROPERTY_CONFIG,
  SyntheticsBrowserTest.JSON_PROPERTY_LOCATIONS,
  SyntheticsBrowserTest.JSON_PROPERTY_MESSAGE,
  SyntheticsBrowserTest.JSON_PROPERTY_MONITOR_ID,
  SyntheticsBrowserTest.JSON_PROPERTY_NAME,
  SyntheticsBrowserTest.JSON_PROPERTY_OPTIONS,
  SyntheticsBrowserTest.JSON_PROPERTY_PUBLIC_ID,
  SyntheticsBrowserTest.JSON_PROPERTY_STATUS,
  SyntheticsBrowserTest.JSON_PROPERTY_STEPS,
  SyntheticsBrowserTest.JSON_PROPERTY_TAGS,
  SyntheticsBrowserTest.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsBrowserTest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIG = "config";
  private SyntheticsBrowserTestConfig config;

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

  public static final String JSON_PROPERTY_STEPS = "steps";
  private List<SyntheticsStep> steps = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsBrowserTestType type = SyntheticsBrowserTestType.BROWSER;

  public SyntheticsBrowserTest() {}

  @JsonCreator
  public SyntheticsBrowserTest(
            @JsonProperty(required=true, value=JSON_PROPERTY_CONFIG)SyntheticsBrowserTestConfig config,
            @JsonProperty(required=true, value=JSON_PROPERTY_LOCATIONS)List<String> locations,
            @JsonProperty(required=true, value=JSON_PROPERTY_MESSAGE)String message,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_OPTIONS)SyntheticsTestOptions options,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)SyntheticsBrowserTestType type) {
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
  public SyntheticsBrowserTest config(SyntheticsBrowserTestConfig config) {
    this.config = config;
    this.unparsed |= config.unparsed;
    return this;
  }

  /**
   * <p>Configuration object for a Synthetic browser test.</p>
   * @return config
  **/
      @JsonProperty(JSON_PROPERTY_CONFIG)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SyntheticsBrowserTestConfig getConfig() {
        return config;
      }
  public void setConfig(SyntheticsBrowserTestConfig config) {
    this.config = config;
  }
  public SyntheticsBrowserTest locations(List<String> locations) {
    this.locations = locations;
    return this;
  }
  public SyntheticsBrowserTest addLocationsItem(String locationsItem) {
    this.locations.add(locationsItem);
    return this;
  }

  /**
   * <p>Array of locations used to run the test.</p>
   * @return locations
  **/
      @JsonProperty(JSON_PROPERTY_LOCATIONS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getLocations() {
        return locations;
      }
  public void setLocations(List<String> locations) {
    this.locations = locations;
  }
  public SyntheticsBrowserTest message(String message) {
    this.message = message;
    return this;
  }

  /**
   * <p>Notification message associated with the test. Message can either be text or an empty string.</p>
   * @return message
  **/
      @JsonProperty(JSON_PROPERTY_MESSAGE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getMessage() {
        return message;
      }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * <p>The associated monitor ID.</p>
   * @return monitorId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MONITOR_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getMonitorId() {
        return monitorId;
      }
  public SyntheticsBrowserTest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the test.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public SyntheticsBrowserTest options(SyntheticsTestOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * <p>Object describing the extra options for a Synthetic test.</p>
   * @return options
  **/
      @JsonProperty(JSON_PROPERTY_OPTIONS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SyntheticsTestOptions getOptions() {
        return options;
      }
  public void setOptions(SyntheticsTestOptions options) {
    this.options = options;
  }

  /**
   * <p>The public ID of the test.</p>
   * @return publicId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPublicId() {
        return publicId;
      }
  public SyntheticsBrowserTest status(SyntheticsTestPauseStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * <p>Define whether you want to start (<code>live</code>) or pause (<code>paused</code>) a
   * Synthetic test.</p>
   * @return status
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsTestPauseStatus getStatus() {
        return status;
      }
  public void setStatus(SyntheticsTestPauseStatus status) {
    if (!status.isValid()) {
        this.unparsed = true;
    }
    this.status = status;
  }
  public SyntheticsBrowserTest steps(List<SyntheticsStep> steps) {
    this.steps = steps;
    for (SyntheticsStep item : steps) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SyntheticsBrowserTest addStepsItem(SyntheticsStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    this.unparsed |= stepsItem.unparsed;
    return this;
  }

  /**
   * <p>Array of steps for the test.</p>
   * @return steps
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STEPS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SyntheticsStep> getSteps() {
        return steps;
      }
  public void setSteps(List<SyntheticsStep> steps) {
    this.steps = steps;
  }
  public SyntheticsBrowserTest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public SyntheticsBrowserTest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>Array of tags attached to the test.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }
  public SyntheticsBrowserTest type(SyntheticsBrowserTestType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the Synthetic test, <code>browser</code>.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SyntheticsBrowserTestType getType() {
        return type;
      }
  public void setType(SyntheticsBrowserTestType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SyntheticsBrowserTest
   */
  @JsonAnySetter
  public SyntheticsBrowserTest putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this SyntheticsBrowserTest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsBrowserTest syntheticsBrowserTest = (SyntheticsBrowserTest) o;
    return Objects.equals(this.config, syntheticsBrowserTest.config) && Objects.equals(this.locations, syntheticsBrowserTest.locations) && Objects.equals(this.message, syntheticsBrowserTest.message) && Objects.equals(this.monitorId, syntheticsBrowserTest.monitorId) && Objects.equals(this.name, syntheticsBrowserTest.name) && Objects.equals(this.options, syntheticsBrowserTest.options) && Objects.equals(this.publicId, syntheticsBrowserTest.publicId) && Objects.equals(this.status, syntheticsBrowserTest.status) && Objects.equals(this.steps, syntheticsBrowserTest.steps) && Objects.equals(this.tags, syntheticsBrowserTest.tags) && Objects.equals(this.type, syntheticsBrowserTest.type) && Objects.equals(this.additionalProperties, syntheticsBrowserTest.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(config,locations,message,monitorId,name,options,publicId,status,steps,tags,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBrowserTest {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

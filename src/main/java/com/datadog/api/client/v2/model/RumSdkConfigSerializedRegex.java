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

/** A serialized regex used as an extractor in dynamic options. */
@JsonPropertyOrder({
  RumSdkConfigSerializedRegex.JSON_PROPERTY_RC_SERIALIZED_TYPE,
  RumSdkConfigSerializedRegex.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumSdkConfigSerializedRegex {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RC_SERIALIZED_TYPE = "rc_serialized_type";
  private RumSdkConfigSerializedRegexType rcSerializedType;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public RumSdkConfigSerializedRegex() {}

  @JsonCreator
  public RumSdkConfigSerializedRegex(
      @JsonProperty(required = true, value = JSON_PROPERTY_RC_SERIALIZED_TYPE)
          RumSdkConfigSerializedRegexType rcSerializedType,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) String value) {
    this.rcSerializedType = rcSerializedType;
    this.unparsed |= !rcSerializedType.isValid();
    this.value = value;
  }

  public RumSdkConfigSerializedRegex rcSerializedType(
      RumSdkConfigSerializedRegexType rcSerializedType) {
    this.rcSerializedType = rcSerializedType;
    this.unparsed |= !rcSerializedType.isValid();
    return this;
  }

  /**
   * The type identifier for a serialized regex. Always <code>regex</code>.
   *
   * @return rcSerializedType
   */
  @JsonProperty(JSON_PROPERTY_RC_SERIALIZED_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumSdkConfigSerializedRegexType getRcSerializedType() {
    return rcSerializedType;
  }

  public void setRcSerializedType(RumSdkConfigSerializedRegexType rcSerializedType) {
    if (!rcSerializedType.isValid()) {
      this.unparsed = true;
    }
    this.rcSerializedType = rcSerializedType;
  }

  public RumSdkConfigSerializedRegex value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The regex pattern used for extraction.
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
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
   * @return RumSdkConfigSerializedRegex
   */
  @JsonAnySetter
  public RumSdkConfigSerializedRegex putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumSdkConfigSerializedRegex object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumSdkConfigSerializedRegex rumSdkConfigSerializedRegex = (RumSdkConfigSerializedRegex) o;
    return Objects.equals(this.rcSerializedType, rumSdkConfigSerializedRegex.rcSerializedType)
        && Objects.equals(this.value, rumSdkConfigSerializedRegex.value)
        && Objects.equals(
            this.additionalProperties, rumSdkConfigSerializedRegex.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rcSerializedType, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumSdkConfigSerializedRegex {\n");
    sb.append("    rcSerializedType: ").append(toIndentedString(rcSerializedType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

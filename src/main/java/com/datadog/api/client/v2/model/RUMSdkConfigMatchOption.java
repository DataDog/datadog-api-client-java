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

/** A match option used for URL or origin pattern matching. */
@JsonPropertyOrder({
  RUMSdkConfigMatchOption.JSON_PROPERTY_RC_SERIALIZED_TYPE,
  RUMSdkConfigMatchOption.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RUMSdkConfigMatchOption {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RC_SERIALIZED_TYPE = "rc_serialized_type";
  private RUMSdkConfigMatchOptionSerializedType rcSerializedType;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public RUMSdkConfigMatchOption() {}

  @JsonCreator
  public RUMSdkConfigMatchOption(
      @JsonProperty(required = true, value = JSON_PROPERTY_RC_SERIALIZED_TYPE)
          RUMSdkConfigMatchOptionSerializedType rcSerializedType,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) String value) {
    this.rcSerializedType = rcSerializedType;
    this.unparsed |= !rcSerializedType.isValid();
    this.value = value;
  }

  public RUMSdkConfigMatchOption rcSerializedType(
      RUMSdkConfigMatchOptionSerializedType rcSerializedType) {
    this.rcSerializedType = rcSerializedType;
    this.unparsed |= !rcSerializedType.isValid();
    return this;
  }

  /**
   * The type of match pattern, either a literal string or a regex.
   *
   * @return rcSerializedType
   */
  @JsonProperty(JSON_PROPERTY_RC_SERIALIZED_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RUMSdkConfigMatchOptionSerializedType getRcSerializedType() {
    return rcSerializedType;
  }

  public void setRcSerializedType(RUMSdkConfigMatchOptionSerializedType rcSerializedType) {
    if (!rcSerializedType.isValid()) {
      this.unparsed = true;
    }
    this.rcSerializedType = rcSerializedType;
  }

  public RUMSdkConfigMatchOption value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value to match against.
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
   * @return RUMSdkConfigMatchOption
   */
  @JsonAnySetter
  public RUMSdkConfigMatchOption putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RUMSdkConfigMatchOption object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMSdkConfigMatchOption rumSdkConfigMatchOption = (RUMSdkConfigMatchOption) o;
    return Objects.equals(this.rcSerializedType, rumSdkConfigMatchOption.rcSerializedType)
        && Objects.equals(this.value, rumSdkConfigMatchOption.value)
        && Objects.equals(this.additionalProperties, rumSdkConfigMatchOption.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rcSerializedType, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMSdkConfigMatchOption {\n");
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

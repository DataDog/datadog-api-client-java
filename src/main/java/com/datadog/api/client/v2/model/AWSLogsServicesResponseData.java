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

/** AWS Logs Services response body */
@JsonPropertyOrder({
  AWSLogsServicesResponseData.JSON_PROPERTY_ATTRIBUTES,
  AWSLogsServicesResponseData.JSON_PROPERTY_ID,
  AWSLogsServicesResponseData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSLogsServicesResponseData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private AWSLogsServicesResponseAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id = "logs_services";

  public static final String JSON_PROPERTY_TYPE = "type";
  private AWSLogsServicesResponseDataType type = AWSLogsServicesResponseDataType.LOGS_SERVICES;

  public AWSLogsServicesResponseData() {}

  @JsonCreator
  public AWSLogsServicesResponseData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          AWSLogsServicesResponseDataType type) {
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public AWSLogsServicesResponseData attributes(AWSLogsServicesResponseAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * AWS Logs Services response body
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AWSLogsServicesResponseAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(AWSLogsServicesResponseAttributes attributes) {
    this.attributes = attributes;
  }

  public AWSLogsServicesResponseData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The <code>AWSLogsServicesResponseData</code> <code>id</code>.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AWSLogsServicesResponseData type(AWSLogsServicesResponseDataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The <code>AWSLogsServicesResponseData</code> <code>type</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AWSLogsServicesResponseDataType getType() {
    return type;
  }

  public void setType(AWSLogsServicesResponseDataType type) {
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
   * @return AWSLogsServicesResponseData
   */
  @JsonAnySetter
  public AWSLogsServicesResponseData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AWSLogsServicesResponseData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSLogsServicesResponseData awsLogsServicesResponseData = (AWSLogsServicesResponseData) o;
    return Objects.equals(this.attributes, awsLogsServicesResponseData.attributes)
        && Objects.equals(this.id, awsLogsServicesResponseData.id)
        && Objects.equals(this.type, awsLogsServicesResponseData.type)
        && Objects.equals(
            this.additionalProperties, awsLogsServicesResponseData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSLogsServicesResponseData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

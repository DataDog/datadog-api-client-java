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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes for creating a timestamp override. */
@JsonPropertyOrder({
  IncidentTimestampOverrideDataAttributesRequest.JSON_PROPERTY_TIMESTAMP_TYPE,
  IncidentTimestampOverrideDataAttributesRequest.JSON_PROPERTY_TIMESTAMP_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentTimestampOverrideDataAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TIMESTAMP_TYPE = "timestamp_type";
  private IncidentTimestampType timestampType;

  public static final String JSON_PROPERTY_TIMESTAMP_VALUE = "timestamp_value";
  private OffsetDateTime timestampValue;

  public IncidentTimestampOverrideDataAttributesRequest() {}

  @JsonCreator
  public IncidentTimestampOverrideDataAttributesRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMESTAMP_TYPE)
          IncidentTimestampType timestampType,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMESTAMP_VALUE)
          OffsetDateTime timestampValue) {
    this.timestampType = timestampType;
    this.unparsed |= !timestampType.isValid();
    this.timestampValue = timestampValue;
  }

  public IncidentTimestampOverrideDataAttributesRequest timestampType(
      IncidentTimestampType timestampType) {
    this.timestampType = timestampType;
    this.unparsed |= !timestampType.isValid();
    return this;
  }

  /**
   * The type of timestamp to override.
   *
   * @return timestampType
   */
  @JsonProperty(JSON_PROPERTY_TIMESTAMP_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentTimestampType getTimestampType() {
    return timestampType;
  }

  public void setTimestampType(IncidentTimestampType timestampType) {
    if (!timestampType.isValid()) {
      this.unparsed = true;
    }
    this.timestampType = timestampType;
  }

  public IncidentTimestampOverrideDataAttributesRequest timestampValue(
      OffsetDateTime timestampValue) {
    this.timestampValue = timestampValue;
    return this;
  }

  /**
   * The overridden timestamp value.
   *
   * @return timestampValue
   */
  @JsonProperty(JSON_PROPERTY_TIMESTAMP_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getTimestampValue() {
    return timestampValue;
  }

  public void setTimestampValue(OffsetDateTime timestampValue) {
    this.timestampValue = timestampValue;
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
   * @return IncidentTimestampOverrideDataAttributesRequest
   */
  @JsonAnySetter
  public IncidentTimestampOverrideDataAttributesRequest putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this IncidentTimestampOverrideDataAttributesRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentTimestampOverrideDataAttributesRequest incidentTimestampOverrideDataAttributesRequest =
        (IncidentTimestampOverrideDataAttributesRequest) o;
    return Objects.equals(
            this.timestampType, incidentTimestampOverrideDataAttributesRequest.timestampType)
        && Objects.equals(
            this.timestampValue, incidentTimestampOverrideDataAttributesRequest.timestampValue)
        && Objects.equals(
            this.additionalProperties,
            incidentTimestampOverrideDataAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestampType, timestampValue, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentTimestampOverrideDataAttributesRequest {\n");
    sb.append("    timestampType: ").append(toIndentedString(timestampType)).append("\n");
    sb.append("    timestampValue: ").append(toIndentedString(timestampValue)).append("\n");
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

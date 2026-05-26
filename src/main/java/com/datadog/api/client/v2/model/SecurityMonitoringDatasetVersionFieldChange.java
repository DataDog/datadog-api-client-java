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

/** A single field change between two versions of a dataset. */
@JsonPropertyOrder({
  SecurityMonitoringDatasetVersionFieldChange.JSON_PROPERTY_CURRENT,
  SecurityMonitoringDatasetVersionFieldChange.JSON_PROPERTY_FIELD,
  SecurityMonitoringDatasetVersionFieldChange.JSON_PROPERTY_PREVIOUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringDatasetVersionFieldChange {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CURRENT = "current";
  private Object current = new Object();

  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_PREVIOUS = "previous";
  private Object previous = new Object();

  public SecurityMonitoringDatasetVersionFieldChange() {}

  @JsonCreator
  public SecurityMonitoringDatasetVersionFieldChange(
      @JsonProperty(required = true, value = JSON_PROPERTY_CURRENT) Object current,
      @JsonProperty(required = true, value = JSON_PROPERTY_FIELD) String field,
      @JsonProperty(required = true, value = JSON_PROPERTY_PREVIOUS) Object previous) {
    this.current = current;
    this.field = field;
    this.previous = previous;
  }

  public SecurityMonitoringDatasetVersionFieldChange current(Object current) {
    this.current = current;
    return this;
  }

  /**
   * The current value of the field, serialized as a JSON value.
   *
   * @return current
   */
  @JsonProperty(JSON_PROPERTY_CURRENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Object getCurrent() {
    return current;
  }

  public void setCurrent(Object current) {
    this.current = current;
  }

  public SecurityMonitoringDatasetVersionFieldChange field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The name of the field that changed.
   *
   * @return field
   */
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public SecurityMonitoringDatasetVersionFieldChange previous(Object previous) {
    this.previous = previous;
    return this;
  }

  /**
   * The previous value of the field, serialized as a JSON value.
   *
   * @return previous
   */
  @JsonProperty(JSON_PROPERTY_PREVIOUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Object getPrevious() {
    return previous;
  }

  public void setPrevious(Object previous) {
    this.previous = previous;
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
   * @return SecurityMonitoringDatasetVersionFieldChange
   */
  @JsonAnySetter
  public SecurityMonitoringDatasetVersionFieldChange putAdditionalProperty(
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

  /** Return true if this SecurityMonitoringDatasetVersionFieldChange object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringDatasetVersionFieldChange securityMonitoringDatasetVersionFieldChange =
        (SecurityMonitoringDatasetVersionFieldChange) o;
    return Objects.equals(this.current, securityMonitoringDatasetVersionFieldChange.current)
        && Objects.equals(this.field, securityMonitoringDatasetVersionFieldChange.field)
        && Objects.equals(this.previous, securityMonitoringDatasetVersionFieldChange.previous)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringDatasetVersionFieldChange.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, field, previous, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringDatasetVersionFieldChange {\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
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

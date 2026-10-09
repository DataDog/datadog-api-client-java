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

/** Attributes of the severity override request. */
@JsonPropertyOrder({SeverityOverrideRequestDataAttributes.JSON_PROPERTY_SEVERITY})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SeverityOverrideRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private SeverityOverrideAttributes severity;

  public SeverityOverrideRequestDataAttributes() {}

  @JsonCreator
  public SeverityOverrideRequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_SEVERITY)
          SeverityOverrideAttributes severity) {
    this.severity = severity;
    this.unparsed |= severity.unparsed;
  }

  public SeverityOverrideRequestDataAttributes severity(SeverityOverrideAttributes severity) {
    this.severity = severity;
    this.unparsed |= severity.unparsed;
    return this;
  }

  /**
   * Severity override to apply to the findings. Set <code>action</code> to <code>set</code> to
   * apply a manual severity override with the given <code>value</code>. Set <code>action</code> to
   * <code>clear</code> to remove a manual severity override.
   *
   * @return severity
   */
  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SeverityOverrideAttributes getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityOverrideAttributes severity) {
    this.severity = severity;
    if (severity != null) {
      this.unparsed |= severity.unparsed;
    }
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
   * @return SeverityOverrideRequestDataAttributes
   */
  @JsonAnySetter
  public SeverityOverrideRequestDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SeverityOverrideRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeverityOverrideRequestDataAttributes severityOverrideRequestDataAttributes =
        (SeverityOverrideRequestDataAttributes) o;
    return Objects.equals(this.severity, severityOverrideRequestDataAttributes.severity)
        && Objects.equals(
            this.additionalProperties, severityOverrideRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(severity, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeverityOverrideRequestDataAttributes {\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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

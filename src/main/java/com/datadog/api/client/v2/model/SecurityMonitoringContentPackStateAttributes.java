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

/** Attributes of a content pack state. */
@JsonPropertyOrder({
  SecurityMonitoringContentPackStateAttributes.JSON_PROPERTY_DETAILS,
  SecurityMonitoringContentPackStateAttributes.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringContentPackStateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DETAILS = "details";
  private SecurityMonitoringContentPackStateDetails details;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SecurityMonitoringContentPackStatus status;

  public SecurityMonitoringContentPackStateAttributes() {}

  @JsonCreator
  public SecurityMonitoringContentPackStateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DETAILS)
          SecurityMonitoringContentPackStateDetails details,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          SecurityMonitoringContentPackStatus status) {
    this.details = details;
    this.unparsed |= details.unparsed;
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public SecurityMonitoringContentPackStateAttributes details(
      SecurityMonitoringContentPackStateDetails details) {
    this.details = details;
    this.unparsed |= details.unparsed;
    return this;
  }

  /**
   * Type-specific details for a content pack state. The set of fields present depends on the
   * content pack's <code>type</code>. When Cloud SIEM is inactive for the requesting organization,
   * <code>onboarding</code> is returned instead of the content pack's usual type, such as <code>
   * logs</code> or <code>vulnerability</code>.`
   *
   * @return details
   */
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringContentPackStateDetails getDetails() {
    return details;
  }

  public void setDetails(SecurityMonitoringContentPackStateDetails details) {
    this.details = details;
    if (details != null) {
      this.unparsed |= details.unparsed;
    }
  }

  public SecurityMonitoringContentPackStateAttributes status(
      SecurityMonitoringContentPackStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The current operational status of a content pack.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringContentPackStatus getStatus() {
    return status;
  }

  public void setStatus(SecurityMonitoringContentPackStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
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
   * @return SecurityMonitoringContentPackStateAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringContentPackStateAttributes putAdditionalProperty(
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

  /** Return true if this SecurityMonitoringContentPackStateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringContentPackStateAttributes securityMonitoringContentPackStateAttributes =
        (SecurityMonitoringContentPackStateAttributes) o;
    return Objects.equals(this.details, securityMonitoringContentPackStateAttributes.details)
        && Objects.equals(this.status, securityMonitoringContentPackStateAttributes.status)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringContentPackStateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringContentPackStateAttributes {\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

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

/**
 * Number of the group's findings for each value of their <code>@severity</code> attribute. The
 * response includes every level, including levels with a count of zero.
 */
@JsonPropertyOrder({
  RemediationGroupFindingsBySeverity.JSON_PROPERTY_CRITICAL,
  RemediationGroupFindingsBySeverity.JSON_PROPERTY_HIGH,
  RemediationGroupFindingsBySeverity.JSON_PROPERTY_INFO,
  RemediationGroupFindingsBySeverity.JSON_PROPERTY_LOW,
  RemediationGroupFindingsBySeverity.JSON_PROPERTY_MEDIUM,
  RemediationGroupFindingsBySeverity.JSON_PROPERTY_NONE,
  RemediationGroupFindingsBySeverity.JSON_PROPERTY_UNKNOWN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RemediationGroupFindingsBySeverity {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CRITICAL = "critical";
  private Long critical;

  public static final String JSON_PROPERTY_HIGH = "high";
  private Long high;

  public static final String JSON_PROPERTY_INFO = "info";
  private Long info;

  public static final String JSON_PROPERTY_LOW = "low";
  private Long low;

  public static final String JSON_PROPERTY_MEDIUM = "medium";
  private Long medium;

  public static final String JSON_PROPERTY_NONE = "none";
  private Long none;

  public static final String JSON_PROPERTY_UNKNOWN = "unknown";
  private Long unknown;

  public RemediationGroupFindingsBySeverity() {}

  @JsonCreator
  public RemediationGroupFindingsBySeverity(
      @JsonProperty(required = true, value = JSON_PROPERTY_CRITICAL) Long critical,
      @JsonProperty(required = true, value = JSON_PROPERTY_HIGH) Long high,
      @JsonProperty(required = true, value = JSON_PROPERTY_INFO) Long info,
      @JsonProperty(required = true, value = JSON_PROPERTY_LOW) Long low,
      @JsonProperty(required = true, value = JSON_PROPERTY_MEDIUM) Long medium,
      @JsonProperty(required = true, value = JSON_PROPERTY_NONE) Long none,
      @JsonProperty(required = true, value = JSON_PROPERTY_UNKNOWN) Long unknown) {
    this.critical = critical;
    this.high = high;
    this.info = info;
    this.low = low;
    this.medium = medium;
    this.none = none;
    this.unknown = unknown;
  }

  public RemediationGroupFindingsBySeverity critical(Long critical) {
    this.critical = critical;
    return this;
  }

  /**
   * Number of critical findings.
   *
   * @return critical
   */
  @JsonProperty(JSON_PROPERTY_CRITICAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCritical() {
    return critical;
  }

  public void setCritical(Long critical) {
    this.critical = critical;
  }

  public RemediationGroupFindingsBySeverity high(Long high) {
    this.high = high;
    return this;
  }

  /**
   * Number of high findings.
   *
   * @return high
   */
  @JsonProperty(JSON_PROPERTY_HIGH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getHigh() {
    return high;
  }

  public void setHigh(Long high) {
    this.high = high;
  }

  public RemediationGroupFindingsBySeverity info(Long info) {
    this.info = info;
    return this;
  }

  /**
   * Number of info findings.
   *
   * @return info
   */
  @JsonProperty(JSON_PROPERTY_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getInfo() {
    return info;
  }

  public void setInfo(Long info) {
    this.info = info;
  }

  public RemediationGroupFindingsBySeverity low(Long low) {
    this.low = low;
    return this;
  }

  /**
   * Number of low findings.
   *
   * @return low
   */
  @JsonProperty(JSON_PROPERTY_LOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLow() {
    return low;
  }

  public void setLow(Long low) {
    this.low = low;
  }

  public RemediationGroupFindingsBySeverity medium(Long medium) {
    this.medium = medium;
    return this;
  }

  /**
   * Number of medium findings.
   *
   * @return medium
   */
  @JsonProperty(JSON_PROPERTY_MEDIUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getMedium() {
    return medium;
  }

  public void setMedium(Long medium) {
    this.medium = medium;
  }

  public RemediationGroupFindingsBySeverity none(Long none) {
    this.none = none;
    return this;
  }

  /**
   * Number of findings with no severity.
   *
   * @return none
   */
  @JsonProperty(JSON_PROPERTY_NONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getNone() {
    return none;
  }

  public void setNone(Long none) {
    this.none = none;
  }

  public RemediationGroupFindingsBySeverity unknown(Long unknown) {
    this.unknown = unknown;
    return this;
  }

  /**
   * Number of findings with an unknown severity.
   *
   * @return unknown
   */
  @JsonProperty(JSON_PROPERTY_UNKNOWN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getUnknown() {
    return unknown;
  }

  public void setUnknown(Long unknown) {
    this.unknown = unknown;
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
   * @return RemediationGroupFindingsBySeverity
   */
  @JsonAnySetter
  public RemediationGroupFindingsBySeverity putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RemediationGroupFindingsBySeverity object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemediationGroupFindingsBySeverity remediationGroupFindingsBySeverity =
        (RemediationGroupFindingsBySeverity) o;
    return Objects.equals(this.critical, remediationGroupFindingsBySeverity.critical)
        && Objects.equals(this.high, remediationGroupFindingsBySeverity.high)
        && Objects.equals(this.info, remediationGroupFindingsBySeverity.info)
        && Objects.equals(this.low, remediationGroupFindingsBySeverity.low)
        && Objects.equals(this.medium, remediationGroupFindingsBySeverity.medium)
        && Objects.equals(this.none, remediationGroupFindingsBySeverity.none)
        && Objects.equals(this.unknown, remediationGroupFindingsBySeverity.unknown)
        && Objects.equals(
            this.additionalProperties, remediationGroupFindingsBySeverity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(critical, high, info, low, medium, none, unknown, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemediationGroupFindingsBySeverity {\n");
    sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    none: ").append(toIndentedString(none)).append("\n");
    sb.append("    unknown: ").append(toIndentedString(unknown)).append("\n");
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

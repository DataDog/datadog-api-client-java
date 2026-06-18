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

/** A mapping of a severity level to the number of days until a finding is due. */
@JsonPropertyOrder({
  DueDatePerSeverityItem.JSON_PROPERTY_DUE_IN_DAYS,
  DueDatePerSeverityItem.JSON_PROPERTY_SEVERITY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DueDatePerSeverityItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DUE_IN_DAYS = "due_in_days";
  private Long dueInDays;

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private DueDateSeverity severity;

  public DueDatePerSeverityItem() {}

  @JsonCreator
  public DueDatePerSeverityItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_DUE_IN_DAYS) Long dueInDays,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEVERITY) DueDateSeverity severity) {
    this.dueInDays = dueInDays;
    this.severity = severity;
    this.unparsed |= !severity.isValid();
  }

  public DueDatePerSeverityItem dueInDays(Long dueInDays) {
    this.dueInDays = dueInDays;
    return this;
  }

  /**
   * The number of days from the reference point until the finding is due. minimum: 1 maximum: 365
   *
   * @return dueInDays
   */
  @JsonProperty(JSON_PROPERTY_DUE_IN_DAYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getDueInDays() {
    return dueInDays;
  }

  public void setDueInDays(Long dueInDays) {
    this.dueInDays = dueInDays;
  }

  public DueDatePerSeverityItem severity(DueDateSeverity severity) {
    this.severity = severity;
    this.unparsed |= !severity.isValid();
    return this;
  }

  /**
   * A severity level used to configure due date thresholds.
   *
   * @return severity
   */
  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DueDateSeverity getSeverity() {
    return severity;
  }

  public void setSeverity(DueDateSeverity severity) {
    if (!severity.isValid()) {
      this.unparsed = true;
    }
    this.severity = severity;
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
   * @return DueDatePerSeverityItem
   */
  @JsonAnySetter
  public DueDatePerSeverityItem putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DueDatePerSeverityItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DueDatePerSeverityItem dueDatePerSeverityItem = (DueDatePerSeverityItem) o;
    return Objects.equals(this.dueInDays, dueDatePerSeverityItem.dueInDays)
        && Objects.equals(this.severity, dueDatePerSeverityItem.severity)
        && Objects.equals(this.additionalProperties, dueDatePerSeverityItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dueInDays, severity, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DueDatePerSeverityItem {\n");
    sb.append("    dueInDays: ").append(toIndentedString(dueInDays)).append("\n");
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

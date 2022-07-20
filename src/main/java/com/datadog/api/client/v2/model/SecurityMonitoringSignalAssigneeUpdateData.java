/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Data containing the patch for changing the assignee of a signal. */
@JsonPropertyOrder({SecurityMonitoringSignalAssigneeUpdateData.JSON_PROPERTY_ATTRIBUTES})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalAssigneeUpdateData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private SecurityMonitoringSignalAssigneeUpdateAttributes attributes;

  public SecurityMonitoringSignalAssigneeUpdateData() {}

  @JsonCreator
  public SecurityMonitoringSignalAssigneeUpdateData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          SecurityMonitoringSignalAssigneeUpdateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
  }

  public SecurityMonitoringSignalAssigneeUpdateData attributes(
      SecurityMonitoringSignalAssigneeUpdateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes describing the new assignee of a security signal.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringSignalAssigneeUpdateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(SecurityMonitoringSignalAssigneeUpdateAttributes attributes) {
    this.attributes = attributes;
  }

  /** Return true if this SecurityMonitoringSignalAssigneeUpdateData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalAssigneeUpdateData securityMonitoringSignalAssigneeUpdateData =
        (SecurityMonitoringSignalAssigneeUpdateData) o;
    return Objects.equals(this.attributes, securityMonitoringSignalAssigneeUpdateData.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalAssigneeUpdateData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("}");
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

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

/** Attributes describing the new assignee of a security signal. */
@JsonPropertyOrder({
  SecurityMonitoringSignalAssigneeUpdateAttributes.JSON_PROPERTY_ASSIGNEE,
  SecurityMonitoringSignalAssigneeUpdateAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalAssigneeUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNEE = "assignee";
  private SecurityMonitoringTriageUser assignee;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public SecurityMonitoringSignalAssigneeUpdateAttributes() {}

  @JsonCreator
  public SecurityMonitoringSignalAssigneeUpdateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ASSIGNEE)
          SecurityMonitoringTriageUser assignee) {
    this.assignee = assignee;
    this.unparsed |= assignee.unparsed;
  }

  public SecurityMonitoringSignalAssigneeUpdateAttributes assignee(
      SecurityMonitoringTriageUser assignee) {
    this.assignee = assignee;
    this.unparsed |= assignee.unparsed;
    return this;
  }

  /**
   * Object representing a given user entity.
   *
   * @return assignee
   */
  @JsonProperty(JSON_PROPERTY_ASSIGNEE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringTriageUser getAssignee() {
    return assignee;
  }

  public void setAssignee(SecurityMonitoringTriageUser assignee) {
    this.assignee = assignee;
  }

  public SecurityMonitoringSignalAssigneeUpdateAttributes version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the updated signal. If server side version is higher, update will be rejected.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  /** Return true if this SecurityMonitoringSignalAssigneeUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalAssigneeUpdateAttributes
        securityMonitoringSignalAssigneeUpdateAttributes =
            (SecurityMonitoringSignalAssigneeUpdateAttributes) o;
    return Objects.equals(this.assignee, securityMonitoringSignalAssigneeUpdateAttributes.assignee)
        && Objects.equals(this.version, securityMonitoringSignalAssigneeUpdateAttributes.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignee, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalAssigneeUpdateAttributes {\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

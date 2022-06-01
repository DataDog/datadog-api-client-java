/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Attributes describing an assignee update operation over a security signal. */
@JsonPropertyOrder({
  SignalAssigneeUpdateRequest.JSON_PROPERTY_ASSIGNEE,
  SignalAssigneeUpdateRequest.JSON_PROPERTY_VERSION
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SignalAssigneeUpdateRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNEE = "assignee";
  private String assignee;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public SignalAssigneeUpdateRequest() {}

  @JsonCreator
  public SignalAssigneeUpdateRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_ASSIGNEE) String assignee) {
    this.assignee = assignee;
  }

  public SignalAssigneeUpdateRequest assignee(String assignee) {
    this.assignee = assignee;
    return this;
  }

  /**
   * The UUID of the user being assigned. Use empty string to return signal to unassigned.
   *
   * @return assignee
   */
  @JsonProperty(JSON_PROPERTY_ASSIGNEE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAssignee() {
    return assignee;
  }

  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }

  public SignalAssigneeUpdateRequest version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the updated signal. If server side version is higher, update will be rejected.
   *
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  /** Return true if this SignalAssigneeUpdateRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignalAssigneeUpdateRequest signalAssigneeUpdateRequest = (SignalAssigneeUpdateRequest) o;
    return Objects.equals(this.assignee, signalAssigneeUpdateRequest.assignee)
        && Objects.equals(this.version, signalAssigneeUpdateRequest.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignee, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignalAssigneeUpdateRequest {\n");
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

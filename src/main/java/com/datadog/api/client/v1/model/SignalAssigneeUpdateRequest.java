/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Attributes describing an assignee update operation over a security signal.</p>
 */
@JsonPropertyOrder({
  SignalAssigneeUpdateRequest.JSON_PROPERTY_ASSIGNEE,
  SignalAssigneeUpdateRequest.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SignalAssigneeUpdateRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNEE = "assignee";
  private String assignee;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public SignalAssigneeUpdateRequest() {}

  @JsonCreator
  public SignalAssigneeUpdateRequest(
            @JsonProperty(required=true, value=JSON_PROPERTY_ASSIGNEE)String assignee) {
        this.assignee = assignee;
  }
  public SignalAssigneeUpdateRequest assignee(String assignee) {
    this.assignee = assignee;
    return this;
  }

  /**
   * <p>The UUID of the user being assigned. Use empty string to return signal to unassigned.</p>
   * @return assignee
  **/
      @JsonProperty(JSON_PROPERTY_ASSIGNEE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>Version of the updated signal. If server side version is higher, update will be rejected.</p>
   * @return version
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getVersion() {
        return version;
      }
  public void setVersion(Long version) {
    this.version = version;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SignalAssigneeUpdateRequest
   */
  @JsonAnySetter
  public SignalAssigneeUpdateRequest putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this SignalAssigneeUpdateRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignalAssigneeUpdateRequest signalAssigneeUpdateRequest = (SignalAssigneeUpdateRequest) o;
    return Objects.equals(this.assignee, signalAssigneeUpdateRequest.assignee) && Objects.equals(this.version, signalAssigneeUpdateRequest.version) && Objects.equals(this.additionalProperties, signalAssigneeUpdateRequest.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(assignee,version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignalAssigneeUpdateRequest {\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

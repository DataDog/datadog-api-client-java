/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Cancel downtimes according to scope. */
@JsonPropertyOrder({CancelDowntimesByScopeRequest.JSON_PROPERTY_SCOPE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CancelDowntimesByScopeRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public CancelDowntimesByScopeRequest() {}

  @JsonCreator
  public CancelDowntimesByScopeRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_SCOPE) String scope) {
    this.scope = scope;
  }

  public CancelDowntimesByScopeRequest scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * The scope(s) to which the downtime applies and must be in <code>key:value</code> format. For
   * example, <code>host:app2</code>. Provide multiple scopes as a comma-separated list like <code>
   * env:dev,env:prod</code>. The resulting downtime applies to sources that matches ALL provided
   * scopes (<code>env:dev</code> <strong>AND</strong> <code>env:prod</code>).
   *
   * @return scope
   */
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
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
   * @return CancelDowntimesByScopeRequest
   */
  @JsonAnySetter
  public CancelDowntimesByScopeRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CancelDowntimesByScopeRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelDowntimesByScopeRequest cancelDowntimesByScopeRequest = (CancelDowntimesByScopeRequest) o;
    return Objects.equals(this.scope, cancelDowntimesByScopeRequest.scope)
        && Objects.equals(
            this.additionalProperties, cancelDowntimesByScopeRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelDowntimesByScopeRequest {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

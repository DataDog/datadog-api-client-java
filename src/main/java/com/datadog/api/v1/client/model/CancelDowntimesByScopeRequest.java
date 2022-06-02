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

/** Cancel downtimes according to scope. */
@JsonPropertyOrder({CancelDowntimesByScopeRequest.JSON_PROPERTY_SCOPE})
@javax.annotation.Generated(
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
   * The scope(s) to which the downtime applies. For example, <code>host:app2</code>. Provide
   * multiple scopes as a comma-separated list like <code>env:dev,env:prod</code>. The resulting
   * downtime applies to sources that matches ALL provided scopes (<code>env:dev</code>
   * <strong>AND</strong> <code>env:prod</code>).
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
    return Objects.equals(this.scope, cancelDowntimesByScopeRequest.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelDowntimesByScopeRequest {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

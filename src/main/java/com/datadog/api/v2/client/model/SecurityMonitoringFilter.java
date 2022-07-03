/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The rule's suppression filter. */
@JsonPropertyOrder({
  SecurityMonitoringFilter.JSON_PROPERTY_ACTION,
  SecurityMonitoringFilter.JSON_PROPERTY_QUERY
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringFilter {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private SecurityMonitoringFilterAction action;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public SecurityMonitoringFilter action(SecurityMonitoringFilterAction action) {
    this.action = action;
    this.unparsed |= !action.isValid();
    return this;
  }

  /**
   * The type of filtering action.
   *
   * @return action
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringFilterAction getAction() {
    return action;
  }

  public void setAction(SecurityMonitoringFilterAction action) {
    if (!action.isValid()) {
      this.unparsed = true;
    }
    this.action = action;
  }

  public SecurityMonitoringFilter query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Query for selecting logs to apply the filtering action.
   *
   * @return query
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  /** Return true if this SecurityMonitoringFilter object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringFilter securityMonitoringFilter = (SecurityMonitoringFilter) o;
    return Objects.equals(this.action, securityMonitoringFilter.action)
        && Objects.equals(this.query, securityMonitoringFilter.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringFilter {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

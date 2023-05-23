/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Object describing a downtime that matches this monitor. */
@JsonPropertyOrder({
  MatchingDowntime.JSON_PROPERTY_END,
  MatchingDowntime.JSON_PROPERTY_ID,
  MatchingDowntime.JSON_PROPERTY_SCOPE,
  MatchingDowntime.JSON_PROPERTY_START
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MatchingDowntime {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_END = "end";
  private JsonNullable<Long> end = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private List<String> scope = null;

  public static final String JSON_PROPERTY_START = "start";
  private Long start;

  public MatchingDowntime() {}

  @JsonCreator
  public MatchingDowntime(@JsonProperty(required = true, value = JSON_PROPERTY_ID) Long id) {
    this.id = id;
  }

  public MatchingDowntime end(Long end) {
    this.end = JsonNullable.<Long>of(end);
    return this;
  }

  /**
   * POSIX timestamp to end the downtime.
   *
   * @return end
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getEnd() {
    return end.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getEnd_JsonNullable() {
    return end;
  }

  @JsonProperty(JSON_PROPERTY_END)
  public void setEnd_JsonNullable(JsonNullable<Long> end) {
    this.end = end;
  }

  public void setEnd(Long end) {
    this.end = JsonNullable.<Long>of(end);
  }

  /**
   * The downtime ID.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getId() {
    return id;
  }

  public MatchingDowntime scope(List<String> scope) {
    this.scope = scope;
    return this;
  }

  public MatchingDowntime addScopeItem(String scopeItem) {
    if (this.scope == null) {
      this.scope = new ArrayList<>();
    }
    this.scope.add(scopeItem);
    return this;
  }

  /**
   * The scope(s) to which the downtime applies. Must be in <code>key:value</code> format. For
   * example, <code>host:app2</code>. Provide multiple scopes as a comma-separated list like <code>
   * env:dev,env:prod</code>. The resulting downtime applies to sources that matches ALL provided
   * scopes (<code>env:dev</code> <strong>AND</strong> <code>env:prod</code>).
   *
   * @return scope
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getScope() {
    return scope;
  }

  public void setScope(List<String> scope) {
    this.scope = scope;
  }

  public MatchingDowntime start(Long start) {
    this.start = start;
    return this;
  }

  /**
   * POSIX timestamp to start the downtime.
   *
   * @return start
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }

  /** Return true if this MatchingDowntime object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchingDowntime matchingDowntime = (MatchingDowntime) o;
    return Objects.equals(this.end, matchingDowntime.end)
        && Objects.equals(this.id, matchingDowntime.id)
        && Objects.equals(this.scope, matchingDowntime.scope)
        && Objects.equals(this.start, matchingDowntime.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, id, scope, start);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchingDowntime {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

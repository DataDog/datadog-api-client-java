/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Downtime match details. */
@JsonPropertyOrder({
  MonitorDowntimeMatchResponseAttributes.JSON_PROPERTY_END,
  MonitorDowntimeMatchResponseAttributes.JSON_PROPERTY_GROUPS,
  MonitorDowntimeMatchResponseAttributes.JSON_PROPERTY_SCOPE,
  MonitorDowntimeMatchResponseAttributes.JSON_PROPERTY_START
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorDowntimeMatchResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_END = "end";
  private JsonNullable<OffsetDateTime> end = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private List<String> groups = null;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_START = "start";
  private OffsetDateTime start;

  public MonitorDowntimeMatchResponseAttributes end(OffsetDateTime end) {
    this.end = JsonNullable.<OffsetDateTime>of(end);
    return this;
  }

  /**
   * The end of the downtime.
   *
   * @return end
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getEnd() {
    return end.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getEnd_JsonNullable() {
    return end;
  }

  @JsonProperty(JSON_PROPERTY_END)
  public void setEnd_JsonNullable(JsonNullable<OffsetDateTime> end) {
    this.end = end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = JsonNullable.<OffsetDateTime>of(end);
  }

  public MonitorDowntimeMatchResponseAttributes groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public MonitorDowntimeMatchResponseAttributes addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * An array of groups associated with the downtime.
   *
   * @return groups
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public MonitorDowntimeMatchResponseAttributes scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * The scope to which the downtime applies. Must follow the <a
   * href="https://docs.datadoghq.com/logs/explorer/search_syntax/">common search syntax</a>.
   *
   * @return scope
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public MonitorDowntimeMatchResponseAttributes start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

  /**
   * The start of the downtime.
   *
   * @return start
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
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
   * @return MonitorDowntimeMatchResponseAttributes
   */
  @JsonAnySetter
  public MonitorDowntimeMatchResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MonitorDowntimeMatchResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorDowntimeMatchResponseAttributes monitorDowntimeMatchResponseAttributes =
        (MonitorDowntimeMatchResponseAttributes) o;
    return Objects.equals(this.end, monitorDowntimeMatchResponseAttributes.end)
        && Objects.equals(this.groups, monitorDowntimeMatchResponseAttributes.groups)
        && Objects.equals(this.scope, monitorDowntimeMatchResponseAttributes.scope)
        && Objects.equals(this.start, monitorDowntimeMatchResponseAttributes.start)
        && Objects.equals(
            this.additionalProperties, monitorDowntimeMatchResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, groups, scope, start, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorDowntimeMatchResponseAttributes {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

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

/** Attributes for creating a new schedule. */
@JsonPropertyOrder({
  FleetScheduleCreateAttributes.JSON_PROPERTY_NAME,
  FleetScheduleCreateAttributes.JSON_PROPERTY_QUERY,
  FleetScheduleCreateAttributes.JSON_PROPERTY_RULE,
  FleetScheduleCreateAttributes.JSON_PROPERTY_STATUS,
  FleetScheduleCreateAttributes.JSON_PROPERTY_VERSION_TO_LATEST
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetScheduleCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_RULE = "rule";
  private FleetScheduleRecurrenceRule rule;

  public static final String JSON_PROPERTY_STATUS = "status";
  private FleetScheduleStatus status;

  public static final String JSON_PROPERTY_VERSION_TO_LATEST = "version_to_latest";
  private Long versionToLatest;

  public FleetScheduleCreateAttributes() {}

  @JsonCreator
  public FleetScheduleCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE) FleetScheduleRecurrenceRule rule) {
    this.name = name;
    this.query = query;
    this.rule = rule;
    this.unparsed |= rule.unparsed;
  }

  public FleetScheduleCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable name for the schedule.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FleetScheduleCreateAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Query used to filter and select target hosts for scheduled deployments. Uses the Datadog query
   * syntax.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public FleetScheduleCreateAttributes rule(FleetScheduleRecurrenceRule rule) {
    this.rule = rule;
    this.unparsed |= rule.unparsed;
    return this;
  }

  /**
   * Defines the recurrence pattern for the schedule. Specifies when deployments should be
   * automatically triggered based on maintenance windows.
   *
   * @return rule
   */
  @JsonProperty(JSON_PROPERTY_RULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FleetScheduleRecurrenceRule getRule() {
    return rule;
  }

  public void setRule(FleetScheduleRecurrenceRule rule) {
    this.rule = rule;
  }

  public FleetScheduleCreateAttributes status(FleetScheduleStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of the schedule. - <code>active</code>: The schedule is active and will create
   * deployments according to its recurrence rule. - <code>inactive</code>: The schedule is inactive
   * and will not create any deployments.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FleetScheduleStatus getStatus() {
    return status;
  }

  public void setStatus(FleetScheduleStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public FleetScheduleCreateAttributes versionToLatest(Long versionToLatest) {
    this.versionToLatest = versionToLatest;
    return this;
  }

  /**
   * Number of major versions behind the latest to target for upgrades. - 0: Always upgrade to the
   * latest version (default) - 1: Upgrade to latest minus 1 major version - 2: Upgrade to latest
   * minus 2 major versions Maximum value is 2. minimum: 0 maximum: 2
   *
   * @return versionToLatest
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION_TO_LATEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersionToLatest() {
    return versionToLatest;
  }

  public void setVersionToLatest(Long versionToLatest) {
    this.versionToLatest = versionToLatest;
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
   * @return FleetScheduleCreateAttributes
   */
  @JsonAnySetter
  public FleetScheduleCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetScheduleCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetScheduleCreateAttributes fleetScheduleCreateAttributes = (FleetScheduleCreateAttributes) o;
    return Objects.equals(this.name, fleetScheduleCreateAttributes.name)
        && Objects.equals(this.query, fleetScheduleCreateAttributes.query)
        && Objects.equals(this.rule, fleetScheduleCreateAttributes.rule)
        && Objects.equals(this.status, fleetScheduleCreateAttributes.status)
        && Objects.equals(this.versionToLatest, fleetScheduleCreateAttributes.versionToLatest)
        && Objects.equals(
            this.additionalProperties, fleetScheduleCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, query, rule, status, versionToLatest, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetScheduleCreateAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    versionToLatest: ").append(toIndentedString(versionToLatest)).append("\n");
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

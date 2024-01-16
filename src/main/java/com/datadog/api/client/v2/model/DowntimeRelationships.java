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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** All relationships associated with downtime. */
@JsonPropertyOrder({
  DowntimeRelationships.JSON_PROPERTY_CREATED_BY,
  DowntimeRelationships.JSON_PROPERTY_MONITOR
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private DowntimeRelationshipsCreatedBy createdBy;

  public static final String JSON_PROPERTY_MONITOR = "monitor";
  private DowntimeRelationshipsMonitor monitor;

  public DowntimeRelationships createdBy(DowntimeRelationshipsCreatedBy createdBy) {
    this.createdBy = createdBy;
    this.unparsed |= createdBy.unparsed;
    return this;
  }

  /**
   * The user who created the downtime.
   *
   * @return createdBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DowntimeRelationshipsCreatedBy getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(DowntimeRelationshipsCreatedBy createdBy) {
    this.createdBy = createdBy;
  }

  public DowntimeRelationships monitor(DowntimeRelationshipsMonitor monitor) {
    this.monitor = monitor;
    this.unparsed |= monitor.unparsed;
    return this;
  }

  /**
   * The monitor identified by the downtime.
   *
   * @return monitor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DowntimeRelationshipsMonitor getMonitor() {
    return monitor;
  }

  public void setMonitor(DowntimeRelationshipsMonitor monitor) {
    this.monitor = monitor;
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
   * @return DowntimeRelationships
   */
  @JsonAnySetter
  public DowntimeRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DowntimeRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeRelationships downtimeRelationships = (DowntimeRelationships) o;
    return Objects.equals(this.createdBy, downtimeRelationships.createdBy)
        && Objects.equals(this.monitor, downtimeRelationships.monitor)
        && Objects.equals(this.additionalProperties, downtimeRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, monitor, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeRelationships {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    monitor: ").append(toIndentedString(monitor)).append("\n");
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

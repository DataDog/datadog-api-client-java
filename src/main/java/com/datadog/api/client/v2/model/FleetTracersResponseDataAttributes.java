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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of the fleet tracers response containing the list of tracers. */
@JsonPropertyOrder({FleetTracersResponseDataAttributes.JSON_PROPERTY_TRACERS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetTracersResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TRACERS = "tracers";
  private List<FleetTracerAttributes> tracers = null;

  public FleetTracersResponseDataAttributes tracers(List<FleetTracerAttributes> tracers) {
    this.tracers = tracers;
    for (FleetTracerAttributes item : tracers) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FleetTracersResponseDataAttributes addTracersItem(FleetTracerAttributes tracersItem) {
    if (this.tracers == null) {
      this.tracers = new ArrayList<>();
    }
    this.tracers.add(tracersItem);
    this.unparsed |= tracersItem.unparsed;
    return this;
  }

  /**
   * Array of tracers matching the query criteria.
   *
   * @return tracers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FleetTracerAttributes> getTracers() {
    return tracers;
  }

  public void setTracers(List<FleetTracerAttributes> tracers) {
    this.tracers = tracers;
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
   * @return FleetTracersResponseDataAttributes
   */
  @JsonAnySetter
  public FleetTracersResponseDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetTracersResponseDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetTracersResponseDataAttributes fleetTracersResponseDataAttributes =
        (FleetTracersResponseDataAttributes) o;
    return Objects.equals(this.tracers, fleetTracersResponseDataAttributes.tracers)
        && Objects.equals(
            this.additionalProperties, fleetTracersResponseDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tracers, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetTracersResponseDataAttributes {\n");
    sb.append("    tracers: ").append(toIndentedString(tracers)).append("\n");
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

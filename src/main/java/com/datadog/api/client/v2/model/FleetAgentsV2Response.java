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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Response containing a paginated list of Datadog Agents. */
@JsonPropertyOrder({
  FleetAgentsV2Response.JSON_PROPERTY_DATA,
  FleetAgentsV2Response.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetAgentsV2Response {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<FleetAgentV2> data = new ArrayList<>();

  public static final String JSON_PROPERTY_META = "meta";
  private FleetAgentsV2ResponseMeta meta;

  public FleetAgentsV2Response() {}

  @JsonCreator
  public FleetAgentsV2Response(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA) List<FleetAgentV2> data) {
    this.data = data;
    for (FleetAgentV2 item : data) {
      this.unparsed |= item.unparsed;
    }
  }

  public FleetAgentsV2Response data(List<FleetAgentV2> data) {
    this.data = data;
    for (FleetAgentV2 item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FleetAgentsV2Response addDataItem(FleetAgentV2 dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * Array of agents matching the query criteria.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<FleetAgentV2> getData() {
    return data;
  }

  public void setData(List<FleetAgentV2> data) {
    this.data = data;
    if (data != null) {
      for (FleetAgentV2 item : data) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public FleetAgentsV2Response meta(FleetAgentsV2ResponseMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Metadata for the v2 list of agents, including pagination information.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FleetAgentsV2ResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(FleetAgentsV2ResponseMeta meta) {
    this.meta = meta;
    if (meta != null) {
      this.unparsed |= meta.unparsed;
    }
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
   * @return FleetAgentsV2Response
   */
  @JsonAnySetter
  public FleetAgentsV2Response putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetAgentsV2Response object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetAgentsV2Response fleetAgentsV2Response = (FleetAgentsV2Response) o;
    return Objects.equals(this.data, fleetAgentsV2Response.data)
        && Objects.equals(this.meta, fleetAgentsV2Response.meta)
        && Objects.equals(this.additionalProperties, fleetAgentsV2Response.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetAgentsV2Response {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

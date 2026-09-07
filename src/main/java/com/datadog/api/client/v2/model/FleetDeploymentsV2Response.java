/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>Response containing a paginated list of deployments.</p>
 */
@JsonPropertyOrder({
  FleetDeploymentsV2Response.JSON_PROPERTY_DATA,
  FleetDeploymentsV2Response.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetDeploymentsV2Response {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<FleetDeploymentV2> data = new ArrayList<>();

  public static final String JSON_PROPERTY_META = "meta";
  private FleetDeploymentsV2ResponseMeta meta;

  public FleetDeploymentsV2Response() {}

  @JsonCreator
  public FleetDeploymentsV2Response(
            @JsonProperty(required=true, value=JSON_PROPERTY_DATA)List<FleetDeploymentV2> data) {
        this.data = data;
        for (FleetDeploymentV2 item : data) {
          this.unparsed |= item.unparsed;
        }
  }
  public FleetDeploymentsV2Response data(List<FleetDeploymentV2> data) {
    this.data = data;
    for (FleetDeploymentV2 item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public FleetDeploymentsV2Response addDataItem(FleetDeploymentV2 dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * <p>Array of deployments matching the query criteria.</p>
   * @return data
  **/
      @JsonProperty(JSON_PROPERTY_DATA)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<FleetDeploymentV2> getData() {
        return data;
      }
  public void setData(List<FleetDeploymentV2> data) {
    this.data = data;
    if (data != null) {
      for (FleetDeploymentV2 item : data) {
        this.unparsed |= item.unparsed;
      }
    }
  }
  public FleetDeploymentsV2Response meta(FleetDeploymentsV2ResponseMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * <p>Metadata for the v2 list of deployments, including pagination information.</p>
   * @return meta
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_META)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public FleetDeploymentsV2ResponseMeta getMeta() {
        return meta;
      }
  public void setMeta(FleetDeploymentsV2ResponseMeta meta) {
    this.meta = meta;
    if (meta != null) {
      this.unparsed |= meta.unparsed;
    }
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
   * @return FleetDeploymentsV2Response
   */
  @JsonAnySetter
  public FleetDeploymentsV2Response putAdditionalProperty(String key, Object value) {
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
   * Return true if this FleetDeploymentsV2Response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetDeploymentsV2Response fleetDeploymentsV2Response = (FleetDeploymentsV2Response) o;
    return Objects.equals(this.data, fleetDeploymentsV2Response.data) && Objects.equals(this.meta, fleetDeploymentsV2Response.meta) && Objects.equals(this.additionalProperties, fleetDeploymentsV2Response.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(data,meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetDeploymentsV2Response {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

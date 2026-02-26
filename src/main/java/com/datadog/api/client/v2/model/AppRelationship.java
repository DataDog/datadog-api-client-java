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
   * <p>The app's publication relationship and custom connections.</p>
 */
@JsonPropertyOrder({
  AppRelationship.JSON_PROPERTY_CONNECTIONS,
  AppRelationship.JSON_PROPERTY_DEPLOYMENT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AppRelationship {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONNECTIONS = "connections";
  private List<CustomConnection> connections = null;

  public static final String JSON_PROPERTY_DEPLOYMENT = "deployment";
  private DeploymentRelationship deployment;

  public AppRelationship connections(List<CustomConnection> connections) {
    this.connections = connections;
    for (CustomConnection item : connections) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public AppRelationship addConnectionsItem(CustomConnection connectionsItem) {
    if (this.connections == null) {
      this.connections = new ArrayList<>();
    }
    this.connections.add(connectionsItem);
    this.unparsed |= connectionsItem.unparsed;
    return this;
  }

  /**
   * <p>Array of custom connections used by the app.</p>
   * @return connections
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONNECTIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<CustomConnection> getConnections() {
        return connections;
      }
  public void setConnections(List<CustomConnection> connections) {
    this.connections = connections;
  }
  public AppRelationship deployment(DeploymentRelationship deployment) {
    this.deployment = deployment;
    this.unparsed |= deployment.unparsed;
    return this;
  }

  /**
   * <p>Information pointing to the app's publication status.</p>
   * @return deployment
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DEPLOYMENT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public DeploymentRelationship getDeployment() {
        return deployment;
      }
  public void setDeployment(DeploymentRelationship deployment) {
    this.deployment = deployment;
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
   * @return AppRelationship
   */
  @JsonAnySetter
  public AppRelationship putAdditionalProperty(String key, Object value) {
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
   * Return true if this AppRelationship object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppRelationship appRelationship = (AppRelationship) o;
    return Objects.equals(this.connections, appRelationship.connections) && Objects.equals(this.deployment, appRelationship.deployment) && Objects.equals(this.additionalProperties, appRelationship.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(connections,deployment, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppRelationship {\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
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

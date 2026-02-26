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
   * <p>A list of connections or connection groups used in the workflow.</p>
 */
@JsonPropertyOrder({
  ConnectionEnv.JSON_PROPERTY_CONNECTION_GROUPS,
  ConnectionEnv.JSON_PROPERTY_CONNECTIONS,
  ConnectionEnv.JSON_PROPERTY_ENV
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ConnectionEnv {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONNECTION_GROUPS = "connectionGroups";
  private List<ConnectionGroup> connectionGroups = null;

  public static final String JSON_PROPERTY_CONNECTIONS = "connections";
  private List<Connection> connections = null;

  public static final String JSON_PROPERTY_ENV = "env";
  private ConnectionEnvEnv env;

  public ConnectionEnv() {}

  @JsonCreator
  public ConnectionEnv(
            @JsonProperty(required=true, value=JSON_PROPERTY_ENV)ConnectionEnvEnv env) {
        this.env = env;
        this.unparsed |= !env.isValid();
  }
  public ConnectionEnv connectionGroups(List<ConnectionGroup> connectionGroups) {
    this.connectionGroups = connectionGroups;
    for (ConnectionGroup item : connectionGroups) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ConnectionEnv addConnectionGroupsItem(ConnectionGroup connectionGroupsItem) {
    if (this.connectionGroups == null) {
      this.connectionGroups = new ArrayList<>();
    }
    this.connectionGroups.add(connectionGroupsItem);
    this.unparsed |= connectionGroupsItem.unparsed;
    return this;
  }

  /**
   * <p>The <code>ConnectionEnv</code> <code>connectionGroups</code>.</p>
   * @return connectionGroups
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONNECTION_GROUPS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ConnectionGroup> getConnectionGroups() {
        return connectionGroups;
      }
  public void setConnectionGroups(List<ConnectionGroup> connectionGroups) {
    this.connectionGroups = connectionGroups;
  }
  public ConnectionEnv connections(List<Connection> connections) {
    this.connections = connections;
    for (Connection item : connections) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ConnectionEnv addConnectionsItem(Connection connectionsItem) {
    if (this.connections == null) {
      this.connections = new ArrayList<>();
    }
    this.connections.add(connectionsItem);
    this.unparsed |= connectionsItem.unparsed;
    return this;
  }

  /**
   * <p>The <code>ConnectionEnv</code> <code>connections</code>.</p>
   * @return connections
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONNECTIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<Connection> getConnections() {
        return connections;
      }
  public void setConnections(List<Connection> connections) {
    this.connections = connections;
  }
  public ConnectionEnv env(ConnectionEnvEnv env) {
    this.env = env;
    this.unparsed |= !env.isValid();
    return this;
  }

  /**
   * <p>The definition of <code>ConnectionEnvEnv</code> object.</p>
   * @return env
  **/
      @JsonProperty(JSON_PROPERTY_ENV)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ConnectionEnvEnv getEnv() {
        return env;
      }
  public void setEnv(ConnectionEnvEnv env) {
    if (!env.isValid()) {
        this.unparsed = true;
    }
    this.env = env;
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
   * @return ConnectionEnv
   */
  @JsonAnySetter
  public ConnectionEnv putAdditionalProperty(String key, Object value) {
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
   * Return true if this ConnectionEnv object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionEnv connectionEnv = (ConnectionEnv) o;
    return Objects.equals(this.connectionGroups, connectionEnv.connectionGroups) && Objects.equals(this.connections, connectionEnv.connections) && Objects.equals(this.env, connectionEnv.env) && Objects.equals(this.additionalProperties, connectionEnv.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(connectionGroups,connections,env, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionEnv {\n");
    sb.append("    connectionGroups: ").append(toIndentedString(connectionGroups)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
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

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

/** Attributes for updating a connection group. */
@JsonPropertyOrder({
  ConnectionGroupDataAttributesRequest.JSON_PROPERTY_CONNECTIONS,
  ConnectionGroupDataAttributesRequest.JSON_PROPERTY_DESCRIPTION,
  ConnectionGroupDataAttributesRequest.JSON_PROPERTY_INTEGRATION_TYPE,
  ConnectionGroupDataAttributesRequest.JSON_PROPERTY_NAME,
  ConnectionGroupDataAttributesRequest.JSON_PROPERTY_POLICY_ATTRIBUTES,
  ConnectionGroupDataAttributesRequest.JSON_PROPERTY_TAG_KEYS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ConnectionGroupDataAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONNECTIONS = "connections";
  private List<String> connections = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_INTEGRATION_TYPE = "integration_type";
  private String integrationType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_POLICY_ATTRIBUTES = "policy_attributes";
  private String policyAttributes;

  public static final String JSON_PROPERTY_TAG_KEYS = "tag_keys";
  private List<String> tagKeys = null;

  public ConnectionGroupDataAttributesRequest connections(List<String> connections) {
    this.connections = connections;
    return this;
  }

  public ConnectionGroupDataAttributesRequest addConnectionsItem(String connectionsItem) {
    if (this.connections == null) {
      this.connections = new ArrayList<>();
    }
    this.connections.add(connectionsItem);
    return this;
  }

  /**
   * List of connection IDs associated with the connection group.
   *
   * @return connections
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getConnections() {
    return connections;
  }

  public void setConnections(List<String> connections) {
    this.connections = connections;
  }

  public ConnectionGroupDataAttributesRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the connection group.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ConnectionGroupDataAttributesRequest integrationType(String integrationType) {
    this.integrationType = integrationType;
    return this;
  }

  /**
   * The integration type of the connection group.
   *
   * @return integrationType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIntegrationType() {
    return integrationType;
  }

  public void setIntegrationType(String integrationType) {
    this.integrationType = integrationType;
  }

  public ConnectionGroupDataAttributesRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the connection group.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConnectionGroupDataAttributesRequest policyAttributes(String policyAttributes) {
    this.policyAttributes = policyAttributes;
    return this;
  }

  /**
   * Policy attributes for the connection group.
   *
   * @return policyAttributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POLICY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPolicyAttributes() {
    return policyAttributes;
  }

  public void setPolicyAttributes(String policyAttributes) {
    this.policyAttributes = policyAttributes;
  }

  public ConnectionGroupDataAttributesRequest tagKeys(List<String> tagKeys) {
    this.tagKeys = tagKeys;
    return this;
  }

  public ConnectionGroupDataAttributesRequest addTagKeysItem(String tagKeysItem) {
    if (this.tagKeys == null) {
      this.tagKeys = new ArrayList<>();
    }
    this.tagKeys.add(tagKeysItem);
    return this;
  }

  /**
   * Tag keys associated with the connection group.
   *
   * @return tagKeys
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTagKeys() {
    return tagKeys;
  }

  public void setTagKeys(List<String> tagKeys) {
    this.tagKeys = tagKeys;
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
   * @return ConnectionGroupDataAttributesRequest
   */
  @JsonAnySetter
  public ConnectionGroupDataAttributesRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ConnectionGroupDataAttributesRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionGroupDataAttributesRequest connectionGroupDataAttributesRequest =
        (ConnectionGroupDataAttributesRequest) o;
    return Objects.equals(this.connections, connectionGroupDataAttributesRequest.connections)
        && Objects.equals(this.description, connectionGroupDataAttributesRequest.description)
        && Objects.equals(
            this.integrationType, connectionGroupDataAttributesRequest.integrationType)
        && Objects.equals(this.name, connectionGroupDataAttributesRequest.name)
        && Objects.equals(
            this.policyAttributes, connectionGroupDataAttributesRequest.policyAttributes)
        && Objects.equals(this.tagKeys, connectionGroupDataAttributesRequest.tagKeys)
        && Objects.equals(
            this.additionalProperties, connectionGroupDataAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        connections,
        description,
        integrationType,
        name,
        policyAttributes,
        tagKeys,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionGroupDataAttributesRequest {\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    policyAttributes: ").append(toIndentedString(policyAttributes)).append("\n");
    sb.append("    tagKeys: ").append(toIndentedString(tagKeys)).append("\n");
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

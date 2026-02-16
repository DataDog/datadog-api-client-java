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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of a connection group. */
@JsonPropertyOrder({
  ConnectionGroupDataAttributesResponse.JSON_PROPERTY_CONNECTIONS,
  ConnectionGroupDataAttributesResponse.JSON_PROPERTY_CREATED_AT,
  ConnectionGroupDataAttributesResponse.JSON_PROPERTY_DESCRIPTION,
  ConnectionGroupDataAttributesResponse.JSON_PROPERTY_INTEGRATION_TYPE,
  ConnectionGroupDataAttributesResponse.JSON_PROPERTY_IS_FAVORITE,
  ConnectionGroupDataAttributesResponse.JSON_PROPERTY_LAST_UPDATED_AT,
  ConnectionGroupDataAttributesResponse.JSON_PROPERTY_NAME,
  ConnectionGroupDataAttributesResponse.JSON_PROPERTY_TAG_KEYS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ConnectionGroupDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONNECTIONS = "connections";
  private List<String> connections = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_INTEGRATION_TYPE = "integration_type";
  private String integrationType;

  public static final String JSON_PROPERTY_IS_FAVORITE = "is_favorite";
  private Boolean isFavorite;

  public static final String JSON_PROPERTY_LAST_UPDATED_AT = "last_updated_at";
  private OffsetDateTime lastUpdatedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TAG_KEYS = "tag_keys";
  private List<String> tagKeys = new ArrayList<>();

  public ConnectionGroupDataAttributesResponse() {}

  @JsonCreator
  public ConnectionGroupDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_INTEGRATION_TYPE) String integrationType,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_FAVORITE) Boolean isFavorite,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_UPDATED_AT)
          OffsetDateTime lastUpdatedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAG_KEYS) List<String> tagKeys) {
    this.createdAt = createdAt;
    this.integrationType = integrationType;
    this.isFavorite = isFavorite;
    this.lastUpdatedAt = lastUpdatedAt;
    this.name = name;
    this.tagKeys = tagKeys;
  }

  public ConnectionGroupDataAttributesResponse connections(List<String> connections) {
    this.connections = connections;
    return this;
  }

  public ConnectionGroupDataAttributesResponse addConnectionsItem(String connectionsItem) {
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

  public ConnectionGroupDataAttributesResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The creation timestamp of the connection group.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ConnectionGroupDataAttributesResponse description(String description) {
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

  public ConnectionGroupDataAttributesResponse integrationType(String integrationType) {
    this.integrationType = integrationType;
    return this;
  }

  /**
   * The integration type of the connection group.
   *
   * @return integrationType
   */
  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIntegrationType() {
    return integrationType;
  }

  public void setIntegrationType(String integrationType) {
    this.integrationType = integrationType;
  }

  public ConnectionGroupDataAttributesResponse isFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
    return this;
  }

  /**
   * Indicates if the connection group is marked as favorite.
   *
   * @return isFavorite
   */
  @JsonProperty(JSON_PROPERTY_IS_FAVORITE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsFavorite() {
    return isFavorite;
  }

  public void setIsFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
  }

  public ConnectionGroupDataAttributesResponse lastUpdatedAt(OffsetDateTime lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
    return this;
  }

  /**
   * The last updated timestamp of the connection group.
   *
   * @return lastUpdatedAt
   */
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getLastUpdatedAt() {
    return lastUpdatedAt;
  }

  public void setLastUpdatedAt(OffsetDateTime lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }

  public ConnectionGroupDataAttributesResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the connection group.
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

  public ConnectionGroupDataAttributesResponse tagKeys(List<String> tagKeys) {
    this.tagKeys = tagKeys;
    return this;
  }

  public ConnectionGroupDataAttributesResponse addTagKeysItem(String tagKeysItem) {
    this.tagKeys.add(tagKeysItem);
    return this;
  }

  /**
   * Tag keys associated with the connection group.
   *
   * @return tagKeys
   */
  @JsonProperty(JSON_PROPERTY_TAG_KEYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return ConnectionGroupDataAttributesResponse
   */
  @JsonAnySetter
  public ConnectionGroupDataAttributesResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ConnectionGroupDataAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionGroupDataAttributesResponse connectionGroupDataAttributesResponse =
        (ConnectionGroupDataAttributesResponse) o;
    return Objects.equals(this.connections, connectionGroupDataAttributesResponse.connections)
        && Objects.equals(this.createdAt, connectionGroupDataAttributesResponse.createdAt)
        && Objects.equals(this.description, connectionGroupDataAttributesResponse.description)
        && Objects.equals(
            this.integrationType, connectionGroupDataAttributesResponse.integrationType)
        && Objects.equals(this.isFavorite, connectionGroupDataAttributesResponse.isFavorite)
        && Objects.equals(this.lastUpdatedAt, connectionGroupDataAttributesResponse.lastUpdatedAt)
        && Objects.equals(this.name, connectionGroupDataAttributesResponse.name)
        && Objects.equals(this.tagKeys, connectionGroupDataAttributesResponse.tagKeys)
        && Objects.equals(
            this.additionalProperties, connectionGroupDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        connections,
        createdAt,
        description,
        integrationType,
        isFavorite,
        lastUpdatedAt,
        name,
        tagKeys,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionGroupDataAttributesResponse {\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

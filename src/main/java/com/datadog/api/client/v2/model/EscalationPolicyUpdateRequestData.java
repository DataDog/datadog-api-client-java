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

/**
 * Represents the data for updating an existing escalation policy, including its ID, attributes,
 * relationships, and resource type.
 */
@JsonPropertyOrder({
  EscalationPolicyUpdateRequestData.JSON_PROPERTY_ATTRIBUTES,
  EscalationPolicyUpdateRequestData.JSON_PROPERTY_ID,
  EscalationPolicyUpdateRequestData.JSON_PROPERTY_RELATIONSHIPS,
  EscalationPolicyUpdateRequestData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EscalationPolicyUpdateRequestData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private EscalationPolicyUpdateRequestDataAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private EscalationPolicyUpdateRequestDataRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private EscalationPolicyUpdateRequestDataType type =
      EscalationPolicyUpdateRequestDataType.POLICIES;

  public EscalationPolicyUpdateRequestData() {}

  @JsonCreator
  public EscalationPolicyUpdateRequestData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          EscalationPolicyUpdateRequestDataAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          EscalationPolicyUpdateRequestDataType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public EscalationPolicyUpdateRequestData attributes(
      EscalationPolicyUpdateRequestDataAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Defines the attributes that can be updated for an escalation policy, such as description, name,
   * resolution behavior, retries, and steps.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EscalationPolicyUpdateRequestDataAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(EscalationPolicyUpdateRequestDataAttributes attributes) {
    this.attributes = attributes;
  }

  public EscalationPolicyUpdateRequestData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Specifies the unique identifier of the escalation policy being updated.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EscalationPolicyUpdateRequestData relationships(
      EscalationPolicyUpdateRequestDataRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * Represents relationships in an escalation policy update request, including references to teams.
   *
   * @return relationships
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EscalationPolicyUpdateRequestDataRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(EscalationPolicyUpdateRequestDataRelationships relationships) {
    this.relationships = relationships;
  }

  public EscalationPolicyUpdateRequestData type(EscalationPolicyUpdateRequestDataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Indicates that the resource is of type <code>policies</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EscalationPolicyUpdateRequestDataType getType() {
    return type;
  }

  public void setType(EscalationPolicyUpdateRequestDataType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return EscalationPolicyUpdateRequestData
   */
  @JsonAnySetter
  public EscalationPolicyUpdateRequestData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this EscalationPolicyUpdateRequestData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EscalationPolicyUpdateRequestData escalationPolicyUpdateRequestData =
        (EscalationPolicyUpdateRequestData) o;
    return Objects.equals(this.attributes, escalationPolicyUpdateRequestData.attributes)
        && Objects.equals(this.id, escalationPolicyUpdateRequestData.id)
        && Objects.equals(this.relationships, escalationPolicyUpdateRequestData.relationships)
        && Objects.equals(this.type, escalationPolicyUpdateRequestData.type)
        && Objects.equals(
            this.additionalProperties, escalationPolicyUpdateRequestData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, relationships, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EscalationPolicyUpdateRequestData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

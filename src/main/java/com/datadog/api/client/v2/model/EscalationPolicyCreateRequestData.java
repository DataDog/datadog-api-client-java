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
   * <p>Represents the data for creating an escalation policy, including its attributes, relationships, and resource type.</p>
 */
@JsonPropertyOrder({
  EscalationPolicyCreateRequestData.JSON_PROPERTY_ATTRIBUTES,
  EscalationPolicyCreateRequestData.JSON_PROPERTY_RELATIONSHIPS,
  EscalationPolicyCreateRequestData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EscalationPolicyCreateRequestData {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private EscalationPolicyCreateRequestDataAttributes attributes;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private EscalationPolicyCreateRequestDataRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private EscalationPolicyCreateRequestDataType type = EscalationPolicyCreateRequestDataType.POLICIES;

  public EscalationPolicyCreateRequestData() {}

  @JsonCreator
  public EscalationPolicyCreateRequestData(
            @JsonProperty(required=true, value=JSON_PROPERTY_ATTRIBUTES)EscalationPolicyCreateRequestDataAttributes attributes,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)EscalationPolicyCreateRequestDataType type) {
        this.attributes = attributes;
        this.unparsed |= attributes.unparsed;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public EscalationPolicyCreateRequestData attributes(EscalationPolicyCreateRequestDataAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * <p>Defines the attributes for creating an escalation policy, including its description, name, resolution behavior, retries, and steps.</p>
   * @return attributes
  **/
      @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public EscalationPolicyCreateRequestDataAttributes getAttributes() {
        return attributes;
      }
  public void setAttributes(EscalationPolicyCreateRequestDataAttributes attributes) {
    this.attributes = attributes;
  }
  public EscalationPolicyCreateRequestData relationships(EscalationPolicyCreateRequestDataRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * <p>Represents relationships in an escalation policy creation request, including references to teams.</p>
   * @return relationships
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public EscalationPolicyCreateRequestDataRelationships getRelationships() {
        return relationships;
      }
  public void setRelationships(EscalationPolicyCreateRequestDataRelationships relationships) {
    this.relationships = relationships;
  }
  public EscalationPolicyCreateRequestData type(EscalationPolicyCreateRequestDataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Indicates that the resource is of type <code>policies</code>.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public EscalationPolicyCreateRequestDataType getType() {
        return type;
      }
  public void setType(EscalationPolicyCreateRequestDataType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
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
   * @return EscalationPolicyCreateRequestData
   */
  @JsonAnySetter
  public EscalationPolicyCreateRequestData putAdditionalProperty(String key, Object value) {
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
   * Return true if this EscalationPolicyCreateRequestData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EscalationPolicyCreateRequestData escalationPolicyCreateRequestData = (EscalationPolicyCreateRequestData) o;
    return Objects.equals(this.attributes, escalationPolicyCreateRequestData.attributes) && Objects.equals(this.relationships, escalationPolicyCreateRequestData.relationships) && Objects.equals(this.type, escalationPolicyCreateRequestData.type) && Objects.equals(this.additionalProperties, escalationPolicyCreateRequestData.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attributes,relationships,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EscalationPolicyCreateRequestData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

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
 * Represents a single step in an escalation policy, including its attributes, relationships, and
 * resource type.
 */
@JsonPropertyOrder({
  EscalationPolicyStep.JSON_PROPERTY_ATTRIBUTES,
  EscalationPolicyStep.JSON_PROPERTY_ID,
  EscalationPolicyStep.JSON_PROPERTY_RELATIONSHIPS,
  EscalationPolicyStep.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EscalationPolicyStep {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private EscalationPolicyStepAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private EscalationPolicyStepRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private EscalationPolicyStepType type = EscalationPolicyStepType.STEPS;

  public EscalationPolicyStep() {}

  @JsonCreator
  public EscalationPolicyStep(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) EscalationPolicyStepType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public EscalationPolicyStep attributes(EscalationPolicyStepAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Defines attributes for an escalation policy step, such as assignment strategy and escalation
   * timeout.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EscalationPolicyStepAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(EscalationPolicyStepAttributes attributes) {
    this.attributes = attributes;
  }

  public EscalationPolicyStep id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Specifies the unique identifier of this escalation policy step.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EscalationPolicyStep relationships(EscalationPolicyStepRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * Represents the relationship of an escalation policy step to its targets.
   *
   * @return relationships
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EscalationPolicyStepRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(EscalationPolicyStepRelationships relationships) {
    this.relationships = relationships;
  }

  public EscalationPolicyStep type(EscalationPolicyStepType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Indicates that the resource is of type <code>steps</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EscalationPolicyStepType getType() {
    return type;
  }

  public void setType(EscalationPolicyStepType type) {
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
   * @return EscalationPolicyStep
   */
  @JsonAnySetter
  public EscalationPolicyStep putAdditionalProperty(String key, Object value) {
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

  /** Return true if this EscalationPolicyStep object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EscalationPolicyStep escalationPolicyStep = (EscalationPolicyStep) o;
    return Objects.equals(this.attributes, escalationPolicyStep.attributes)
        && Objects.equals(this.id, escalationPolicyStep.id)
        && Objects.equals(this.relationships, escalationPolicyStep.relationships)
        && Objects.equals(this.type, escalationPolicyStep.type)
        && Objects.equals(this.additionalProperties, escalationPolicyStep.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, relationships, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EscalationPolicyStep {\n");
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

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
import java.util.UUID;

/**
 * Data of the inbox rule update request: the rule id, the rule type, and the rule attributes. All
 * fields are required.
 */
@JsonPropertyOrder({
  UpdateInboxRuleParametersData.JSON_PROPERTY_ATTRIBUTES,
  UpdateInboxRuleParametersData.JSON_PROPERTY_ID,
  UpdateInboxRuleParametersData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UpdateInboxRuleParametersData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private CreateInboxRuleParametersDataAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private InboxRulesType type;

  public UpdateInboxRuleParametersData() {}

  @JsonCreator
  public UpdateInboxRuleParametersData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          CreateInboxRuleParametersDataAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) UUID id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) InboxRulesType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public UpdateInboxRuleParametersData attributes(
      CreateInboxRuleParametersDataAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes of the inbox rule create request: the rule name, the rule details, the associated
   * action, and the optional enabled field.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CreateInboxRuleParametersDataAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CreateInboxRuleParametersDataAttributes attributes) {
    this.attributes = attributes;
  }

  public UpdateInboxRuleParametersData id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of a pipeline rule
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public UpdateInboxRuleParametersData type(InboxRulesType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The pipeline rule type associated to inbox rules
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public InboxRulesType getType() {
    return type;
  }

  public void setType(InboxRulesType type) {
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
   * @return UpdateInboxRuleParametersData
   */
  @JsonAnySetter
  public UpdateInboxRuleParametersData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UpdateInboxRuleParametersData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateInboxRuleParametersData updateInboxRuleParametersData = (UpdateInboxRuleParametersData) o;
    return Objects.equals(this.attributes, updateInboxRuleParametersData.attributes)
        && Objects.equals(this.id, updateInboxRuleParametersData.id)
        && Objects.equals(this.type, updateInboxRuleParametersData.type)
        && Objects.equals(
            this.additionalProperties, updateInboxRuleParametersData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInboxRuleParametersData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
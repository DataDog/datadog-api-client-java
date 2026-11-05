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

/** An entity the investigation found. */
@JsonPropertyOrder({
  SecurityAgentInvestigationEntity.JSON_PROPERTY_SUB_TYPE,
  SecurityAgentInvestigationEntity.JSON_PROPERTY_TYPE,
  SecurityAgentInvestigationEntity.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityAgentInvestigationEntity {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SUB_TYPE = "sub_type";
  private String subType;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public SecurityAgentInvestigationEntity() {}

  @JsonCreator
  public SecurityAgentInvestigationEntity(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) String value) {
    this.type = type;
    this.value = value;
  }

  public SecurityAgentInvestigationEntity subType(String subType) {
    this.subType = subType;
    return this;
  }

  /**
   * More specific type of the entity.
   *
   * @return subType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUB_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSubType() {
    return subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }

  public SecurityAgentInvestigationEntity type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the entity, such as a user, a host, or an IP address.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SecurityAgentInvestigationEntity value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value that identifies the entity.
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
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
   * @return SecurityAgentInvestigationEntity
   */
  @JsonAnySetter
  public SecurityAgentInvestigationEntity putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityAgentInvestigationEntity object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityAgentInvestigationEntity securityAgentInvestigationEntity =
        (SecurityAgentInvestigationEntity) o;
    return Objects.equals(this.subType, securityAgentInvestigationEntity.subType)
        && Objects.equals(this.type, securityAgentInvestigationEntity.type)
        && Objects.equals(this.value, securityAgentInvestigationEntity.value)
        && Objects.equals(
            this.additionalProperties, securityAgentInvestigationEntity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subType, type, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityAgentInvestigationEntity {\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

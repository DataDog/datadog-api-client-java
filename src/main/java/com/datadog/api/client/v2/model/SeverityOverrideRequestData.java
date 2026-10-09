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

/** Data of the severity override request. */
@JsonPropertyOrder({
  SeverityOverrideRequestData.JSON_PROPERTY_ATTRIBUTES,
  SeverityOverrideRequestData.JSON_PROPERTY_ID,
  SeverityOverrideRequestData.JSON_PROPERTY_RELATIONSHIPS,
  SeverityOverrideRequestData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SeverityOverrideRequestData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private SeverityOverrideRequestDataAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private SeverityOverrideRequestDataRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SeverityOverrideDataType type = SeverityOverrideDataType.SEVERITY_OVERRIDE;

  public SeverityOverrideRequestData() {}

  @JsonCreator
  public SeverityOverrideRequestData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          SeverityOverrideRequestDataAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_RELATIONSHIPS)
          SeverityOverrideRequestDataRelationships relationships,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) SeverityOverrideDataType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SeverityOverrideRequestData attributes(SeverityOverrideRequestDataAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes of the severity override request.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SeverityOverrideRequestDataAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(SeverityOverrideRequestDataAttributes attributes) {
    this.attributes = attributes;
    if (attributes != null) {
      this.unparsed |= attributes.unparsed;
    }
  }

  public SeverityOverrideRequestData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the severity override request. If not provided, an identifier is
   * generated.
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

  public SeverityOverrideRequestData relationships(
      SeverityOverrideRequestDataRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * Relationships of the severity override request.
   *
   * @return relationships
   */
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SeverityOverrideRequestDataRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(SeverityOverrideRequestDataRelationships relationships) {
    this.relationships = relationships;
    if (relationships != null) {
      this.unparsed |= relationships.unparsed;
    }
  }

  public SeverityOverrideRequestData type(SeverityOverrideDataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Severity override resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SeverityOverrideDataType getType() {
    return type;
  }

  public void setType(SeverityOverrideDataType type) {
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
   * @return SeverityOverrideRequestData
   */
  @JsonAnySetter
  public SeverityOverrideRequestData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SeverityOverrideRequestData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeverityOverrideRequestData severityOverrideRequestData = (SeverityOverrideRequestData) o;
    return Objects.equals(this.attributes, severityOverrideRequestData.attributes)
        && Objects.equals(this.id, severityOverrideRequestData.id)
        && Objects.equals(this.relationships, severityOverrideRequestData.relationships)
        && Objects.equals(this.type, severityOverrideRequestData.type)
        && Objects.equals(
            this.additionalProperties, severityOverrideRequestData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, relationships, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeverityOverrideRequestData {\n");
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

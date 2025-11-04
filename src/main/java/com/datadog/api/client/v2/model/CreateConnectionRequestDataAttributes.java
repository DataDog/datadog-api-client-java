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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** */
@JsonPropertyOrder({
  CreateConnectionRequestDataAttributes.JSON_PROPERTY_FIELDS,
  CreateConnectionRequestDataAttributes.JSON_PROPERTY_JOIN_ATTRIBUTE,
  CreateConnectionRequestDataAttributes.JSON_PROPERTY_JOIN_TYPE,
  CreateConnectionRequestDataAttributes.JSON_PROPERTY_METADATA,
  CreateConnectionRequestDataAttributes.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateConnectionRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<CreateConnectionRequestDataAttributesFieldsItems> fields = null;

  public static final String JSON_PROPERTY_JOIN_ATTRIBUTE = "join_attribute";
  private String joinAttribute;

  public static final String JSON_PROPERTY_JOIN_TYPE = "join_type";
  private String joinType;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public CreateConnectionRequestDataAttributes() {}

  @JsonCreator
  public CreateConnectionRequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_JOIN_ATTRIBUTE) String joinAttribute,
      @JsonProperty(required = true, value = JSON_PROPERTY_JOIN_TYPE) String joinType,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type) {
    this.joinAttribute = joinAttribute;
    this.joinType = joinType;
    this.type = type;
  }

  public CreateConnectionRequestDataAttributes fields(
      List<CreateConnectionRequestDataAttributesFieldsItems> fields) {
    this.fields = fields;
    for (CreateConnectionRequestDataAttributesFieldsItems item : fields) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CreateConnectionRequestDataAttributes addFieldsItem(
      CreateConnectionRequestDataAttributesFieldsItems fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    this.unparsed |= fieldsItem.unparsed;
    return this;
  }

  /**
   * Getfields
   *
   * @return fields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<CreateConnectionRequestDataAttributesFieldsItems> getFields() {
    return fields;
  }

  public void setFields(List<CreateConnectionRequestDataAttributesFieldsItems> fields) {
    this.fields = fields;
  }

  public CreateConnectionRequestDataAttributes joinAttribute(String joinAttribute) {
    this.joinAttribute = joinAttribute;
    return this;
  }

  /**
   * GetjoinAttribute
   *
   * @return joinAttribute
   */
  @JsonProperty(JSON_PROPERTY_JOIN_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getJoinAttribute() {
    return joinAttribute;
  }

  public void setJoinAttribute(String joinAttribute) {
    this.joinAttribute = joinAttribute;
  }

  public CreateConnectionRequestDataAttributes joinType(String joinType) {
    this.joinType = joinType;
    return this;
  }

  /**
   * GetjoinType
   *
   * @return joinType
   */
  @JsonProperty(JSON_PROPERTY_JOIN_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getJoinType() {
    return joinType;
  }

  public void setJoinType(String joinType) {
    this.joinType = joinType;
  }

  public CreateConnectionRequestDataAttributes metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public CreateConnectionRequestDataAttributes putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Getmetadata
   *
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public CreateConnectionRequestDataAttributes type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Gettype
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
   * @return CreateConnectionRequestDataAttributes
   */
  @JsonAnySetter
  public CreateConnectionRequestDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CreateConnectionRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateConnectionRequestDataAttributes createConnectionRequestDataAttributes =
        (CreateConnectionRequestDataAttributes) o;
    return Objects.equals(this.fields, createConnectionRequestDataAttributes.fields)
        && Objects.equals(this.joinAttribute, createConnectionRequestDataAttributes.joinAttribute)
        && Objects.equals(this.joinType, createConnectionRequestDataAttributes.joinType)
        && Objects.equals(this.metadata, createConnectionRequestDataAttributes.metadata)
        && Objects.equals(this.type, createConnectionRequestDataAttributes.type)
        && Objects.equals(
            this.additionalProperties, createConnectionRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, joinAttribute, joinType, metadata, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateConnectionRequestDataAttributes {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    joinAttribute: ").append(toIndentedString(joinAttribute)).append("\n");
    sb.append("    joinType: ").append(toIndentedString(joinType)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

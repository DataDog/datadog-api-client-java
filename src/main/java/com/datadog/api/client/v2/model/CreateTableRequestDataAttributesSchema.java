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

/** The definition of <code>CreateTableRequestDataAttributesSchema</code> object. */
@JsonPropertyOrder({
  CreateTableRequestDataAttributesSchema.JSON_PROPERTY_FIELDS,
  CreateTableRequestDataAttributesSchema.JSON_PROPERTY_PRIMARY_KEYS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateTableRequestDataAttributesSchema {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<CreateTableRequestDataAttributesSchemaFieldsItems> fields = new ArrayList<>();

  public static final String JSON_PROPERTY_PRIMARY_KEYS = "primary_keys";
  private List<String> primaryKeys = new ArrayList<>();

  public CreateTableRequestDataAttributesSchema() {}

  @JsonCreator
  public CreateTableRequestDataAttributesSchema(
      @JsonProperty(required = true, value = JSON_PROPERTY_FIELDS)
          List<CreateTableRequestDataAttributesSchemaFieldsItems> fields,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRIMARY_KEYS) List<String> primaryKeys) {
    this.fields = fields;
    this.primaryKeys = primaryKeys;
  }

  public CreateTableRequestDataAttributesSchema fields(
      List<CreateTableRequestDataAttributesSchemaFieldsItems> fields) {
    this.fields = fields;
    for (CreateTableRequestDataAttributesSchemaFieldsItems item : fields) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CreateTableRequestDataAttributesSchema addFieldsItem(
      CreateTableRequestDataAttributesSchemaFieldsItems fieldsItem) {
    this.fields.add(fieldsItem);
    this.unparsed |= fieldsItem.unparsed;
    return this;
  }

  /**
   * The <code>schema</code> <code>fields</code>.
   *
   * @return fields
   */
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<CreateTableRequestDataAttributesSchemaFieldsItems> getFields() {
    return fields;
  }

  public void setFields(List<CreateTableRequestDataAttributesSchemaFieldsItems> fields) {
    this.fields = fields;
  }

  public CreateTableRequestDataAttributesSchema primaryKeys(List<String> primaryKeys) {
    this.primaryKeys = primaryKeys;
    return this;
  }

  public CreateTableRequestDataAttributesSchema addPrimaryKeysItem(String primaryKeysItem) {
    this.primaryKeys.add(primaryKeysItem);
    return this;
  }

  /**
   * List of field names that serve as primary keys for the table. Only one primary key is
   * supported, and it is used as an ID to retrieve rows.
   *
   * @return primaryKeys
   */
  @JsonProperty(JSON_PROPERTY_PRIMARY_KEYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getPrimaryKeys() {
    return primaryKeys;
  }

  public void setPrimaryKeys(List<String> primaryKeys) {
    this.primaryKeys = primaryKeys;
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
   * @return CreateTableRequestDataAttributesSchema
   */
  @JsonAnySetter
  public CreateTableRequestDataAttributesSchema putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CreateTableRequestDataAttributesSchema object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTableRequestDataAttributesSchema createTableRequestDataAttributesSchema =
        (CreateTableRequestDataAttributesSchema) o;
    return Objects.equals(this.fields, createTableRequestDataAttributesSchema.fields)
        && Objects.equals(this.primaryKeys, createTableRequestDataAttributesSchema.primaryKeys)
        && Objects.equals(
            this.additionalProperties, createTableRequestDataAttributesSchema.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, primaryKeys, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTableRequestDataAttributesSchema {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    primaryKeys: ").append(toIndentedString(primaryKeys)).append("\n");
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

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
   * <p>Schema defining the structure and columns of the reference table.</p>
 */
@JsonPropertyOrder({
  TableResultV2DataAttributesSchema.JSON_PROPERTY_FIELDS,
  TableResultV2DataAttributesSchema.JSON_PROPERTY_PRIMARY_KEYS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TableResultV2DataAttributesSchema {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<TableResultV2DataAttributesSchemaFieldsItems> fields = new ArrayList<>();

  public static final String JSON_PROPERTY_PRIMARY_KEYS = "primary_keys";
  private List<String> primaryKeys = new ArrayList<>();

  public TableResultV2DataAttributesSchema() {}

  @JsonCreator
  public TableResultV2DataAttributesSchema(
            @JsonProperty(required=true, value=JSON_PROPERTY_FIELDS)List<TableResultV2DataAttributesSchemaFieldsItems> fields,
            @JsonProperty(required=true, value=JSON_PROPERTY_PRIMARY_KEYS)List<String> primaryKeys) {
        this.fields = fields;
        this.primaryKeys = primaryKeys;
  }
  public TableResultV2DataAttributesSchema fields(List<TableResultV2DataAttributesSchemaFieldsItems> fields) {
    this.fields = fields;
    for (TableResultV2DataAttributesSchemaFieldsItems item : fields) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public TableResultV2DataAttributesSchema addFieldsItem(TableResultV2DataAttributesSchemaFieldsItems fieldsItem) {
    this.fields.add(fieldsItem);
    this.unparsed |= fieldsItem.unparsed;
    return this;
  }

  /**
   * <p>The schema fields.</p>
   * @return fields
  **/
      @JsonProperty(JSON_PROPERTY_FIELDS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<TableResultV2DataAttributesSchemaFieldsItems> getFields() {
        return fields;
      }
  public void setFields(List<TableResultV2DataAttributesSchemaFieldsItems> fields) {
    this.fields = fields;
  }
  public TableResultV2DataAttributesSchema primaryKeys(List<String> primaryKeys) {
    this.primaryKeys = primaryKeys;
    return this;
  }
  public TableResultV2DataAttributesSchema addPrimaryKeysItem(String primaryKeysItem) {
    this.primaryKeys.add(primaryKeysItem);
    return this;
  }

  /**
   * <p>List of field names that serve as primary keys for the table. Only one primary key is supported, and it is used as an ID to retrieve rows.</p>
   * @return primaryKeys
  **/
      @JsonProperty(JSON_PROPERTY_PRIMARY_KEYS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getPrimaryKeys() {
        return primaryKeys;
      }
  public void setPrimaryKeys(List<String> primaryKeys) {
    this.primaryKeys = primaryKeys;
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
   * @return TableResultV2DataAttributesSchema
   */
  @JsonAnySetter
  public TableResultV2DataAttributesSchema putAdditionalProperty(String key, Object value) {
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
   * Return true if this TableResultV2DataAttributesSchema object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableResultV2DataAttributesSchema tableResultV2DataAttributesSchema = (TableResultV2DataAttributesSchema) o;
    return Objects.equals(this.fields, tableResultV2DataAttributesSchema.fields) && Objects.equals(this.primaryKeys, tableResultV2DataAttributesSchema.primaryKeys) && Objects.equals(this.additionalProperties, tableResultV2DataAttributesSchema.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(fields,primaryKeys, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableResultV2DataAttributesSchema {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    primaryKeys: ").append(toIndentedString(primaryKeys)).append("\n");
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

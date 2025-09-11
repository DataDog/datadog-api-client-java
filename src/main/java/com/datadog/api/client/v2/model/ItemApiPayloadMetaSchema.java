/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Schema information about the datastore, including its primary key and field definitions. */
@JsonPropertyOrder({
  ItemApiPayloadMetaSchema.JSON_PROPERTY_FIELDS,
  ItemApiPayloadMetaSchema.JSON_PROPERTY_PRIMARY_KEY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ItemApiPayloadMetaSchema {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<ItemApiPayloadMetaSchemaField> fields = null;

  public static final String JSON_PROPERTY_PRIMARY_KEY = "primary_key";
  private String primaryKey;

  public ItemApiPayloadMetaSchema fields(List<ItemApiPayloadMetaSchemaField> fields) {
    this.fields = fields;
    for (ItemApiPayloadMetaSchemaField item : fields) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ItemApiPayloadMetaSchema addFieldsItem(ItemApiPayloadMetaSchemaField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    this.unparsed |= fieldsItem.unparsed;
    return this;
  }

  /**
   * An array describing the columns available in this datastore.
   *
   * @return fields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ItemApiPayloadMetaSchemaField> getFields() {
    return fields;
  }

  public void setFields(List<ItemApiPayloadMetaSchemaField> fields) {
    this.fields = fields;
  }

  public ItemApiPayloadMetaSchema primaryKey(String primaryKey) {
    this.primaryKey = primaryKey;
    return this;
  }

  /**
   * The name of the primary key column for this datastore.
   *
   * @return primaryKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrimaryKey() {
    return primaryKey;
  }

  public void setPrimaryKey(String primaryKey) {
    this.primaryKey = primaryKey;
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
   * @return ItemApiPayloadMetaSchema
   */
  @JsonAnySetter
  public ItemApiPayloadMetaSchema putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ItemApiPayloadMetaSchema object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemApiPayloadMetaSchema itemApiPayloadMetaSchema = (ItemApiPayloadMetaSchema) o;
    return Objects.equals(this.fields, itemApiPayloadMetaSchema.fields)
        && Objects.equals(this.primaryKey, itemApiPayloadMetaSchema.primaryKey)
        && Objects.equals(this.additionalProperties, itemApiPayloadMetaSchema.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, primaryKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemApiPayloadMetaSchema {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
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

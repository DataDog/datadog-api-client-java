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

/** The datastore configuration for a form. */
@JsonPropertyOrder({
  FormDatastoreConfigAttributes.JSON_PROPERTY_DATASTORE_ID,
  FormDatastoreConfigAttributes.JSON_PROPERTY_PRIMARY_COLUMN_NAME,
  FormDatastoreConfigAttributes.JSON_PROPERTY_PRIMARY_KEY_GENERATION_STRATEGY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormDatastoreConfigAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATASTORE_ID = "datastore_id";
  private UUID datastoreId;

  public static final String JSON_PROPERTY_PRIMARY_COLUMN_NAME = "primary_column_name";
  private String primaryColumnName;

  public static final String JSON_PROPERTY_PRIMARY_KEY_GENERATION_STRATEGY =
      "primary_key_generation_strategy";
  private String primaryKeyGenerationStrategy;

  public FormDatastoreConfigAttributes() {}

  @JsonCreator
  public FormDatastoreConfigAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASTORE_ID) UUID datastoreId,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRIMARY_COLUMN_NAME)
          String primaryColumnName,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRIMARY_KEY_GENERATION_STRATEGY)
          String primaryKeyGenerationStrategy) {
    this.datastoreId = datastoreId;
    this.primaryColumnName = primaryColumnName;
    this.primaryKeyGenerationStrategy = primaryKeyGenerationStrategy;
  }

  public FormDatastoreConfigAttributes datastoreId(UUID datastoreId) {
    this.datastoreId = datastoreId;
    return this;
  }

  /**
   * The ID of the datastore.
   *
   * @return datastoreId
   */
  @JsonProperty(JSON_PROPERTY_DATASTORE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getDatastoreId() {
    return datastoreId;
  }

  public void setDatastoreId(UUID datastoreId) {
    this.datastoreId = datastoreId;
  }

  public FormDatastoreConfigAttributes primaryColumnName(String primaryColumnName) {
    this.primaryColumnName = primaryColumnName;
    return this;
  }

  /**
   * The name of the primary column in the datastore.
   *
   * @return primaryColumnName
   */
  @JsonProperty(JSON_PROPERTY_PRIMARY_COLUMN_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPrimaryColumnName() {
    return primaryColumnName;
  }

  public void setPrimaryColumnName(String primaryColumnName) {
    this.primaryColumnName = primaryColumnName;
  }

  public FormDatastoreConfigAttributes primaryKeyGenerationStrategy(
      String primaryKeyGenerationStrategy) {
    this.primaryKeyGenerationStrategy = primaryKeyGenerationStrategy;
    return this;
  }

  /**
   * The strategy used to generate primary keys in the datastore.
   *
   * @return primaryKeyGenerationStrategy
   */
  @JsonProperty(JSON_PROPERTY_PRIMARY_KEY_GENERATION_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPrimaryKeyGenerationStrategy() {
    return primaryKeyGenerationStrategy;
  }

  public void setPrimaryKeyGenerationStrategy(String primaryKeyGenerationStrategy) {
    this.primaryKeyGenerationStrategy = primaryKeyGenerationStrategy;
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
   * @return FormDatastoreConfigAttributes
   */
  @JsonAnySetter
  public FormDatastoreConfigAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FormDatastoreConfigAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormDatastoreConfigAttributes formDatastoreConfigAttributes = (FormDatastoreConfigAttributes) o;
    return Objects.equals(this.datastoreId, formDatastoreConfigAttributes.datastoreId)
        && Objects.equals(this.primaryColumnName, formDatastoreConfigAttributes.primaryColumnName)
        && Objects.equals(
            this.primaryKeyGenerationStrategy,
            formDatastoreConfigAttributes.primaryKeyGenerationStrategy)
        && Objects.equals(
            this.additionalProperties, formDatastoreConfigAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        datastoreId, primaryColumnName, primaryKeyGenerationStrategy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormDatastoreConfigAttributes {\n");
    sb.append("    datastoreId: ").append(toIndentedString(datastoreId)).append("\n");
    sb.append("    primaryColumnName: ").append(toIndentedString(primaryColumnName)).append("\n");
    sb.append("    primaryKeyGenerationStrategy: ")
        .append(toIndentedString(primaryKeyGenerationStrategy))
        .append("\n");
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

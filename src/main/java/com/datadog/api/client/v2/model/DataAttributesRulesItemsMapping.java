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

/** The definition of <code>DataAttributesRulesItemsMapping</code> object. */
@JsonPropertyOrder({
  DataAttributesRulesItemsMapping.JSON_PROPERTY_DESTINATION_KEY,
  DataAttributesRulesItemsMapping.JSON_PROPERTY_IF_NOT_EXISTS,
  DataAttributesRulesItemsMapping.JSON_PROPERTY_IF_TAG_EXISTS,
  DataAttributesRulesItemsMapping.JSON_PROPERTY_SOURCE_KEYS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DataAttributesRulesItemsMapping {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESTINATION_KEY = "destination_key";
  private String destinationKey;

  public static final String JSON_PROPERTY_IF_NOT_EXISTS = "if_not_exists";
  private Boolean ifNotExists;

  public static final String JSON_PROPERTY_IF_TAG_EXISTS = "if_tag_exists";
  private DataAttributesRulesItemsIfTagExists ifTagExists;

  public static final String JSON_PROPERTY_SOURCE_KEYS = "source_keys";
  private List<String> sourceKeys = new ArrayList<>();

  public DataAttributesRulesItemsMapping() {}

  @JsonCreator
  public DataAttributesRulesItemsMapping(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESTINATION_KEY) String destinationKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE_KEYS) List<String> sourceKeys) {
    this.destinationKey = destinationKey;
    this.sourceKeys = sourceKeys;
  }

  public DataAttributesRulesItemsMapping destinationKey(String destinationKey) {
    this.destinationKey = destinationKey;
    return this;
  }

  /**
   * The <code>mapping</code> <code>destination_key</code>.
   *
   * @return destinationKey
   */
  @JsonProperty(JSON_PROPERTY_DESTINATION_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDestinationKey() {
    return destinationKey;
  }

  public void setDestinationKey(String destinationKey) {
    this.destinationKey = destinationKey;
  }

  public DataAttributesRulesItemsMapping ifNotExists(Boolean ifNotExists) {
    this.ifNotExists = ifNotExists;
    return this;
  }

  /**
   * Deprecated. Use <code>if_tag_exists</code> instead. The <code>mapping</code> <code>
   * if_not_exists</code>.
   *
   * @return ifNotExists
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IF_NOT_EXISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIfNotExists() {
    return ifNotExists;
  }

  @Deprecated
  public void setIfNotExists(Boolean ifNotExists) {
    this.ifNotExists = ifNotExists;
  }

  public DataAttributesRulesItemsMapping ifTagExists(
      DataAttributesRulesItemsIfTagExists ifTagExists) {
    this.ifTagExists = ifTagExists;
    this.unparsed |= !ifTagExists.isValid();
    return this;
  }

  /**
   * The behavior when the tag already exists.
   *
   * @return ifTagExists
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IF_TAG_EXISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DataAttributesRulesItemsIfTagExists getIfTagExists() {
    return ifTagExists;
  }

  public void setIfTagExists(DataAttributesRulesItemsIfTagExists ifTagExists) {
    if (!ifTagExists.isValid()) {
      this.unparsed = true;
    }
    this.ifTagExists = ifTagExists;
  }

  public DataAttributesRulesItemsMapping sourceKeys(List<String> sourceKeys) {
    this.sourceKeys = sourceKeys;
    return this;
  }

  public DataAttributesRulesItemsMapping addSourceKeysItem(String sourceKeysItem) {
    this.sourceKeys.add(sourceKeysItem);
    return this;
  }

  /**
   * The <code>mapping</code> <code>source_keys</code>.
   *
   * @return sourceKeys
   */
  @JsonProperty(JSON_PROPERTY_SOURCE_KEYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getSourceKeys() {
    return sourceKeys;
  }

  public void setSourceKeys(List<String> sourceKeys) {
    this.sourceKeys = sourceKeys;
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
   * @return DataAttributesRulesItemsMapping
   */
  @JsonAnySetter
  public DataAttributesRulesItemsMapping putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DataAttributesRulesItemsMapping object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataAttributesRulesItemsMapping dataAttributesRulesItemsMapping =
        (DataAttributesRulesItemsMapping) o;
    return Objects.equals(this.destinationKey, dataAttributesRulesItemsMapping.destinationKey)
        && Objects.equals(this.ifNotExists, dataAttributesRulesItemsMapping.ifNotExists)
        && Objects.equals(this.ifTagExists, dataAttributesRulesItemsMapping.ifTagExists)
        && Objects.equals(this.sourceKeys, dataAttributesRulesItemsMapping.sourceKeys)
        && Objects.equals(
            this.additionalProperties, dataAttributesRulesItemsMapping.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationKey, ifNotExists, ifTagExists, sourceKeys, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataAttributesRulesItemsMapping {\n");
    sb.append("    destinationKey: ").append(toIndentedString(destinationKey)).append("\n");
    sb.append("    ifNotExists: ").append(toIndentedString(ifNotExists)).append("\n");
    sb.append("    ifTagExists: ").append(toIndentedString(ifTagExists)).append("\n");
    sb.append("    sourceKeys: ").append(toIndentedString(sourceKeys)).append("\n");
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

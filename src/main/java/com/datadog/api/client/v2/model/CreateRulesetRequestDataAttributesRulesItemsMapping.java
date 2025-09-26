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

/** The definition of <code>CreateRulesetRequestDataAttributesRulesItemsMapping</code> object. */
@JsonPropertyOrder({
  CreateRulesetRequestDataAttributesRulesItemsMapping.JSON_PROPERTY_DESTINATION_KEY,
  CreateRulesetRequestDataAttributesRulesItemsMapping.JSON_PROPERTY_IF_NOT_EXISTS,
  CreateRulesetRequestDataAttributesRulesItemsMapping.JSON_PROPERTY_SOURCE_KEYS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateRulesetRequestDataAttributesRulesItemsMapping {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESTINATION_KEY = "destination_key";
  private String destinationKey;

  public static final String JSON_PROPERTY_IF_NOT_EXISTS = "if_not_exists";
  private Boolean ifNotExists;

  public static final String JSON_PROPERTY_SOURCE_KEYS = "source_keys";
  private List<String> sourceKeys = new ArrayList<>();

  public CreateRulesetRequestDataAttributesRulesItemsMapping() {}

  @JsonCreator
  public CreateRulesetRequestDataAttributesRulesItemsMapping(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESTINATION_KEY) String destinationKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_IF_NOT_EXISTS) Boolean ifNotExists,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE_KEYS) List<String> sourceKeys) {
    this.destinationKey = destinationKey;
    this.ifNotExists = ifNotExists;
    this.sourceKeys = sourceKeys;
  }

  public CreateRulesetRequestDataAttributesRulesItemsMapping destinationKey(String destinationKey) {
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

  public CreateRulesetRequestDataAttributesRulesItemsMapping ifNotExists(Boolean ifNotExists) {
    this.ifNotExists = ifNotExists;
    return this;
  }

  /**
   * The <code>mapping</code> <code>if_not_exists</code>.
   *
   * @return ifNotExists
   */
  @JsonProperty(JSON_PROPERTY_IF_NOT_EXISTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIfNotExists() {
    return ifNotExists;
  }

  public void setIfNotExists(Boolean ifNotExists) {
    this.ifNotExists = ifNotExists;
  }

  public CreateRulesetRequestDataAttributesRulesItemsMapping sourceKeys(List<String> sourceKeys) {
    this.sourceKeys = sourceKeys;
    return this;
  }

  public CreateRulesetRequestDataAttributesRulesItemsMapping addSourceKeysItem(
      String sourceKeysItem) {
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
   * @return CreateRulesetRequestDataAttributesRulesItemsMapping
   */
  @JsonAnySetter
  public CreateRulesetRequestDataAttributesRulesItemsMapping putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this CreateRulesetRequestDataAttributesRulesItemsMapping object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRulesetRequestDataAttributesRulesItemsMapping
        createRulesetRequestDataAttributesRulesItemsMapping =
            (CreateRulesetRequestDataAttributesRulesItemsMapping) o;
    return Objects.equals(
            this.destinationKey, createRulesetRequestDataAttributesRulesItemsMapping.destinationKey)
        && Objects.equals(
            this.ifNotExists, createRulesetRequestDataAttributesRulesItemsMapping.ifNotExists)
        && Objects.equals(
            this.sourceKeys, createRulesetRequestDataAttributesRulesItemsMapping.sourceKeys)
        && Objects.equals(
            this.additionalProperties,
            createRulesetRequestDataAttributesRulesItemsMapping.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationKey, ifNotExists, sourceKeys, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRulesetRequestDataAttributesRulesItemsMapping {\n");
    sb.append("    destinationKey: ").append(toIndentedString(destinationKey)).append("\n");
    sb.append("    ifNotExists: ").append(toIndentedString(ifNotExists)).append("\n");
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

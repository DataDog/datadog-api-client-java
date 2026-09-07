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
   * <p>The definition of <code>UpdateRulesetRequestDataAttributesRulesItems</code> object.</p>
 */
@JsonPropertyOrder({
  UpdateRulesetRequestDataAttributesRulesItems.JSON_PROPERTY_ENABLED,
  UpdateRulesetRequestDataAttributesRulesItems.JSON_PROPERTY_MAPPING,
  UpdateRulesetRequestDataAttributesRulesItems.JSON_PROPERTY_METADATA,
  UpdateRulesetRequestDataAttributesRulesItems.JSON_PROPERTY_NAME,
  UpdateRulesetRequestDataAttributesRulesItems.JSON_PROPERTY_QUERY,
  UpdateRulesetRequestDataAttributesRulesItems.JSON_PROPERTY_REFERENCE_TABLE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UpdateRulesetRequestDataAttributesRulesItems {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_MAPPING = "mapping";
  private JsonNullable<DataAttributesRulesItemsMapping> mapping = JsonNullable.<DataAttributesRulesItemsMapping>undefined();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Map<String, String>> metadata = JsonNullable.<Map<String, String>>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private JsonNullable<UpdateRulesetRequestDataAttributesRulesItemsQuery> query = JsonNullable.<UpdateRulesetRequestDataAttributesRulesItemsQuery>undefined();

  public static final String JSON_PROPERTY_REFERENCE_TABLE = "reference_table";
  private JsonNullable<UpdateRulesetRequestDataAttributesRulesItemsReferenceTable> referenceTable = JsonNullable.<UpdateRulesetRequestDataAttributesRulesItemsReferenceTable>undefined();

  public UpdateRulesetRequestDataAttributesRulesItems() {}

  @JsonCreator
  public UpdateRulesetRequestDataAttributesRulesItems(
            @JsonProperty(required=true, value=JSON_PROPERTY_ENABLED)Boolean enabled,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name) {
        this.enabled = enabled;
        this.name = name;
  }
  public UpdateRulesetRequestDataAttributesRulesItems enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>The <code>items</code> <code>enabled</code>.</p>
   * @return enabled
  **/
      @JsonProperty(JSON_PROPERTY_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getEnabled() {
        return enabled;
      }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }
  public UpdateRulesetRequestDataAttributesRulesItems mapping(DataAttributesRulesItemsMapping mapping) {
    this.mapping = JsonNullable.<DataAttributesRulesItemsMapping>of(mapping);
    return this;
  }

  /**
   * <p>The definition of <code>DataAttributesRulesItemsMapping</code> object.</p>
   * @return mapping
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public DataAttributesRulesItemsMapping getMapping() {
        return mapping.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_MAPPING)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<DataAttributesRulesItemsMapping> getMapping_JsonNullable() {
    return mapping;
  }
  @JsonProperty(JSON_PROPERTY_MAPPING)public void setMapping_JsonNullable(JsonNullable<DataAttributesRulesItemsMapping> mapping) {
    this.mapping = mapping;
  }
  public void setMapping(DataAttributesRulesItemsMapping mapping) {
    this.mapping = JsonNullable.<DataAttributesRulesItemsMapping>of(mapping);
  }
  public UpdateRulesetRequestDataAttributesRulesItems metadata(Map<String, String> metadata) {
    this.metadata = JsonNullable.<Map<String, String>>of(metadata);
    return this;
  }
  public UpdateRulesetRequestDataAttributesRulesItems putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null || !this.metadata.isPresent()) {
      this.metadata = JsonNullable.<Map<String, String>>of(new HashMap<>());
    }
    try {
      this.metadata.get().put(key, metadataItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * <p>The <code>items</code> <code>metadata</code>.</p>
   * @return metadata
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Map<String, String> getMetadata() {
        return metadata.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, String>> getMetadata_JsonNullable() {
    return metadata;
  }
  @JsonProperty(JSON_PROPERTY_METADATA)public void setMetadata_JsonNullable(JsonNullable<Map<String, String>> metadata) {
    this.metadata = metadata;
  }
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = JsonNullable.<Map<String, String>>of(metadata);
  }
  public UpdateRulesetRequestDataAttributesRulesItems name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The <code>items</code> <code>name</code>.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public UpdateRulesetRequestDataAttributesRulesItems query(UpdateRulesetRequestDataAttributesRulesItemsQuery query) {
    this.query = JsonNullable.<UpdateRulesetRequestDataAttributesRulesItemsQuery>of(query);
    return this;
  }

  /**
   * <p>The definition of <code>UpdateRulesetRequestDataAttributesRulesItemsQuery</code> object.</p>
   * @return query
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public UpdateRulesetRequestDataAttributesRulesItemsQuery getQuery() {
        return query.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<UpdateRulesetRequestDataAttributesRulesItemsQuery> getQuery_JsonNullable() {
    return query;
  }
  @JsonProperty(JSON_PROPERTY_QUERY)public void setQuery_JsonNullable(JsonNullable<UpdateRulesetRequestDataAttributesRulesItemsQuery> query) {
    this.query = query;
  }
  public void setQuery(UpdateRulesetRequestDataAttributesRulesItemsQuery query) {
    this.query = JsonNullable.<UpdateRulesetRequestDataAttributesRulesItemsQuery>of(query);
  }
  public UpdateRulesetRequestDataAttributesRulesItems referenceTable(UpdateRulesetRequestDataAttributesRulesItemsReferenceTable referenceTable) {
    this.referenceTable = JsonNullable.<UpdateRulesetRequestDataAttributesRulesItemsReferenceTable>of(referenceTable);
    return this;
  }

  /**
   * <p>The definition of <code>UpdateRulesetRequestDataAttributesRulesItemsReferenceTable</code> object.</p>
   * @return referenceTable
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public UpdateRulesetRequestDataAttributesRulesItemsReferenceTable getReferenceTable() {
        return referenceTable.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_REFERENCE_TABLE)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<UpdateRulesetRequestDataAttributesRulesItemsReferenceTable> getReferenceTable_JsonNullable() {
    return referenceTable;
  }
  @JsonProperty(JSON_PROPERTY_REFERENCE_TABLE)public void setReferenceTable_JsonNullable(JsonNullable<UpdateRulesetRequestDataAttributesRulesItemsReferenceTable> referenceTable) {
    this.referenceTable = referenceTable;
  }
  public void setReferenceTable(UpdateRulesetRequestDataAttributesRulesItemsReferenceTable referenceTable) {
    this.referenceTable = JsonNullable.<UpdateRulesetRequestDataAttributesRulesItemsReferenceTable>of(referenceTable);
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
   * @return UpdateRulesetRequestDataAttributesRulesItems
   */
  @JsonAnySetter
  public UpdateRulesetRequestDataAttributesRulesItems putAdditionalProperty(String key, Object value) {
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
   * Return true if this UpdateRulesetRequestDataAttributesRulesItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRulesetRequestDataAttributesRulesItems updateRulesetRequestDataAttributesRulesItems = (UpdateRulesetRequestDataAttributesRulesItems) o;
    return Objects.equals(this.enabled, updateRulesetRequestDataAttributesRulesItems.enabled) && Objects.equals(this.mapping, updateRulesetRequestDataAttributesRulesItems.mapping) && Objects.equals(this.metadata, updateRulesetRequestDataAttributesRulesItems.metadata) && Objects.equals(this.name, updateRulesetRequestDataAttributesRulesItems.name) && Objects.equals(this.query, updateRulesetRequestDataAttributesRulesItems.query) && Objects.equals(this.referenceTable, updateRulesetRequestDataAttributesRulesItems.referenceTable) && Objects.equals(this.additionalProperties, updateRulesetRequestDataAttributesRulesItems.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(enabled,mapping,metadata,name,query,referenceTable, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRulesetRequestDataAttributesRulesItems {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    referenceTable: ").append(toIndentedString(referenceTable)).append("\n");
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

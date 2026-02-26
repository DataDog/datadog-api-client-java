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

/** The definition of <code>RulesetRespDataAttributesRulesItemsReferenceTable</code> object. */
@JsonPropertyOrder({
  RulesetRespDataAttributesRulesItemsReferenceTable.JSON_PROPERTY_CASE_INSENSITIVITY,
  RulesetRespDataAttributesRulesItemsReferenceTable.JSON_PROPERTY_FIELD_PAIRS,
  RulesetRespDataAttributesRulesItemsReferenceTable.JSON_PROPERTY_IF_NOT_EXISTS,
  RulesetRespDataAttributesRulesItemsReferenceTable.JSON_PROPERTY_IF_TAG_EXISTS,
  RulesetRespDataAttributesRulesItemsReferenceTable.JSON_PROPERTY_SOURCE_KEYS,
  RulesetRespDataAttributesRulesItemsReferenceTable.JSON_PROPERTY_TABLE_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RulesetRespDataAttributesRulesItemsReferenceTable {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CASE_INSENSITIVITY = "case_insensitivity";
  private Boolean caseInsensitivity;

  public static final String JSON_PROPERTY_FIELD_PAIRS = "field_pairs";
  private List<RulesetRespDataAttributesRulesItemsReferenceTableFieldPairsItems> fieldPairs =
      new ArrayList<>();

  public static final String JSON_PROPERTY_IF_NOT_EXISTS = "if_not_exists";
  private Boolean ifNotExists;

  public static final String JSON_PROPERTY_IF_TAG_EXISTS = "if_tag_exists";
  private DataAttributesRulesItemsIfTagExists ifTagExists;

  public static final String JSON_PROPERTY_SOURCE_KEYS = "source_keys";
  private List<String> sourceKeys = new ArrayList<>();

  public static final String JSON_PROPERTY_TABLE_NAME = "table_name";
  private String tableName;

  public RulesetRespDataAttributesRulesItemsReferenceTable() {}

  @JsonCreator
  public RulesetRespDataAttributesRulesItemsReferenceTable(
      @JsonProperty(required = true, value = JSON_PROPERTY_FIELD_PAIRS)
          List<RulesetRespDataAttributesRulesItemsReferenceTableFieldPairsItems> fieldPairs,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE_KEYS) List<String> sourceKeys,
      @JsonProperty(required = true, value = JSON_PROPERTY_TABLE_NAME) String tableName) {
    this.fieldPairs = fieldPairs;
    this.sourceKeys = sourceKeys;
    this.tableName = tableName;
  }

  public RulesetRespDataAttributesRulesItemsReferenceTable caseInsensitivity(
      Boolean caseInsensitivity) {
    this.caseInsensitivity = caseInsensitivity;
    return this;
  }

  /**
   * The <code>reference_table</code> <code>case_insensitivity</code>.
   *
   * @return caseInsensitivity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CASE_INSENSITIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCaseInsensitivity() {
    return caseInsensitivity;
  }

  public void setCaseInsensitivity(Boolean caseInsensitivity) {
    this.caseInsensitivity = caseInsensitivity;
  }

  public RulesetRespDataAttributesRulesItemsReferenceTable fieldPairs(
      List<RulesetRespDataAttributesRulesItemsReferenceTableFieldPairsItems> fieldPairs) {
    this.fieldPairs = fieldPairs;
    for (RulesetRespDataAttributesRulesItemsReferenceTableFieldPairsItems item : fieldPairs) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public RulesetRespDataAttributesRulesItemsReferenceTable addFieldPairsItem(
      RulesetRespDataAttributesRulesItemsReferenceTableFieldPairsItems fieldPairsItem) {
    this.fieldPairs.add(fieldPairsItem);
    this.unparsed |= fieldPairsItem.unparsed;
    return this;
  }

  /**
   * The <code>reference_table</code> <code>field_pairs</code>.
   *
   * @return fieldPairs
   */
  @JsonProperty(JSON_PROPERTY_FIELD_PAIRS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<RulesetRespDataAttributesRulesItemsReferenceTableFieldPairsItems> getFieldPairs() {
    return fieldPairs;
  }

  public void setFieldPairs(
      List<RulesetRespDataAttributesRulesItemsReferenceTableFieldPairsItems> fieldPairs) {
    this.fieldPairs = fieldPairs;
  }

  public RulesetRespDataAttributesRulesItemsReferenceTable ifNotExists(Boolean ifNotExists) {
    this.ifNotExists = ifNotExists;
    return this;
  }

  /**
   * Deprecated. Use <code>if_tag_exists</code> instead. The <code>reference_table</code> <code>
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

  public RulesetRespDataAttributesRulesItemsReferenceTable ifTagExists(
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

  public RulesetRespDataAttributesRulesItemsReferenceTable sourceKeys(List<String> sourceKeys) {
    this.sourceKeys = sourceKeys;
    return this;
  }

  public RulesetRespDataAttributesRulesItemsReferenceTable addSourceKeysItem(
      String sourceKeysItem) {
    this.sourceKeys.add(sourceKeysItem);
    return this;
  }

  /**
   * The <code>reference_table</code> <code>source_keys</code>.
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

  public RulesetRespDataAttributesRulesItemsReferenceTable tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  /**
   * The <code>reference_table</code> <code>table_name</code>.
   *
   * @return tableName
   */
  @JsonProperty(JSON_PROPERTY_TABLE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
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
   * @return RulesetRespDataAttributesRulesItemsReferenceTable
   */
  @JsonAnySetter
  public RulesetRespDataAttributesRulesItemsReferenceTable putAdditionalProperty(
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

  /** Return true if this RulesetRespDataAttributesRulesItemsReferenceTable object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RulesetRespDataAttributesRulesItemsReferenceTable
        rulesetRespDataAttributesRulesItemsReferenceTable =
            (RulesetRespDataAttributesRulesItemsReferenceTable) o;
    return Objects.equals(
            this.caseInsensitivity,
            rulesetRespDataAttributesRulesItemsReferenceTable.caseInsensitivity)
        && Objects.equals(
            this.fieldPairs, rulesetRespDataAttributesRulesItemsReferenceTable.fieldPairs)
        && Objects.equals(
            this.ifNotExists, rulesetRespDataAttributesRulesItemsReferenceTable.ifNotExists)
        && Objects.equals(
            this.ifTagExists, rulesetRespDataAttributesRulesItemsReferenceTable.ifTagExists)
        && Objects.equals(
            this.sourceKeys, rulesetRespDataAttributesRulesItemsReferenceTable.sourceKeys)
        && Objects.equals(
            this.tableName, rulesetRespDataAttributesRulesItemsReferenceTable.tableName)
        && Objects.equals(
            this.additionalProperties,
            rulesetRespDataAttributesRulesItemsReferenceTable.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        caseInsensitivity,
        fieldPairs,
        ifNotExists,
        ifTagExists,
        sourceKeys,
        tableName,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RulesetRespDataAttributesRulesItemsReferenceTable {\n");
    sb.append("    caseInsensitivity: ").append(toIndentedString(caseInsensitivity)).append("\n");
    sb.append("    fieldPairs: ").append(toIndentedString(fieldPairs)).append("\n");
    sb.append("    ifNotExists: ").append(toIndentedString(ifNotExists)).append("\n");
    sb.append("    ifTagExists: ").append(toIndentedString(ifTagExists)).append("\n");
    sb.append("    sourceKeys: ").append(toIndentedString(sourceKeys)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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

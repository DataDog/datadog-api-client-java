/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Defines one group-by dimension used to produce the rows of a guided table. */
@JsonPropertyOrder({
  GuidedTableRowGroupBy.JSON_PROPERTY_ALIAS,
  GuidedTableRowGroupBy.JSON_PROPERTY_FORMAT,
  GuidedTableRowGroupBy.JSON_PROPERTY_GROUP_KEYS,
  GuidedTableRowGroupBy.JSON_PROPERTY_IS_HIDDEN,
  GuidedTableRowGroupBy.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GuidedTableRowGroupBy {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private GuidedTableRowGroupByFormat format;

  public static final String JSON_PROPERTY_GROUP_KEYS = "group_keys";
  private List<GuidedTableGroupKey> groupKeys = new ArrayList<>();

  public static final String JSON_PROPERTY_IS_HIDDEN = "is_hidden";
  private Boolean isHidden;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public GuidedTableRowGroupBy() {}

  @JsonCreator
  public GuidedTableRowGroupBy(
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUP_KEYS)
          List<GuidedTableGroupKey> groupKeys,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.groupKeys = groupKeys;
    this.name = name;
  }

  public GuidedTableRowGroupBy alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Display name used as the column header for this group-by.
   *
   * @return alias
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public GuidedTableRowGroupBy format(GuidedTableRowGroupByFormat format) {
    this.format = format;
    this.unparsed |= format.unparsed;
    return this;
  }

  /**
   * Text formatting configuration for this group-by column.
   *
   * @return format
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GuidedTableRowGroupByFormat getFormat() {
    return format;
  }

  public void setFormat(GuidedTableRowGroupByFormat format) {
    this.format = format;
  }

  public GuidedTableRowGroupBy groupKeys(List<GuidedTableGroupKey> groupKeys) {
    this.groupKeys = groupKeys;
    for (GuidedTableGroupKey item : groupKeys) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GuidedTableRowGroupBy addGroupKeysItem(GuidedTableGroupKey groupKeysItem) {
    this.groupKeys.add(groupKeysItem);
    this.unparsed |= groupKeysItem.unparsed;
    return this;
  }

  /**
   * Mapping from each source query to the field name used as the grouping key. Different data
   * sources may use different field names for the same concept.
   *
   * @return groupKeys
   */
  @JsonProperty(JSON_PROPERTY_GROUP_KEYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<GuidedTableGroupKey> getGroupKeys() {
    return groupKeys;
  }

  public void setGroupKeys(List<GuidedTableGroupKey> groupKeys) {
    this.groupKeys = groupKeys;
  }

  public GuidedTableRowGroupBy isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  /**
   * Whether this group-by column is hidden in the rendered table.
   *
   * @return isHidden
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public GuidedTableRowGroupBy name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Auto-generated name for this group-by parameter.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
   * @return GuidedTableRowGroupBy
   */
  @JsonAnySetter
  public GuidedTableRowGroupBy putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GuidedTableRowGroupBy object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuidedTableRowGroupBy guidedTableRowGroupBy = (GuidedTableRowGroupBy) o;
    return Objects.equals(this.alias, guidedTableRowGroupBy.alias)
        && Objects.equals(this.format, guidedTableRowGroupBy.format)
        && Objects.equals(this.groupKeys, guidedTableRowGroupBy.groupKeys)
        && Objects.equals(this.isHidden, guidedTableRowGroupBy.isHidden)
        && Objects.equals(this.name, guidedTableRowGroupBy.name)
        && Objects.equals(this.additionalProperties, guidedTableRowGroupBy.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, format, groupKeys, isHidden, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuidedTableRowGroupBy {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    groupKeys: ").append(toIndentedString(groupKeys)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

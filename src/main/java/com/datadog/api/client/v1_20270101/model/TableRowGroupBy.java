/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  TableRowGroupBy.JSON_PROPERTY_ALIAS,
  TableRowGroupBy.JSON_PROPERTY_FORMAT,
  TableRowGroupBy.JSON_PROPERTY_GROUP_KEYS,
  TableRowGroupBy.JSON_PROPERTY_IS_HIDDEN,
  TableRowGroupBy.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TableRowGroupBy {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private TableRowGroupByFormat format;

  public static final String JSON_PROPERTY_GROUP_KEYS = "group_keys";
  private List<TableGroupKey> groupKeys = new ArrayList<>();

  public static final String JSON_PROPERTY_IS_HIDDEN = "is_hidden";
  private Boolean isHidden;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public TableRowGroupBy() {}

  @JsonCreator
  public TableRowGroupBy(
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUP_KEYS)
          List<TableGroupKey> groupKeys,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.groupKeys = groupKeys;
    for (TableGroupKey item : groupKeys) {
      this.unparsed |= item.unparsed;
    }
    this.name = name;
  }

  public TableRowGroupBy alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public TableRowGroupBy format(TableRowGroupByFormat format) {
    this.format = format;
    this.unparsed |= format.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return format
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TableRowGroupByFormat getFormat() {
    return format;
  }

  public void setFormat(TableRowGroupByFormat format) {
    this.format = format;
    if (format != null) {
      this.unparsed |= format.unparsed;
    }
  }

  public TableRowGroupBy groupKeys(List<TableGroupKey> groupKeys) {
    this.groupKeys = groupKeys;
    for (TableGroupKey item : groupKeys) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TableRowGroupBy addGroupKeysItem(TableGroupKey groupKeysItem) {
    this.groupKeys.add(groupKeysItem);
    this.unparsed |= groupKeysItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return groupKeys
   */
  @JsonProperty(JSON_PROPERTY_GROUP_KEYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TableGroupKey> getGroupKeys() {
    return groupKeys;
  }

  public void setGroupKeys(List<TableGroupKey> groupKeys) {
    this.groupKeys = groupKeys;
    if (groupKeys != null) {
      for (TableGroupKey item : groupKeys) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TableRowGroupBy isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public TableRowGroupBy name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  /** Return true if this TableRowGroupBy object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableRowGroupBy tableRowGroupBy = (TableRowGroupBy) o;
    return Objects.equals(this.alias, tableRowGroupBy.alias)
        && Objects.equals(this.format, tableRowGroupBy.format)
        && Objects.equals(this.groupKeys, tableRowGroupBy.groupKeys)
        && Objects.equals(this.isHidden, tableRowGroupBy.isHidden)
        && Objects.equals(this.name, tableRowGroupBy.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, format, groupKeys, isHidden, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRowGroupBy {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    groupKeys: ").append(toIndentedString(groupKeys)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

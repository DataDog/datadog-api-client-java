/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>A formula and functions events query.</p>
 */
@JsonPropertyOrder({
  FormulaAndFunctionEventQueryDefinition.JSON_PROPERTY_COMPUTE,
  FormulaAndFunctionEventQueryDefinition.JSON_PROPERTY_CROSS_ORG_UUIDS,
  FormulaAndFunctionEventQueryDefinition.JSON_PROPERTY_DATA_SOURCE,
  FormulaAndFunctionEventQueryDefinition.JSON_PROPERTY_GROUP_BY,
  FormulaAndFunctionEventQueryDefinition.JSON_PROPERTY_INDEXES,
  FormulaAndFunctionEventQueryDefinition.JSON_PROPERTY_NAME,
  FormulaAndFunctionEventQueryDefinition.JSON_PROPERTY_SEARCH,
  FormulaAndFunctionEventQueryDefinition.JSON_PROPERTY_STORAGE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaAndFunctionEventQueryDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private FormulaAndFunctionEventQueryDefinitionCompute compute;

  public static final String JSON_PROPERTY_CROSS_ORG_UUIDS = "cross_org_uuids";
  private List<String> crossOrgUuids = null;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaAndFunctionEventsDataSource dataSource;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<FormulaAndFunctionEventQueryGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private FormulaAndFunctionEventQueryDefinitionSearch search;

  public static final String JSON_PROPERTY_STORAGE = "storage";
  private String storage;

  public FormulaAndFunctionEventQueryDefinition() {}

  @JsonCreator
  public FormulaAndFunctionEventQueryDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_COMPUTE)FormulaAndFunctionEventQueryDefinitionCompute compute,
            @JsonProperty(required=true, value=JSON_PROPERTY_DATA_SOURCE)FormulaAndFunctionEventsDataSource dataSource,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name) {
        this.compute = compute;
        this.unparsed |= compute.unparsed;
        this.dataSource = dataSource;
        this.unparsed |= !dataSource.isValid();
        this.name = name;
  }
  public FormulaAndFunctionEventQueryDefinition compute(FormulaAndFunctionEventQueryDefinitionCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * <p>Compute options.</p>
   * @return compute
  **/
      @JsonProperty(JSON_PROPERTY_COMPUTE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public FormulaAndFunctionEventQueryDefinitionCompute getCompute() {
        return compute;
      }
  public void setCompute(FormulaAndFunctionEventQueryDefinitionCompute compute) {
    this.compute = compute;
  }
  public FormulaAndFunctionEventQueryDefinition crossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
    return this;
  }
  public FormulaAndFunctionEventQueryDefinition addCrossOrgUuidsItem(String crossOrgUuidsItem) {
    if (this.crossOrgUuids == null) {
      this.crossOrgUuids = new ArrayList<>();
    }
    this.crossOrgUuids.add(crossOrgUuidsItem);
    return this;
  }

  /**
   * <p>The source organization UUID for cross organization queries. Feature in Private Beta.</p>
   * @return crossOrgUuids
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CROSS_ORG_UUIDS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getCrossOrgUuids() {
        return crossOrgUuids;
      }
  public void setCrossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
  }
  public FormulaAndFunctionEventQueryDefinition dataSource(FormulaAndFunctionEventsDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * <p>Data source for event platform-based queries.</p>
   * @return dataSource
  **/
      @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public FormulaAndFunctionEventsDataSource getDataSource() {
        return dataSource;
      }
  public void setDataSource(FormulaAndFunctionEventsDataSource dataSource) {
    if (!dataSource.isValid()) {
        this.unparsed = true;
    }
    this.dataSource = dataSource;
  }
  public FormulaAndFunctionEventQueryDefinition groupBy(List<FormulaAndFunctionEventQueryGroupBy> groupBy) {
    this.groupBy = groupBy;
    for (FormulaAndFunctionEventQueryGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public FormulaAndFunctionEventQueryDefinition addGroupByItem(FormulaAndFunctionEventQueryGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * <p>Group by options.</p>
   * @return groupBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUP_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<FormulaAndFunctionEventQueryGroupBy> getGroupBy() {
        return groupBy;
      }
  public void setGroupBy(List<FormulaAndFunctionEventQueryGroupBy> groupBy) {
    this.groupBy = groupBy;
  }
  public FormulaAndFunctionEventQueryDefinition indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }
  public FormulaAndFunctionEventQueryDefinition addIndexesItem(String indexesItem) {
    if (this.indexes == null) {
      this.indexes = new ArrayList<>();
    }
    this.indexes.add(indexesItem);
    return this;
  }

  /**
   * <p>An array of index names to query in the stream. Omit or use <code>[]</code> to query all indexes at once.</p>
   * @return indexes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INDEXES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getIndexes() {
        return indexes;
      }
  public void setIndexes(List<String> indexes) {
    this.indexes = indexes;
  }
  public FormulaAndFunctionEventQueryDefinition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the query for use in formulas.</p>
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
  public FormulaAndFunctionEventQueryDefinition search(FormulaAndFunctionEventQueryDefinitionSearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * <p>Search options.</p>
   * @return search
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SEARCH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public FormulaAndFunctionEventQueryDefinitionSearch getSearch() {
        return search;
      }
  public void setSearch(FormulaAndFunctionEventQueryDefinitionSearch search) {
    this.search = search;
  }
  public FormulaAndFunctionEventQueryDefinition storage(String storage) {
    this.storage = storage;
    return this;
  }

  /**
   * <p>Option for storage location. Feature in Private Beta.</p>
   * @return storage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STORAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getStorage() {
        return storage;
      }
  public void setStorage(String storage) {
    this.storage = storage;
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
   * @return FormulaAndFunctionEventQueryDefinition
   */
  @JsonAnySetter
  public FormulaAndFunctionEventQueryDefinition putAdditionalProperty(String key, Object value) {
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
   * Return true if this FormulaAndFunctionEventQueryDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaAndFunctionEventQueryDefinition formulaAndFunctionEventQueryDefinition = (FormulaAndFunctionEventQueryDefinition) o;
    return Objects.equals(this.compute, formulaAndFunctionEventQueryDefinition.compute) && Objects.equals(this.crossOrgUuids, formulaAndFunctionEventQueryDefinition.crossOrgUuids) && Objects.equals(this.dataSource, formulaAndFunctionEventQueryDefinition.dataSource) && Objects.equals(this.groupBy, formulaAndFunctionEventQueryDefinition.groupBy) && Objects.equals(this.indexes, formulaAndFunctionEventQueryDefinition.indexes) && Objects.equals(this.name, formulaAndFunctionEventQueryDefinition.name) && Objects.equals(this.search, formulaAndFunctionEventQueryDefinition.search) && Objects.equals(this.storage, formulaAndFunctionEventQueryDefinition.storage) && Objects.equals(this.additionalProperties, formulaAndFunctionEventQueryDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(compute,crossOrgUuids,dataSource,groupBy,indexes,name,search,storage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaAndFunctionEventQueryDefinition {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    crossOrgUuids: ").append(toIndentedString(crossOrgUuids)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
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

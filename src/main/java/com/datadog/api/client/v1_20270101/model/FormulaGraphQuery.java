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
  FormulaGraphQuery.JSON_PROPERTY_COMPUTE,
  FormulaGraphQuery.JSON_PROPERTY_DATA_SOURCE,
  FormulaGraphQuery.JSON_PROPERTY_GROUP_BY,
  FormulaGraphQuery.JSON_PROPERTY_NAME,
  FormulaGraphQuery.JSON_PROPERTY_SEARCH,
  FormulaGraphQuery.JSON_PROPERTY_SEMANTIC_MODE,
  FormulaGraphQuery.JSON_PROPERTY_STORAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaGraphQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private FormulaGraphQueryCompute compute;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaGraphQueryDataSource dataSource;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<FormulaGraphQueryGroupByItems> groupBy = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private GraphQuerySearch search;

  public static final String JSON_PROPERTY_SEMANTIC_MODE = "semantic_mode";
  private FormulaSemanticMode semanticMode;

  public static final String JSON_PROPERTY_STORAGE = "storage";
  private StorageType storage;

  public FormulaGraphQuery() {}

  @JsonCreator
  public FormulaGraphQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPUTE)
          FormulaGraphQueryCompute compute,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          FormulaGraphQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEARCH) GraphQuerySearch search) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.name = name;
    this.search = search;
    this.unparsed |= search.unparsed;
  }

  public FormulaGraphQuery compute(FormulaGraphQueryCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return compute
   */
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormulaGraphQueryCompute getCompute() {
    return compute;
  }

  public void setCompute(FormulaGraphQueryCompute compute) {
    this.compute = compute;
    if (compute != null) {
      this.unparsed |= compute.unparsed;
    }
  }

  public FormulaGraphQuery dataSource(FormulaGraphQueryDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormulaGraphQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(FormulaGraphQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public FormulaGraphQuery groupBy(List<FormulaGraphQueryGroupByItems> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (FormulaGraphQueryGroupByItems item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public FormulaGraphQuery addGroupByItem(FormulaGraphQueryGroupByItems groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FormulaGraphQueryGroupByItems> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<FormulaGraphQueryGroupByItems> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (FormulaGraphQueryGroupByItems item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public FormulaGraphQuery name(String name) {
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

  public FormulaGraphQuery search(GraphQuerySearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return search
   */
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GraphQuerySearch getSearch() {
    return search;
  }

  public void setSearch(GraphQuerySearch search) {
    this.search = search;
    if (search != null) {
      this.unparsed |= search.unparsed;
    }
  }

  public FormulaGraphQuery semanticMode(FormulaSemanticMode semanticMode) {
    this.semanticMode = semanticMode;
    this.unparsed |= !semanticMode.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return semanticMode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEMANTIC_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FormulaSemanticMode getSemanticMode() {
    return semanticMode;
  }

  public void setSemanticMode(FormulaSemanticMode semanticMode) {
    if (!semanticMode.isValid()) {
      this.unparsed = true;
    }
    this.semanticMode = semanticMode;
  }

  public FormulaGraphQuery storage(StorageType storage) {
    this.storage = storage;
    this.unparsed |= !storage.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return storage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STORAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StorageType getStorage() {
    return storage;
  }

  public void setStorage(StorageType storage) {
    if (!storage.isValid()) {
      this.unparsed = true;
    }
    this.storage = storage;
  }

  /** Return true if this FormulaGraphQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaGraphQuery formulaGraphQuery = (FormulaGraphQuery) o;
    return Objects.equals(this.compute, formulaGraphQuery.compute)
        && Objects.equals(this.dataSource, formulaGraphQuery.dataSource)
        && Objects.equals(this.groupBy, formulaGraphQuery.groupBy)
        && Objects.equals(this.name, formulaGraphQuery.name)
        && Objects.equals(this.search, formulaGraphQuery.search)
        && Objects.equals(this.semanticMode, formulaGraphQuery.semanticMode)
        && Objects.equals(this.storage, formulaGraphQuery.storage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compute, dataSource, groupBy, name, search, semanticMode, storage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaGraphQuery {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    semanticMode: ").append(toIndentedString(semanticMode)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
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

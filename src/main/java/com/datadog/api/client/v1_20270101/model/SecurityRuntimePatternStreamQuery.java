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
  SecurityRuntimePatternStreamQuery.JSON_PROPERTY_CALCULATED_FIELDS,
  SecurityRuntimePatternStreamQuery.JSON_PROPERTY_CLUSTERING_PATTERN_FIELD_PATH,
  SecurityRuntimePatternStreamQuery.JSON_PROPERTY_CROSS_ORG_UUIDS,
  SecurityRuntimePatternStreamQuery.JSON_PROPERTY_DATA_SOURCE,
  SecurityRuntimePatternStreamQuery.JSON_PROPERTY_GROUP_BY,
  SecurityRuntimePatternStreamQuery.JSON_PROPERTY_INDEXES,
  SecurityRuntimePatternStreamQuery.JSON_PROPERTY_QUERY_STRING,
  SecurityRuntimePatternStreamQuery.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityRuntimePatternStreamQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CALCULATED_FIELDS = "calculated_fields";
  private List<EventsCalculatedField> calculatedFields = null;

  public static final String JSON_PROPERTY_CLUSTERING_PATTERN_FIELD_PATH =
      "clustering_pattern_field_path";
  private String clusteringPatternFieldPath;

  public static final String JSON_PROPERTY_CROSS_ORG_UUIDS = "cross_org_uuids";
  private List<String> crossOrgUuids = null;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private SecurityRuntimePatternStreamQueryDataSource dataSource;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<EventPatternGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private String queryString;

  public static final String JSON_PROPERTY_SORT = "sort";
  private SecurityRuntimePatternStreamQuery20270101Sort sort;

  public SecurityRuntimePatternStreamQuery() {}

  @JsonCreator
  public SecurityRuntimePatternStreamQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          SecurityRuntimePatternStreamQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_STRING) String queryString) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.queryString = queryString;
  }

  public SecurityRuntimePatternStreamQuery calculatedFields(
      List<EventsCalculatedField> calculatedFields) {
    this.calculatedFields = calculatedFields;
    if (calculatedFields != null) {
      for (EventsCalculatedField item : calculatedFields) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public SecurityRuntimePatternStreamQuery addCalculatedFieldsItem(
      EventsCalculatedField calculatedFieldsItem) {
    if (this.calculatedFields == null) {
      this.calculatedFields = new ArrayList<>();
    }
    this.calculatedFields.add(calculatedFieldsItem);
    this.unparsed |= calculatedFieldsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return calculatedFields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CALCULATED_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EventsCalculatedField> getCalculatedFields() {
    return calculatedFields;
  }

  public void setCalculatedFields(List<EventsCalculatedField> calculatedFields) {
    this.calculatedFields = calculatedFields;
    if (calculatedFields != null) {
      for (EventsCalculatedField item : calculatedFields) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SecurityRuntimePatternStreamQuery clusteringPatternFieldPath(
      String clusteringPatternFieldPath) {
    this.clusteringPatternFieldPath = clusteringPatternFieldPath;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return clusteringPatternFieldPath
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLUSTERING_PATTERN_FIELD_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClusteringPatternFieldPath() {
    return clusteringPatternFieldPath;
  }

  public void setClusteringPatternFieldPath(String clusteringPatternFieldPath) {
    this.clusteringPatternFieldPath = clusteringPatternFieldPath;
  }

  public SecurityRuntimePatternStreamQuery crossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
    return this;
  }

  public SecurityRuntimePatternStreamQuery addCrossOrgUuidsItem(String crossOrgUuidsItem) {
    if (this.crossOrgUuids == null) {
      this.crossOrgUuids = new ArrayList<>();
    }
    this.crossOrgUuids.add(crossOrgUuidsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return crossOrgUuids
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CROSS_ORG_UUIDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCrossOrgUuids() {
    return crossOrgUuids;
  }

  public void setCrossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
  }

  public SecurityRuntimePatternStreamQuery dataSource(
      SecurityRuntimePatternStreamQueryDataSource dataSource) {
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
  public SecurityRuntimePatternStreamQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(SecurityRuntimePatternStreamQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public SecurityRuntimePatternStreamQuery groupBy(List<EventPatternGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (EventPatternGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public SecurityRuntimePatternStreamQuery addGroupByItem(EventPatternGroupBy groupByItem) {
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
  public List<EventPatternGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<EventPatternGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (EventPatternGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SecurityRuntimePatternStreamQuery indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public SecurityRuntimePatternStreamQuery addIndexesItem(String indexesItem) {
    if (this.indexes == null) {
      this.indexes = new ArrayList<>();
    }
    this.indexes.add(indexesItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return indexes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getIndexes() {
    return indexes;
  }

  public void setIndexes(List<String> indexes) {
    this.indexes = indexes;
  }

  public SecurityRuntimePatternStreamQuery queryString(String queryString) {
    this.queryString = queryString;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return queryString
   */
  @JsonProperty(JSON_PROPERTY_QUERY_STRING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQueryString() {
    return queryString;
  }

  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }

  public SecurityRuntimePatternStreamQuery sort(
      SecurityRuntimePatternStreamQuery20270101Sort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityRuntimePatternStreamQuery20270101Sort getSort() {
    return sort;
  }

  public void setSort(SecurityRuntimePatternStreamQuery20270101Sort sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }

  /** Return true if this SecurityRuntimePatternStreamQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityRuntimePatternStreamQuery securityRuntimePatternStreamQuery =
        (SecurityRuntimePatternStreamQuery) o;
    return Objects.equals(this.calculatedFields, securityRuntimePatternStreamQuery.calculatedFields)
        && Objects.equals(
            this.clusteringPatternFieldPath,
            securityRuntimePatternStreamQuery.clusteringPatternFieldPath)
        && Objects.equals(this.crossOrgUuids, securityRuntimePatternStreamQuery.crossOrgUuids)
        && Objects.equals(this.dataSource, securityRuntimePatternStreamQuery.dataSource)
        && Objects.equals(this.groupBy, securityRuntimePatternStreamQuery.groupBy)
        && Objects.equals(this.indexes, securityRuntimePatternStreamQuery.indexes)
        && Objects.equals(this.queryString, securityRuntimePatternStreamQuery.queryString)
        && Objects.equals(this.sort, securityRuntimePatternStreamQuery.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        calculatedFields,
        clusteringPatternFieldPath,
        crossOrgUuids,
        dataSource,
        groupBy,
        indexes,
        queryString,
        sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityRuntimePatternStreamQuery {\n");
    sb.append("    calculatedFields: ").append(toIndentedString(calculatedFields)).append("\n");
    sb.append("    clusteringPatternFieldPath: ")
        .append(toIndentedString(clusteringPatternFieldPath))
        .append("\n");
    sb.append("    crossOrgUuids: ").append(toIndentedString(crossOrgUuids)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

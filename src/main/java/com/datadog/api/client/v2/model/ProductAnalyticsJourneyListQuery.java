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
   * <p>Query definition for a journey list request.</p>
 */
@JsonPropertyOrder({
  ProductAnalyticsJourneyListQuery.JSON_PROPERTY_COMPUTED_COLUMNS,
  ProductAnalyticsJourneyListQuery.JSON_PROPERTY_CONVERSION_TYPE,
  ProductAnalyticsJourneyListQuery.JSON_PROPERTY_ENTITY_COLUMNS,
  ProductAnalyticsJourneyListQuery.JSON_PROPERTY_ENTITY_FILTERS,
  ProductAnalyticsJourneyListQuery.JSON_PROPERTY_GROUP_BY,
  ProductAnalyticsJourneyListQuery.JSON_PROPERTY_LIMIT,
  ProductAnalyticsJourneyListQuery.JSON_PROPERTY_SEARCH,
  ProductAnalyticsJourneyListQuery.JSON_PROPERTY_SORT,
  ProductAnalyticsJourneyListQuery.JSON_PROPERTY_TARGET
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsJourneyListQuery {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTED_COLUMNS = "computed_columns";
  private List<ProductAnalyticsJourneyComputedColumn> computedColumns = null;

  public static final String JSON_PROPERTY_CONVERSION_TYPE = "conversion_type";
  private ProductAnalyticsJourneyConversionType conversionType;

  public static final String JSON_PROPERTY_ENTITY_COLUMNS = "entity_columns";
  private List<String> entityColumns = null;

  public static final String JSON_PROPERTY_ENTITY_FILTERS = "entity_filters";
  private String entityFilters;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<ProductAnalyticsGraphQueryGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private ProductAnalyticsJourneySearch search;

  public static final String JSON_PROPERTY_SORT = "sort";
  private ProductAnalyticsJourneyListSort sort;

  public static final String JSON_PROPERTY_TARGET = "target";
  private ProductAnalyticsJourneyTarget target;

  public ProductAnalyticsJourneyListQuery() {}

  @JsonCreator
  public ProductAnalyticsJourneyListQuery(
            @JsonProperty(required=true, value=JSON_PROPERTY_SEARCH)ProductAnalyticsJourneySearch search) {
        this.search = search;
        this.unparsed |= search.unparsed;
  }
  public ProductAnalyticsJourneyListQuery computedColumns(List<ProductAnalyticsJourneyComputedColumn> computedColumns) {
    this.computedColumns = computedColumns;
    if (computedColumns != null) {
    for (ProductAnalyticsJourneyComputedColumn item : computedColumns) {
      this.unparsed |= item.unparsed;
    }
    }
    return this;
  }
  public ProductAnalyticsJourneyListQuery addComputedColumnsItem(ProductAnalyticsJourneyComputedColumn computedColumnsItem) {
    if (this.computedColumns == null) {
      this.computedColumns = new ArrayList<>();
    }
    this.computedColumns.add(computedColumnsItem);
    this.unparsed |= computedColumnsItem.unparsed;
    return this;
  }

  /**
   * <p>Computed columns to add to each row.</p>
   * @return computedColumns
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COMPUTED_COLUMNS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ProductAnalyticsJourneyComputedColumn> getComputedColumns() {
        return computedColumns;
      }
  public void setComputedColumns(List<ProductAnalyticsJourneyComputedColumn> computedColumns) {
    this.computedColumns = computedColumns;
    if (computedColumns != null) {
      for (ProductAnalyticsJourneyComputedColumn item : computedColumns) {
        this.unparsed |= item.unparsed;
      }
    }
  }
  public ProductAnalyticsJourneyListQuery conversionType(ProductAnalyticsJourneyConversionType conversionType) {
    this.conversionType = conversionType;
    this.unparsed |= !conversionType.isValid();
    return this;
  }

  /**
   * <p>Whether to return the entities that converted at the target step, or those that dropped off.</p>
   * @return conversionType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONVERSION_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ProductAnalyticsJourneyConversionType getConversionType() {
        return conversionType;
      }
  public void setConversionType(ProductAnalyticsJourneyConversionType conversionType) {
    if (!conversionType.isValid()) {
        this.unparsed = true;
    }
    this.conversionType = conversionType;
  }
  public ProductAnalyticsJourneyListQuery entityColumns(List<String> entityColumns) {
    this.entityColumns = entityColumns;
    return this;
  }
  public ProductAnalyticsJourneyListQuery addEntityColumnsItem(String entityColumnsItem) {
    if (this.entityColumns == null) {
      this.entityColumns = new ArrayList<>();
    }
    this.entityColumns.add(entityColumnsItem);
    return this;
  }

  /**
   * <p>Attribute columns to return for each row, in addition to the identity join key and <code>timestamp</code>.</p>
   * @return entityColumns
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENTITY_COLUMNS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getEntityColumns() {
        return entityColumns;
      }
  public void setEntityColumns(List<String> entityColumns) {
    this.entityColumns = entityColumns;
  }
  public ProductAnalyticsJourneyListQuery entityFilters(String entityFilters) {
    this.entityFilters = entityFilters;
    return this;
  }

  /**
   * <p>Additional search query applied to the returned rows.</p>
   * @return entityFilters
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENTITY_FILTERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getEntityFilters() {
        return entityFilters;
      }
  public void setEntityFilters(String entityFilters) {
    this.entityFilters = entityFilters;
  }
  public ProductAnalyticsJourneyListQuery groupBy(List<ProductAnalyticsGraphQueryGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
    for (ProductAnalyticsGraphQueryGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    }
    return this;
  }
  public ProductAnalyticsJourneyListQuery addGroupByItem(ProductAnalyticsGraphQueryGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * <p>Segments the results by the values of one or more facets.</p>
   * @return groupBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUP_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ProductAnalyticsGraphQueryGroupBy> getGroupBy() {
        return groupBy;
      }
  public void setGroupBy(List<ProductAnalyticsGraphQueryGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (ProductAnalyticsGraphQueryGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
  }
  public ProductAnalyticsJourneyListQuery limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <p>Maximum number of rows to return. Omit it to let the service choose.</p>
   * minimum: 1
   * @return limit
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LIMIT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getLimit() {
        return limit;
      }
  public void setLimit(Long limit) {
    this.limit = limit;
  }
  public ProductAnalyticsJourneyListQuery search(ProductAnalyticsJourneySearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * <p>Defines the steps of the journey and the filters applied to it.</p>
   * @return search
  **/
      @JsonProperty(JSON_PROPERTY_SEARCH)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ProductAnalyticsJourneySearch getSearch() {
        return search;
      }
  public void setSearch(ProductAnalyticsJourneySearch search) {
    this.search = search;
    if (search != null) {
      this.unparsed |= search.unparsed;
    }
  }
  public ProductAnalyticsJourneyListQuery sort(ProductAnalyticsJourneyListSort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * <p>Sort configuration for the returned rows. The sort is applied only when <code>facet</code>
   * is one of the returned columns; otherwise it is ignored.</p>
   * @return sort
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SORT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ProductAnalyticsJourneyListSort getSort() {
        return sort;
      }
  public void setSort(ProductAnalyticsJourneyListSort sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }
  public ProductAnalyticsJourneyListQuery target(ProductAnalyticsJourneyTarget target) {
    this.target = target;
    this.unparsed |= target.unparsed;
    return this;
  }

  /**
   * <p>A reference to a step, or a range of steps, in the journey.
   * Use a <code>node</code> target to name a single step, or a <code>path</code> target to name the range
   * between two steps.</p>
   * @return target
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TARGET)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ProductAnalyticsJourneyTarget getTarget() {
        return target;
      }
  public void setTarget(ProductAnalyticsJourneyTarget target) {
    this.target = target;
    if (target != null) {
      this.unparsed |= target.unparsed;
    }
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
   * @return ProductAnalyticsJourneyListQuery
   */
  @JsonAnySetter
  public ProductAnalyticsJourneyListQuery putAdditionalProperty(String key, Object value) {
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
   * Return true if this ProductAnalyticsJourneyListQuery object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsJourneyListQuery productAnalyticsJourneyListQuery = (ProductAnalyticsJourneyListQuery) o;
    return Objects.equals(this.computedColumns, productAnalyticsJourneyListQuery.computedColumns) && Objects.equals(this.conversionType, productAnalyticsJourneyListQuery.conversionType) && Objects.equals(this.entityColumns, productAnalyticsJourneyListQuery.entityColumns) && Objects.equals(this.entityFilters, productAnalyticsJourneyListQuery.entityFilters) && Objects.equals(this.groupBy, productAnalyticsJourneyListQuery.groupBy) && Objects.equals(this.limit, productAnalyticsJourneyListQuery.limit) && Objects.equals(this.search, productAnalyticsJourneyListQuery.search) && Objects.equals(this.sort, productAnalyticsJourneyListQuery.sort) && Objects.equals(this.target, productAnalyticsJourneyListQuery.target) && Objects.equals(this.additionalProperties, productAnalyticsJourneyListQuery.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(computedColumns,conversionType,entityColumns,entityFilters,groupBy,limit,search,sort,target, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsJourneyListQuery {\n");
    sb.append("    computedColumns: ").append(toIndentedString(computedColumns)).append("\n");
    sb.append("    conversionType: ").append(toIndentedString(conversionType)).append("\n");
    sb.append("    entityColumns: ").append(toIndentedString(entityColumns)).append("\n");
    sb.append("    entityFilters: ").append(toIndentedString(entityFilters)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

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
   * <p>Splits retention results by the values of a facet.</p>
 */
@JsonPropertyOrder({
  ProductAnalyticsRetentionGroupBy.JSON_PROPERTY_FACET,
  ProductAnalyticsRetentionGroupBy.JSON_PROPERTY_LIMIT,
  ProductAnalyticsRetentionGroupBy.JSON_PROPERTY_SHOULD_EXCLUDE_MISSING,
  ProductAnalyticsRetentionGroupBy.JSON_PROPERTY_SORT,
  ProductAnalyticsRetentionGroupBy.JSON_PROPERTY_SOURCE,
  ProductAnalyticsRetentionGroupBy.JSON_PROPERTY_TARGET
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsRetentionGroupBy {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FACET = "facet";
  private String facet;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_SHOULD_EXCLUDE_MISSING = "should_exclude_missing";
  private Boolean shouldExcludeMissing = false;

  public static final String JSON_PROPERTY_SORT = "sort";
  private ProductAnalyticsGroupBySort sort;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_TARGET = "target";
  private ProductAnalyticsRetentionGroupByTarget target;

  public ProductAnalyticsRetentionGroupBy() {}

  @JsonCreator
  public ProductAnalyticsRetentionGroupBy(
            @JsonProperty(required=true, value=JSON_PROPERTY_FACET)String facet,
            @JsonProperty(required=true, value=JSON_PROPERTY_TARGET)ProductAnalyticsRetentionGroupByTarget target) {
        this.facet = facet;
        this.target = target;
        this.unparsed |= !target.isValid();
  }
  public ProductAnalyticsRetentionGroupBy facet(String facet) {
    this.facet = facet;
    return this;
  }

  /**
   * <p>The attribute path to group by.</p>
   * @return facet
  **/
      @JsonProperty(JSON_PROPERTY_FACET)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getFacet() {
        return facet;
      }
  public void setFacet(String facet) {
    this.facet = facet;
  }
  public ProductAnalyticsRetentionGroupBy limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <p>Maximum number of groups to return. Omit it to let the service choose.</p>
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
  public ProductAnalyticsRetentionGroupBy shouldExcludeMissing(Boolean shouldExcludeMissing) {
    this.shouldExcludeMissing = shouldExcludeMissing;
    return this;
  }

  /**
   * <p>Whether to drop entities that have no value for the facet.</p>
   * @return shouldExcludeMissing
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SHOULD_EXCLUDE_MISSING)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getShouldExcludeMissing() {
        return shouldExcludeMissing;
      }
  public void setShouldExcludeMissing(Boolean shouldExcludeMissing) {
    this.shouldExcludeMissing = shouldExcludeMissing;
  }
  public ProductAnalyticsRetentionGroupBy sort(ProductAnalyticsGroupBySort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * <p>Sort configuration for group-by results.</p>
   * @return sort
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SORT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ProductAnalyticsGroupBySort getSort() {
        return sort;
      }
  public void setSort(ProductAnalyticsGroupBySort sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }
  public ProductAnalyticsRetentionGroupBy source(String source) {
    this.source = source;
    return this;
  }

  /**
   * <p>Audience source backing the group-by, when grouping by an audience rather than a facet.</p>
   * @return source
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSource() {
        return source;
      }
  public void setSource(String source) {
    this.source = source;
  }
  public ProductAnalyticsRetentionGroupBy target(ProductAnalyticsRetentionGroupByTarget target) {
    this.target = target;
    this.unparsed |= !target.isValid();
    return this;
  }

  /**
   * <p>Which axis of the retention grid a group-by applies to.</p>
   * @return target
  **/
      @JsonProperty(JSON_PROPERTY_TARGET)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ProductAnalyticsRetentionGroupByTarget getTarget() {
        return target;
      }
  public void setTarget(ProductAnalyticsRetentionGroupByTarget target) {
    if (!target.isValid()) {
        this.unparsed = true;
    }
    this.target = target;
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
   * @return ProductAnalyticsRetentionGroupBy
   */
  @JsonAnySetter
  public ProductAnalyticsRetentionGroupBy putAdditionalProperty(String key, Object value) {
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
   * Return true if this ProductAnalyticsRetentionGroupBy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsRetentionGroupBy productAnalyticsRetentionGroupBy = (ProductAnalyticsRetentionGroupBy) o;
    return Objects.equals(this.facet, productAnalyticsRetentionGroupBy.facet) && Objects.equals(this.limit, productAnalyticsRetentionGroupBy.limit) && Objects.equals(this.shouldExcludeMissing, productAnalyticsRetentionGroupBy.shouldExcludeMissing) && Objects.equals(this.sort, productAnalyticsRetentionGroupBy.sort) && Objects.equals(this.source, productAnalyticsRetentionGroupBy.source) && Objects.equals(this.target, productAnalyticsRetentionGroupBy.target) && Objects.equals(this.additionalProperties, productAnalyticsRetentionGroupBy.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(facet,limit,shouldExcludeMissing,sort,source,target, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsRetentionGroupBy {\n");
    sb.append("    facet: ").append(toIndentedString(facet)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    shouldExcludeMissing: ").append(toIndentedString(shouldExcludeMissing)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

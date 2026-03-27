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
   * <p>The object containing document metadata.</p>
 */
@JsonPropertyOrder({
  MonthlyCostAttributionMeta.JSON_PROPERTY_AGGREGATES,
  MonthlyCostAttributionMeta.JSON_PROPERTY_PAGINATION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonthlyCostAttributionMeta {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATES = "aggregates";
  private List<CostAttributionAggregatesBody> aggregates = null;

  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private MonthlyCostAttributionPagination pagination;

  public MonthlyCostAttributionMeta aggregates(List<CostAttributionAggregatesBody> aggregates) {
    this.aggregates = aggregates;
    for (CostAttributionAggregatesBody item : aggregates) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public MonthlyCostAttributionMeta addAggregatesItem(CostAttributionAggregatesBody aggregatesItem) {
    if (this.aggregates == null) {
      this.aggregates = new ArrayList<>();
    }
    this.aggregates.add(aggregatesItem);
    this.unparsed |= aggregatesItem.unparsed;
    return this;
  }

  /**
   * <p>An array of available aggregates.</p>
   * @return aggregates
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AGGREGATES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<CostAttributionAggregatesBody> getAggregates() {
        return aggregates;
      }
  public void setAggregates(List<CostAttributionAggregatesBody> aggregates) {
    this.aggregates = aggregates;
  }
  public MonthlyCostAttributionMeta pagination(MonthlyCostAttributionPagination pagination) {
    this.pagination = pagination;
    this.unparsed |= pagination.unparsed;
    return this;
  }

  /**
   * <p>The metadata for the current pagination.</p>
   * @return pagination
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PAGINATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public MonthlyCostAttributionPagination getPagination() {
        return pagination;
      }
  public void setPagination(MonthlyCostAttributionPagination pagination) {
    this.pagination = pagination;
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
   * @return MonthlyCostAttributionMeta
   */
  @JsonAnySetter
  public MonthlyCostAttributionMeta putAdditionalProperty(String key, Object value) {
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
   * Return true if this MonthlyCostAttributionMeta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonthlyCostAttributionMeta monthlyCostAttributionMeta = (MonthlyCostAttributionMeta) o;
    return Objects.equals(this.aggregates, monthlyCostAttributionMeta.aggregates) && Objects.equals(this.pagination, monthlyCostAttributionMeta.pagination) && Objects.equals(this.additionalProperties, monthlyCostAttributionMeta.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(aggregates,pagination, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonthlyCostAttributionMeta {\n");
    sb.append("    aggregates: ").append(toIndentedString(aggregates)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

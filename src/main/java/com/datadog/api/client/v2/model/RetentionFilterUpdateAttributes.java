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
   * <p>The object describing the configuration of the retention filter to create/update.</p>
 */
@JsonPropertyOrder({
  RetentionFilterUpdateAttributes.JSON_PROPERTY_ENABLED,
  RetentionFilterUpdateAttributes.JSON_PROPERTY_FILTER,
  RetentionFilterUpdateAttributes.JSON_PROPERTY_FILTER_TYPE,
  RetentionFilterUpdateAttributes.JSON_PROPERTY_NAME,
  RetentionFilterUpdateAttributes.JSON_PROPERTY_RATE,
  RetentionFilterUpdateAttributes.JSON_PROPERTY_TRACE_RATE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RetentionFilterUpdateAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private SpansFilterCreate filter;

  public static final String JSON_PROPERTY_FILTER_TYPE = "filter_type";
  private RetentionFilterAllType filterType = RetentionFilterAllType.SPANS_SAMPLING_PROCESSOR;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RATE = "rate";
  private Double rate;

  public static final String JSON_PROPERTY_TRACE_RATE = "trace_rate";
  private Double traceRate;

  public RetentionFilterUpdateAttributes() {}

  @JsonCreator
  public RetentionFilterUpdateAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_ENABLED)Boolean enabled,
            @JsonProperty(required=true, value=JSON_PROPERTY_FILTER)SpansFilterCreate filter,
            @JsonProperty(required=true, value=JSON_PROPERTY_FILTER_TYPE)RetentionFilterAllType filterType,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_RATE)Double rate) {
        this.enabled = enabled;
        this.filter = filter;
        this.unparsed |= filter.unparsed;
        this.filterType = filterType;
        this.unparsed |= !filterType.isValid();
        this.name = name;
        this.rate = rate;
  }
  public RetentionFilterUpdateAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>Enable/Disable the retention filter.</p>
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
  public RetentionFilterUpdateAttributes filter(SpansFilterCreate filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * <p>The spans filter. Spans matching this filter will be indexed and stored.</p>
   * @return filter
  **/
      @JsonProperty(JSON_PROPERTY_FILTER)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SpansFilterCreate getFilter() {
        return filter;
      }
  public void setFilter(SpansFilterCreate filter) {
    this.filter = filter;
  }
  public RetentionFilterUpdateAttributes filterType(RetentionFilterAllType filterType) {
    this.filterType = filterType;
    this.unparsed |= !filterType.isValid();
    return this;
  }

  /**
   * <p>The type of retention filter.</p>
   * @return filterType
  **/
      @JsonProperty(JSON_PROPERTY_FILTER_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public RetentionFilterAllType getFilterType() {
        return filterType;
      }
  public void setFilterType(RetentionFilterAllType filterType) {
    if (!filterType.isValid()) {
        this.unparsed = true;
    }
    this.filterType = filterType;
  }
  public RetentionFilterUpdateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the retention filter.</p>
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
  public RetentionFilterUpdateAttributes rate(Double rate) {
    this.rate = rate;
    return this;
  }

  /**
   * <p>Sample rate to apply to spans going through this retention filter.
   * A value of 1.0 keeps all spans matching the query.</p>
   * @return rate
  **/
      @JsonProperty(JSON_PROPERTY_RATE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Double getRate() {
        return rate;
      }
  public void setRate(Double rate) {
    this.rate = rate;
  }
  public RetentionFilterUpdateAttributes traceRate(Double traceRate) {
    this.traceRate = traceRate;
    return this;
  }

  /**
   * <p>Sample rate to apply to traces containing spans going through this retention filter.
   * A value of 1.0 keeps all traces with spans matching the query.</p>
   * @return traceRate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TRACE_RATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getTraceRate() {
        return traceRate;
      }
  public void setTraceRate(Double traceRate) {
    this.traceRate = traceRate;
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
   * @return RetentionFilterUpdateAttributes
   */
  @JsonAnySetter
  public RetentionFilterUpdateAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this RetentionFilterUpdateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionFilterUpdateAttributes retentionFilterUpdateAttributes = (RetentionFilterUpdateAttributes) o;
    return Objects.equals(this.enabled, retentionFilterUpdateAttributes.enabled) && Objects.equals(this.filter, retentionFilterUpdateAttributes.filter) && Objects.equals(this.filterType, retentionFilterUpdateAttributes.filterType) && Objects.equals(this.name, retentionFilterUpdateAttributes.name) && Objects.equals(this.rate, retentionFilterUpdateAttributes.rate) && Objects.equals(this.traceRate, retentionFilterUpdateAttributes.traceRate) && Objects.equals(this.additionalProperties, retentionFilterUpdateAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(enabled,filter,filterType,name,rate,traceRate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionFilterUpdateAttributes {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    traceRate: ").append(toIndentedString(traceRate)).append("\n");
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

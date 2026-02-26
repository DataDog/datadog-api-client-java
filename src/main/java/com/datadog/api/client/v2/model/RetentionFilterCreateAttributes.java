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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The object describing the configuration of the retention filter to create/update. */
@JsonPropertyOrder({
  RetentionFilterCreateAttributes.JSON_PROPERTY_ENABLED,
  RetentionFilterCreateAttributes.JSON_PROPERTY_FILTER,
  RetentionFilterCreateAttributes.JSON_PROPERTY_FILTER_TYPE,
  RetentionFilterCreateAttributes.JSON_PROPERTY_NAME,
  RetentionFilterCreateAttributes.JSON_PROPERTY_RATE,
  RetentionFilterCreateAttributes.JSON_PROPERTY_TRACE_RATE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RetentionFilterCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private SpansFilterCreate filter;

  public static final String JSON_PROPERTY_FILTER_TYPE = "filter_type";
  private RetentionFilterType filterType = RetentionFilterType.SPANS_SAMPLING_PROCESSOR;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RATE = "rate";
  private Double rate;

  public static final String JSON_PROPERTY_TRACE_RATE = "trace_rate";
  private Double traceRate;

  public RetentionFilterCreateAttributes() {}

  @JsonCreator
  public RetentionFilterCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_FILTER) SpansFilterCreate filter,
      @JsonProperty(required = true, value = JSON_PROPERTY_FILTER_TYPE)
          RetentionFilterType filterType,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_RATE) Double rate) {
    this.enabled = enabled;
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    this.filterType = filterType;
    this.unparsed |= !filterType.isValid();
    this.name = name;
    this.rate = rate;
  }

  public RetentionFilterCreateAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Enable/Disable the retention filter.
   *
   * @return enabled
   */
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public RetentionFilterCreateAttributes filter(SpansFilterCreate filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * The spans filter. Spans matching this filter will be indexed and stored.
   *
   * @return filter
   */
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SpansFilterCreate getFilter() {
    return filter;
  }

  public void setFilter(SpansFilterCreate filter) {
    this.filter = filter;
  }

  public RetentionFilterCreateAttributes filterType(RetentionFilterType filterType) {
    this.filterType = filterType;
    this.unparsed |= !filterType.isValid();
    return this;
  }

  /**
   * The type of retention filter. The value should always be spans-sampling-processor.
   *
   * @return filterType
   */
  @JsonProperty(JSON_PROPERTY_FILTER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RetentionFilterType getFilterType() {
    return filterType;
  }

  public void setFilterType(RetentionFilterType filterType) {
    if (!filterType.isValid()) {
      this.unparsed = true;
    }
    this.filterType = filterType;
  }

  public RetentionFilterCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the retention filter.
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

  public RetentionFilterCreateAttributes rate(Double rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Sample rate to apply to spans going through this retention filter. A value of 1.0 keeps all
   * spans matching the query.
   *
   * @return rate
   */
  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }

  public RetentionFilterCreateAttributes traceRate(Double traceRate) {
    this.traceRate = traceRate;
    return this;
  }

  /**
   * Sample rate to apply to traces containing spans going through this retention filter. A value of
   * 1.0 keeps all traces with spans matching the query.
   *
   * @return traceRate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTraceRate() {
    return traceRate;
  }

  public void setTraceRate(Double traceRate) {
    this.traceRate = traceRate;
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
   * @return RetentionFilterCreateAttributes
   */
  @JsonAnySetter
  public RetentionFilterCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RetentionFilterCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionFilterCreateAttributes retentionFilterCreateAttributes =
        (RetentionFilterCreateAttributes) o;
    return Objects.equals(this.enabled, retentionFilterCreateAttributes.enabled)
        && Objects.equals(this.filter, retentionFilterCreateAttributes.filter)
        && Objects.equals(this.filterType, retentionFilterCreateAttributes.filterType)
        && Objects.equals(this.name, retentionFilterCreateAttributes.name)
        && Objects.equals(this.rate, retentionFilterCreateAttributes.rate)
        && Objects.equals(this.traceRate, retentionFilterCreateAttributes.traceRate)
        && Objects.equals(
            this.additionalProperties, retentionFilterCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, filter, filterType, name, rate, traceRate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionFilterCreateAttributes {\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The attributes of the retention filter. */
@JsonPropertyOrder({
  RetentionFilterAttributes.JSON_PROPERTY_CREATED_AT,
  RetentionFilterAttributes.JSON_PROPERTY_CREATED_BY,
  RetentionFilterAttributes.JSON_PROPERTY_EDITABLE,
  RetentionFilterAttributes.JSON_PROPERTY_ENABLED,
  RetentionFilterAttributes.JSON_PROPERTY_EXECUTION_ORDER,
  RetentionFilterAttributes.JSON_PROPERTY_FILTER,
  RetentionFilterAttributes.JSON_PROPERTY_FILTER_TYPE,
  RetentionFilterAttributes.JSON_PROPERTY_MODIFIED_AT,
  RetentionFilterAttributes.JSON_PROPERTY_MODIFIED_BY,
  RetentionFilterAttributes.JSON_PROPERTY_NAME,
  RetentionFilterAttributes.JSON_PROPERTY_RATE,
  RetentionFilterAttributes.JSON_PROPERTY_TRACE_RATE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RetentionFilterAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_EDITABLE = "editable";
  private Boolean editable;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_EXECUTION_ORDER = "execution_order";
  private Long executionOrder;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private SpansFilter filter;

  public static final String JSON_PROPERTY_FILTER_TYPE = "filter_type";
  private RetentionFilterType filterType = RetentionFilterType.SPANS_SAMPLING_PROCESSOR;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private Long modifiedAt;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modified_by";
  private String modifiedBy;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RATE = "rate";
  private Double rate;

  public static final String JSON_PROPERTY_TRACE_RATE = "trace_rate";
  private Double traceRate;

  public RetentionFilterAttributes createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The creation timestamp of the retention filter.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public RetentionFilterAttributes createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The creator of the retention filter.
   *
   * @return createdBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public RetentionFilterAttributes editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

  /**
   * Shows whether the filter can be edited.
   *
   * @return editable
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EDITABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  public RetentionFilterAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * The status of the retention filter (Enabled/Disabled).
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public RetentionFilterAttributes executionOrder(Long executionOrder) {
    this.executionOrder = executionOrder;
    return this;
  }

  /**
   * The execution order of the retention filter.
   *
   * @return executionOrder
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXECUTION_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExecutionOrder() {
    return executionOrder;
  }

  public void setExecutionOrder(Long executionOrder) {
    this.executionOrder = executionOrder;
  }

  public RetentionFilterAttributes filter(SpansFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * The spans filter used to index spans.
   *
   * @return filter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SpansFilter getFilter() {
    return filter;
  }

  public void setFilter(SpansFilter filter) {
    this.filter = filter;
  }

  public RetentionFilterAttributes filterType(RetentionFilterType filterType) {
    this.filterType = filterType;
    this.unparsed |= !filterType.isValid();
    return this;
  }

  /**
   * The type of retention filter. The value should always be spans-sampling-processor.
   *
   * @return filterType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RetentionFilterType getFilterType() {
    return filterType;
  }

  public void setFilterType(RetentionFilterType filterType) {
    if (!filterType.isValid()) {
      this.unparsed = true;
    }
    this.filterType = filterType;
  }

  public RetentionFilterAttributes modifiedAt(Long modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The modification timestamp of the retention filter.
   *
   * @return modifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(Long modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public RetentionFilterAttributes modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * The modifier of the retention filter.
   *
   * @return modifiedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public RetentionFilterAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the retention filter.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RetentionFilterAttributes rate(Double rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Sample rate to apply to spans going through this retention filter. A value of 1.0 keeps all
   * spans matching the query.
   *
   * @return rate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }

  public RetentionFilterAttributes traceRate(Double traceRate) {
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
   * @return RetentionFilterAttributes
   */
  @JsonAnySetter
  public RetentionFilterAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RetentionFilterAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionFilterAttributes retentionFilterAttributes = (RetentionFilterAttributes) o;
    return Objects.equals(this.createdAt, retentionFilterAttributes.createdAt)
        && Objects.equals(this.createdBy, retentionFilterAttributes.createdBy)
        && Objects.equals(this.editable, retentionFilterAttributes.editable)
        && Objects.equals(this.enabled, retentionFilterAttributes.enabled)
        && Objects.equals(this.executionOrder, retentionFilterAttributes.executionOrder)
        && Objects.equals(this.filter, retentionFilterAttributes.filter)
        && Objects.equals(this.filterType, retentionFilterAttributes.filterType)
        && Objects.equals(this.modifiedAt, retentionFilterAttributes.modifiedAt)
        && Objects.equals(this.modifiedBy, retentionFilterAttributes.modifiedBy)
        && Objects.equals(this.name, retentionFilterAttributes.name)
        && Objects.equals(this.rate, retentionFilterAttributes.rate)
        && Objects.equals(this.traceRate, retentionFilterAttributes.traceRate)
        && Objects.equals(
            this.additionalProperties, retentionFilterAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        createdBy,
        editable,
        enabled,
        executionOrder,
        filter,
        filterType,
        modifiedAt,
        modifiedBy,
        name,
        rate,
        traceRate,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionFilterAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    executionOrder: ").append(toIndentedString(executionOrder)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
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

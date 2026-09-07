/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The object containing the aggregates. */
@JsonPropertyOrder({
  UsageAttributionAggregatesBody.JSON_PROPERTY_AGG_TYPE,
  UsageAttributionAggregatesBody.JSON_PROPERTY_FIELD,
  UsageAttributionAggregatesBody.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageAttributionAggregatesBody {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGG_TYPE = "agg_type";
  private String aggType;

  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public UsageAttributionAggregatesBody aggType(String aggType) {
    this.aggType = aggType;
    return this;
  }

  /**
   * The aggregate type.
   *
   * @return aggType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGG_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAggType() {
    return aggType;
  }

  public void setAggType(String aggType) {
    this.aggType = aggType;
  }

  public UsageAttributionAggregatesBody field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The field.
   *
   * @return field
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public UsageAttributionAggregatesBody value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * The value for a given field.
   *
   * @return value
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
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
   * @return UsageAttributionAggregatesBody
   */
  @JsonAnySetter
  public UsageAttributionAggregatesBody putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UsageAttributionAggregatesBody object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageAttributionAggregatesBody usageAttributionAggregatesBody =
        (UsageAttributionAggregatesBody) o;
    return Objects.equals(this.aggType, usageAttributionAggregatesBody.aggType)
        && Objects.equals(this.field, usageAttributionAggregatesBody.field)
        && Objects.equals(this.value, usageAttributionAggregatesBody.value)
        && Objects.equals(
            this.additionalProperties, usageAttributionAggregatesBody.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggType, field, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageAttributionAggregatesBody {\n");
    sb.append("    aggType: ").append(toIndentedString(aggType)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

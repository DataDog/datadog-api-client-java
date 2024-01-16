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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** List of active billing dimensions. */
@JsonPropertyOrder({
  ActiveBillingDimensionsAttributes.JSON_PROPERTY_MONTH,
  ActiveBillingDimensionsAttributes.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ActiveBillingDimensionsAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MONTH = "month";
  private OffsetDateTime month;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<String> values = null;

  public ActiveBillingDimensionsAttributes month(OffsetDateTime month) {
    this.month = month;
    return this;
  }

  /**
   * Datetime in ISO-8601 format, UTC, precise to hour: <code>[YYYY-MM-DDThh]</code>.
   *
   * @return month
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getMonth() {
    return month;
  }

  public void setMonth(OffsetDateTime month) {
    this.month = month;
  }

  public ActiveBillingDimensionsAttributes values(List<String> values) {
    this.values = values;
    return this;
  }

  public ActiveBillingDimensionsAttributes addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * List of active billing dimensions. Example: <code>[infra_host, apm_host, serverless_infra]
   * </code>.
   *
   * @return values
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
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
   * @return ActiveBillingDimensionsAttributes
   */
  @JsonAnySetter
  public ActiveBillingDimensionsAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ActiveBillingDimensionsAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActiveBillingDimensionsAttributes activeBillingDimensionsAttributes =
        (ActiveBillingDimensionsAttributes) o;
    return Objects.equals(this.month, activeBillingDimensionsAttributes.month)
        && Objects.equals(this.values, activeBillingDimensionsAttributes.values)
        && Objects.equals(
            this.additionalProperties, activeBillingDimensionsAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(month, values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActiveBillingDimensionsAttributes {\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

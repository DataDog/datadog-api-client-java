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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** One dimension rule in a template budget selector. */
@JsonPropertyOrder({
  AiGatewayBudgetSelectorEntry.JSON_PROPERTY_DIM,
  AiGatewayBudgetSelectorEntry.JSON_PROPERTY_PER_VALUE,
  AiGatewayBudgetSelectorEntry.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayBudgetSelectorEntry {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DIM = "dim";
  private String dim;

  public static final String JSON_PROPERTY_PER_VALUE = "per_value";
  private Boolean perValue = false;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<String> values = null;

  public AiGatewayBudgetSelectorEntry() {}

  @JsonCreator
  public AiGatewayBudgetSelectorEntry(
      @JsonProperty(required = true, value = JSON_PROPERTY_DIM) String dim,
      @JsonProperty(required = true, value = JSON_PROPERTY_PER_VALUE) Boolean perValue) {
    this.dim = dim;
    this.perValue = perValue;
  }

  public AiGatewayBudgetSelectorEntry dim(String dim) {
    this.dim = dim;
    return this;
  }

  /**
   * Dimension to match: user_id, team_id, model, provider, or tag:<key>. Reserved metadata tag keys
   * are rejected.
   *
   * @return dim
   */
  @JsonProperty(JSON_PROPERTY_DIM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDim() {
    return dim;
  }

  public void setDim(String dim) {
    this.dim = dim;
  }

  public AiGatewayBudgetSelectorEntry perValue(Boolean perValue) {
    this.perValue = perValue;
    return this;
  }

  /**
   * Separate counters by the matched value when true. Otherwise, pool spend within the other
   * separated dimensions.
   *
   * @return perValue
   */
  @JsonProperty(JSON_PROPERTY_PER_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getPerValue() {
    return perValue;
  }

  public void setPerValue(Boolean perValue) {
    this.perValue = perValue;
  }

  public AiGatewayBudgetSelectorEntry values(List<String> values) {
    this.values = values;
    return this;
  }

  public AiGatewayBudgetSelectorEntry addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Allowed dimension values. Omit to match any value, including an absent dimension. An explicit
   * list must contain at least one value.
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
   * @return AiGatewayBudgetSelectorEntry
   */
  @JsonAnySetter
  public AiGatewayBudgetSelectorEntry putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayBudgetSelectorEntry object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayBudgetSelectorEntry aiGatewayBudgetSelectorEntry = (AiGatewayBudgetSelectorEntry) o;
    return Objects.equals(this.dim, aiGatewayBudgetSelectorEntry.dim)
        && Objects.equals(this.perValue, aiGatewayBudgetSelectorEntry.perValue)
        && Objects.equals(this.values, aiGatewayBudgetSelectorEntry.values)
        && Objects.equals(
            this.additionalProperties, aiGatewayBudgetSelectorEntry.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dim, perValue, values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayBudgetSelectorEntry {\n");
    sb.append("    dim: ").append(toIndentedString(dim)).append("\n");
    sb.append("    perValue: ").append(toIndentedString(perValue)).append("\n");
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

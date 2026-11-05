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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/** Values of one budget split dimension. */
@JsonPropertyOrder({
  AiGatewayBudgetInstanceDimensionAttributes.JSON_PROPERTY_BUDGET_ID,
  AiGatewayBudgetInstanceDimensionAttributes.JSON_PROPERTY_DIM,
  AiGatewayBudgetInstanceDimensionAttributes.JSON_PROPERTY_RESTRICTED_DETAILS,
  AiGatewayBudgetInstanceDimensionAttributes.JSON_PROPERTY_TRUNCATED,
  AiGatewayBudgetInstanceDimensionAttributes.JSON_PROPERTY_VALUES,
  AiGatewayBudgetInstanceDimensionAttributes.JSON_PROPERTY_WINDOW_START
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayBudgetInstanceDimensionAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUDGET_ID = "budget_id";
  private UUID budgetId;

  public static final String JSON_PROPERTY_DIM = "dim";
  private String dim;

  public static final String JSON_PROPERTY_RESTRICTED_DETAILS = "restricted_details";
  private Boolean restrictedDetails;

  public static final String JSON_PROPERTY_TRUNCATED = "truncated";
  private Boolean truncated;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<AiGatewayBudgetInstanceDimensionValue> values = new ArrayList<>();

  public static final String JSON_PROPERTY_WINDOW_START = "window_start";
  private OffsetDateTime windowStart;

  public AiGatewayBudgetInstanceDimensionAttributes() {}

  @JsonCreator
  public AiGatewayBudgetInstanceDimensionAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_BUDGET_ID) UUID budgetId,
      @JsonProperty(required = true, value = JSON_PROPERTY_DIM) String dim,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESTRICTED_DETAILS)
          Boolean restrictedDetails,
      @JsonProperty(required = true, value = JSON_PROPERTY_TRUNCATED) Boolean truncated,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUES)
          List<AiGatewayBudgetInstanceDimensionValue> values,
      @JsonProperty(required = true, value = JSON_PROPERTY_WINDOW_START)
          OffsetDateTime windowStart) {
    this.budgetId = budgetId;
    this.dim = dim;
    this.restrictedDetails = restrictedDetails;
    this.truncated = truncated;
    this.values = values;
    for (AiGatewayBudgetInstanceDimensionValue item : values) {
      this.unparsed |= item.unparsed;
    }
    this.windowStart = windowStart;
  }

  public AiGatewayBudgetInstanceDimensionAttributes budgetId(UUID budgetId) {
    this.budgetId = budgetId;
    return this;
  }

  /**
   * Budget identifier.
   *
   * @return budgetId
   */
  @JsonProperty(JSON_PROPERTY_BUDGET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getBudgetId() {
    return budgetId;
  }

  public void setBudgetId(UUID budgetId) {
    this.budgetId = budgetId;
  }

  public AiGatewayBudgetInstanceDimensionAttributes dim(String dim) {
    this.dim = dim;
    return this;
  }

  /**
   * Split dimension name, as used in <code>split_dims</code> and the <code>split_dim</code> filter.
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

  public AiGatewayBudgetInstanceDimensionAttributes restrictedDetails(Boolean restrictedDetails) {
    this.restrictedDetails = restrictedDetails;
    return this;
  }

  /**
   * Whether identifying instance details were withheld. Aggregate totals still include restricted
   * instances.
   *
   * @return restrictedDetails
   */
  @JsonProperty(JSON_PROPERTY_RESTRICTED_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getRestrictedDetails() {
    return restrictedDetails;
  }

  public void setRestrictedDetails(Boolean restrictedDetails) {
    this.restrictedDetails = restrictedDetails;
  }

  public AiGatewayBudgetInstanceDimensionAttributes truncated(Boolean truncated) {
    this.truncated = truncated;
    return this;
  }

  /**
   * Whether more values matched than were returned. Narrow the results with <code>query</code> or
   * <code>value</code> to see them.
   *
   * @return truncated
   */
  @JsonProperty(JSON_PROPERTY_TRUNCATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getTruncated() {
    return truncated;
  }

  public void setTruncated(Boolean truncated) {
    this.truncated = truncated;
  }

  public AiGatewayBudgetInstanceDimensionAttributes values(
      List<AiGatewayBudgetInstanceDimensionValue> values) {
    this.values = values;
    for (AiGatewayBudgetInstanceDimensionValue item : values) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AiGatewayBudgetInstanceDimensionAttributes addValuesItem(
      AiGatewayBudgetInstanceDimensionValue valuesItem) {
    this.values.add(valuesItem);
    this.unparsed |= valuesItem.unparsed;
    return this;
  }

  /**
   * Values of this dimension across matching instance counters, highest spend first and at most
   * <code>limit</code> of them. Values are counted under every <code>split_dim</code> filter except
   * the one for this dimension.
   *
   * @return values
   */
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AiGatewayBudgetInstanceDimensionValue> getValues() {
    return values;
  }

  public void setValues(List<AiGatewayBudgetInstanceDimensionValue> values) {
    this.values = values;
    if (values != null) {
      for (AiGatewayBudgetInstanceDimensionValue item : values) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AiGatewayBudgetInstanceDimensionAttributes windowStart(OffsetDateTime windowStart) {
    this.windowStart = windowStart;
    return this;
  }

  /**
   * Start of the accounting window.
   *
   * @return windowStart
   */
  @JsonProperty(JSON_PROPERTY_WINDOW_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getWindowStart() {
    return windowStart;
  }

  public void setWindowStart(OffsetDateTime windowStart) {
    this.windowStart = windowStart;
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
   * @return AiGatewayBudgetInstanceDimensionAttributes
   */
  @JsonAnySetter
  public AiGatewayBudgetInstanceDimensionAttributes putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this AiGatewayBudgetInstanceDimensionAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayBudgetInstanceDimensionAttributes aiGatewayBudgetInstanceDimensionAttributes =
        (AiGatewayBudgetInstanceDimensionAttributes) o;
    return Objects.equals(this.budgetId, aiGatewayBudgetInstanceDimensionAttributes.budgetId)
        && Objects.equals(this.dim, aiGatewayBudgetInstanceDimensionAttributes.dim)
        && Objects.equals(
            this.restrictedDetails, aiGatewayBudgetInstanceDimensionAttributes.restrictedDetails)
        && Objects.equals(this.truncated, aiGatewayBudgetInstanceDimensionAttributes.truncated)
        && Objects.equals(this.values, aiGatewayBudgetInstanceDimensionAttributes.values)
        && Objects.equals(this.windowStart, aiGatewayBudgetInstanceDimensionAttributes.windowStart)
        && Objects.equals(
            this.additionalProperties,
            aiGatewayBudgetInstanceDimensionAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        budgetId, dim, restrictedDetails, truncated, values, windowStart, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayBudgetInstanceDimensionAttributes {\n");
    sb.append("    budgetId: ").append(toIndentedString(budgetId)).append("\n");
    sb.append("    dim: ").append(toIndentedString(dim)).append("\n");
    sb.append("    restrictedDetails: ").append(toIndentedString(restrictedDetails)).append("\n");
    sb.append("    truncated: ").append(toIndentedString(truncated)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    windowStart: ").append(toIndentedString(windowStart)).append("\n");
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

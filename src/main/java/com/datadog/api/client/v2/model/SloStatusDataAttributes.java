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
   * <p>The attributes of the SLO status.</p>
 */
@JsonPropertyOrder({
  SloStatusDataAttributes.JSON_PROPERTY_ERROR_BUDGET_REMAINING,
  SloStatusDataAttributes.JSON_PROPERTY_RAW_ERROR_BUDGET_REMAINING,
  SloStatusDataAttributes.JSON_PROPERTY_SLI,
  SloStatusDataAttributes.JSON_PROPERTY_SPAN_PRECISION,
  SloStatusDataAttributes.JSON_PROPERTY_STATE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SloStatusDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERROR_BUDGET_REMAINING = "error_budget_remaining";
  private Double errorBudgetRemaining;

  public static final String JSON_PROPERTY_RAW_ERROR_BUDGET_REMAINING = "raw_error_budget_remaining";
  private RawErrorBudgetRemaining rawErrorBudgetRemaining;

  public static final String JSON_PROPERTY_SLI = "sli";
  private Double sli;

  public static final String JSON_PROPERTY_SPAN_PRECISION = "span_precision";
  private Long spanPrecision;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public SloStatusDataAttributes() {}

  @JsonCreator
  public SloStatusDataAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_ERROR_BUDGET_REMAINING)Double errorBudgetRemaining,
            @JsonProperty(required=true, value=JSON_PROPERTY_RAW_ERROR_BUDGET_REMAINING)RawErrorBudgetRemaining rawErrorBudgetRemaining,
            @JsonProperty(required=true, value=JSON_PROPERTY_SLI)Double sli,
            @JsonProperty(required=true, value=JSON_PROPERTY_SPAN_PRECISION)Long spanPrecision,
            @JsonProperty(required=true, value=JSON_PROPERTY_STATE)String state) {
        this.errorBudgetRemaining = errorBudgetRemaining;
        this.rawErrorBudgetRemaining = rawErrorBudgetRemaining;
        this.unparsed |= rawErrorBudgetRemaining.unparsed;
        this.sli = sli;
        this.spanPrecision = spanPrecision;
        this.state = state;
  }
  public SloStatusDataAttributes errorBudgetRemaining(Double errorBudgetRemaining) {
    this.errorBudgetRemaining = errorBudgetRemaining;
    return this;
  }

  /**
   * <p>The percentage of error budget remaining.</p>
   * @return errorBudgetRemaining
  **/
      @JsonProperty(JSON_PROPERTY_ERROR_BUDGET_REMAINING)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Double getErrorBudgetRemaining() {
        return errorBudgetRemaining;
      }
  public void setErrorBudgetRemaining(Double errorBudgetRemaining) {
    this.errorBudgetRemaining = errorBudgetRemaining;
  }
  public SloStatusDataAttributes rawErrorBudgetRemaining(RawErrorBudgetRemaining rawErrorBudgetRemaining) {
    this.rawErrorBudgetRemaining = rawErrorBudgetRemaining;
    this.unparsed |= rawErrorBudgetRemaining.unparsed;
    return this;
  }

  /**
   * <p>The raw error budget remaining for the SLO.</p>
   * @return rawErrorBudgetRemaining
  **/
      @JsonProperty(JSON_PROPERTY_RAW_ERROR_BUDGET_REMAINING)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public RawErrorBudgetRemaining getRawErrorBudgetRemaining() {
        return rawErrorBudgetRemaining;
      }
  public void setRawErrorBudgetRemaining(RawErrorBudgetRemaining rawErrorBudgetRemaining) {
    this.rawErrorBudgetRemaining = rawErrorBudgetRemaining;
  }
  public SloStatusDataAttributes sli(Double sli) {
    this.sli = sli;
    return this;
  }

  /**
   * <p>The current Service Level Indicator (SLI) value as a percentage.</p>
   * @return sli
  **/
      @JsonProperty(JSON_PROPERTY_SLI)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Double getSli() {
        return sli;
      }
  public void setSli(Double sli) {
    this.sli = sli;
  }
  public SloStatusDataAttributes spanPrecision(Long spanPrecision) {
    this.spanPrecision = spanPrecision;
    return this;
  }

  /**
   * <p>The precision of the time span in seconds.</p>
   * @return spanPrecision
  **/
      @JsonProperty(JSON_PROPERTY_SPAN_PRECISION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getSpanPrecision() {
        return spanPrecision;
      }
  public void setSpanPrecision(Long spanPrecision) {
    this.spanPrecision = spanPrecision;
  }
  public SloStatusDataAttributes state(String state) {
    this.state = state;
    return this;
  }

  /**
   * <p>The current state of the SLO (for example, <code>breached</code>, <code>warning</code>, <code>ok</code>).</p>
   * @return state
  **/
      @JsonProperty(JSON_PROPERTY_STATE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getState() {
        return state;
      }
  public void setState(String state) {
    this.state = state;
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
   * @return SloStatusDataAttributes
   */
  @JsonAnySetter
  public SloStatusDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this SloStatusDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SloStatusDataAttributes sloStatusDataAttributes = (SloStatusDataAttributes) o;
    return Objects.equals(this.errorBudgetRemaining, sloStatusDataAttributes.errorBudgetRemaining) && Objects.equals(this.rawErrorBudgetRemaining, sloStatusDataAttributes.rawErrorBudgetRemaining) && Objects.equals(this.sli, sloStatusDataAttributes.sli) && Objects.equals(this.spanPrecision, sloStatusDataAttributes.spanPrecision) && Objects.equals(this.state, sloStatusDataAttributes.state) && Objects.equals(this.additionalProperties, sloStatusDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(errorBudgetRemaining,rawErrorBudgetRemaining,sli,spanPrecision,state, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SloStatusDataAttributes {\n");
    sb.append("    errorBudgetRemaining: ").append(toIndentedString(errorBudgetRemaining)).append("\n");
    sb.append("    rawErrorBudgetRemaining: ").append(toIndentedString(rawErrorBudgetRemaining)).append("\n");
    sb.append("    sli: ").append(toIndentedString(sli)).append("\n");
    sb.append("    spanPrecision: ").append(toIndentedString(spanPrecision)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

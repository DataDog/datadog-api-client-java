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
import org.openapitools.jackson.nullable.JsonNullable;

/** Aggregated cost data for the budget over the requested period. */
@JsonPropertyOrder({
  BudgetAttributesCosts.JSON_PROPERTY_ACTUAL,
  BudgetAttributesCosts.JSON_PROPERTY_AMOUNT,
  BudgetAttributesCosts.JSON_PROPERTY_FORECAST,
  BudgetAttributesCosts.JSON_PROPERTY_OOTB_FORECAST
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BudgetAttributesCosts {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTUAL = "actual";
  private JsonNullable<Double> actual = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private JsonNullable<Double> amount = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_FORECAST = "forecast";
  private JsonNullable<Double> forecast = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_OOTB_FORECAST = "ootb_forecast";
  private JsonNullable<Double> ootbForecast = JsonNullable.<Double>undefined();

  public BudgetAttributesCosts actual(Double actual) {
    this.actual = JsonNullable.<Double>of(actual);
    return this;
  }

  /**
   * The total actual cost. Present only when <code>actual=true</code> is requested.
   *
   * @return actual
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getActual() {
    return actual.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACTUAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getActual_JsonNullable() {
    return actual;
  }

  @JsonProperty(JSON_PROPERTY_ACTUAL)
  public void setActual_JsonNullable(JsonNullable<Double> actual) {
    this.actual = actual;
  }

  public void setActual(Double actual) {
    this.actual = JsonNullable.<Double>of(actual);
  }

  public BudgetAttributesCosts amount(Double amount) {
    this.amount = JsonNullable.<Double>of(amount);
    return this;
  }

  /**
   * The total budgeted amount over the requested period.
   *
   * @return amount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getAmount() {
    return amount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getAmount_JsonNullable() {
    return amount;
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT)
  public void setAmount_JsonNullable(JsonNullable<Double> amount) {
    this.amount = amount;
  }

  public void setAmount(Double amount) {
    this.amount = JsonNullable.<Double>of(amount);
  }

  public BudgetAttributesCosts forecast(Double forecast) {
    this.forecast = JsonNullable.<Double>of(forecast);
    return this;
  }

  /**
   * The total forecast cost, with any custom forecast overrides applied. Present only when <code>
   * forecast=true</code> is requested.
   *
   * @return forecast
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getForecast() {
    return forecast.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FORECAST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getForecast_JsonNullable() {
    return forecast;
  }

  @JsonProperty(JSON_PROPERTY_FORECAST)
  public void setForecast_JsonNullable(JsonNullable<Double> forecast) {
    this.forecast = forecast;
  }

  public void setForecast(Double forecast) {
    this.forecast = JsonNullable.<Double>of(forecast);
  }

  public BudgetAttributesCosts ootbForecast(Double ootbForecast) {
    this.ootbForecast = JsonNullable.<Double>of(ootbForecast);
    return this;
  }

  /**
   * The out-of-the-box ML forecast before custom overrides. Present only when <code>forecast=true
   * </code> is requested.
   *
   * @return ootbForecast
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getOotbForecast() {
    return ootbForecast.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OOTB_FORECAST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getOotbForecast_JsonNullable() {
    return ootbForecast;
  }

  @JsonProperty(JSON_PROPERTY_OOTB_FORECAST)
  public void setOotbForecast_JsonNullable(JsonNullable<Double> ootbForecast) {
    this.ootbForecast = ootbForecast;
  }

  public void setOotbForecast(Double ootbForecast) {
    this.ootbForecast = JsonNullable.<Double>of(ootbForecast);
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
   * @return BudgetAttributesCosts
   */
  @JsonAnySetter
  public BudgetAttributesCosts putAdditionalProperty(String key, Object value) {
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

  /** Return true if this BudgetAttributesCosts object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetAttributesCosts budgetAttributesCosts = (BudgetAttributesCosts) o;
    return Objects.equals(this.actual, budgetAttributesCosts.actual)
        && Objects.equals(this.amount, budgetAttributesCosts.amount)
        && Objects.equals(this.forecast, budgetAttributesCosts.forecast)
        && Objects.equals(this.ootbForecast, budgetAttributesCosts.ootbForecast)
        && Objects.equals(this.additionalProperties, budgetAttributesCosts.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actual, amount, forecast, ootbForecast, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetAttributesCosts {\n");
    sb.append("    actual: ").append(toIndentedString(actual)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    forecast: ").append(toIndentedString(forecast)).append("\n");
    sb.append("    ootbForecast: ").append(toIndentedString(ootbForecast)).append("\n");
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

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

/** Cost data for a single budget entry. */
@JsonPropertyOrder({
  BudgetWithEntriesDataAttributesEntriesItemsCosts.JSON_PROPERTY_ACTUAL,
  BudgetWithEntriesDataAttributesEntriesItemsCosts.JSON_PROPERTY_AMOUNT,
  BudgetWithEntriesDataAttributesEntriesItemsCosts.JSON_PROPERTY_CUSTOM_FORECAST,
  BudgetWithEntriesDataAttributesEntriesItemsCosts.JSON_PROPERTY_FORECAST,
  BudgetWithEntriesDataAttributesEntriesItemsCosts.JSON_PROPERTY_OOTB_FORECAST
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BudgetWithEntriesDataAttributesEntriesItemsCosts {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTUAL = "actual";
  private JsonNullable<Double> actual = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private JsonNullable<Double> amount = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CUSTOM_FORECAST = "custom_forecast";
  private JsonNullable<Double> customForecast = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_FORECAST = "forecast";
  private JsonNullable<Double> forecast = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_OOTB_FORECAST = "ootb_forecast";
  private JsonNullable<Double> ootbForecast = JsonNullable.<Double>undefined();

  public BudgetWithEntriesDataAttributesEntriesItemsCosts actual(Double actual) {
    this.actual = JsonNullable.<Double>of(actual);
    return this;
  }

  /**
   * The actual cost for this entry. Present only when <code>actual=true</code> is requested.
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

  public BudgetWithEntriesDataAttributesEntriesItemsCosts amount(Double amount) {
    this.amount = JsonNullable.<Double>of(amount);
    return this;
  }

  /**
   * The budgeted amount for this entry.
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

  public BudgetWithEntriesDataAttributesEntriesItemsCosts customForecast(Double customForecast) {
    this.customForecast = JsonNullable.<Double>of(customForecast);
    return this;
  }

  /**
   * The custom forecast override for this entry. <code>null</code> when <code>forecast=true</code>
   * is requested but no custom forecast has been set for this entry's month. A numeric value,
   * including <code>0</code>, indicates an explicit custom forecast override. Omitted when <code>
   * forecast=false</code> or the feature is not available for the organization.
   *
   * @return customForecast
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getCustomForecast() {
    return customForecast.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_FORECAST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getCustomForecast_JsonNullable() {
    return customForecast;
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_FORECAST)
  public void setCustomForecast_JsonNullable(JsonNullable<Double> customForecast) {
    this.customForecast = customForecast;
  }

  public void setCustomForecast(Double customForecast) {
    this.customForecast = JsonNullable.<Double>of(customForecast);
  }

  public BudgetWithEntriesDataAttributesEntriesItemsCosts forecast(Double forecast) {
    this.forecast = JsonNullable.<Double>of(forecast);
    return this;
  }

  /**
   * The final forecast for this entry, with any custom forecast override applied. Present only when
   * <code>forecast=true</code> is requested.
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

  public BudgetWithEntriesDataAttributesEntriesItemsCosts ootbForecast(Double ootbForecast) {
    this.ootbForecast = JsonNullable.<Double>of(ootbForecast);
    return this;
  }

  /**
   * The out-of-the-box ML forecast for this entry, before custom overrides. Present only when
   * <code>forecast=true</code> is requested.
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
   * @return BudgetWithEntriesDataAttributesEntriesItemsCosts
   */
  @JsonAnySetter
  public BudgetWithEntriesDataAttributesEntriesItemsCosts putAdditionalProperty(
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

  /** Return true if this BudgetWithEntriesDataAttributesEntriesItemsCosts object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetWithEntriesDataAttributesEntriesItemsCosts
        budgetWithEntriesDataAttributesEntriesItemsCosts =
            (BudgetWithEntriesDataAttributesEntriesItemsCosts) o;
    return Objects.equals(this.actual, budgetWithEntriesDataAttributesEntriesItemsCosts.actual)
        && Objects.equals(this.amount, budgetWithEntriesDataAttributesEntriesItemsCosts.amount)
        && Objects.equals(
            this.customForecast, budgetWithEntriesDataAttributesEntriesItemsCosts.customForecast)
        && Objects.equals(this.forecast, budgetWithEntriesDataAttributesEntriesItemsCosts.forecast)
        && Objects.equals(
            this.ootbForecast, budgetWithEntriesDataAttributesEntriesItemsCosts.ootbForecast)
        && Objects.equals(
            this.additionalProperties,
            budgetWithEntriesDataAttributesEntriesItemsCosts.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actual, amount, customForecast, forecast, ootbForecast, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetWithEntriesDataAttributesEntriesItemsCosts {\n");
    sb.append("    actual: ").append(toIndentedString(actual)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    customForecast: ").append(toIndentedString(customForecast)).append("\n");
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

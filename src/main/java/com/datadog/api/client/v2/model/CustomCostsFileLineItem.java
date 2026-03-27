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
   * <p>Line item details from a Custom Costs file.</p>
 */
@JsonPropertyOrder({
  CustomCostsFileLineItem.JSON_PROPERTY_BILLED_COST,
  CustomCostsFileLineItem.JSON_PROPERTY_BILLING_CURRENCY,
  CustomCostsFileLineItem.JSON_PROPERTY_CHARGE_DESCRIPTION,
  CustomCostsFileLineItem.JSON_PROPERTY_CHARGE_PERIOD_END,
  CustomCostsFileLineItem.JSON_PROPERTY_CHARGE_PERIOD_START,
  CustomCostsFileLineItem.JSON_PROPERTY_PROVIDER_NAME,
  CustomCostsFileLineItem.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomCostsFileLineItem {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BILLED_COST = "BilledCost";
  private Double billedCost;

  public static final String JSON_PROPERTY_BILLING_CURRENCY = "BillingCurrency";
  private String billingCurrency;

  public static final String JSON_PROPERTY_CHARGE_DESCRIPTION = "ChargeDescription";
  private String chargeDescription;

  public static final String JSON_PROPERTY_CHARGE_PERIOD_END = "ChargePeriodEnd";
  private String chargePeriodEnd;

  public static final String JSON_PROPERTY_CHARGE_PERIOD_START = "ChargePeriodStart";
  private String chargePeriodStart;

  public static final String JSON_PROPERTY_PROVIDER_NAME = "ProviderName";
  private String providerName;

  public static final String JSON_PROPERTY_TAGS = "Tags";
  private Map<String, String> tags = null;

  public CustomCostsFileLineItem billedCost(Double billedCost) {
    this.billedCost = billedCost;
    return this;
  }

  /**
   * <p>Total cost in the cost file.</p>
   * @return billedCost
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BILLED_COST)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getBilledCost() {
        return billedCost;
      }
  public void setBilledCost(Double billedCost) {
    this.billedCost = billedCost;
  }
  public CustomCostsFileLineItem billingCurrency(String billingCurrency) {
    this.billingCurrency = billingCurrency;
    return this;
  }

  /**
   * <p>Currency used in the Custom Costs file.</p>
   * @return billingCurrency
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BILLING_CURRENCY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getBillingCurrency() {
        return billingCurrency;
      }
  public void setBillingCurrency(String billingCurrency) {
    this.billingCurrency = billingCurrency;
  }
  public CustomCostsFileLineItem chargeDescription(String chargeDescription) {
    this.chargeDescription = chargeDescription;
    return this;
  }

  /**
   * <p>Description for the line item cost.</p>
   * @return chargeDescription
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CHARGE_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getChargeDescription() {
        return chargeDescription;
      }
  public void setChargeDescription(String chargeDescription) {
    this.chargeDescription = chargeDescription;
  }
  public CustomCostsFileLineItem chargePeriodEnd(String chargePeriodEnd) {
    this.chargePeriodEnd = chargePeriodEnd;
    return this;
  }

  /**
   * <p>End date of the usage charge.</p>
   * @return chargePeriodEnd
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CHARGE_PERIOD_END)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getChargePeriodEnd() {
        return chargePeriodEnd;
      }
  public void setChargePeriodEnd(String chargePeriodEnd) {
    this.chargePeriodEnd = chargePeriodEnd;
  }
  public CustomCostsFileLineItem chargePeriodStart(String chargePeriodStart) {
    this.chargePeriodStart = chargePeriodStart;
    return this;
  }

  /**
   * <p>Start date of the usage charge.</p>
   * @return chargePeriodStart
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CHARGE_PERIOD_START)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getChargePeriodStart() {
        return chargePeriodStart;
      }
  public void setChargePeriodStart(String chargePeriodStart) {
    this.chargePeriodStart = chargePeriodStart;
  }
  public CustomCostsFileLineItem providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

  /**
   * <p>Name of the provider for the line item.</p>
   * @return providerName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PROVIDER_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getProviderName() {
        return providerName;
      }
  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }
  public CustomCostsFileLineItem tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }
  public CustomCostsFileLineItem putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * <p>Additional tags for the line item.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, String> getTags() {
        return tags;
      }
  public void setTags(Map<String, String> tags) {
    this.tags = tags;
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
   * @return CustomCostsFileLineItem
   */
  @JsonAnySetter
  public CustomCostsFileLineItem putAdditionalProperty(String key, Object value) {
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
   * Return true if this CustomCostsFileLineItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomCostsFileLineItem customCostsFileLineItem = (CustomCostsFileLineItem) o;
    return Objects.equals(this.billedCost, customCostsFileLineItem.billedCost) && Objects.equals(this.billingCurrency, customCostsFileLineItem.billingCurrency) && Objects.equals(this.chargeDescription, customCostsFileLineItem.chargeDescription) && Objects.equals(this.chargePeriodEnd, customCostsFileLineItem.chargePeriodEnd) && Objects.equals(this.chargePeriodStart, customCostsFileLineItem.chargePeriodStart) && Objects.equals(this.providerName, customCostsFileLineItem.providerName) && Objects.equals(this.tags, customCostsFileLineItem.tags) && Objects.equals(this.additionalProperties, customCostsFileLineItem.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(billedCost,billingCurrency,chargeDescription,chargePeriodEnd,chargePeriodStart,providerName,tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomCostsFileLineItem {\n");
    sb.append("    billedCost: ").append(toIndentedString(billedCost)).append("\n");
    sb.append("    billingCurrency: ").append(toIndentedString(billingCurrency)).append("\n");
    sb.append("    chargeDescription: ").append(toIndentedString(chargeDescription)).append("\n");
    sb.append("    chargePeriodEnd: ").append(toIndentedString(chargePeriodEnd)).append("\n");
    sb.append("    chargePeriodStart: ").append(toIndentedString(chargePeriodStart)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

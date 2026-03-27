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
   * <p>The definition of <code>ArbitraryCostUpsertRequestDataAttributes</code> object.</p>
 */
@JsonPropertyOrder({
  ArbitraryCostUpsertRequestDataAttributes.JSON_PROPERTY_COSTS_TO_ALLOCATE,
  ArbitraryCostUpsertRequestDataAttributes.JSON_PROPERTY_ENABLED,
  ArbitraryCostUpsertRequestDataAttributes.JSON_PROPERTY_ORDER_ID,
  ArbitraryCostUpsertRequestDataAttributes.JSON_PROPERTY_PROVIDER,
  ArbitraryCostUpsertRequestDataAttributes.JSON_PROPERTY_REJECTED,
  ArbitraryCostUpsertRequestDataAttributes.JSON_PROPERTY_RULE_NAME,
  ArbitraryCostUpsertRequestDataAttributes.JSON_PROPERTY_STRATEGY,
  ArbitraryCostUpsertRequestDataAttributes.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ArbitraryCostUpsertRequestDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COSTS_TO_ALLOCATE = "costs_to_allocate";
  private List<ArbitraryCostUpsertRequestDataAttributesCostsToAllocateItems> costsToAllocate = new ArrayList<>();

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ORDER_ID = "order_id";
  private Long orderId;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private List<String> provider = new ArrayList<>();

  public static final String JSON_PROPERTY_REJECTED = "rejected";
  private Boolean rejected;

  public static final String JSON_PROPERTY_RULE_NAME = "rule_name";
  private String ruleName;

  public static final String JSON_PROPERTY_STRATEGY = "strategy";
  private ArbitraryCostUpsertRequestDataAttributesStrategy strategy;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public ArbitraryCostUpsertRequestDataAttributes() {}

  @JsonCreator
  public ArbitraryCostUpsertRequestDataAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_COSTS_TO_ALLOCATE)List<ArbitraryCostUpsertRequestDataAttributesCostsToAllocateItems> costsToAllocate,
            @JsonProperty(required=true, value=JSON_PROPERTY_PROVIDER)List<String> provider,
            @JsonProperty(required=true, value=JSON_PROPERTY_RULE_NAME)String ruleName,
            @JsonProperty(required=true, value=JSON_PROPERTY_STRATEGY)ArbitraryCostUpsertRequestDataAttributesStrategy strategy,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)String type) {
        this.costsToAllocate = costsToAllocate;
        this.provider = provider;
        this.ruleName = ruleName;
        this.strategy = strategy;
        this.unparsed |= strategy.unparsed;
        this.type = type;
  }
  public ArbitraryCostUpsertRequestDataAttributes costsToAllocate(List<ArbitraryCostUpsertRequestDataAttributesCostsToAllocateItems> costsToAllocate) {
    this.costsToAllocate = costsToAllocate;
    for (ArbitraryCostUpsertRequestDataAttributesCostsToAllocateItems item : costsToAllocate) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ArbitraryCostUpsertRequestDataAttributes addCostsToAllocateItem(ArbitraryCostUpsertRequestDataAttributesCostsToAllocateItems costsToAllocateItem) {
    this.costsToAllocate.add(costsToAllocateItem);
    this.unparsed |= costsToAllocateItem.unparsed;
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>costs_to_allocate</code>.</p>
   * @return costsToAllocate
  **/
      @JsonProperty(JSON_PROPERTY_COSTS_TO_ALLOCATE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<ArbitraryCostUpsertRequestDataAttributesCostsToAllocateItems> getCostsToAllocate() {
        return costsToAllocate;
      }
  public void setCostsToAllocate(List<ArbitraryCostUpsertRequestDataAttributesCostsToAllocateItems> costsToAllocate) {
    this.costsToAllocate = costsToAllocate;
  }
  public ArbitraryCostUpsertRequestDataAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>enabled</code>.</p>
   * @return enabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getEnabled() {
        return enabled;
      }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }
  public ArbitraryCostUpsertRequestDataAttributes orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>order_id</code>.</p>
   * @return orderId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ORDER_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getOrderId() {
        return orderId;
      }
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }
  public ArbitraryCostUpsertRequestDataAttributes provider(List<String> provider) {
    this.provider = provider;
    return this;
  }
  public ArbitraryCostUpsertRequestDataAttributes addProviderItem(String providerItem) {
    this.provider.add(providerItem);
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>provider</code>.</p>
   * @return provider
  **/
      @JsonProperty(JSON_PROPERTY_PROVIDER)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getProvider() {
        return provider;
      }
  public void setProvider(List<String> provider) {
    this.provider = provider;
  }
  public ArbitraryCostUpsertRequestDataAttributes rejected(Boolean rejected) {
    this.rejected = rejected;
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>rejected</code>.</p>
   * @return rejected
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REJECTED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getRejected() {
        return rejected;
      }
  public void setRejected(Boolean rejected) {
    this.rejected = rejected;
  }
  public ArbitraryCostUpsertRequestDataAttributes ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>rule_name</code>.</p>
   * @return ruleName
  **/
      @JsonProperty(JSON_PROPERTY_RULE_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getRuleName() {
        return ruleName;
      }
  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }
  public ArbitraryCostUpsertRequestDataAttributes strategy(ArbitraryCostUpsertRequestDataAttributesStrategy strategy) {
    this.strategy = strategy;
    this.unparsed |= strategy.unparsed;
    return this;
  }

  /**
   * <p>The definition of <code>ArbitraryCostUpsertRequestDataAttributesStrategy</code> object.</p>
   * @return strategy
  **/
      @JsonProperty(JSON_PROPERTY_STRATEGY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ArbitraryCostUpsertRequestDataAttributesStrategy getStrategy() {
        return strategy;
      }
  public void setStrategy(ArbitraryCostUpsertRequestDataAttributesStrategy strategy) {
    this.strategy = strategy;
  }
  public ArbitraryCostUpsertRequestDataAttributes type(String type) {
    this.type = type;
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>type</code>.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getType() {
        return type;
      }
  public void setType(String type) {
    this.type = type;
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
   * @return ArbitraryCostUpsertRequestDataAttributes
   */
  @JsonAnySetter
  public ArbitraryCostUpsertRequestDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this ArbitraryCostUpsertRequestDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArbitraryCostUpsertRequestDataAttributes arbitraryCostUpsertRequestDataAttributes = (ArbitraryCostUpsertRequestDataAttributes) o;
    return Objects.equals(this.costsToAllocate, arbitraryCostUpsertRequestDataAttributes.costsToAllocate) && Objects.equals(this.enabled, arbitraryCostUpsertRequestDataAttributes.enabled) && Objects.equals(this.orderId, arbitraryCostUpsertRequestDataAttributes.orderId) && Objects.equals(this.provider, arbitraryCostUpsertRequestDataAttributes.provider) && Objects.equals(this.rejected, arbitraryCostUpsertRequestDataAttributes.rejected) && Objects.equals(this.ruleName, arbitraryCostUpsertRequestDataAttributes.ruleName) && Objects.equals(this.strategy, arbitraryCostUpsertRequestDataAttributes.strategy) && Objects.equals(this.type, arbitraryCostUpsertRequestDataAttributes.type) && Objects.equals(this.additionalProperties, arbitraryCostUpsertRequestDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(costsToAllocate,enabled,orderId,provider,rejected,ruleName,strategy,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArbitraryCostUpsertRequestDataAttributes {\n");
    sb.append("    costsToAllocate: ").append(toIndentedString(costsToAllocate)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    rejected: ").append(toIndentedString(rejected)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

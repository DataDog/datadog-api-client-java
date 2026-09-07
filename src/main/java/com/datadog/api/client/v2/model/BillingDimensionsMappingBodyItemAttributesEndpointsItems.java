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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** An endpoint's keys mapped to the billing_dimension. */
@JsonPropertyOrder({
  BillingDimensionsMappingBodyItemAttributesEndpointsItems.JSON_PROPERTY_ID,
  BillingDimensionsMappingBodyItemAttributesEndpointsItems.JSON_PROPERTY_KEYS,
  BillingDimensionsMappingBodyItemAttributesEndpointsItems.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BillingDimensionsMappingBodyItemAttributesEndpointsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_KEYS = "keys";
  private List<String> keys = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private BillingDimensionsMappingBodyItemAttributesEndpointsItemsStatus status;

  public BillingDimensionsMappingBodyItemAttributesEndpointsItems id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The URL for the endpoint.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BillingDimensionsMappingBodyItemAttributesEndpointsItems keys(List<String> keys) {
    this.keys = keys;
    return this;
  }

  public BillingDimensionsMappingBodyItemAttributesEndpointsItems addKeysItem(String keysItem) {
    if (this.keys == null) {
      this.keys = new ArrayList<>();
    }
    this.keys.add(keysItem);
    return this;
  }

  /**
   * The billing dimension.
   *
   * @return keys
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getKeys() {
    return keys;
  }

  public void setKeys(List<String> keys) {
    this.keys = keys;
  }

  public BillingDimensionsMappingBodyItemAttributesEndpointsItems status(
      BillingDimensionsMappingBodyItemAttributesEndpointsItemsStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Denotes whether mapping keys were available for this endpoint.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BillingDimensionsMappingBodyItemAttributesEndpointsItemsStatus getStatus() {
    return status;
  }

  public void setStatus(BillingDimensionsMappingBodyItemAttributesEndpointsItemsStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
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
   * @return BillingDimensionsMappingBodyItemAttributesEndpointsItems
   */
  @JsonAnySetter
  public BillingDimensionsMappingBodyItemAttributesEndpointsItems putAdditionalProperty(
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

  /**
   * Return true if this BillingDimensionsMappingBodyItemAttributesEndpointsItems object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingDimensionsMappingBodyItemAttributesEndpointsItems
        billingDimensionsMappingBodyItemAttributesEndpointsItems =
            (BillingDimensionsMappingBodyItemAttributesEndpointsItems) o;
    return Objects.equals(this.id, billingDimensionsMappingBodyItemAttributesEndpointsItems.id)
        && Objects.equals(this.keys, billingDimensionsMappingBodyItemAttributesEndpointsItems.keys)
        && Objects.equals(
            this.status, billingDimensionsMappingBodyItemAttributesEndpointsItems.status)
        && Objects.equals(
            this.additionalProperties,
            billingDimensionsMappingBodyItemAttributesEndpointsItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, keys, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingDimensionsMappingBodyItemAttributesEndpointsItems {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

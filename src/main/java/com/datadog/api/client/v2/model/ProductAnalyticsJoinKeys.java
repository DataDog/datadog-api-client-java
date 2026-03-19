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

/** Join key configuration for correlating events. */
@JsonPropertyOrder({
  ProductAnalyticsJoinKeys.JSON_PROPERTY_PRIMARY,
  ProductAnalyticsJoinKeys.JSON_PROPERTY_SECONDARY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsJoinKeys {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PRIMARY = "primary";
  private String primary;

  public static final String JSON_PROPERTY_SECONDARY = "secondary";
  private List<String> secondary = null;

  public ProductAnalyticsJoinKeys primary(String primary) {
    this.primary = primary;
    return this;
  }

  /**
   * The primary join key facet.
   *
   * @return primary
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrimary() {
    return primary;
  }

  public void setPrimary(String primary) {
    this.primary = primary;
  }

  public ProductAnalyticsJoinKeys secondary(List<String> secondary) {
    this.secondary = secondary;
    return this;
  }

  public ProductAnalyticsJoinKeys addSecondaryItem(String secondaryItem) {
    if (this.secondary == null) {
      this.secondary = new ArrayList<>();
    }
    this.secondary.add(secondaryItem);
    return this;
  }

  /**
   * Secondary join key facets.
   *
   * @return secondary
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECONDARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getSecondary() {
    return secondary;
  }

  public void setSecondary(List<String> secondary) {
    this.secondary = secondary;
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
   * @return ProductAnalyticsJoinKeys
   */
  @JsonAnySetter
  public ProductAnalyticsJoinKeys putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsJoinKeys object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsJoinKeys productAnalyticsJoinKeys = (ProductAnalyticsJoinKeys) o;
    return Objects.equals(this.primary, productAnalyticsJoinKeys.primary)
        && Objects.equals(this.secondary, productAnalyticsJoinKeys.secondary)
        && Objects.equals(this.additionalProperties, productAnalyticsJoinKeys.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primary, secondary, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsJoinKeys {\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    secondary: ").append(toIndentedString(secondary)).append("\n");
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

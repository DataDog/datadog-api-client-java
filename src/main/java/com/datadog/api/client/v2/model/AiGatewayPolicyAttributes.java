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

/** Routing policy configuration. */
@JsonPropertyOrder({
  AiGatewayPolicyAttributes.JSON_PROPERTY_PRIORITY,
  AiGatewayPolicyAttributes.JSON_PROPERTY_TIERS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayPolicyAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private Long priority;

  public static final String JSON_PROPERTY_TIERS = "tiers";
  private List<AiGatewayPolicyTier> tiers = new ArrayList<>();

  public AiGatewayPolicyAttributes() {}

  @JsonCreator
  public AiGatewayPolicyAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_PRIORITY) Long priority,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIERS) List<AiGatewayPolicyTier> tiers) {
    this.priority = priority;
    this.tiers = tiers;
    for (AiGatewayPolicyTier item : tiers) {
      this.unparsed |= item.unparsed;
    }
  }

  public AiGatewayPolicyAttributes priority(Long priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Routing priority.
   *
   * @return priority
   */
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public AiGatewayPolicyAttributes tiers(List<AiGatewayPolicyTier> tiers) {
    this.tiers = tiers;
    for (AiGatewayPolicyTier item : tiers) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AiGatewayPolicyAttributes addTiersItem(AiGatewayPolicyTier tiersItem) {
    this.tiers.add(tiersItem);
    this.unparsed |= tiersItem.unparsed;
    return this;
  }

  /**
   * Gettiers
   *
   * @return tiers
   */
  @JsonProperty(JSON_PROPERTY_TIERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AiGatewayPolicyTier> getTiers() {
    return tiers;
  }

  public void setTiers(List<AiGatewayPolicyTier> tiers) {
    this.tiers = tiers;
    if (tiers != null) {
      for (AiGatewayPolicyTier item : tiers) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return AiGatewayPolicyAttributes
   */
  @JsonAnySetter
  public AiGatewayPolicyAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayPolicyAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayPolicyAttributes aiGatewayPolicyAttributes = (AiGatewayPolicyAttributes) o;
    return Objects.equals(this.priority, aiGatewayPolicyAttributes.priority)
        && Objects.equals(this.tiers, aiGatewayPolicyAttributes.tiers)
        && Objects.equals(
            this.additionalProperties, aiGatewayPolicyAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority, tiers, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayPolicyAttributes {\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    tiers: ").append(toIndentedString(tiers)).append("\n");
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

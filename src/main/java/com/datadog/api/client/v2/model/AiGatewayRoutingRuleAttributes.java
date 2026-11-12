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

/** Routing rule configuration and metadata. */
@JsonPropertyOrder({
  AiGatewayRoutingRuleAttributes.JSON_PROPERTY_CREATED_AT,
  AiGatewayRoutingRuleAttributes.JSON_PROPERTY_ROUTE_ID,
  AiGatewayRoutingRuleAttributes.JSON_PROPERTY_TIERS,
  AiGatewayRoutingRuleAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayRoutingRuleAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_ROUTE_ID = "route_id";
  private Long routeId;

  public static final String JSON_PROPERTY_TIERS = "tiers";
  private List<AiGatewayRoutingRuleTier> tiers = new ArrayList<>();

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public AiGatewayRoutingRuleAttributes() {}

  @JsonCreator
  public AiGatewayRoutingRuleAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_ROUTE_ID) Long routeId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIERS)
          List<AiGatewayRoutingRuleTier> tiers,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt) {
    this.createdAt = createdAt;
    this.routeId = routeId;
    this.tiers = tiers;
    for (AiGatewayRoutingRuleTier item : tiers) {
      this.unparsed |= item.unparsed;
    }
    this.updatedAt = updatedAt;
  }

  public AiGatewayRoutingRuleAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time when the resource was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public AiGatewayRoutingRuleAttributes routeId(Long routeId) {
    this.routeId = routeId;
    return this;
  }

  /**
   * Stable numeric route identifier used by scoped policies and <code>ai-gateway-route</code>
   * restriction policies.
   *
   * @return routeId
   */
  @JsonProperty(JSON_PROPERTY_ROUTE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getRouteId() {
    return routeId;
  }

  public void setRouteId(Long routeId) {
    this.routeId = routeId;
  }

  public AiGatewayRoutingRuleAttributes tiers(List<AiGatewayRoutingRuleTier> tiers) {
    this.tiers = tiers;
    for (AiGatewayRoutingRuleTier item : tiers) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AiGatewayRoutingRuleAttributes addTiersItem(AiGatewayRoutingRuleTier tiersItem) {
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
  public List<AiGatewayRoutingRuleTier> getTiers() {
    return tiers;
  }

  public void setTiers(List<AiGatewayRoutingRuleTier> tiers) {
    this.tiers = tiers;
    if (tiers != null) {
      for (AiGatewayRoutingRuleTier item : tiers) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AiGatewayRoutingRuleAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Time when the resource was last updated.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return AiGatewayRoutingRuleAttributes
   */
  @JsonAnySetter
  public AiGatewayRoutingRuleAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayRoutingRuleAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayRoutingRuleAttributes aiGatewayRoutingRuleAttributes =
        (AiGatewayRoutingRuleAttributes) o;
    return Objects.equals(this.createdAt, aiGatewayRoutingRuleAttributes.createdAt)
        && Objects.equals(this.routeId, aiGatewayRoutingRuleAttributes.routeId)
        && Objects.equals(this.tiers, aiGatewayRoutingRuleAttributes.tiers)
        && Objects.equals(this.updatedAt, aiGatewayRoutingRuleAttributes.updatedAt)
        && Objects.equals(
            this.additionalProperties, aiGatewayRoutingRuleAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, routeId, tiers, updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayRoutingRuleAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    tiers: ").append(toIndentedString(tiers)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

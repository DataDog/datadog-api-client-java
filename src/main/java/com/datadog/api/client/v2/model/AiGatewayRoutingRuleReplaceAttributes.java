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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Partial route update. Omit tiers to preserve the entire graph, including hidden selections. Saved
 * target IDs retain omitted settings. Replacing tiers must explicitly retain or remove every hidden
 * occurrence.
 */
@JsonPropertyOrder({
  AiGatewayRoutingRuleReplaceAttributes.JSON_PROPERTY_EXPECTED_UPDATED_AT,
  AiGatewayRoutingRuleReplaceAttributes.JSON_PROPERTY_REMOVED_TARGET_IDS,
  AiGatewayRoutingRuleReplaceAttributes.JSON_PROPERTY_TIERS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayRoutingRuleReplaceAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXPECTED_UPDATED_AT = "expected_updated_at";
  private OffsetDateTime expectedUpdatedAt;

  public static final String JSON_PROPERTY_REMOVED_TARGET_IDS = "removed_target_ids";
  private List<Long> removedTargetIds = null;

  public static final String JSON_PROPERTY_TIERS = "tiers";
  private List<AiGatewayRoutingRuleTierRequest> tiers = null;

  public AiGatewayRoutingRuleReplaceAttributes expectedUpdatedAt(OffsetDateTime expectedUpdatedAt) {
    this.expectedUpdatedAt = expectedUpdatedAt;
    return this;
  }

  /**
   * Saved route revision. A mismatched value returns 409 without changes.
   *
   * @return expectedUpdatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPECTED_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getExpectedUpdatedAt() {
    return expectedUpdatedAt;
  }

  public void setExpectedUpdatedAt(OffsetDateTime expectedUpdatedAt) {
    this.expectedUpdatedAt = expectedUpdatedAt;
  }

  public AiGatewayRoutingRuleReplaceAttributes removedTargetIds(List<Long> removedTargetIds) {
    this.removedTargetIds = removedTargetIds;
    return this;
  }

  public AiGatewayRoutingRuleReplaceAttributes addRemovedTargetIdsItem(Long removedTargetIdsItem) {
    if (this.removedTargetIds == null) {
      this.removedTargetIds = new ArrayList<>();
    }
    this.removedTargetIds.add(removedTargetIdsItem);
    return this;
  }

  /**
   * Parent-local saved occurrence IDs explicitly removed from the submitted tiers. IDs must be
   * distinct, belong to this route, and not also be retained.
   *
   * @return removedTargetIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMOVED_TARGET_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Long> getRemovedTargetIds() {
    return removedTargetIds;
  }

  public void setRemovedTargetIds(List<Long> removedTargetIds) {
    this.removedTargetIds = removedTargetIds;
  }

  public AiGatewayRoutingRuleReplaceAttributes tiers(List<AiGatewayRoutingRuleTierRequest> tiers) {
    this.tiers = tiers;
    if (tiers != null) {
      for (AiGatewayRoutingRuleTierRequest item : tiers) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public AiGatewayRoutingRuleReplaceAttributes addTiersItem(
      AiGatewayRoutingRuleTierRequest tiersItem) {
    if (this.tiers == null) {
      this.tiers = new ArrayList<>();
    }
    this.tiers.add(tiersItem);
    this.unparsed |= tiersItem.unparsed;
    return this;
  }

  /**
   * Gettiers
   *
   * @return tiers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AiGatewayRoutingRuleTierRequest> getTiers() {
    return tiers;
  }

  public void setTiers(List<AiGatewayRoutingRuleTierRequest> tiers) {
    this.tiers = tiers;
    if (tiers != null) {
      for (AiGatewayRoutingRuleTierRequest item : tiers) {
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
   * @return AiGatewayRoutingRuleReplaceAttributes
   */
  @JsonAnySetter
  public AiGatewayRoutingRuleReplaceAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayRoutingRuleReplaceAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayRoutingRuleReplaceAttributes aiGatewayRoutingRuleReplaceAttributes =
        (AiGatewayRoutingRuleReplaceAttributes) o;
    return Objects.equals(
            this.expectedUpdatedAt, aiGatewayRoutingRuleReplaceAttributes.expectedUpdatedAt)
        && Objects.equals(
            this.removedTargetIds, aiGatewayRoutingRuleReplaceAttributes.removedTargetIds)
        && Objects.equals(this.tiers, aiGatewayRoutingRuleReplaceAttributes.tiers)
        && Objects.equals(
            this.additionalProperties, aiGatewayRoutingRuleReplaceAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedUpdatedAt, removedTargetIds, tiers, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayRoutingRuleReplaceAttributes {\n");
    sb.append("    expectedUpdatedAt: ").append(toIndentedString(expectedUpdatedAt)).append("\n");
    sb.append("    removedTargetIds: ").append(toIndentedString(removedTargetIds)).append("\n");
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

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

/** Where a message action appears. */
@JsonPropertyOrder({
  CostRecommendationNotificationRuleMessageAction.JSON_PROPERTY_BULK,
  CostRecommendationNotificationRuleMessageAction.JSON_PROPERTY_PER_REC
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CostRecommendationNotificationRuleMessageAction {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BULK = "bulk";
  private Boolean bulk;

  public static final String JSON_PROPERTY_PER_REC = "per_rec";
  private Boolean perRec;

  public CostRecommendationNotificationRuleMessageAction bulk(Boolean bulk) {
    this.bulk = bulk;
    return this;
  }

  /**
   * Whether the action appears once for the whole digest.
   *
   * @return bulk
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BULK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getBulk() {
    return bulk;
  }

  public void setBulk(Boolean bulk) {
    this.bulk = bulk;
  }

  public CostRecommendationNotificationRuleMessageAction perRec(Boolean perRec) {
    this.perRec = perRec;
    return this;
  }

  /**
   * Whether the action appears on each recommendation.
   *
   * @return perRec
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PER_REC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPerRec() {
    return perRec;
  }

  public void setPerRec(Boolean perRec) {
    this.perRec = perRec;
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
   * @return CostRecommendationNotificationRuleMessageAction
   */
  @JsonAnySetter
  public CostRecommendationNotificationRuleMessageAction putAdditionalProperty(
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

  /** Return true if this CostRecommendationNotificationRuleMessageAction object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostRecommendationNotificationRuleMessageAction
        costRecommendationNotificationRuleMessageAction =
            (CostRecommendationNotificationRuleMessageAction) o;
    return Objects.equals(this.bulk, costRecommendationNotificationRuleMessageAction.bulk)
        && Objects.equals(this.perRec, costRecommendationNotificationRuleMessageAction.perRec)
        && Objects.equals(
            this.additionalProperties,
            costRecommendationNotificationRuleMessageAction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulk, perRec, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostRecommendationNotificationRuleMessageAction {\n");
    sb.append("    bulk: ").append(toIndentedString(bulk)).append("\n");
    sb.append("    perRec: ").append(toIndentedString(perRec)).append("\n");
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

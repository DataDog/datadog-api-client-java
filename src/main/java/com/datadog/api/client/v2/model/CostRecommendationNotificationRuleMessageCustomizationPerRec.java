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

/** What each recommendation in the digest shows. */
@JsonPropertyOrder({
  CostRecommendationNotificationRuleMessageCustomizationPerRec.JSON_PROPERTY_EFFORT,
  CostRecommendationNotificationRuleMessageCustomizationPerRec.JSON_PROPERTY_RISK,
  CostRecommendationNotificationRuleMessageCustomizationPerRec.JSON_PROPERTY_WHY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CostRecommendationNotificationRuleMessageCustomizationPerRec {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EFFORT = "effort";
  private Boolean effort;

  public static final String JSON_PROPERTY_RISK = "risk";
  private Boolean risk;

  public static final String JSON_PROPERTY_WHY = "why";
  private Boolean why;

  public CostRecommendationNotificationRuleMessageCustomizationPerRec effort(Boolean effort) {
    this.effort = effort;
    return this;
  }

  /**
   * Whether each recommendation shows its effort.
   *
   * @return effort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EFFORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEffort() {
    return effort;
  }

  public void setEffort(Boolean effort) {
    this.effort = effort;
  }

  public CostRecommendationNotificationRuleMessageCustomizationPerRec risk(Boolean risk) {
    this.risk = risk;
    return this;
  }

  /**
   * Whether each recommendation shows its risk.
   *
   * @return risk
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RISK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRisk() {
    return risk;
  }

  public void setRisk(Boolean risk) {
    this.risk = risk;
  }

  public CostRecommendationNotificationRuleMessageCustomizationPerRec why(Boolean why) {
    this.why = why;
    return this;
  }

  /**
   * Whether each recommendation shows why it was made.
   *
   * @return why
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WHY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getWhy() {
    return why;
  }

  public void setWhy(Boolean why) {
    this.why = why;
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
   * @return CostRecommendationNotificationRuleMessageCustomizationPerRec
   */
  @JsonAnySetter
  public CostRecommendationNotificationRuleMessageCustomizationPerRec putAdditionalProperty(
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
   * Return true if this CostRecommendationNotificationRuleMessageCustomizationPerRec object is
   * equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostRecommendationNotificationRuleMessageCustomizationPerRec
        costRecommendationNotificationRuleMessageCustomizationPerRec =
            (CostRecommendationNotificationRuleMessageCustomizationPerRec) o;
    return Objects.equals(
            this.effort, costRecommendationNotificationRuleMessageCustomizationPerRec.effort)
        && Objects.equals(
            this.risk, costRecommendationNotificationRuleMessageCustomizationPerRec.risk)
        && Objects.equals(
            this.why, costRecommendationNotificationRuleMessageCustomizationPerRec.why)
        && Objects.equals(
            this.additionalProperties,
            costRecommendationNotificationRuleMessageCustomizationPerRec.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effort, risk, why, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostRecommendationNotificationRuleMessageCustomizationPerRec {\n");
    sb.append("    effort: ").append(toIndentedString(effort)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    why: ").append(toIndentedString(why)).append("\n");
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

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

/** What the digest header shows. */
@JsonPropertyOrder({
  CostRecommendationNotificationRuleMessageCustomizationHeader.JSON_PROPERTY_CUSTOM_TEXT,
  CostRecommendationNotificationRuleMessageCustomizationHeader.JSON_PROPERTY_NOTIFICATION_NAME,
  CostRecommendationNotificationRuleMessageCustomizationHeader.JSON_PROPERTY_TOTAL_SAVINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CostRecommendationNotificationRuleMessageCustomizationHeader {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_TEXT = "custom_text";
  private String customText;

  public static final String JSON_PROPERTY_NOTIFICATION_NAME = "notification_name";
  private Boolean notificationName;

  public static final String JSON_PROPERTY_TOTAL_SAVINGS = "total_savings";
  private Boolean totalSavings;

  public CostRecommendationNotificationRuleMessageCustomizationHeader customText(
      String customText) {
    this.customText = customText;
    return this;
  }

  /**
   * Text shown in the header, up to 500 characters. It can use the <code>{{ total_savings }}</code>
   * , <code>{{ rec_count }}</code>, and <code>{{ digest_date }}</code> variables.
   *
   * @return customText
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomText() {
    return customText;
  }

  public void setCustomText(String customText) {
    this.customText = customText;
  }

  public CostRecommendationNotificationRuleMessageCustomizationHeader notificationName(
      Boolean notificationName) {
    this.notificationName = notificationName;
    return this;
  }

  /**
   * Whether the header shows the rule name.
   *
   * @return notificationName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNotificationName() {
    return notificationName;
  }

  public void setNotificationName(Boolean notificationName) {
    this.notificationName = notificationName;
  }

  public CostRecommendationNotificationRuleMessageCustomizationHeader totalSavings(
      Boolean totalSavings) {
    this.totalSavings = totalSavings;
    return this;
  }

  /**
   * Whether the header shows the total potential savings.
   *
   * @return totalSavings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_SAVINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getTotalSavings() {
    return totalSavings;
  }

  public void setTotalSavings(Boolean totalSavings) {
    this.totalSavings = totalSavings;
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
   * @return CostRecommendationNotificationRuleMessageCustomizationHeader
   */
  @JsonAnySetter
  public CostRecommendationNotificationRuleMessageCustomizationHeader putAdditionalProperty(
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
   * Return true if this CostRecommendationNotificationRuleMessageCustomizationHeader object is
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
    CostRecommendationNotificationRuleMessageCustomizationHeader
        costRecommendationNotificationRuleMessageCustomizationHeader =
            (CostRecommendationNotificationRuleMessageCustomizationHeader) o;
    return Objects.equals(
            this.customText,
            costRecommendationNotificationRuleMessageCustomizationHeader.customText)
        && Objects.equals(
            this.notificationName,
            costRecommendationNotificationRuleMessageCustomizationHeader.notificationName)
        && Objects.equals(
            this.totalSavings,
            costRecommendationNotificationRuleMessageCustomizationHeader.totalSavings)
        && Objects.equals(
            this.additionalProperties,
            costRecommendationNotificationRuleMessageCustomizationHeader.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customText, notificationName, totalSavings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostRecommendationNotificationRuleMessageCustomizationHeader {\n");
    sb.append("    customText: ").append(toIndentedString(customText)).append("\n");
    sb.append("    notificationName: ").append(toIndentedString(notificationName)).append("\n");
    sb.append("    totalSavings: ").append(toIndentedString(totalSavings)).append("\n");
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

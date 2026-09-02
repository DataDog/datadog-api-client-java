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

/** Attributes describing a single cost recommendation. */
@JsonPropertyOrder({
  CostRecommendationDataAttributes.JSON_PROPERTY_DD_RESOURCE_KEY,
  CostRecommendationDataAttributes.JSON_PROPERTY_POTENTIAL_DAILY_SAVINGS,
  CostRecommendationDataAttributes.JSON_PROPERTY_RECOMMENDATION_TYPE,
  CostRecommendationDataAttributes.JSON_PROPERTY_RESOURCE_ID,
  CostRecommendationDataAttributes.JSON_PROPERTY_RESOURCE_TYPE,
  CostRecommendationDataAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CostRecommendationDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DD_RESOURCE_KEY = "dd_resource_key";
  private String ddResourceKey;

  public static final String JSON_PROPERTY_POTENTIAL_DAILY_SAVINGS = "potential_daily_savings";
  private CostRecommendationDataAttributesPotentialDailySavings potentialDailySavings;

  public static final String JSON_PROPERTY_RECOMMENDATION_TYPE = "recommendation_type";
  private String recommendationType;

  public static final String JSON_PROPERTY_RESOURCE_ID = "resource_id";
  private String resourceId;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resource_type";
  private String resourceType;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public CostRecommendationDataAttributes ddResourceKey(String ddResourceKey) {
    this.ddResourceKey = ddResourceKey;
    return this;
  }

  /**
   * Datadog resource key identifying the recommended resource.
   *
   * @return ddResourceKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DD_RESOURCE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDdResourceKey() {
    return ddResourceKey;
  }

  public void setDdResourceKey(String ddResourceKey) {
    this.ddResourceKey = ddResourceKey;
  }

  public CostRecommendationDataAttributes potentialDailySavings(
      CostRecommendationDataAttributesPotentialDailySavings potentialDailySavings) {
    this.potentialDailySavings = potentialDailySavings;
    this.unparsed |= potentialDailySavings.unparsed;
    return this;
  }

  /**
   * Estimated daily savings if the recommendation is applied.
   *
   * @return potentialDailySavings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POTENTIAL_DAILY_SAVINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CostRecommendationDataAttributesPotentialDailySavings getPotentialDailySavings() {
    return potentialDailySavings;
  }

  public void setPotentialDailySavings(
      CostRecommendationDataAttributesPotentialDailySavings potentialDailySavings) {
    this.potentialDailySavings = potentialDailySavings;
    if (potentialDailySavings != null) {
      this.unparsed |= potentialDailySavings.unparsed;
    }
  }

  public CostRecommendationDataAttributes recommendationType(String recommendationType) {
    this.recommendationType = recommendationType;
    return this;
  }

  /**
   * The kind of recommendation (for example, <code>terminate</code> or <code>rightsize</code>).
   *
   * @return recommendationType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECOMMENDATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRecommendationType() {
    return recommendationType;
  }

  public void setRecommendationType(String recommendationType) {
    this.recommendationType = recommendationType;
  }

  public CostRecommendationDataAttributes resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * Cloud provider identifier of the resource.
   *
   * @return resourceId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public CostRecommendationDataAttributes resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Resource type (for example, <code>aws_ec2_instance</code>).
   *
   * @return resourceType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public CostRecommendationDataAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CostRecommendationDataAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags attached to the recommended resource.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
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
   * @return CostRecommendationDataAttributes
   */
  @JsonAnySetter
  public CostRecommendationDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CostRecommendationDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostRecommendationDataAttributes costRecommendationDataAttributes =
        (CostRecommendationDataAttributes) o;
    return Objects.equals(this.ddResourceKey, costRecommendationDataAttributes.ddResourceKey)
        && Objects.equals(
            this.potentialDailySavings, costRecommendationDataAttributes.potentialDailySavings)
        && Objects.equals(
            this.recommendationType, costRecommendationDataAttributes.recommendationType)
        && Objects.equals(this.resourceId, costRecommendationDataAttributes.resourceId)
        && Objects.equals(this.resourceType, costRecommendationDataAttributes.resourceType)
        && Objects.equals(this.tags, costRecommendationDataAttributes.tags)
        && Objects.equals(
            this.additionalProperties, costRecommendationDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        ddResourceKey,
        potentialDailySavings,
        recommendationType,
        resourceId,
        resourceType,
        tags,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostRecommendationDataAttributes {\n");
    sb.append("    ddResourceKey: ").append(toIndentedString(ddResourceKey)).append("\n");
    sb.append("    potentialDailySavings: ")
        .append(toIndentedString(potentialDailySavings))
        .append("\n");
    sb.append("    recommendationType: ").append(toIndentedString(recommendationType)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

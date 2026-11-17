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

/** A feature detected in the application, with the journeys users take to use it. */
@JsonPropertyOrder({
  ProductAnalyticsFunnelSuggestionsFeature.JSON_PROPERTY_CORE_USER_JOURNEYS,
  ProductAnalyticsFunnelSuggestionsFeature.JSON_PROPERTY_DESCRIPTION,
  ProductAnalyticsFunnelSuggestionsFeature.JSON_PROPERTY_ID,
  ProductAnalyticsFunnelSuggestionsFeature.JSON_PROPERTY_NAME,
  ProductAnalyticsFunnelSuggestionsFeature.JSON_PROPERTY_SCORE,
  ProductAnalyticsFunnelSuggestionsFeature.JSON_PROPERTY_SUPPORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsFunnelSuggestionsFeature {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CORE_USER_JOURNEYS = "core_user_journeys";
  private List<ProductAnalyticsCoreUserJourney> coreUserJourneys = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SCORE = "score";
  private Long score;

  public static final String JSON_PROPERTY_SUPPORT = "support";
  private Long support;

  public ProductAnalyticsFunnelSuggestionsFeature coreUserJourneys(
      List<ProductAnalyticsCoreUserJourney> coreUserJourneys) {
    this.coreUserJourneys = coreUserJourneys;
    if (coreUserJourneys != null) {
      for (ProductAnalyticsCoreUserJourney item : coreUserJourneys) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ProductAnalyticsFunnelSuggestionsFeature addCoreUserJourneysItem(
      ProductAnalyticsCoreUserJourney coreUserJourneysItem) {
    if (this.coreUserJourneys == null) {
      this.coreUserJourneys = new ArrayList<>();
    }
    this.coreUserJourneys.add(coreUserJourneysItem);
    this.unparsed |= coreUserJourneysItem.unparsed;
    return this;
  }

  /**
   * The suggested journey that users follow to use the feature. Contains one journey.
   *
   * @return coreUserJourneys
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CORE_USER_JOURNEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ProductAnalyticsCoreUserJourney> getCoreUserJourneys() {
    return coreUserJourneys;
  }

  public void setCoreUserJourneys(List<ProductAnalyticsCoreUserJourney> coreUserJourneys) {
    this.coreUserJourneys = coreUserJourneys;
    if (coreUserJourneys != null) {
      for (ProductAnalyticsCoreUserJourney item : coreUserJourneys) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ProductAnalyticsFunnelSuggestionsFeature description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the feature.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductAnalyticsFunnelSuggestionsFeature id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the feature.
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

  public ProductAnalyticsFunnelSuggestionsFeature name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the feature.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductAnalyticsFunnelSuggestionsFeature score(Long score) {
    this.score = score;
    return this;
  }

  /**
   * Relevance score of the feature. Higher is more relevant.
   *
   * @return score
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getScore() {
    return score;
  }

  public void setScore(Long score) {
    this.score = score;
  }

  public ProductAnalyticsFunnelSuggestionsFeature support(Long support) {
    this.support = support;
    return this;
  }

  /**
   * Number of sessions that used the feature.
   *
   * @return support
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSupport() {
    return support;
  }

  public void setSupport(Long support) {
    this.support = support;
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
   * @return ProductAnalyticsFunnelSuggestionsFeature
   */
  @JsonAnySetter
  public ProductAnalyticsFunnelSuggestionsFeature putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsFunnelSuggestionsFeature object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsFunnelSuggestionsFeature productAnalyticsFunnelSuggestionsFeature =
        (ProductAnalyticsFunnelSuggestionsFeature) o;
    return Objects.equals(
            this.coreUserJourneys, productAnalyticsFunnelSuggestionsFeature.coreUserJourneys)
        && Objects.equals(this.description, productAnalyticsFunnelSuggestionsFeature.description)
        && Objects.equals(this.id, productAnalyticsFunnelSuggestionsFeature.id)
        && Objects.equals(this.name, productAnalyticsFunnelSuggestionsFeature.name)
        && Objects.equals(this.score, productAnalyticsFunnelSuggestionsFeature.score)
        && Objects.equals(this.support, productAnalyticsFunnelSuggestionsFeature.support)
        && Objects.equals(
            this.additionalProperties,
            productAnalyticsFunnelSuggestionsFeature.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        coreUserJourneys, description, id, name, score, support, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsFunnelSuggestionsFeature {\n");
    sb.append("    coreUserJourneys: ").append(toIndentedString(coreUserJourneys)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    support: ").append(toIndentedString(support)).append("\n");
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

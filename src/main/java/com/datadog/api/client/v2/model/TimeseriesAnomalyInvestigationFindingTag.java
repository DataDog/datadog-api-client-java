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

/** Structured tag evidence for an influential-tag finding. */
@JsonPropertyOrder({
  TimeseriesAnomalyInvestigationFindingTag.JSON_PROPERTY_INFLUENCE_TYPE,
  TimeseriesAnomalyInvestigationFindingTag.JSON_PROPERTY_KEY,
  TimeseriesAnomalyInvestigationFindingTag.JSON_PROPERTY_RATING,
  TimeseriesAnomalyInvestigationFindingTag.JSON_PROPERTY_SYNONYMS,
  TimeseriesAnomalyInvestigationFindingTag.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesAnomalyInvestigationFindingTag {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INFLUENCE_TYPE = "influence_type";
  private TimeseriesAnomalyInvestigationInfluenceType influenceType;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_RATING = "rating";
  private Double rating;

  public static final String JSON_PROPERTY_SYNONYMS = "synonyms";
  private List<TimeseriesAnomalyInvestigationFindingSynonym> synonyms = new ArrayList<>();

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<String> values = new ArrayList<>();

  public TimeseriesAnomalyInvestigationFindingTag() {}

  @JsonCreator
  public TimeseriesAnomalyInvestigationFindingTag(
      @JsonProperty(required = true, value = JSON_PROPERTY_INFLUENCE_TYPE)
          TimeseriesAnomalyInvestigationInfluenceType influenceType,
      @JsonProperty(required = true, value = JSON_PROPERTY_KEY) String key,
      @JsonProperty(required = true, value = JSON_PROPERTY_RATING) Double rating,
      @JsonProperty(required = true, value = JSON_PROPERTY_SYNONYMS)
          List<TimeseriesAnomalyInvestigationFindingSynonym> synonyms,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUES) List<String> values) {
    this.influenceType = influenceType;
    this.unparsed |= !influenceType.isValid();
    this.key = key;
    this.rating = rating;
    this.synonyms = synonyms;
    for (TimeseriesAnomalyInvestigationFindingSynonym item : synonyms) {
      this.unparsed |= item.unparsed;
    }
    this.values = values;
  }

  public TimeseriesAnomalyInvestigationFindingTag influenceType(
      TimeseriesAnomalyInvestigationInfluenceType influenceType) {
    this.influenceType = influenceType;
    this.unparsed |= !influenceType.isValid();
    return this;
  }

  /**
   * Kind of influence a tag has on a series.
   *
   * @return influenceType
   */
  @JsonProperty(JSON_PROPERTY_INFLUENCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TimeseriesAnomalyInvestigationInfluenceType getInfluenceType() {
    return influenceType;
  }

  public void setInfluenceType(TimeseriesAnomalyInvestigationInfluenceType influenceType) {
    if (!influenceType.isValid()) {
      this.unparsed = true;
    }
    this.influenceType = influenceType;
  }

  public TimeseriesAnomalyInvestigationFindingTag key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Influential tag key.
   *
   * @return key
   */
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public TimeseriesAnomalyInvestigationFindingTag rating(Double rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Influence rating from 1 through 5. minimum: 1 maximum: 5
   *
   * @return rating
   */
  @JsonProperty(JSON_PROPERTY_RATING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getRating() {
    return rating;
  }

  public void setRating(Double rating) {
    this.rating = rating;
  }

  public TimeseriesAnomalyInvestigationFindingTag synonyms(
      List<TimeseriesAnomalyInvestigationFindingSynonym> synonyms) {
    this.synonyms = synonyms;
    for (TimeseriesAnomalyInvestigationFindingSynonym item : synonyms) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TimeseriesAnomalyInvestigationFindingTag addSynonymsItem(
      TimeseriesAnomalyInvestigationFindingSynonym synonymsItem) {
    this.synonyms.add(synonymsItem);
    this.unparsed |= synonymsItem.unparsed;
    return this;
  }

  /**
   * Tags grouped with this tag by Variation of Influence synonym analysis.
   *
   * @return synonyms
   */
  @JsonProperty(JSON_PROPERTY_SYNONYMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TimeseriesAnomalyInvestigationFindingSynonym> getSynonyms() {
    return synonyms;
  }

  public void setSynonyms(List<TimeseriesAnomalyInvestigationFindingSynonym> synonyms) {
    this.synonyms = synonyms;
    if (synonyms != null) {
      for (TimeseriesAnomalyInvestigationFindingSynonym item : synonyms) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TimeseriesAnomalyInvestigationFindingTag values(List<String> values) {
    this.values = values;
    return this;
  }

  public TimeseriesAnomalyInvestigationFindingTag addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Influential values for the tag key.
   *
   * @return values
   */
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
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
   * @return TimeseriesAnomalyInvestigationFindingTag
   */
  @JsonAnySetter
  public TimeseriesAnomalyInvestigationFindingTag putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TimeseriesAnomalyInvestigationFindingTag object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesAnomalyInvestigationFindingTag timeseriesAnomalyInvestigationFindingTag =
        (TimeseriesAnomalyInvestigationFindingTag) o;
    return Objects.equals(
            this.influenceType, timeseriesAnomalyInvestigationFindingTag.influenceType)
        && Objects.equals(this.key, timeseriesAnomalyInvestigationFindingTag.key)
        && Objects.equals(this.rating, timeseriesAnomalyInvestigationFindingTag.rating)
        && Objects.equals(this.synonyms, timeseriesAnomalyInvestigationFindingTag.synonyms)
        && Objects.equals(this.values, timeseriesAnomalyInvestigationFindingTag.values)
        && Objects.equals(
            this.additionalProperties,
            timeseriesAnomalyInvestigationFindingTag.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(influenceType, key, rating, synonyms, values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesAnomalyInvestigationFindingTag {\n");
    sb.append("    influenceType: ").append(toIndentedString(influenceType)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Finding that attributes an anomaly to an influential tag. */
@JsonPropertyOrder({
  TimeseriesAnomalyInvestigationInfluentialTagFinding.JSON_PROPERTY_DESCRIPTION,
  TimeseriesAnomalyInvestigationInfluentialTagFinding.JSON_PROPERTY_HEADLINE,
  TimeseriesAnomalyInvestigationInfluentialTagFinding.JSON_PROPERTY_TAG,
  TimeseriesAnomalyInvestigationInfluentialTagFinding.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesAnomalyInvestigationInfluentialTagFinding {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_HEADLINE = "headline";
  private String headline;

  public static final String JSON_PROPERTY_TAG = "tag";
  private TimeseriesAnomalyInvestigationFindingTag tag;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TimeseriesAnomalyInvestigationInfluentialTagFindingType type;

  public TimeseriesAnomalyInvestigationInfluentialTagFinding() {}

  @JsonCreator
  public TimeseriesAnomalyInvestigationInfluentialTagFinding(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_HEADLINE) String headline,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAG)
          TimeseriesAnomalyInvestigationFindingTag tag,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          TimeseriesAnomalyInvestigationInfluentialTagFindingType type) {
    this.description = description;
    this.headline = headline;
    this.tag = tag;
    this.unparsed |= tag.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TimeseriesAnomalyInvestigationInfluentialTagFinding description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Deterministic explanation of the finding.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TimeseriesAnomalyInvestigationInfluentialTagFinding headline(String headline) {
    this.headline = headline;
    return this;
  }

  /**
   * Concise, deterministic finding title.
   *
   * @return headline
   */
  @JsonProperty(JSON_PROPERTY_HEADLINE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getHeadline() {
    return headline;
  }

  public void setHeadline(String headline) {
    this.headline = headline;
  }

  public TimeseriesAnomalyInvestigationInfluentialTagFinding tag(
      TimeseriesAnomalyInvestigationFindingTag tag) {
    this.tag = tag;
    this.unparsed |= tag.unparsed;
    return this;
  }

  /**
   * Structured tag evidence for an influential-tag finding.
   *
   * @return tag
   */
  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TimeseriesAnomalyInvestigationFindingTag getTag() {
    return tag;
  }

  public void setTag(TimeseriesAnomalyInvestigationFindingTag tag) {
    this.tag = tag;
    if (tag != null) {
      this.unparsed |= tag.unparsed;
    }
  }

  public TimeseriesAnomalyInvestigationInfluentialTagFinding type(
      TimeseriesAnomalyInvestigationInfluentialTagFindingType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Finding category for an influential tag.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TimeseriesAnomalyInvestigationInfluentialTagFindingType getType() {
    return type;
  }

  public void setType(TimeseriesAnomalyInvestigationInfluentialTagFindingType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return TimeseriesAnomalyInvestigationInfluentialTagFinding
   */
  @JsonAnySetter
  public TimeseriesAnomalyInvestigationInfluentialTagFinding putAdditionalProperty(
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
   * Return true if this TimeseriesAnomalyInvestigationInfluentialTagFinding object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesAnomalyInvestigationInfluentialTagFinding
        timeseriesAnomalyInvestigationInfluentialTagFinding =
            (TimeseriesAnomalyInvestigationInfluentialTagFinding) o;
    return Objects.equals(
            this.description, timeseriesAnomalyInvestigationInfluentialTagFinding.description)
        && Objects.equals(
            this.headline, timeseriesAnomalyInvestigationInfluentialTagFinding.headline)
        && Objects.equals(this.tag, timeseriesAnomalyInvestigationInfluentialTagFinding.tag)
        && Objects.equals(this.type, timeseriesAnomalyInvestigationInfluentialTagFinding.type)
        && Objects.equals(
            this.additionalProperties,
            timeseriesAnomalyInvestigationInfluentialTagFinding.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, headline, tag, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesAnomalyInvestigationInfluentialTagFinding {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

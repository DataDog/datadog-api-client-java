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

/** Attributes of a scorecard score. */
@JsonPropertyOrder({
  ScorecardScoreAttributes.JSON_PROPERTY_AGGREGATION,
  ScorecardScoreAttributes.JSON_PROPERTY_DENOMINATOR,
  ScorecardScoreAttributes.JSON_PROPERTY_LEVEL,
  ScorecardScoreAttributes.JSON_PROPERTY_NUMERATOR,
  ScorecardScoreAttributes.JSON_PROPERTY_SCORE,
  ScorecardScoreAttributes.JSON_PROPERTY_TOTAL_ENTITIES,
  ScorecardScoreAttributes.JSON_PROPERTY_TOTAL_FAIL,
  ScorecardScoreAttributes.JSON_PROPERTY_TOTAL_NO_DATA,
  ScorecardScoreAttributes.JSON_PROPERTY_TOTAL_PASS,
  ScorecardScoreAttributes.JSON_PROPERTY_TOTAL_SKIP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScorecardScoreAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private ScorecardScoresAggregation aggregation;

  public static final String JSON_PROPERTY_DENOMINATOR = "denominator";
  private Long denominator;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private Long level;

  public static final String JSON_PROPERTY_NUMERATOR = "numerator";
  private Long numerator;

  public static final String JSON_PROPERTY_SCORE = "score";
  private Double score;

  public static final String JSON_PROPERTY_TOTAL_ENTITIES = "total_entities";
  private Long totalEntities;

  public static final String JSON_PROPERTY_TOTAL_FAIL = "total_fail";
  private Long totalFail;

  public static final String JSON_PROPERTY_TOTAL_NO_DATA = "total_no_data";
  private Long totalNoData;

  public static final String JSON_PROPERTY_TOTAL_PASS = "total_pass";
  private Long totalPass;

  public static final String JSON_PROPERTY_TOTAL_SKIP = "total_skip";
  private Long totalSkip;

  public ScorecardScoreAttributes aggregation(ScorecardScoresAggregation aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
    return this;
  }

  /**
   * Dimension to group scores by.
   *
   * @return aggregation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ScorecardScoresAggregation getAggregation() {
    return aggregation;
  }

  public void setAggregation(ScorecardScoresAggregation aggregation) {
    if (!aggregation.isValid()) {
      this.unparsed = true;
    }
    this.aggregation = aggregation;
  }

  public ScorecardScoreAttributes denominator(Long denominator) {
    this.denominator = denominator;
    return this;
  }

  /**
   * The denominator used to compute the score ratio.
   *
   * @return denominator
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DENOMINATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDenominator() {
    return denominator;
  }

  public void setDenominator(Long denominator) {
    this.denominator = denominator;
  }

  public ScorecardScoreAttributes level(Long level) {
    this.level = level;
    return this;
  }

  /**
   * The maturity level of the associated rule.
   *
   * @return level
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLevel() {
    return level;
  }

  public void setLevel(Long level) {
    this.level = level;
  }

  public ScorecardScoreAttributes numerator(Long numerator) {
    this.numerator = numerator;
    return this;
  }

  /**
   * The numerator used to compute the score ratio.
   *
   * @return numerator
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNumerator() {
    return numerator;
  }

  public void setNumerator(Long numerator) {
    this.numerator = numerator;
  }

  public ScorecardScoreAttributes score(Double score) {
    this.score = score;
    return this;
  }

  /**
   * The computed score ratio (numerator/denominator), from 0 to 1.
   *
   * @return score
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public ScorecardScoreAttributes totalEntities(Long totalEntities) {
    this.totalEntities = totalEntities;
    return this;
  }

  /**
   * The total number of entities evaluated.
   *
   * @return totalEntities
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalEntities() {
    return totalEntities;
  }

  public void setTotalEntities(Long totalEntities) {
    this.totalEntities = totalEntities;
  }

  public ScorecardScoreAttributes totalFail(Long totalFail) {
    this.totalFail = totalFail;
    return this;
  }

  /**
   * The number of rules that failed.
   *
   * @return totalFail
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_FAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalFail() {
    return totalFail;
  }

  public void setTotalFail(Long totalFail) {
    this.totalFail = totalFail;
  }

  public ScorecardScoreAttributes totalNoData(Long totalNoData) {
    this.totalNoData = totalNoData;
    return this;
  }

  /**
   * The number of rules with no data.
   *
   * @return totalNoData
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_NO_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalNoData() {
    return totalNoData;
  }

  public void setTotalNoData(Long totalNoData) {
    this.totalNoData = totalNoData;
  }

  public ScorecardScoreAttributes totalPass(Long totalPass) {
    this.totalPass = totalPass;
    return this;
  }

  /**
   * The number of rules that passed.
   *
   * @return totalPass
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_PASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalPass() {
    return totalPass;
  }

  public void setTotalPass(Long totalPass) {
    this.totalPass = totalPass;
  }

  public ScorecardScoreAttributes totalSkip(Long totalSkip) {
    this.totalSkip = totalSkip;
    return this;
  }

  /**
   * The number of rules that were skipped.
   *
   * @return totalSkip
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_SKIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalSkip() {
    return totalSkip;
  }

  public void setTotalSkip(Long totalSkip) {
    this.totalSkip = totalSkip;
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
   * @return ScorecardScoreAttributes
   */
  @JsonAnySetter
  public ScorecardScoreAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ScorecardScoreAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScorecardScoreAttributes scorecardScoreAttributes = (ScorecardScoreAttributes) o;
    return Objects.equals(this.aggregation, scorecardScoreAttributes.aggregation)
        && Objects.equals(this.denominator, scorecardScoreAttributes.denominator)
        && Objects.equals(this.level, scorecardScoreAttributes.level)
        && Objects.equals(this.numerator, scorecardScoreAttributes.numerator)
        && Objects.equals(this.score, scorecardScoreAttributes.score)
        && Objects.equals(this.totalEntities, scorecardScoreAttributes.totalEntities)
        && Objects.equals(this.totalFail, scorecardScoreAttributes.totalFail)
        && Objects.equals(this.totalNoData, scorecardScoreAttributes.totalNoData)
        && Objects.equals(this.totalPass, scorecardScoreAttributes.totalPass)
        && Objects.equals(this.totalSkip, scorecardScoreAttributes.totalSkip)
        && Objects.equals(this.additionalProperties, scorecardScoreAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aggregation,
        denominator,
        level,
        numerator,
        score,
        totalEntities,
        totalFail,
        totalNoData,
        totalPass,
        totalSkip,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScorecardScoreAttributes {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    denominator: ").append(toIndentedString(denominator)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    numerator: ").append(toIndentedString(numerator)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    totalEntities: ").append(toIndentedString(totalEntities)).append("\n");
    sb.append("    totalFail: ").append(toIndentedString(totalFail)).append("\n");
    sb.append("    totalNoData: ").append(toIndentedString(totalNoData)).append("\n");
    sb.append("    totalPass: ").append(toIndentedString(totalPass)).append("\n");
    sb.append("    totalSkip: ").append(toIndentedString(totalSkip)).append("\n");
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

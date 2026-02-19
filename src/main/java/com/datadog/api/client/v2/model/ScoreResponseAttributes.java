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

/** Score attributes. */
@JsonPropertyOrder({
  ScoreResponseAttributes.JSON_PROPERTY_AGGREGATION,
  ScoreResponseAttributes.JSON_PROPERTY_DENOMINATOR,
  ScoreResponseAttributes.JSON_PROPERTY_NUMERATOR,
  ScoreResponseAttributes.JSON_PROPERTY_SCORE,
  ScoreResponseAttributes.JSON_PROPERTY_TOTAL_FAIL,
  ScoreResponseAttributes.JSON_PROPERTY_TOTAL_NO_DATA,
  ScoreResponseAttributes.JSON_PROPERTY_TOTAL_PASS,
  ScoreResponseAttributes.JSON_PROPERTY_TOTAL_SKIP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScoreResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private String aggregation;

  public static final String JSON_PROPERTY_DENOMINATOR = "denominator";
  private Long denominator;

  public static final String JSON_PROPERTY_NUMERATOR = "numerator";
  private Long numerator;

  public static final String JSON_PROPERTY_SCORE = "score";
  private Double score;

  public static final String JSON_PROPERTY_TOTAL_FAIL = "total_fail";
  private Long totalFail;

  public static final String JSON_PROPERTY_TOTAL_NO_DATA = "total_no_data";
  private Long totalNoData;

  public static final String JSON_PROPERTY_TOTAL_PASS = "total_pass";
  private Long totalPass;

  public static final String JSON_PROPERTY_TOTAL_SKIP = "total_skip";
  private Long totalSkip;

  public ScoreResponseAttributes() {}

  @JsonCreator
  public ScoreResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION) String aggregation,
      @JsonProperty(required = true, value = JSON_PROPERTY_DENOMINATOR) Long denominator,
      @JsonProperty(required = true, value = JSON_PROPERTY_NUMERATOR) Long numerator,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCORE) Double score,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL_FAIL) Long totalFail,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL_NO_DATA) Long totalNoData,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL_PASS) Long totalPass,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL_SKIP) Long totalSkip) {
    this.aggregation = aggregation;
    this.denominator = denominator;
    this.numerator = numerator;
    this.score = score;
    this.totalFail = totalFail;
    this.totalNoData = totalNoData;
    this.totalPass = totalPass;
    this.totalSkip = totalSkip;
  }

  public ScoreResponseAttributes aggregation(String aggregation) {
    this.aggregation = aggregation;
    return this;
  }

  /**
   * The aggregation type.
   *
   * @return aggregation
   */
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAggregation() {
    return aggregation;
  }

  public void setAggregation(String aggregation) {
    this.aggregation = aggregation;
  }

  public ScoreResponseAttributes denominator(Long denominator) {
    this.denominator = denominator;
    return this;
  }

  /**
   * Score denominator.
   *
   * @return denominator
   */
  @JsonProperty(JSON_PROPERTY_DENOMINATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getDenominator() {
    return denominator;
  }

  public void setDenominator(Long denominator) {
    this.denominator = denominator;
  }

  public ScoreResponseAttributes numerator(Long numerator) {
    this.numerator = numerator;
    return this;
  }

  /**
   * Score numerator.
   *
   * @return numerator
   */
  @JsonProperty(JSON_PROPERTY_NUMERATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getNumerator() {
    return numerator;
  }

  public void setNumerator(Long numerator) {
    this.numerator = numerator;
  }

  public ScoreResponseAttributes score(Double score) {
    this.score = score;
    return this;
  }

  /**
   * Calculated score value.
   *
   * @return score
   */
  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public ScoreResponseAttributes totalFail(Long totalFail) {
    this.totalFail = totalFail;
    return this;
  }

  /**
   * Total number of failing rules.
   *
   * @return totalFail
   */
  @JsonProperty(JSON_PROPERTY_TOTAL_FAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotalFail() {
    return totalFail;
  }

  public void setTotalFail(Long totalFail) {
    this.totalFail = totalFail;
  }

  public ScoreResponseAttributes totalNoData(Long totalNoData) {
    this.totalNoData = totalNoData;
    return this;
  }

  /**
   * Total number of rules with no data.
   *
   * @return totalNoData
   */
  @JsonProperty(JSON_PROPERTY_TOTAL_NO_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotalNoData() {
    return totalNoData;
  }

  public void setTotalNoData(Long totalNoData) {
    this.totalNoData = totalNoData;
  }

  public ScoreResponseAttributes totalPass(Long totalPass) {
    this.totalPass = totalPass;
    return this;
  }

  /**
   * Total number of passing rules.
   *
   * @return totalPass
   */
  @JsonProperty(JSON_PROPERTY_TOTAL_PASS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotalPass() {
    return totalPass;
  }

  public void setTotalPass(Long totalPass) {
    this.totalPass = totalPass;
  }

  public ScoreResponseAttributes totalSkip(Long totalSkip) {
    this.totalSkip = totalSkip;
    return this;
  }

  /**
   * Total number of skipped rules.
   *
   * @return totalSkip
   */
  @JsonProperty(JSON_PROPERTY_TOTAL_SKIP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return ScoreResponseAttributes
   */
  @JsonAnySetter
  public ScoreResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ScoreResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScoreResponseAttributes scoreResponseAttributes = (ScoreResponseAttributes) o;
    return Objects.equals(this.aggregation, scoreResponseAttributes.aggregation)
        && Objects.equals(this.denominator, scoreResponseAttributes.denominator)
        && Objects.equals(this.numerator, scoreResponseAttributes.numerator)
        && Objects.equals(this.score, scoreResponseAttributes.score)
        && Objects.equals(this.totalFail, scoreResponseAttributes.totalFail)
        && Objects.equals(this.totalNoData, scoreResponseAttributes.totalNoData)
        && Objects.equals(this.totalPass, scoreResponseAttributes.totalPass)
        && Objects.equals(this.totalSkip, scoreResponseAttributes.totalSkip)
        && Objects.equals(this.additionalProperties, scoreResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aggregation,
        denominator,
        numerator,
        score,
        totalFail,
        totalNoData,
        totalPass,
        totalSkip,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScoreResponseAttributes {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    denominator: ").append(toIndentedString(denominator)).append("\n");
    sb.append("    numerator: ").append(toIndentedString(numerator)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

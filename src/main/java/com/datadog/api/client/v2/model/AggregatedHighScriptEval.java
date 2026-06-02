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

/** Aggregated high script evaluation detection grouped by source. */
@JsonPropertyOrder({
  AggregatedHighScriptEval.JSON_PROPERTY_AVG_DURATION,
  AggregatedHighScriptEval.JSON_PROPERTY_AVG_FORCED_STYLE_LAYOUT,
  AggregatedHighScriptEval.JSON_PROPERTY_FINGERPRINT,
  AggregatedHighScriptEval.JSON_PROPERTY_IMPACT_SCORE,
  AggregatedHighScriptEval.JSON_PROPERTY_INSTANCE_COUNT,
  AggregatedHighScriptEval.JSON_PROPERTY_INVOKER_TYPE,
  AggregatedHighScriptEval.JSON_PROPERTY_SOURCE_CATEGORY,
  AggregatedHighScriptEval.JSON_PROPERTY_SOURCE_FUNCTION_NAME,
  AggregatedHighScriptEval.JSON_PROPERTY_SOURCE_URL,
  AggregatedHighScriptEval.JSON_PROPERTY_VIEW_OCCURRENCES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AggregatedHighScriptEval {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVG_DURATION = "avg_duration";
  private Long avgDuration;

  public static final String JSON_PROPERTY_AVG_FORCED_STYLE_LAYOUT = "avg_forced_style_layout";
  private Long avgForcedStyleLayout;

  public static final String JSON_PROPERTY_FINGERPRINT = "fingerprint";
  private String fingerprint;

  public static final String JSON_PROPERTY_IMPACT_SCORE = "impact_score";
  private Double impactScore;

  public static final String JSON_PROPERTY_INSTANCE_COUNT = "instance_count";
  private Integer instanceCount;

  public static final String JSON_PROPERTY_INVOKER_TYPE = "invoker_type";
  private String invokerType;

  public static final String JSON_PROPERTY_SOURCE_CATEGORY = "source_category";
  private String sourceCategory;

  public static final String JSON_PROPERTY_SOURCE_FUNCTION_NAME = "source_function_name";
  private String sourceFunctionName;

  public static final String JSON_PROPERTY_SOURCE_URL = "source_url";
  private String sourceUrl;

  public static final String JSON_PROPERTY_VIEW_OCCURRENCES = "view_occurrences";
  private Integer viewOccurrences;

  public AggregatedHighScriptEval() {}

  @JsonCreator
  public AggregatedHighScriptEval(
      @JsonProperty(required = true, value = JSON_PROPERTY_AVG_DURATION) Long avgDuration,
      @JsonProperty(required = true, value = JSON_PROPERTY_AVG_FORCED_STYLE_LAYOUT)
          Long avgForcedStyleLayout,
      @JsonProperty(required = true, value = JSON_PROPERTY_FINGERPRINT) String fingerprint,
      @JsonProperty(required = true, value = JSON_PROPERTY_IMPACT_SCORE) Double impactScore,
      @JsonProperty(required = true, value = JSON_PROPERTY_INSTANCE_COUNT) Integer instanceCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_INVOKER_TYPE) String invokerType,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE_CATEGORY) String sourceCategory,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE_FUNCTION_NAME)
          String sourceFunctionName,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE_URL) String sourceUrl,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIEW_OCCURRENCES)
          Integer viewOccurrences) {
    this.avgDuration = avgDuration;
    this.avgForcedStyleLayout = avgForcedStyleLayout;
    this.fingerprint = fingerprint;
    this.impactScore = impactScore;
    this.instanceCount = instanceCount;
    this.invokerType = invokerType;
    this.sourceCategory = sourceCategory;
    if (sourceCategory != null) {}
    this.sourceFunctionName = sourceFunctionName;
    this.sourceUrl = sourceUrl;
    if (sourceUrl != null) {}
    this.viewOccurrences = viewOccurrences;
  }

  public AggregatedHighScriptEval avgDuration(Long avgDuration) {
    this.avgDuration = avgDuration;
    return this;
  }

  /**
   * Average script evaluation duration in nanoseconds.
   *
   * @return avgDuration
   */
  @JsonProperty(JSON_PROPERTY_AVG_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getAvgDuration() {
    return avgDuration;
  }

  public void setAvgDuration(Long avgDuration) {
    this.avgDuration = avgDuration;
  }

  public AggregatedHighScriptEval avgForcedStyleLayout(Long avgForcedStyleLayout) {
    this.avgForcedStyleLayout = avgForcedStyleLayout;
    return this;
  }

  /**
   * Average forced style/layout duration in nanoseconds.
   *
   * @return avgForcedStyleLayout
   */
  @JsonProperty(JSON_PROPERTY_AVG_FORCED_STYLE_LAYOUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getAvgForcedStyleLayout() {
    return avgForcedStyleLayout;
  }

  public void setAvgForcedStyleLayout(Long avgForcedStyleLayout) {
    this.avgForcedStyleLayout = avgForcedStyleLayout;
  }

  public AggregatedHighScriptEval fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Unique fingerprint identifying this detection group.
   *
   * @return fingerprint
   */
  @JsonProperty(JSON_PROPERTY_FINGERPRINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }

  public AggregatedHighScriptEval impactScore(Double impactScore) {
    this.impactScore = impactScore;
    return this;
  }

  /**
   * Impact score combining view frequency and duration severity.
   *
   * @return impactScore
   */
  @JsonProperty(JSON_PROPERTY_IMPACT_SCORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getImpactScore() {
    return impactScore;
  }

  public void setImpactScore(Double impactScore) {
    this.impactScore = impactScore;
  }

  public AggregatedHighScriptEval instanceCount(Integer instanceCount) {
    this.instanceCount = instanceCount;
    return this;
  }

  /**
   * Total number of detection instances across sampled views. maximum: 2147483647
   *
   * @return instanceCount
   */
  @JsonProperty(JSON_PROPERTY_INSTANCE_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getInstanceCount() {
    return instanceCount;
  }

  public void setInstanceCount(Integer instanceCount) {
    this.instanceCount = instanceCount;
  }

  public AggregatedHighScriptEval invokerType(String invokerType) {
    this.invokerType = invokerType;
    return this;
  }

  /**
   * Type of invoker that triggered the script evaluation.
   *
   * @return invokerType
   */
  @JsonProperty(JSON_PROPERTY_INVOKER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInvokerType() {
    return invokerType;
  }

  public void setInvokerType(String invokerType) {
    this.invokerType = invokerType;
  }

  public AggregatedHighScriptEval sourceCategory(String sourceCategory) {
    this.sourceCategory = sourceCategory;
    if (sourceCategory != null) {}
    return this;
  }

  /**
   * Category of the script source.
   *
   * @return sourceCategory
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSourceCategory() {
    return sourceCategory;
  }

  public void setSourceCategory(String sourceCategory) {
    this.sourceCategory = sourceCategory;
  }

  public AggregatedHighScriptEval sourceFunctionName(String sourceFunctionName) {
    this.sourceFunctionName = sourceFunctionName;
    return this;
  }

  /**
   * Name of the function that triggered the high script evaluation.
   *
   * @return sourceFunctionName
   */
  @JsonProperty(JSON_PROPERTY_SOURCE_FUNCTION_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSourceFunctionName() {
    return sourceFunctionName;
  }

  public void setSourceFunctionName(String sourceFunctionName) {
    this.sourceFunctionName = sourceFunctionName;
  }

  public AggregatedHighScriptEval sourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
    if (sourceUrl != null) {}
    return this;
  }

  /**
   * URL of the script that triggered the high script evaluation.
   *
   * @return sourceUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  public AggregatedHighScriptEval viewOccurrences(Integer viewOccurrences) {
    this.viewOccurrences = viewOccurrences;
    return this;
  }

  /**
   * Number of sampled views where this detection occurred. maximum: 2147483647
   *
   * @return viewOccurrences
   */
  @JsonProperty(JSON_PROPERTY_VIEW_OCCURRENCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getViewOccurrences() {
    return viewOccurrences;
  }

  public void setViewOccurrences(Integer viewOccurrences) {
    this.viewOccurrences = viewOccurrences;
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
   * @return AggregatedHighScriptEval
   */
  @JsonAnySetter
  public AggregatedHighScriptEval putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AggregatedHighScriptEval object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatedHighScriptEval aggregatedHighScriptEval = (AggregatedHighScriptEval) o;
    return Objects.equals(this.avgDuration, aggregatedHighScriptEval.avgDuration)
        && Objects.equals(this.avgForcedStyleLayout, aggregatedHighScriptEval.avgForcedStyleLayout)
        && Objects.equals(this.fingerprint, aggregatedHighScriptEval.fingerprint)
        && Objects.equals(this.impactScore, aggregatedHighScriptEval.impactScore)
        && Objects.equals(this.instanceCount, aggregatedHighScriptEval.instanceCount)
        && Objects.equals(this.invokerType, aggregatedHighScriptEval.invokerType)
        && Objects.equals(this.sourceCategory, aggregatedHighScriptEval.sourceCategory)
        && Objects.equals(this.sourceFunctionName, aggregatedHighScriptEval.sourceFunctionName)
        && Objects.equals(this.sourceUrl, aggregatedHighScriptEval.sourceUrl)
        && Objects.equals(this.viewOccurrences, aggregatedHighScriptEval.viewOccurrences)
        && Objects.equals(this.additionalProperties, aggregatedHighScriptEval.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        avgDuration,
        avgForcedStyleLayout,
        fingerprint,
        impactScore,
        instanceCount,
        invokerType,
        sourceCategory,
        sourceFunctionName,
        sourceUrl,
        viewOccurrences,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedHighScriptEval {\n");
    sb.append("    avgDuration: ").append(toIndentedString(avgDuration)).append("\n");
    sb.append("    avgForcedStyleLayout: ")
        .append(toIndentedString(avgForcedStyleLayout))
        .append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    impactScore: ").append(toIndentedString(impactScore)).append("\n");
    sb.append("    instanceCount: ").append(toIndentedString(instanceCount)).append("\n");
    sb.append("    invokerType: ").append(toIndentedString(invokerType)).append("\n");
    sb.append("    sourceCategory: ").append(toIndentedString(sourceCategory)).append("\n");
    sb.append("    sourceFunctionName: ").append(toIndentedString(sourceFunctionName)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
    sb.append("    viewOccurrences: ").append(toIndentedString(viewOccurrences)).append("\n");
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

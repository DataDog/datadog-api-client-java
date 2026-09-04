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

/**
 * Summary of optional influential-tag enrichment. Count and key fields are present only when
 * analysis completes; enrichment availability does not affect completion of the investigation
 * result.
 */
@JsonPropertyOrder({
  TimeseriesAnomalyInvestigationTagAnalysis.JSON_PROPERTY_ANALYZED_TAG_KEYS,
  TimeseriesAnomalyInvestigationTagAnalysis.JSON_PROPERTY_STATUS,
  TimeseriesAnomalyInvestigationTagAnalysis.JSON_PROPERTY_TAG_KEYS_ANALYZED,
  TimeseriesAnomalyInvestigationTagAnalysis.JSON_PROPERTY_TAG_VALUES_ANALYZED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesAnomalyInvestigationTagAnalysis {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANALYZED_TAG_KEYS = "analyzed_tag_keys";
  private List<String> analyzedTagKeys = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TimeseriesAnomalyInvestigationTagAnalysisStatus status;

  public static final String JSON_PROPERTY_TAG_KEYS_ANALYZED = "tag_keys_analyzed";
  private Long tagKeysAnalyzed;

  public static final String JSON_PROPERTY_TAG_VALUES_ANALYZED = "tag_values_analyzed";
  private Long tagValuesAnalyzed;

  public TimeseriesAnomalyInvestigationTagAnalysis() {}

  @JsonCreator
  public TimeseriesAnomalyInvestigationTagAnalysis(
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          TimeseriesAnomalyInvestigationTagAnalysisStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public TimeseriesAnomalyInvestigationTagAnalysis analyzedTagKeys(List<String> analyzedTagKeys) {
    this.analyzedTagKeys = analyzedTagKeys;
    return this;
  }

  public TimeseriesAnomalyInvestigationTagAnalysis addAnalyzedTagKeysItem(
      String analyzedTagKeysItem) {
    if (this.analyzedTagKeys == null) {
      this.analyzedTagKeys = new ArrayList<>();
    }
    this.analyzedTagKeys.add(analyzedTagKeysItem);
    return this;
  }

  /**
   * Tag keys analyzed. Present only when analysis completes.
   *
   * @return analyzedTagKeys
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANALYZED_TAG_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getAnalyzedTagKeys() {
    return analyzedTagKeys;
  }

  public void setAnalyzedTagKeys(List<String> analyzedTagKeys) {
    this.analyzedTagKeys = analyzedTagKeys;
  }

  public TimeseriesAnomalyInvestigationTagAnalysis status(
      TimeseriesAnomalyInvestigationTagAnalysisStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Outcome of optional influential-tag enrichment.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TimeseriesAnomalyInvestigationTagAnalysisStatus getStatus() {
    return status;
  }

  public void setStatus(TimeseriesAnomalyInvestigationTagAnalysisStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public TimeseriesAnomalyInvestigationTagAnalysis tagKeysAnalyzed(Long tagKeysAnalyzed) {
    this.tagKeysAnalyzed = tagKeysAnalyzed;
    return this;
  }

  /**
   * Number of tag keys analyzed. Present only when analysis completes. minimum: 0
   *
   * @return tagKeysAnalyzed
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_KEYS_ANALYZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTagKeysAnalyzed() {
    return tagKeysAnalyzed;
  }

  public void setTagKeysAnalyzed(Long tagKeysAnalyzed) {
    this.tagKeysAnalyzed = tagKeysAnalyzed;
  }

  public TimeseriesAnomalyInvestigationTagAnalysis tagValuesAnalyzed(Long tagValuesAnalyzed) {
    this.tagValuesAnalyzed = tagValuesAnalyzed;
    return this;
  }

  /**
   * Number of tag values analyzed. Present only when analysis completes. minimum: 0
   *
   * @return tagValuesAnalyzed
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_VALUES_ANALYZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTagValuesAnalyzed() {
    return tagValuesAnalyzed;
  }

  public void setTagValuesAnalyzed(Long tagValuesAnalyzed) {
    this.tagValuesAnalyzed = tagValuesAnalyzed;
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
   * @return TimeseriesAnomalyInvestigationTagAnalysis
   */
  @JsonAnySetter
  public TimeseriesAnomalyInvestigationTagAnalysis putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TimeseriesAnomalyInvestigationTagAnalysis object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesAnomalyInvestigationTagAnalysis timeseriesAnomalyInvestigationTagAnalysis =
        (TimeseriesAnomalyInvestigationTagAnalysis) o;
    return Objects.equals(
            this.analyzedTagKeys, timeseriesAnomalyInvestigationTagAnalysis.analyzedTagKeys)
        && Objects.equals(this.status, timeseriesAnomalyInvestigationTagAnalysis.status)
        && Objects.equals(
            this.tagKeysAnalyzed, timeseriesAnomalyInvestigationTagAnalysis.tagKeysAnalyzed)
        && Objects.equals(
            this.tagValuesAnalyzed, timeseriesAnomalyInvestigationTagAnalysis.tagValuesAnalyzed)
        && Objects.equals(
            this.additionalProperties,
            timeseriesAnomalyInvestigationTagAnalysis.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        analyzedTagKeys, status, tagKeysAnalyzed, tagValuesAnalyzed, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesAnomalyInvestigationTagAnalysis {\n");
    sb.append("    analyzedTagKeys: ").append(toIndentedString(analyzedTagKeys)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tagKeysAnalyzed: ").append(toIndentedString(tagKeysAnalyzed)).append("\n");
    sb.append("    tagValuesAnalyzed: ").append(toIndentedString(tagValuesAnalyzed)).append("\n");
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

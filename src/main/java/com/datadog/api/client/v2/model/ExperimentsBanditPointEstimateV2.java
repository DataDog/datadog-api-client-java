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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/** An arm's point estimate from one saved refresh. */
@JsonPropertyOrder({
  ExperimentsBanditPointEstimateV2.JSON_PROPERTY_CONFIDENCE_INTERVAL,
  ExperimentsBanditPointEstimateV2.JSON_PROPERTY_DATA_AS_OF,
  ExperimentsBanditPointEstimateV2.JSON_PROPERTY_FEATURE_FLAG_VARIANT_ID,
  ExperimentsBanditPointEstimateV2.JSON_PROPERTY_POINT_ESTIMATE,
  ExperimentsBanditPointEstimateV2.JSON_PROPERTY_REFRESH_ID,
  ExperimentsBanditPointEstimateV2.JSON_PROPERTY_RESULTS_LAST_UPDATED,
  ExperimentsBanditPointEstimateV2.JSON_PROPERTY_VARIANT_KEY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsBanditPointEstimateV2 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIDENCE_INTERVAL = "confidence_interval";
  private ExperimentsBanditConfidenceIntervalV2 confidenceInterval;

  public static final String JSON_PROPERTY_DATA_AS_OF = "data_as_of";
  private OffsetDateTime dataAsOf;

  public static final String JSON_PROPERTY_FEATURE_FLAG_VARIANT_ID = "feature_flag_variant_id";
  private UUID featureFlagVariantId;

  public static final String JSON_PROPERTY_POINT_ESTIMATE = "point_estimate";
  private Double pointEstimate;

  public static final String JSON_PROPERTY_REFRESH_ID = "refresh_id";
  private UUID refreshId;

  public static final String JSON_PROPERTY_RESULTS_LAST_UPDATED = "results_last_updated";
  private OffsetDateTime resultsLastUpdated;

  public static final String JSON_PROPERTY_VARIANT_KEY = "variant_key";
  private String variantKey;

  public ExperimentsBanditPointEstimateV2() {}

  @JsonCreator
  public ExperimentsBanditPointEstimateV2(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIDENCE_INTERVAL)
          ExperimentsBanditConfidenceIntervalV2 confidenceInterval,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_AS_OF) OffsetDateTime dataAsOf,
      @JsonProperty(required = true, value = JSON_PROPERTY_FEATURE_FLAG_VARIANT_ID)
          UUID featureFlagVariantId,
      @JsonProperty(required = true, value = JSON_PROPERTY_POINT_ESTIMATE) Double pointEstimate,
      @JsonProperty(required = true, value = JSON_PROPERTY_REFRESH_ID) UUID refreshId,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESULTS_LAST_UPDATED)
          OffsetDateTime resultsLastUpdated,
      @JsonProperty(required = true, value = JSON_PROPERTY_VARIANT_KEY) String variantKey) {
    this.confidenceInterval = confidenceInterval;
    this.unparsed |= confidenceInterval.unparsed;
    this.dataAsOf = dataAsOf;
    if (dataAsOf != null) {}
    this.featureFlagVariantId = featureFlagVariantId;
    this.pointEstimate = pointEstimate;
    this.refreshId = refreshId;
    this.resultsLastUpdated = resultsLastUpdated;
    this.variantKey = variantKey;
    if (variantKey != null) {}
  }

  public ExperimentsBanditPointEstimateV2 confidenceInterval(
      ExperimentsBanditConfidenceIntervalV2 confidenceInterval) {
    this.confidenceInterval = confidenceInterval;
    this.unparsed |= confidenceInterval.unparsed;
    return this;
  }

  /**
   * A central interval around point_estimate at confidence_level.
   *
   * @return confidenceInterval
   */
  @JsonProperty(JSON_PROPERTY_CONFIDENCE_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsBanditConfidenceIntervalV2 getConfidenceInterval() {
    return confidenceInterval;
  }

  public void setConfidenceInterval(ExperimentsBanditConfidenceIntervalV2 confidenceInterval) {
    this.confidenceInterval = confidenceInterval;
    if (confidenceInterval != null) {
      this.unparsed |= confidenceInterval.unparsed;
    }
  }

  public ExperimentsBanditPointEstimateV2 dataAsOf(OffsetDateTime dataAsOf) {
    this.dataAsOf = dataAsOf;
    if (dataAsOf != null) {}
    return this;
  }

  /**
   * The latest warehouse data the refresh read.
   *
   * @return dataAsOf
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_AS_OF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getDataAsOf() {
    return dataAsOf;
  }

  public void setDataAsOf(OffsetDateTime dataAsOf) {
    this.dataAsOf = dataAsOf;
  }

  public ExperimentsBanditPointEstimateV2 featureFlagVariantId(UUID featureFlagVariantId) {
    this.featureFlagVariantId = featureFlagVariantId;
    return this;
  }

  /**
   * The arm's variant ID on the flag.
   *
   * @return featureFlagVariantId
   */
  @JsonProperty(JSON_PROPERTY_FEATURE_FLAG_VARIANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getFeatureFlagVariantId() {
    return featureFlagVariantId;
  }

  public void setFeatureFlagVariantId(UUID featureFlagVariantId) {
    this.featureFlagVariantId = featureFlagVariantId;
  }

  public ExperimentsBanditPointEstimateV2 pointEstimate(Double pointEstimate) {
    this.pointEstimate = pointEstimate;
    return this;
  }

  /**
   * The arm's estimated mean of the metric, in the metric's units.
   *
   * @return pointEstimate
   */
  @JsonProperty(JSON_PROPERTY_POINT_ESTIMATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getPointEstimate() {
    return pointEstimate;
  }

  public void setPointEstimate(Double pointEstimate) {
    this.pointEstimate = pointEstimate;
  }

  public ExperimentsBanditPointEstimateV2 refreshId(UUID refreshId) {
    this.refreshId = refreshId;
    return this;
  }

  /**
   * The refresh the estimate comes from.
   *
   * @return refreshId
   */
  @JsonProperty(JSON_PROPERTY_REFRESH_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getRefreshId() {
    return refreshId;
  }

  public void setRefreshId(UUID refreshId) {
    this.refreshId = refreshId;
  }

  public ExperimentsBanditPointEstimateV2 resultsLastUpdated(OffsetDateTime resultsLastUpdated) {
    this.resultsLastUpdated = resultsLastUpdated;
    return this;
  }

  /**
   * When the refresh saved its results.
   *
   * @return resultsLastUpdated
   */
  @JsonProperty(JSON_PROPERTY_RESULTS_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getResultsLastUpdated() {
    return resultsLastUpdated;
  }

  public void setResultsLastUpdated(OffsetDateTime resultsLastUpdated) {
    this.resultsLastUpdated = resultsLastUpdated;
  }

  public ExperimentsBanditPointEstimateV2 variantKey(String variantKey) {
    this.variantKey = variantKey;
    if (variantKey != null) {}
    return this;
  }

  /**
   * The arm's variant key.
   *
   * @return variantKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANT_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getVariantKey() {
    return variantKey;
  }

  public void setVariantKey(String variantKey) {
    this.variantKey = variantKey;
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
   * @return ExperimentsBanditPointEstimateV2
   */
  @JsonAnySetter
  public ExperimentsBanditPointEstimateV2 putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsBanditPointEstimateV2 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsBanditPointEstimateV2 experimentsBanditPointEstimateV2 =
        (ExperimentsBanditPointEstimateV2) o;
    return Objects.equals(
            this.confidenceInterval, experimentsBanditPointEstimateV2.confidenceInterval)
        && Objects.equals(this.dataAsOf, experimentsBanditPointEstimateV2.dataAsOf)
        && Objects.equals(
            this.featureFlagVariantId, experimentsBanditPointEstimateV2.featureFlagVariantId)
        && Objects.equals(this.pointEstimate, experimentsBanditPointEstimateV2.pointEstimate)
        && Objects.equals(this.refreshId, experimentsBanditPointEstimateV2.refreshId)
        && Objects.equals(
            this.resultsLastUpdated, experimentsBanditPointEstimateV2.resultsLastUpdated)
        && Objects.equals(this.variantKey, experimentsBanditPointEstimateV2.variantKey)
        && Objects.equals(
            this.additionalProperties, experimentsBanditPointEstimateV2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        confidenceInterval,
        dataAsOf,
        featureFlagVariantId,
        pointEstimate,
        refreshId,
        resultsLastUpdated,
        variantKey,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsBanditPointEstimateV2 {\n");
    sb.append("    confidenceInterval: ").append(toIndentedString(confidenceInterval)).append("\n");
    sb.append("    dataAsOf: ").append(toIndentedString(dataAsOf)).append("\n");
    sb.append("    featureFlagVariantId: ")
        .append(toIndentedString(featureFlagVariantId))
        .append("\n");
    sb.append("    pointEstimate: ").append(toIndentedString(pointEstimate)).append("\n");
    sb.append("    refreshId: ").append(toIndentedString(refreshId)).append("\n");
    sb.append("    resultsLastUpdated: ").append(toIndentedString(resultsLastUpdated)).append("\n");
    sb.append("    variantKey: ").append(toIndentedString(variantKey)).append("\n");
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

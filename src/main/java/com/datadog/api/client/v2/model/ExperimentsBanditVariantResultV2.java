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
import java.util.UUID;

/** An arm's estimates from the latest saved refresh. */
@JsonPropertyOrder({
  ExperimentsBanditVariantResultV2.JSON_PROPERTY_CONFIDENCE_INTERVAL,
  ExperimentsBanditVariantResultV2.JSON_PROPERTY_DATA_STATUS,
  ExperimentsBanditVariantResultV2.JSON_PROPERTY_FEATURE_FLAG_VARIANT_ID,
  ExperimentsBanditVariantResultV2.JSON_PROPERTY_MATURE_OBSERVATIONS,
  ExperimentsBanditVariantResultV2.JSON_PROPERTY_POINT_ESTIMATE,
  ExperimentsBanditVariantResultV2.JSON_PROPERTY_POSTERIOR_UNAVAILABLE_REASON,
  ExperimentsBanditVariantResultV2.JSON_PROPERTY_PROBABILITY_OF_BEING_OPTIMAL,
  ExperimentsBanditVariantResultV2.JSON_PROPERTY_VARIANT_KEY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsBanditVariantResultV2 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIDENCE_INTERVAL = "confidence_interval";
  private ExperimentsBanditNullableConfidenceIntervalV2 confidenceInterval;

  public static final String JSON_PROPERTY_DATA_STATUS = "data_status";
  private ExperimentsBanditArmDataStatus dataStatus;

  public static final String JSON_PROPERTY_FEATURE_FLAG_VARIANT_ID = "feature_flag_variant_id";
  private UUID featureFlagVariantId;

  public static final String JSON_PROPERTY_MATURE_OBSERVATIONS = "mature_observations";
  private Long matureObservations;

  public static final String JSON_PROPERTY_POINT_ESTIMATE = "point_estimate";
  private Double pointEstimate;

  public static final String JSON_PROPERTY_POSTERIOR_UNAVAILABLE_REASON =
      "posterior_unavailable_reason";
  private ExperimentsBanditPosteriorUnavailableReason posteriorUnavailableReason;

  public static final String JSON_PROPERTY_PROBABILITY_OF_BEING_OPTIMAL =
      "probability_of_being_optimal";
  private Double probabilityOfBeingOptimal;

  public static final String JSON_PROPERTY_VARIANT_KEY = "variant_key";
  private String variantKey;

  public ExperimentsBanditVariantResultV2() {}

  @JsonCreator
  public ExperimentsBanditVariantResultV2(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIDENCE_INTERVAL)
          ExperimentsBanditNullableConfidenceIntervalV2 confidenceInterval,
      @JsonProperty(required = true, value = JSON_PROPERTY_FEATURE_FLAG_VARIANT_ID)
          UUID featureFlagVariantId,
      @JsonProperty(required = true, value = JSON_PROPERTY_MATURE_OBSERVATIONS)
          Long matureObservations,
      @JsonProperty(required = true, value = JSON_PROPERTY_POINT_ESTIMATE) Double pointEstimate,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROBABILITY_OF_BEING_OPTIMAL)
          Double probabilityOfBeingOptimal,
      @JsonProperty(required = true, value = JSON_PROPERTY_VARIANT_KEY) String variantKey) {
    this.confidenceInterval = confidenceInterval;
    if (confidenceInterval != null) {
      this.unparsed |= confidenceInterval.unparsed;
    }
    this.featureFlagVariantId = featureFlagVariantId;
    this.matureObservations = matureObservations;
    this.pointEstimate = pointEstimate;
    if (pointEstimate != null) {}
    this.probabilityOfBeingOptimal = probabilityOfBeingOptimal;
    if (probabilityOfBeingOptimal != null) {}
    this.variantKey = variantKey;
    if (variantKey != null) {}
  }

  public ExperimentsBanditVariantResultV2 confidenceInterval(
      ExperimentsBanditNullableConfidenceIntervalV2 confidenceInterval) {
    this.confidenceInterval = confidenceInterval;
    if (confidenceInterval != null) {
      this.unparsed |= confidenceInterval.unparsed;
    }
    return this;
  }

  /**
   * A central interval around point_estimate at confidence_level. Null when the estimate is
   * unavailable.
   *
   * @return confidenceInterval
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIDENCE_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsBanditNullableConfidenceIntervalV2 getConfidenceInterval() {
    return confidenceInterval;
  }

  public void setConfidenceInterval(
      ExperimentsBanditNullableConfidenceIntervalV2 confidenceInterval) {
    this.confidenceInterval = confidenceInterval;
    if (confidenceInterval != null) {
      this.unparsed |= confidenceInterval.unparsed;
    }
  }

  public ExperimentsBanditVariantResultV2 dataStatus(ExperimentsBanditArmDataStatus dataStatus) {
    this.dataStatus = dataStatus;
    this.unparsed |= !dataStatus.isValid();
    return this;
  }

  /**
   * Where the arm's reward variance came from, or why it's unavailable.
   *
   * @return dataStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsBanditArmDataStatus getDataStatus() {
    return dataStatus;
  }

  public void setDataStatus(ExperimentsBanditArmDataStatus dataStatus) {
    if (!dataStatus.isValid()) {
      this.unparsed = true;
    }
    this.dataStatus = dataStatus;
  }

  public ExperimentsBanditVariantResultV2 featureFlagVariantId(UUID featureFlagVariantId) {
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

  public ExperimentsBanditVariantResultV2 matureObservations(Long matureObservations) {
    this.matureObservations = matureObservations;
    return this;
  }

  /**
   * The arm's valid observations whose aggregation window has closed. The estimate uses these.
   *
   * @return matureObservations
   */
  @JsonProperty(JSON_PROPERTY_MATURE_OBSERVATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getMatureObservations() {
    return matureObservations;
  }

  public void setMatureObservations(Long matureObservations) {
    this.matureObservations = matureObservations;
  }

  public ExperimentsBanditVariantResultV2 pointEstimate(Double pointEstimate) {
    this.pointEstimate = pointEstimate;
    if (pointEstimate != null) {}
    return this;
  }

  /**
   * The arm's estimated mean of the metric, in the metric's units. It isn't a lift.
   *
   * @return pointEstimate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POINT_ESTIMATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getPointEstimate() {
    return pointEstimate;
  }

  public void setPointEstimate(Double pointEstimate) {
    this.pointEstimate = pointEstimate;
  }

  public ExperimentsBanditVariantResultV2 posteriorUnavailableReason(
      ExperimentsBanditPosteriorUnavailableReason posteriorUnavailableReason) {
    this.posteriorUnavailableReason = posteriorUnavailableReason;
    this.unparsed |= !posteriorUnavailableReason.isValid();
    return this;
  }

  /**
   * Why the arm's estimate and interval are unavailable. Absent when they are available.
   *
   * @return posteriorUnavailableReason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSTERIOR_UNAVAILABLE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsBanditPosteriorUnavailableReason getPosteriorUnavailableReason() {
    return posteriorUnavailableReason;
  }

  public void setPosteriorUnavailableReason(
      ExperimentsBanditPosteriorUnavailableReason posteriorUnavailableReason) {
    if (!posteriorUnavailableReason.isValid()) {
      this.unparsed = true;
    }
    this.posteriorUnavailableReason = posteriorUnavailableReason;
  }

  public ExperimentsBanditVariantResultV2 probabilityOfBeingOptimal(
      Double probabilityOfBeingOptimal) {
    this.probabilityOfBeingOptimal = probabilityOfBeingOptimal;
    if (probabilityOfBeingOptimal != null) {}
    return this;
  }

  /**
   * The probability that this arm is the best. minimum: 0 maximum: 1
   *
   * @return probabilityOfBeingOptimal
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROBABILITY_OF_BEING_OPTIMAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getProbabilityOfBeingOptimal() {
    return probabilityOfBeingOptimal;
  }

  public void setProbabilityOfBeingOptimal(Double probabilityOfBeingOptimal) {
    this.probabilityOfBeingOptimal = probabilityOfBeingOptimal;
  }

  public ExperimentsBanditVariantResultV2 variantKey(String variantKey) {
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
   * @return ExperimentsBanditVariantResultV2
   */
  @JsonAnySetter
  public ExperimentsBanditVariantResultV2 putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsBanditVariantResultV2 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsBanditVariantResultV2 experimentsBanditVariantResultV2 =
        (ExperimentsBanditVariantResultV2) o;
    return Objects.equals(
            this.confidenceInterval, experimentsBanditVariantResultV2.confidenceInterval)
        && Objects.equals(this.dataStatus, experimentsBanditVariantResultV2.dataStatus)
        && Objects.equals(
            this.featureFlagVariantId, experimentsBanditVariantResultV2.featureFlagVariantId)
        && Objects.equals(
            this.matureObservations, experimentsBanditVariantResultV2.matureObservations)
        && Objects.equals(this.pointEstimate, experimentsBanditVariantResultV2.pointEstimate)
        && Objects.equals(
            this.posteriorUnavailableReason,
            experimentsBanditVariantResultV2.posteriorUnavailableReason)
        && Objects.equals(
            this.probabilityOfBeingOptimal,
            experimentsBanditVariantResultV2.probabilityOfBeingOptimal)
        && Objects.equals(this.variantKey, experimentsBanditVariantResultV2.variantKey)
        && Objects.equals(
            this.additionalProperties, experimentsBanditVariantResultV2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        confidenceInterval,
        dataStatus,
        featureFlagVariantId,
        matureObservations,
        pointEstimate,
        posteriorUnavailableReason,
        probabilityOfBeingOptimal,
        variantKey,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsBanditVariantResultV2 {\n");
    sb.append("    confidenceInterval: ").append(toIndentedString(confidenceInterval)).append("\n");
    sb.append("    dataStatus: ").append(toIndentedString(dataStatus)).append("\n");
    sb.append("    featureFlagVariantId: ")
        .append(toIndentedString(featureFlagVariantId))
        .append("\n");
    sb.append("    matureObservations: ").append(toIndentedString(matureObservations)).append("\n");
    sb.append("    pointEstimate: ").append(toIndentedString(pointEstimate)).append("\n");
    sb.append("    posteriorUnavailableReason: ")
        .append(toIndentedString(posteriorUnavailableReason))
        .append("\n");
    sb.append("    probabilityOfBeingOptimal: ")
        .append(toIndentedString(probabilityOfBeingOptimal))
        .append("\n");
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

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/** What the bandit's refreshes have learned. */
@JsonPropertyOrder({
  ExperimentsBanditResultsV2DTODataAttributes.JSON_PROPERTY_CONFIDENCE_LEVEL,
  ExperimentsBanditResultsV2DTODataAttributes.JSON_PROPERTY_CONFIG_VERSION,
  ExperimentsBanditResultsV2DTODataAttributes.JSON_PROPERTY_DATA_AS_OF,
  ExperimentsBanditResultsV2DTODataAttributes.JSON_PROPERTY_DESIRED_CHANGE,
  ExperimentsBanditResultsV2DTODataAttributes.JSON_PROPERTY_NEXT_REFRESH_AT,
  ExperimentsBanditResultsV2DTODataAttributes.JSON_PROPERTY_OPTIMAL_VARIANT_KEY,
  ExperimentsBanditResultsV2DTODataAttributes.JSON_PROPERTY_OPTIMAL_VARIANT_UNAVAILABLE_REASON,
  ExperimentsBanditResultsV2DTODataAttributes.JSON_PROPERTY_POINT_ESTIMATES,
  ExperimentsBanditResultsV2DTODataAttributes.JSON_PROPERTY_REFRESH_ID,
  ExperimentsBanditResultsV2DTODataAttributes.JSON_PROPERTY_RESULTS_LAST_UPDATED,
  ExperimentsBanditResultsV2DTODataAttributes.JSON_PROPERTY_STATE,
  ExperimentsBanditResultsV2DTODataAttributes.JSON_PROPERTY_STATISTICS_STATUS,
  ExperimentsBanditResultsV2DTODataAttributes.JSON_PROPERTY_VARIANTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsBanditResultsV2DTODataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIDENCE_LEVEL = "confidence_level";
  private Double confidenceLevel;

  public static final String JSON_PROPERTY_CONFIG_VERSION = "config_version";
  private Long configVersion;

  public static final String JSON_PROPERTY_DATA_AS_OF = "data_as_of";
  private OffsetDateTime dataAsOf;

  public static final String JSON_PROPERTY_DESIRED_CHANGE = "desired_change";
  private ExperimentsBanditDesiredChange desiredChange;

  public static final String JSON_PROPERTY_NEXT_REFRESH_AT = "next_refresh_at";
  private OffsetDateTime nextRefreshAt;

  public static final String JSON_PROPERTY_OPTIMAL_VARIANT_KEY = "optimal_variant_key";
  private String optimalVariantKey;

  public static final String JSON_PROPERTY_OPTIMAL_VARIANT_UNAVAILABLE_REASON =
      "optimal_variant_unavailable_reason";
  private ExperimentsBanditOptimalVariantUnavailableReason optimalVariantUnavailableReason;

  public static final String JSON_PROPERTY_POINT_ESTIMATES = "point_estimates";
  private List<ExperimentsBanditPointEstimateV2> pointEstimates = new ArrayList<>();

  public static final String JSON_PROPERTY_REFRESH_ID = "refresh_id";
  private UUID refreshId;

  public static final String JSON_PROPERTY_RESULTS_LAST_UPDATED = "results_last_updated";
  private OffsetDateTime resultsLastUpdated;

  public static final String JSON_PROPERTY_STATE = "state";
  private ExperimentsBanditResultsState state;

  public static final String JSON_PROPERTY_STATISTICS_STATUS = "statistics_status";
  private ExperimentsBanditStatisticsStatus statisticsStatus;

  public static final String JSON_PROPERTY_VARIANTS = "variants";
  private List<ExperimentsBanditVariantResultV2> variants = new ArrayList<>();

  public ExperimentsBanditResultsV2DTODataAttributes() {}

  @JsonCreator
  public ExperimentsBanditResultsV2DTODataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIDENCE_LEVEL) Double confidenceLevel,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIG_VERSION) Long configVersion,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_AS_OF) OffsetDateTime dataAsOf,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESIRED_CHANGE)
          ExperimentsBanditDesiredChange desiredChange,
      @JsonProperty(required = true, value = JSON_PROPERTY_NEXT_REFRESH_AT)
          OffsetDateTime nextRefreshAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_OPTIMAL_VARIANT_KEY)
          String optimalVariantKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_POINT_ESTIMATES)
          List<ExperimentsBanditPointEstimateV2> pointEstimates,
      @JsonProperty(required = true, value = JSON_PROPERTY_REFRESH_ID) UUID refreshId,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESULTS_LAST_UPDATED)
          OffsetDateTime resultsLastUpdated,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATE)
          ExperimentsBanditResultsState state,
      @JsonProperty(required = true, value = JSON_PROPERTY_VARIANTS)
          List<ExperimentsBanditVariantResultV2> variants) {
    this.confidenceLevel = confidenceLevel;
    this.configVersion = configVersion;
    if (configVersion != null) {}
    this.dataAsOf = dataAsOf;
    if (dataAsOf != null) {}
    this.desiredChange = desiredChange;
    if (desiredChange != null) {
      this.unparsed |= !desiredChange.isValid();
    }
    this.nextRefreshAt = nextRefreshAt;
    if (nextRefreshAt != null) {}
    this.optimalVariantKey = optimalVariantKey;
    if (optimalVariantKey != null) {}
    this.pointEstimates = pointEstimates;
    for (ExperimentsBanditPointEstimateV2 item : pointEstimates) {
      this.unparsed |= item.unparsed;
    }
    this.refreshId = refreshId;
    if (refreshId != null) {}
    this.resultsLastUpdated = resultsLastUpdated;
    if (resultsLastUpdated != null) {}
    this.state = state;
    this.unparsed |= !state.isValid();
    this.variants = variants;
    for (ExperimentsBanditVariantResultV2 item : variants) {
      this.unparsed |= item.unparsed;
    }
  }

  public ExperimentsBanditResultsV2DTODataAttributes confidenceLevel(Double confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
    return this;
  }

  /**
   * The probability mass of each confidence interval. minimum: 0 maximum: 1
   *
   * @return confidenceLevel
   */
  @JsonProperty(JSON_PROPERTY_CONFIDENCE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getConfidenceLevel() {
    return confidenceLevel;
  }

  public void setConfidenceLevel(Double confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
  }

  public ExperimentsBanditResultsV2DTODataAttributes configVersion(Long configVersion) {
    this.configVersion = configVersion;
    if (configVersion != null) {}
    return this;
  }

  /**
   * The configuration version the latest saved refresh used. It can be older than the bandit's,
   * because changes such as a new end date don't invalidate results.
   *
   * @return configVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIG_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getConfigVersion() {
    return configVersion;
  }

  public void setConfigVersion(Long configVersion) {
    this.configVersion = configVersion;
  }

  public ExperimentsBanditResultsV2DTODataAttributes dataAsOf(OffsetDateTime dataAsOf) {
    this.dataAsOf = dataAsOf;
    if (dataAsOf != null) {}
    return this;
  }

  /**
   * The latest warehouse data the latest saved refresh read.
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

  public ExperimentsBanditResultsV2DTODataAttributes desiredChange(
      ExperimentsBanditDesiredChange desiredChange) {
    this.desiredChange = desiredChange;
    if (desiredChange != null) {
      this.unparsed |= !desiredChange.isValid();
    }
    return this;
  }

  /**
   * The direction the bandit optimizes the metric in. It's fixed when the bandit starts. Null
   * before the first saved refresh.
   *
   * @return desiredChange
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESIRED_CHANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsBanditDesiredChange getDesiredChange() {
    return desiredChange;
  }

  public void setDesiredChange(ExperimentsBanditDesiredChange desiredChange) {
    if (!desiredChange.isValid()) {
      this.unparsed = true;
    }
    this.desiredChange = desiredChange;
  }

  public ExperimentsBanditResultsV2DTODataAttributes nextRefreshAt(OffsetDateTime nextRefreshAt) {
    this.nextRefreshAt = nextRefreshAt;
    if (nextRefreshAt != null) {}
    return this;
  }

  /**
   * An estimate of when the next scheduled refresh starts. Null when the bandit isn't running or
   * the time can't be estimated. Only daily and hourly schedules get an estimate.
   *
   * @return nextRefreshAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_REFRESH_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getNextRefreshAt() {
    return nextRefreshAt;
  }

  public void setNextRefreshAt(OffsetDateTime nextRefreshAt) {
    this.nextRefreshAt = nextRefreshAt;
  }

  public ExperimentsBanditResultsV2DTODataAttributes optimalVariantKey(String optimalVariantKey) {
    this.optimalVariantKey = optimalVariantKey;
    if (optimalVariantKey != null) {}
    return this;
  }

  /**
   * The key of the arm most likely to be best, when one arm leads and the bandit is outside warmup.
   * Null otherwise.
   *
   * @return optimalVariantKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIMAL_VARIANT_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOptimalVariantKey() {
    return optimalVariantKey;
  }

  public void setOptimalVariantKey(String optimalVariantKey) {
    this.optimalVariantKey = optimalVariantKey;
  }

  public ExperimentsBanditResultsV2DTODataAttributes optimalVariantUnavailableReason(
      ExperimentsBanditOptimalVariantUnavailableReason optimalVariantUnavailableReason) {
    this.optimalVariantUnavailableReason = optimalVariantUnavailableReason;
    this.unparsed |= !optimalVariantUnavailableReason.isValid();
    return this;
  }

  /**
   * Why no optimal variant is reported. Absent when one is, or when the cause isn't known.
   *
   * @return optimalVariantUnavailableReason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIMAL_VARIANT_UNAVAILABLE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsBanditOptimalVariantUnavailableReason getOptimalVariantUnavailableReason() {
    return optimalVariantUnavailableReason;
  }

  public void setOptimalVariantUnavailableReason(
      ExperimentsBanditOptimalVariantUnavailableReason optimalVariantUnavailableReason) {
    if (!optimalVariantUnavailableReason.isValid()) {
      this.unparsed = true;
    }
    this.optimalVariantUnavailableReason = optimalVariantUnavailableReason;
  }

  public ExperimentsBanditResultsV2DTODataAttributes pointEstimates(
      List<ExperimentsBanditPointEstimateV2> pointEstimates) {
    this.pointEstimates = pointEstimates;
    for (ExperimentsBanditPointEstimateV2 item : pointEstimates) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ExperimentsBanditResultsV2DTODataAttributes addPointEstimatesItem(
      ExperimentsBanditPointEstimateV2 pointEstimatesItem) {
    this.pointEstimates.add(pointEstimatesItem);
    this.unparsed |= pointEstimatesItem.unparsed;
    return this;
  }

  /**
   * Each arm's point estimate from up to the latest 400 saved refreshes in the requested range,
   * oldest first.
   *
   * @return pointEstimates
   */
  @JsonProperty(JSON_PROPERTY_POINT_ESTIMATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ExperimentsBanditPointEstimateV2> getPointEstimates() {
    return pointEstimates;
  }

  public void setPointEstimates(List<ExperimentsBanditPointEstimateV2> pointEstimates) {
    this.pointEstimates = pointEstimates;
    if (pointEstimates != null) {
      for (ExperimentsBanditPointEstimateV2 item : pointEstimates) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsBanditResultsV2DTODataAttributes refreshId(UUID refreshId) {
    this.refreshId = refreshId;
    if (refreshId != null) {}
    return this;
  }

  /**
   * The latest refresh that saved results. The estimates come from it.
   *
   * @return refreshId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFRESH_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getRefreshId() {
    return refreshId;
  }

  public void setRefreshId(UUID refreshId) {
    this.refreshId = refreshId;
  }

  public ExperimentsBanditResultsV2DTODataAttributes resultsLastUpdated(
      OffsetDateTime resultsLastUpdated) {
    this.resultsLastUpdated = resultsLastUpdated;
    if (resultsLastUpdated != null) {}
    return this;
  }

  /**
   * When the latest saved refresh saved its results.
   *
   * @return resultsLastUpdated
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULTS_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getResultsLastUpdated() {
    return resultsLastUpdated;
  }

  public void setResultsLastUpdated(OffsetDateTime resultsLastUpdated) {
    this.resultsLastUpdated = resultsLastUpdated;
  }

  public ExperimentsBanditResultsV2DTODataAttributes state(ExperimentsBanditResultsState state) {
    this.state = state;
    this.unparsed |= !state.isValid();
    return this;
  }

  /**
   * WAITING_FOR_FIRST_REFRESH until a refresh saves results. STATS_UNAVAILABLE when the latest
   * saved refresh has no complete probabilities of being optimal. ENDED once the bandit is stopped
   * or completed; its last estimates stay. Otherwise WARMUP or OPTIMIZING says which policy the
   * bandit serves. A paused bandit keeps its state.
   *
   * @return state
   */
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsBanditResultsState getState() {
    return state;
  }

  public void setState(ExperimentsBanditResultsState state) {
    if (!state.isValid()) {
      this.unparsed = true;
    }
    this.state = state;
  }

  public ExperimentsBanditResultsV2DTODataAttributes statisticsStatus(
      ExperimentsBanditStatisticsStatus statisticsStatus) {
    this.statisticsStatus = statisticsStatus;
    this.unparsed |= !statisticsStatus.isValid();
    return this;
  }

  /**
   * Whether the latest saved refresh calculated its statistics. Absent for older refreshes.
   *
   * @return statisticsStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATISTICS_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsBanditStatisticsStatus getStatisticsStatus() {
    return statisticsStatus;
  }

  public void setStatisticsStatus(ExperimentsBanditStatisticsStatus statisticsStatus) {
    if (!statisticsStatus.isValid()) {
      this.unparsed = true;
    }
    this.statisticsStatus = statisticsStatus;
  }

  public ExperimentsBanditResultsV2DTODataAttributes variants(
      List<ExperimentsBanditVariantResultV2> variants) {
    this.variants = variants;
    for (ExperimentsBanditVariantResultV2 item : variants) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ExperimentsBanditResultsV2DTODataAttributes addVariantsItem(
      ExperimentsBanditVariantResultV2 variantsItem) {
    this.variants.add(variantsItem);
    this.unparsed |= variantsItem.unparsed;
    return this;
  }

  /**
   * One row per arm, in arm order.
   *
   * @return variants
   */
  @JsonProperty(JSON_PROPERTY_VARIANTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ExperimentsBanditVariantResultV2> getVariants() {
    return variants;
  }

  public void setVariants(List<ExperimentsBanditVariantResultV2> variants) {
    this.variants = variants;
    if (variants != null) {
      for (ExperimentsBanditVariantResultV2 item : variants) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return ExperimentsBanditResultsV2DTODataAttributes
   */
  @JsonAnySetter
  public ExperimentsBanditResultsV2DTODataAttributes putAdditionalProperty(
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

  /** Return true if this ExperimentsBanditResultsV2DTODataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsBanditResultsV2DTODataAttributes experimentsBanditResultsV2DtoDataAttributes =
        (ExperimentsBanditResultsV2DTODataAttributes) o;
    return Objects.equals(
            this.confidenceLevel, experimentsBanditResultsV2DtoDataAttributes.confidenceLevel)
        && Objects.equals(
            this.configVersion, experimentsBanditResultsV2DtoDataAttributes.configVersion)
        && Objects.equals(this.dataAsOf, experimentsBanditResultsV2DtoDataAttributes.dataAsOf)
        && Objects.equals(
            this.desiredChange, experimentsBanditResultsV2DtoDataAttributes.desiredChange)
        && Objects.equals(
            this.nextRefreshAt, experimentsBanditResultsV2DtoDataAttributes.nextRefreshAt)
        && Objects.equals(
            this.optimalVariantKey, experimentsBanditResultsV2DtoDataAttributes.optimalVariantKey)
        && Objects.equals(
            this.optimalVariantUnavailableReason,
            experimentsBanditResultsV2DtoDataAttributes.optimalVariantUnavailableReason)
        && Objects.equals(
            this.pointEstimates, experimentsBanditResultsV2DtoDataAttributes.pointEstimates)
        && Objects.equals(this.refreshId, experimentsBanditResultsV2DtoDataAttributes.refreshId)
        && Objects.equals(
            this.resultsLastUpdated, experimentsBanditResultsV2DtoDataAttributes.resultsLastUpdated)
        && Objects.equals(this.state, experimentsBanditResultsV2DtoDataAttributes.state)
        && Objects.equals(
            this.statisticsStatus, experimentsBanditResultsV2DtoDataAttributes.statisticsStatus)
        && Objects.equals(this.variants, experimentsBanditResultsV2DtoDataAttributes.variants)
        && Objects.equals(
            this.additionalProperties,
            experimentsBanditResultsV2DtoDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        confidenceLevel,
        configVersion,
        dataAsOf,
        desiredChange,
        nextRefreshAt,
        optimalVariantKey,
        optimalVariantUnavailableReason,
        pointEstimates,
        refreshId,
        resultsLastUpdated,
        state,
        statisticsStatus,
        variants,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsBanditResultsV2DTODataAttributes {\n");
    sb.append("    confidenceLevel: ").append(toIndentedString(confidenceLevel)).append("\n");
    sb.append("    configVersion: ").append(toIndentedString(configVersion)).append("\n");
    sb.append("    dataAsOf: ").append(toIndentedString(dataAsOf)).append("\n");
    sb.append("    desiredChange: ").append(toIndentedString(desiredChange)).append("\n");
    sb.append("    nextRefreshAt: ").append(toIndentedString(nextRefreshAt)).append("\n");
    sb.append("    optimalVariantKey: ").append(toIndentedString(optimalVariantKey)).append("\n");
    sb.append("    optimalVariantUnavailableReason: ")
        .append(toIndentedString(optimalVariantUnavailableReason))
        .append("\n");
    sb.append("    pointEstimates: ").append(toIndentedString(pointEstimates)).append("\n");
    sb.append("    refreshId: ").append(toIndentedString(refreshId)).append("\n");
    sb.append("    resultsLastUpdated: ").append(toIndentedString(resultsLastUpdated)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    statisticsStatus: ").append(toIndentedString(statisticsStatus)).append("\n");
    sb.append("    variants: ").append(toIndentedString(variants)).append("\n");
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

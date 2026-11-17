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

/** An arm's observations and new subjects on one UTC day. */
@JsonPropertyOrder({
  ExperimentsBanditDailyTrafficV2.JSON_PROPERTY_CUMULATIVE_NEW_SUBJECTS,
  ExperimentsBanditDailyTrafficV2.JSON_PROPERTY_CUMULATIVE_OBSERVATIONS,
  ExperimentsBanditDailyTrafficV2.JSON_PROPERTY_DATE,
  ExperimentsBanditDailyTrafficV2.JSON_PROPERTY_FEATURE_FLAG_VARIANT_ID,
  ExperimentsBanditDailyTrafficV2.JSON_PROPERTY_NEW_SUBJECTS,
  ExperimentsBanditDailyTrafficV2.JSON_PROPERTY_OBSERVATIONS,
  ExperimentsBanditDailyTrafficV2.JSON_PROPERTY_VARIANT_KEY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsBanditDailyTrafficV2 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUMULATIVE_NEW_SUBJECTS = "cumulative_new_subjects";
  private Long cumulativeNewSubjects;

  public static final String JSON_PROPERTY_CUMULATIVE_OBSERVATIONS = "cumulative_observations";
  private Long cumulativeObservations;

  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_FEATURE_FLAG_VARIANT_ID = "feature_flag_variant_id";
  private UUID featureFlagVariantId;

  public static final String JSON_PROPERTY_NEW_SUBJECTS = "new_subjects";
  private Long newSubjects;

  public static final String JSON_PROPERTY_OBSERVATIONS = "observations";
  private Long observations;

  public static final String JSON_PROPERTY_VARIANT_KEY = "variant_key";
  private String variantKey;

  public ExperimentsBanditDailyTrafficV2() {}

  @JsonCreator
  public ExperimentsBanditDailyTrafficV2(
      @JsonProperty(required = true, value = JSON_PROPERTY_CUMULATIVE_NEW_SUBJECTS)
          Long cumulativeNewSubjects,
      @JsonProperty(required = true, value = JSON_PROPERTY_CUMULATIVE_OBSERVATIONS)
          Long cumulativeObservations,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATE) OffsetDateTime date,
      @JsonProperty(required = true, value = JSON_PROPERTY_FEATURE_FLAG_VARIANT_ID)
          UUID featureFlagVariantId,
      @JsonProperty(required = true, value = JSON_PROPERTY_NEW_SUBJECTS) Long newSubjects,
      @JsonProperty(required = true, value = JSON_PROPERTY_OBSERVATIONS) Long observations,
      @JsonProperty(required = true, value = JSON_PROPERTY_VARIANT_KEY) String variantKey) {
    this.cumulativeNewSubjects = cumulativeNewSubjects;
    this.cumulativeObservations = cumulativeObservations;
    this.date = date;
    this.featureFlagVariantId = featureFlagVariantId;
    this.newSubjects = newSubjects;
    this.observations = observations;
    this.variantKey = variantKey;
    if (variantKey != null) {}
  }

  public ExperimentsBanditDailyTrafficV2 cumulativeNewSubjects(Long cumulativeNewSubjects) {
    this.cumulativeNewSubjects = cumulativeNewSubjects;
    return this;
  }

  /**
   * The arm's new subjects from the bandit's start through this day, including days before the
   * requested range.
   *
   * @return cumulativeNewSubjects
   */
  @JsonProperty(JSON_PROPERTY_CUMULATIVE_NEW_SUBJECTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCumulativeNewSubjects() {
    return cumulativeNewSubjects;
  }

  public void setCumulativeNewSubjects(Long cumulativeNewSubjects) {
    this.cumulativeNewSubjects = cumulativeNewSubjects;
  }

  public ExperimentsBanditDailyTrafficV2 cumulativeObservations(Long cumulativeObservations) {
    this.cumulativeObservations = cumulativeObservations;
    return this;
  }

  /**
   * The arm's observations from the bandit's start through this day, including days before the
   * requested range.
   *
   * @return cumulativeObservations
   */
  @JsonProperty(JSON_PROPERTY_CUMULATIVE_OBSERVATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCumulativeObservations() {
    return cumulativeObservations;
  }

  public void setCumulativeObservations(Long cumulativeObservations) {
    this.cumulativeObservations = cumulativeObservations;
  }

  public ExperimentsBanditDailyTrafficV2 date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * A UTC date as YYYY-MM-DD.
   *
   * @return date
   */
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public ExperimentsBanditDailyTrafficV2 featureFlagVariantId(UUID featureFlagVariantId) {
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

  public ExperimentsBanditDailyTrafficV2 newSubjects(Long newSubjects) {
    this.newSubjects = newSubjects;
    return this;
  }

  /**
   * Subjects whose first valid observation is on this day and arm.
   *
   * @return newSubjects
   */
  @JsonProperty(JSON_PROPERTY_NEW_SUBJECTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getNewSubjects() {
    return newSubjects;
  }

  public void setNewSubjects(Long newSubjects) {
    this.newSubjects = newSubjects;
  }

  public ExperimentsBanditDailyTrafficV2 observations(Long observations) {
    this.observations = observations;
    return this;
  }

  /**
   * The arm's valid observations on this day.
   *
   * @return observations
   */
  @JsonProperty(JSON_PROPERTY_OBSERVATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getObservations() {
    return observations;
  }

  public void setObservations(Long observations) {
    this.observations = observations;
  }

  public ExperimentsBanditDailyTrafficV2 variantKey(String variantKey) {
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
   * @return ExperimentsBanditDailyTrafficV2
   */
  @JsonAnySetter
  public ExperimentsBanditDailyTrafficV2 putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsBanditDailyTrafficV2 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsBanditDailyTrafficV2 experimentsBanditDailyTrafficV2 =
        (ExperimentsBanditDailyTrafficV2) o;
    return Objects.equals(
            this.cumulativeNewSubjects, experimentsBanditDailyTrafficV2.cumulativeNewSubjects)
        && Objects.equals(
            this.cumulativeObservations, experimentsBanditDailyTrafficV2.cumulativeObservations)
        && Objects.equals(this.date, experimentsBanditDailyTrafficV2.date)
        && Objects.equals(
            this.featureFlagVariantId, experimentsBanditDailyTrafficV2.featureFlagVariantId)
        && Objects.equals(this.newSubjects, experimentsBanditDailyTrafficV2.newSubjects)
        && Objects.equals(this.observations, experimentsBanditDailyTrafficV2.observations)
        && Objects.equals(this.variantKey, experimentsBanditDailyTrafficV2.variantKey)
        && Objects.equals(
            this.additionalProperties, experimentsBanditDailyTrafficV2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cumulativeNewSubjects,
        cumulativeObservations,
        date,
        featureFlagVariantId,
        newSubjects,
        observations,
        variantKey,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsBanditDailyTrafficV2 {\n");
    sb.append("    cumulativeNewSubjects: ")
        .append(toIndentedString(cumulativeNewSubjects))
        .append("\n");
    sb.append("    cumulativeObservations: ")
        .append(toIndentedString(cumulativeObservations))
        .append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    featureFlagVariantId: ")
        .append(toIndentedString(featureFlagVariantId))
        .append("\n");
    sb.append("    newSubjects: ").append(toIndentedString(newSubjects)).append("\n");
    sb.append("    observations: ").append(toIndentedString(observations)).append("\n");
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

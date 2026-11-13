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

/** An arm's observations and subjects in total. */
@JsonPropertyOrder({
  ExperimentsBanditTrafficVariantV2.JSON_PROPERTY_FEATURE_FLAG_VARIANT_ID,
  ExperimentsBanditTrafficVariantV2.JSON_PROPERTY_OBSERVATIONS,
  ExperimentsBanditTrafficVariantV2.JSON_PROPERTY_SUBJECTS,
  ExperimentsBanditTrafficVariantV2.JSON_PROPERTY_VARIANT_KEY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsBanditTrafficVariantV2 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FEATURE_FLAG_VARIANT_ID = "feature_flag_variant_id";
  private UUID featureFlagVariantId;

  public static final String JSON_PROPERTY_OBSERVATIONS = "observations";
  private Long observations;

  public static final String JSON_PROPERTY_SUBJECTS = "subjects";
  private Long subjects;

  public static final String JSON_PROPERTY_VARIANT_KEY = "variant_key";
  private String variantKey;

  public ExperimentsBanditTrafficVariantV2() {}

  @JsonCreator
  public ExperimentsBanditTrafficVariantV2(
      @JsonProperty(required = true, value = JSON_PROPERTY_FEATURE_FLAG_VARIANT_ID)
          UUID featureFlagVariantId,
      @JsonProperty(required = true, value = JSON_PROPERTY_OBSERVATIONS) Long observations,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUBJECTS) Long subjects,
      @JsonProperty(required = true, value = JSON_PROPERTY_VARIANT_KEY) String variantKey) {
    this.featureFlagVariantId = featureFlagVariantId;
    this.observations = observations;
    this.subjects = subjects;
    this.variantKey = variantKey;
    if (variantKey != null) {}
  }

  public ExperimentsBanditTrafficVariantV2 featureFlagVariantId(UUID featureFlagVariantId) {
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

  public ExperimentsBanditTrafficVariantV2 observations(Long observations) {
    this.observations = observations;
    return this;
  }

  /**
   * The arm's valid observations, mature or not.
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

  public ExperimentsBanditTrafficVariantV2 subjects(Long subjects) {
    this.subjects = subjects;
    return this;
  }

  /**
   * Subjects whose first valid observation is on this arm. A subject counts once, on the arm its
   * reward goes to.
   *
   * @return subjects
   */
  @JsonProperty(JSON_PROPERTY_SUBJECTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSubjects() {
    return subjects;
  }

  public void setSubjects(Long subjects) {
    this.subjects = subjects;
  }

  public ExperimentsBanditTrafficVariantV2 variantKey(String variantKey) {
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
   * @return ExperimentsBanditTrafficVariantV2
   */
  @JsonAnySetter
  public ExperimentsBanditTrafficVariantV2 putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsBanditTrafficVariantV2 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsBanditTrafficVariantV2 experimentsBanditTrafficVariantV2 =
        (ExperimentsBanditTrafficVariantV2) o;
    return Objects.equals(
            this.featureFlagVariantId, experimentsBanditTrafficVariantV2.featureFlagVariantId)
        && Objects.equals(this.observations, experimentsBanditTrafficVariantV2.observations)
        && Objects.equals(this.subjects, experimentsBanditTrafficVariantV2.subjects)
        && Objects.equals(this.variantKey, experimentsBanditTrafficVariantV2.variantKey)
        && Objects.equals(
            this.additionalProperties, experimentsBanditTrafficVariantV2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        featureFlagVariantId, observations, subjects, variantKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsBanditTrafficVariantV2 {\n");
    sb.append("    featureFlagVariantId: ")
        .append(toIndentedString(featureFlagVariantId))
        .append("\n");
    sb.append("    observations: ").append(toIndentedString(observations)).append("\n");
    sb.append("    subjects: ").append(toIndentedString(subjects)).append("\n");
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

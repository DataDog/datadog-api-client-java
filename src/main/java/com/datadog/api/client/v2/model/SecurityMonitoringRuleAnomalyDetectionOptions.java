/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Options on anomaly detection method.</p>
 */
@JsonPropertyOrder({
  SecurityMonitoringRuleAnomalyDetectionOptions.JSON_PROPERTY_BUCKET_DURATION,
  SecurityMonitoringRuleAnomalyDetectionOptions.JSON_PROPERTY_DETECTION_TOLERANCE,
  SecurityMonitoringRuleAnomalyDetectionOptions.JSON_PROPERTY_INSTANTANEOUS_BASELINE,
  SecurityMonitoringRuleAnomalyDetectionOptions.JSON_PROPERTY_LEARNING_DURATION,
  SecurityMonitoringRuleAnomalyDetectionOptions.JSON_PROPERTY_LEARNING_PERIOD_BASELINE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringRuleAnomalyDetectionOptions {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUCKET_DURATION = "bucketDuration";
  private SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration bucketDuration;

  public static final String JSON_PROPERTY_DETECTION_TOLERANCE = "detectionTolerance";
  private SecurityMonitoringRuleAnomalyDetectionOptionsDetectionTolerance detectionTolerance;

  public static final String JSON_PROPERTY_INSTANTANEOUS_BASELINE = "instantaneousBaseline";
  private Boolean instantaneousBaseline;

  public static final String JSON_PROPERTY_LEARNING_DURATION = "learningDuration";
  private SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration learningDuration;

  public static final String JSON_PROPERTY_LEARNING_PERIOD_BASELINE = "learningPeriodBaseline";
  private Long learningPeriodBaseline;

  public SecurityMonitoringRuleAnomalyDetectionOptions bucketDuration(SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration bucketDuration) {
    this.bucketDuration = bucketDuration;
    this.unparsed |= !bucketDuration.isValid();
    return this;
  }

  /**
   * <p>Duration in seconds of the time buckets used to aggregate events matched by the rule.
   * Must be greater than or equal to 300.</p>
   * @return bucketDuration
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BUCKET_DURATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration getBucketDuration() {
        return bucketDuration;
      }
  public void setBucketDuration(SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration bucketDuration) {
    if (!bucketDuration.isValid()) {
        this.unparsed = true;
    }
    this.bucketDuration = bucketDuration;
  }
  public SecurityMonitoringRuleAnomalyDetectionOptions detectionTolerance(SecurityMonitoringRuleAnomalyDetectionOptionsDetectionTolerance detectionTolerance) {
    this.detectionTolerance = detectionTolerance;
    this.unparsed |= !detectionTolerance.isValid();
    return this;
  }

  /**
   * <p>An optional parameter that sets how permissive anomaly detection is.
   * Higher values require higher deviations before triggering a signal.</p>
   * @return detectionTolerance
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DETECTION_TOLERANCE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityMonitoringRuleAnomalyDetectionOptionsDetectionTolerance getDetectionTolerance() {
        return detectionTolerance;
      }
  public void setDetectionTolerance(SecurityMonitoringRuleAnomalyDetectionOptionsDetectionTolerance detectionTolerance) {
    if (!detectionTolerance.isValid()) {
        this.unparsed = true;
    }
    this.detectionTolerance = detectionTolerance;
  }
  public SecurityMonitoringRuleAnomalyDetectionOptions instantaneousBaseline(Boolean instantaneousBaseline) {
    this.instantaneousBaseline = instantaneousBaseline;
    return this;
  }

  /**
   * <p>When set to true, Datadog uses previous values that fall within the defined learning window to construct the baseline, enabling the system to establish an accurate baseline more rapidly rather than relying solely on gradual learning over time.</p>
   * @return instantaneousBaseline
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INSTANTANEOUS_BASELINE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getInstantaneousBaseline() {
        return instantaneousBaseline;
      }
  public void setInstantaneousBaseline(Boolean instantaneousBaseline) {
    this.instantaneousBaseline = instantaneousBaseline;
  }
  public SecurityMonitoringRuleAnomalyDetectionOptions learningDuration(SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration learningDuration) {
    this.learningDuration = learningDuration;
    this.unparsed |= !learningDuration.isValid();
    return this;
  }

  /**
   * <p>Learning duration in hours. Anomaly detection waits for at least this amount of historical data before it starts evaluating.</p>
   * @return learningDuration
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LEARNING_DURATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration getLearningDuration() {
        return learningDuration;
      }
  public void setLearningDuration(SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration learningDuration) {
    if (!learningDuration.isValid()) {
        this.unparsed = true;
    }
    this.learningDuration = learningDuration;
  }
  public SecurityMonitoringRuleAnomalyDetectionOptions learningPeriodBaseline(Long learningPeriodBaseline) {
    this.learningPeriodBaseline = learningPeriodBaseline;
    return this;
  }

  /**
   * <p>An optional override baseline to apply while the rule is in the learning period. Must be greater than or equal to 0.</p>
   * minimum: 0
   * @return learningPeriodBaseline
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LEARNING_PERIOD_BASELINE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getLearningPeriodBaseline() {
        return learningPeriodBaseline;
      }
  public void setLearningPeriodBaseline(Long learningPeriodBaseline) {
    this.learningPeriodBaseline = learningPeriodBaseline;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SecurityMonitoringRuleAnomalyDetectionOptions
   */
  @JsonAnySetter
  public SecurityMonitoringRuleAnomalyDetectionOptions putAdditionalProperty(String key, Object value) {
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
   * Return true if this SecurityMonitoringRuleAnomalyDetectionOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringRuleAnomalyDetectionOptions securityMonitoringRuleAnomalyDetectionOptions = (SecurityMonitoringRuleAnomalyDetectionOptions) o;
    return Objects.equals(this.bucketDuration, securityMonitoringRuleAnomalyDetectionOptions.bucketDuration) && Objects.equals(this.detectionTolerance, securityMonitoringRuleAnomalyDetectionOptions.detectionTolerance) && Objects.equals(this.instantaneousBaseline, securityMonitoringRuleAnomalyDetectionOptions.instantaneousBaseline) && Objects.equals(this.learningDuration, securityMonitoringRuleAnomalyDetectionOptions.learningDuration) && Objects.equals(this.learningPeriodBaseline, securityMonitoringRuleAnomalyDetectionOptions.learningPeriodBaseline) && Objects.equals(this.additionalProperties, securityMonitoringRuleAnomalyDetectionOptions.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(bucketDuration,detectionTolerance,instantaneousBaseline,learningDuration,learningPeriodBaseline, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringRuleAnomalyDetectionOptions {\n");
    sb.append("    bucketDuration: ").append(toIndentedString(bucketDuration)).append("\n");
    sb.append("    detectionTolerance: ").append(toIndentedString(detectionTolerance)).append("\n");
    sb.append("    instantaneousBaseline: ").append(toIndentedString(instantaneousBaseline)).append("\n");
    sb.append("    learningDuration: ").append(toIndentedString(learningDuration)).append("\n");
    sb.append("    learningPeriodBaseline: ").append(toIndentedString(learningPeriodBaseline)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

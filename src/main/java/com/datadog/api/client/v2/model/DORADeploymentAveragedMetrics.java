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

/**
 * Averaged DORA and delivery metrics computed across the commits and pull requests included in the
 * deployment.
 */
@JsonPropertyOrder({
  DORADeploymentAveragedMetrics.JSON_PROPERTY_CHANGE_LEAD_TIME,
  DORADeploymentAveragedMetrics.JSON_PROPERTY_MERGE_TIME,
  DORADeploymentAveragedMetrics.JSON_PROPERTY_REVIEW_TIME,
  DORADeploymentAveragedMetrics.JSON_PROPERTY_TIME_TO_DEPLOY,
  DORADeploymentAveragedMetrics.JSON_PROPERTY_TIME_TO_PR_READY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DORADeploymentAveragedMetrics {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANGE_LEAD_TIME = "change_lead_time";
  private Long changeLeadTime;

  public static final String JSON_PROPERTY_MERGE_TIME = "merge_time";
  private Long mergeTime;

  public static final String JSON_PROPERTY_REVIEW_TIME = "review_time";
  private Long reviewTime;

  public static final String JSON_PROPERTY_TIME_TO_DEPLOY = "time_to_deploy";
  private Long timeToDeploy;

  public static final String JSON_PROPERTY_TIME_TO_PR_READY = "time_to_pr_ready";
  private Long timeToPrReady;

  public DORADeploymentAveragedMetrics changeLeadTime(Long changeLeadTime) {
    this.changeLeadTime = changeLeadTime;
    return this;
  }

  /**
   * The averaged change lead time, in seconds.
   *
   * @return changeLeadTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANGE_LEAD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getChangeLeadTime() {
    return changeLeadTime;
  }

  public void setChangeLeadTime(Long changeLeadTime) {
    this.changeLeadTime = changeLeadTime;
  }

  public DORADeploymentAveragedMetrics mergeTime(Long mergeTime) {
    this.mergeTime = mergeTime;
    return this;
  }

  /**
   * The averaged merge time, in seconds.
   *
   * @return mergeTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERGE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMergeTime() {
    return mergeTime;
  }

  public void setMergeTime(Long mergeTime) {
    this.mergeTime = mergeTime;
  }

  public DORADeploymentAveragedMetrics reviewTime(Long reviewTime) {
    this.reviewTime = reviewTime;
    return this;
  }

  /**
   * The averaged review time, in seconds.
   *
   * @return reviewTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVIEW_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getReviewTime() {
    return reviewTime;
  }

  public void setReviewTime(Long reviewTime) {
    this.reviewTime = reviewTime;
  }

  public DORADeploymentAveragedMetrics timeToDeploy(Long timeToDeploy) {
    this.timeToDeploy = timeToDeploy;
    return this;
  }

  /**
   * The averaged time to deploy, in seconds.
   *
   * @return timeToDeploy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_TO_DEPLOY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTimeToDeploy() {
    return timeToDeploy;
  }

  public void setTimeToDeploy(Long timeToDeploy) {
    this.timeToDeploy = timeToDeploy;
  }

  public DORADeploymentAveragedMetrics timeToPrReady(Long timeToPrReady) {
    this.timeToPrReady = timeToPrReady;
    return this;
  }

  /**
   * The averaged time until the pull request was ready for review, in seconds.
   *
   * @return timeToPrReady
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_TO_PR_READY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTimeToPrReady() {
    return timeToPrReady;
  }

  public void setTimeToPrReady(Long timeToPrReady) {
    this.timeToPrReady = timeToPrReady;
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
   * @return DORADeploymentAveragedMetrics
   */
  @JsonAnySetter
  public DORADeploymentAveragedMetrics putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DORADeploymentAveragedMetrics object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DORADeploymentAveragedMetrics doraDeploymentAveragedMetrics = (DORADeploymentAveragedMetrics) o;
    return Objects.equals(this.changeLeadTime, doraDeploymentAveragedMetrics.changeLeadTime)
        && Objects.equals(this.mergeTime, doraDeploymentAveragedMetrics.mergeTime)
        && Objects.equals(this.reviewTime, doraDeploymentAveragedMetrics.reviewTime)
        && Objects.equals(this.timeToDeploy, doraDeploymentAveragedMetrics.timeToDeploy)
        && Objects.equals(this.timeToPrReady, doraDeploymentAveragedMetrics.timeToPrReady)
        && Objects.equals(
            this.additionalProperties, doraDeploymentAveragedMetrics.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        changeLeadTime, mergeTime, reviewTime, timeToDeploy, timeToPrReady, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DORADeploymentAveragedMetrics {\n");
    sb.append("    changeLeadTime: ").append(toIndentedString(changeLeadTime)).append("\n");
    sb.append("    mergeTime: ").append(toIndentedString(mergeTime)).append("\n");
    sb.append("    reviewTime: ").append(toIndentedString(reviewTime)).append("\n");
    sb.append("    timeToDeploy: ").append(toIndentedString(timeToDeploy)).append("\n");
    sb.append("    timeToPrReady: ").append(toIndentedString(timeToPrReady)).append("\n");
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

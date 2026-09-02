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

/** Metadata about the sampling quality for a signals and problems query. */
@JsonPropertyOrder({
  SignalsProblemsSampleMetadata.JSON_PROPERTY_FAILED,
  SignalsProblemsSampleMetadata.JSON_PROPERTY_REQUESTED,
  SignalsProblemsSampleMetadata.JSON_PROPERTY_SAMPLED_VIEW_IDS,
  SignalsProblemsSampleMetadata.JSON_PROPERTY_SUCCEEDED,
  SignalsProblemsSampleMetadata.JSON_PROPERTY_SUCCESS_RATE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SignalsProblemsSampleMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FAILED = "failed";
  private Integer failed;

  public static final String JSON_PROPERTY_REQUESTED = "requested";
  private Integer requested;

  public static final String JSON_PROPERTY_SAMPLED_VIEW_IDS = "sampled_view_ids";
  private List<String> sampledViewIds = new ArrayList<>();

  public static final String JSON_PROPERTY_SUCCEEDED = "succeeded";
  private Integer succeeded;

  public static final String JSON_PROPERTY_SUCCESS_RATE = "success_rate";
  private Double successRate;

  public SignalsProblemsSampleMetadata() {}

  @JsonCreator
  public SignalsProblemsSampleMetadata(
      @JsonProperty(required = true, value = JSON_PROPERTY_FAILED) Integer failed,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTED) Integer requested,
      @JsonProperty(required = true, value = JSON_PROPERTY_SAMPLED_VIEW_IDS)
          List<String> sampledViewIds,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUCCEEDED) Integer succeeded,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUCCESS_RATE) Double successRate) {
    this.failed = failed;
    this.requested = requested;
    this.sampledViewIds = sampledViewIds;
    this.succeeded = succeeded;
    this.successRate = successRate;
  }

  public SignalsProblemsSampleMetadata failed(Integer failed) {
    this.failed = failed;
    return this;
  }

  /**
   * Number of view instances that failed to process. maximum: 2147483647
   *
   * @return failed
   */
  @JsonProperty(JSON_PROPERTY_FAILED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getFailed() {
    return failed;
  }

  public void setFailed(Integer failed) {
    this.failed = failed;
  }

  public SignalsProblemsSampleMetadata requested(Integer requested) {
    this.requested = requested;
    return this;
  }

  /**
   * Number of view instances requested for sampling. maximum: 2147483647
   *
   * @return requested
   */
  @JsonProperty(JSON_PROPERTY_REQUESTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getRequested() {
    return requested;
  }

  public void setRequested(Integer requested) {
    this.requested = requested;
  }

  public SignalsProblemsSampleMetadata sampledViewIds(List<String> sampledViewIds) {
    this.sampledViewIds = sampledViewIds;
    return this;
  }

  public SignalsProblemsSampleMetadata addSampledViewIdsItem(String sampledViewIdsItem) {
    this.sampledViewIds.add(sampledViewIdsItem);
    return this;
  }

  /**
   * List of RUM view IDs that were sampled.
   *
   * @return sampledViewIds
   */
  @JsonProperty(JSON_PROPERTY_SAMPLED_VIEW_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getSampledViewIds() {
    return sampledViewIds;
  }

  public void setSampledViewIds(List<String> sampledViewIds) {
    this.sampledViewIds = sampledViewIds;
  }

  public SignalsProblemsSampleMetadata succeeded(Integer succeeded) {
    this.succeeded = succeeded;
    return this;
  }

  /**
   * Number of view instances successfully processed. maximum: 2147483647
   *
   * @return succeeded
   */
  @JsonProperty(JSON_PROPERTY_SUCCEEDED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getSucceeded() {
    return succeeded;
  }

  public void setSucceeded(Integer succeeded) {
    this.succeeded = succeeded;
  }

  public SignalsProblemsSampleMetadata successRate(Double successRate) {
    this.successRate = successRate;
    return this;
  }

  /**
   * Ratio of successfully processed views to requested views.
   *
   * @return successRate
   */
  @JsonProperty(JSON_PROPERTY_SUCCESS_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getSuccessRate() {
    return successRate;
  }

  public void setSuccessRate(Double successRate) {
    this.successRate = successRate;
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
   * @return SignalsProblemsSampleMetadata
   */
  @JsonAnySetter
  public SignalsProblemsSampleMetadata putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SignalsProblemsSampleMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignalsProblemsSampleMetadata signalsProblemsSampleMetadata = (SignalsProblemsSampleMetadata) o;
    return Objects.equals(this.failed, signalsProblemsSampleMetadata.failed)
        && Objects.equals(this.requested, signalsProblemsSampleMetadata.requested)
        && Objects.equals(this.sampledViewIds, signalsProblemsSampleMetadata.sampledViewIds)
        && Objects.equals(this.succeeded, signalsProblemsSampleMetadata.succeeded)
        && Objects.equals(this.successRate, signalsProblemsSampleMetadata.successRate)
        && Objects.equals(
            this.additionalProperties, signalsProblemsSampleMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        failed, requested, sampledViewIds, succeeded, successRate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignalsProblemsSampleMetadata {\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    requested: ").append(toIndentedString(requested)).append("\n");
    sb.append("    sampledViewIds: ").append(toIndentedString(sampledViewIds)).append("\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
    sb.append("    successRate: ").append(toIndentedString(successRate)).append("\n");
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

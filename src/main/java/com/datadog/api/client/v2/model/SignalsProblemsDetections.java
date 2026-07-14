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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Grouped detection results by detection type. */
@JsonPropertyOrder({
  SignalsProblemsDetections.JSON_PROPERTY_HIGH_FROZEN_FRAME_RATES,
  SignalsProblemsDetections.JSON_PROPERTY_HIGH_SCRIPT_EVALUATIONS,
  SignalsProblemsDetections.JSON_PROPERTY_LOW_CACHE_HIT_RATES,
  SignalsProblemsDetections.JSON_PROPERTY_MOBILE_SCROLL_FRICTIONS,
  SignalsProblemsDetections.JSON_PROPERTY_SLOW_FCP_HIGH_BYTES,
  SignalsProblemsDetections.JSON_PROPERTY_SLOW_INTERACTION_LONG_TASKS,
  SignalsProblemsDetections.JSON_PROPERTY_UNCOMPRESSED_RESOURCES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SignalsProblemsDetections {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HIGH_FROZEN_FRAME_RATES = "high_frozen_frame_rates";
  private List<AggregatedHighFrozenFrameRate> highFrozenFrameRates = null;

  public static final String JSON_PROPERTY_HIGH_SCRIPT_EVALUATIONS = "high_script_evaluations";
  private List<AggregatedHighScriptEval> highScriptEvaluations = null;

  public static final String JSON_PROPERTY_LOW_CACHE_HIT_RATES = "low_cache_hit_rates";
  private List<AggregatedLowCacheHitRate> lowCacheHitRates = null;

  public static final String JSON_PROPERTY_MOBILE_SCROLL_FRICTIONS = "mobile_scroll_frictions";
  private List<AggregatedMobileScrollFriction> mobileScrollFrictions = null;

  public static final String JSON_PROPERTY_SLOW_FCP_HIGH_BYTES = "slow_fcp_high_bytes";
  private List<AggregatedSlowFCPHighBytes> slowFcpHighBytes = null;

  public static final String JSON_PROPERTY_SLOW_INTERACTION_LONG_TASKS =
      "slow_interaction_long_tasks";
  private List<AggregatedSlowInteractionLongTask> slowInteractionLongTasks = null;

  public static final String JSON_PROPERTY_UNCOMPRESSED_RESOURCES = "uncompressed_resources";
  private List<AggregatedUncompressedResource> uncompressedResources = null;

  public SignalsProblemsDetections highFrozenFrameRates(
      List<AggregatedHighFrozenFrameRate> highFrozenFrameRates) {
    this.highFrozenFrameRates = highFrozenFrameRates;
    if (highFrozenFrameRates != null) {
      for (AggregatedHighFrozenFrameRate item : highFrozenFrameRates) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public SignalsProblemsDetections addHighFrozenFrameRatesItem(
      AggregatedHighFrozenFrameRate highFrozenFrameRatesItem) {
    if (this.highFrozenFrameRates == null) {
      this.highFrozenFrameRates = new ArrayList<>();
    }
    this.highFrozenFrameRates.add(highFrozenFrameRatesItem);
    this.unparsed |= highFrozenFrameRatesItem.unparsed;
    return this;
  }

  /**
   * Detected high frozen frame rate issues.
   *
   * @return highFrozenFrameRates
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIGH_FROZEN_FRAME_RATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AggregatedHighFrozenFrameRate> getHighFrozenFrameRates() {
    return highFrozenFrameRates;
  }

  public void setHighFrozenFrameRates(List<AggregatedHighFrozenFrameRate> highFrozenFrameRates) {
    this.highFrozenFrameRates = highFrozenFrameRates;
    if (highFrozenFrameRates != null) {
      for (AggregatedHighFrozenFrameRate item : highFrozenFrameRates) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SignalsProblemsDetections highScriptEvaluations(
      List<AggregatedHighScriptEval> highScriptEvaluations) {
    this.highScriptEvaluations = highScriptEvaluations;
    if (highScriptEvaluations != null) {
      for (AggregatedHighScriptEval item : highScriptEvaluations) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public SignalsProblemsDetections addHighScriptEvaluationsItem(
      AggregatedHighScriptEval highScriptEvaluationsItem) {
    if (this.highScriptEvaluations == null) {
      this.highScriptEvaluations = new ArrayList<>();
    }
    this.highScriptEvaluations.add(highScriptEvaluationsItem);
    this.unparsed |= highScriptEvaluationsItem.unparsed;
    return this;
  }

  /**
   * Detected high script evaluation issues.
   *
   * @return highScriptEvaluations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIGH_SCRIPT_EVALUATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AggregatedHighScriptEval> getHighScriptEvaluations() {
    return highScriptEvaluations;
  }

  public void setHighScriptEvaluations(List<AggregatedHighScriptEval> highScriptEvaluations) {
    this.highScriptEvaluations = highScriptEvaluations;
    if (highScriptEvaluations != null) {
      for (AggregatedHighScriptEval item : highScriptEvaluations) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SignalsProblemsDetections lowCacheHitRates(
      List<AggregatedLowCacheHitRate> lowCacheHitRates) {
    this.lowCacheHitRates = lowCacheHitRates;
    if (lowCacheHitRates != null) {
      for (AggregatedLowCacheHitRate item : lowCacheHitRates) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public SignalsProblemsDetections addLowCacheHitRatesItem(
      AggregatedLowCacheHitRate lowCacheHitRatesItem) {
    if (this.lowCacheHitRates == null) {
      this.lowCacheHitRates = new ArrayList<>();
    }
    this.lowCacheHitRates.add(lowCacheHitRatesItem);
    this.unparsed |= lowCacheHitRatesItem.unparsed;
    return this;
  }

  /**
   * Detected low cache hit rate issues.
   *
   * @return lowCacheHitRates
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOW_CACHE_HIT_RATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AggregatedLowCacheHitRate> getLowCacheHitRates() {
    return lowCacheHitRates;
  }

  public void setLowCacheHitRates(List<AggregatedLowCacheHitRate> lowCacheHitRates) {
    this.lowCacheHitRates = lowCacheHitRates;
    if (lowCacheHitRates != null) {
      for (AggregatedLowCacheHitRate item : lowCacheHitRates) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SignalsProblemsDetections mobileScrollFrictions(
      List<AggregatedMobileScrollFriction> mobileScrollFrictions) {
    this.mobileScrollFrictions = mobileScrollFrictions;
    if (mobileScrollFrictions != null) {
      for (AggregatedMobileScrollFriction item : mobileScrollFrictions) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public SignalsProblemsDetections addMobileScrollFrictionsItem(
      AggregatedMobileScrollFriction mobileScrollFrictionsItem) {
    if (this.mobileScrollFrictions == null) {
      this.mobileScrollFrictions = new ArrayList<>();
    }
    this.mobileScrollFrictions.add(mobileScrollFrictionsItem);
    this.unparsed |= mobileScrollFrictionsItem.unparsed;
    return this;
  }

  /**
   * Detected mobile scroll friction issues.
   *
   * @return mobileScrollFrictions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_SCROLL_FRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AggregatedMobileScrollFriction> getMobileScrollFrictions() {
    return mobileScrollFrictions;
  }

  public void setMobileScrollFrictions(List<AggregatedMobileScrollFriction> mobileScrollFrictions) {
    this.mobileScrollFrictions = mobileScrollFrictions;
    if (mobileScrollFrictions != null) {
      for (AggregatedMobileScrollFriction item : mobileScrollFrictions) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SignalsProblemsDetections slowFcpHighBytes(
      List<AggregatedSlowFCPHighBytes> slowFcpHighBytes) {
    this.slowFcpHighBytes = slowFcpHighBytes;
    if (slowFcpHighBytes != null) {
      for (AggregatedSlowFCPHighBytes item : slowFcpHighBytes) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public SignalsProblemsDetections addSlowFcpHighBytesItem(
      AggregatedSlowFCPHighBytes slowFcpHighBytesItem) {
    if (this.slowFcpHighBytes == null) {
      this.slowFcpHighBytes = new ArrayList<>();
    }
    this.slowFcpHighBytes.add(slowFcpHighBytesItem);
    this.unparsed |= slowFcpHighBytesItem.unparsed;
    return this;
  }

  /**
   * Detected slow first contentful paint with high byte count issues.
   *
   * @return slowFcpHighBytes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLOW_FCP_HIGH_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AggregatedSlowFCPHighBytes> getSlowFcpHighBytes() {
    return slowFcpHighBytes;
  }

  public void setSlowFcpHighBytes(List<AggregatedSlowFCPHighBytes> slowFcpHighBytes) {
    this.slowFcpHighBytes = slowFcpHighBytes;
    if (slowFcpHighBytes != null) {
      for (AggregatedSlowFCPHighBytes item : slowFcpHighBytes) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SignalsProblemsDetections slowInteractionLongTasks(
      List<AggregatedSlowInteractionLongTask> slowInteractionLongTasks) {
    this.slowInteractionLongTasks = slowInteractionLongTasks;
    if (slowInteractionLongTasks != null) {
      for (AggregatedSlowInteractionLongTask item : slowInteractionLongTasks) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public SignalsProblemsDetections addSlowInteractionLongTasksItem(
      AggregatedSlowInteractionLongTask slowInteractionLongTasksItem) {
    if (this.slowInteractionLongTasks == null) {
      this.slowInteractionLongTasks = new ArrayList<>();
    }
    this.slowInteractionLongTasks.add(slowInteractionLongTasksItem);
    this.unparsed |= slowInteractionLongTasksItem.unparsed;
    return this;
  }

  /**
   * Detected slow interaction with long task issues.
   *
   * @return slowInteractionLongTasks
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLOW_INTERACTION_LONG_TASKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AggregatedSlowInteractionLongTask> getSlowInteractionLongTasks() {
    return slowInteractionLongTasks;
  }

  public void setSlowInteractionLongTasks(
      List<AggregatedSlowInteractionLongTask> slowInteractionLongTasks) {
    this.slowInteractionLongTasks = slowInteractionLongTasks;
    if (slowInteractionLongTasks != null) {
      for (AggregatedSlowInteractionLongTask item : slowInteractionLongTasks) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SignalsProblemsDetections uncompressedResources(
      List<AggregatedUncompressedResource> uncompressedResources) {
    this.uncompressedResources = uncompressedResources;
    if (uncompressedResources != null) {
      for (AggregatedUncompressedResource item : uncompressedResources) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public SignalsProblemsDetections addUncompressedResourcesItem(
      AggregatedUncompressedResource uncompressedResourcesItem) {
    if (this.uncompressedResources == null) {
      this.uncompressedResources = new ArrayList<>();
    }
    this.uncompressedResources.add(uncompressedResourcesItem);
    this.unparsed |= uncompressedResourcesItem.unparsed;
    return this;
  }

  /**
   * Detected uncompressed resource issues.
   *
   * @return uncompressedResources
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNCOMPRESSED_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AggregatedUncompressedResource> getUncompressedResources() {
    return uncompressedResources;
  }

  public void setUncompressedResources(List<AggregatedUncompressedResource> uncompressedResources) {
    this.uncompressedResources = uncompressedResources;
    if (uncompressedResources != null) {
      for (AggregatedUncompressedResource item : uncompressedResources) {
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
   * @return SignalsProblemsDetections
   */
  @JsonAnySetter
  public SignalsProblemsDetections putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SignalsProblemsDetections object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignalsProblemsDetections signalsProblemsDetections = (SignalsProblemsDetections) o;
    return Objects.equals(this.highFrozenFrameRates, signalsProblemsDetections.highFrozenFrameRates)
        && Objects.equals(
            this.highScriptEvaluations, signalsProblemsDetections.highScriptEvaluations)
        && Objects.equals(this.lowCacheHitRates, signalsProblemsDetections.lowCacheHitRates)
        && Objects.equals(
            this.mobileScrollFrictions, signalsProblemsDetections.mobileScrollFrictions)
        && Objects.equals(this.slowFcpHighBytes, signalsProblemsDetections.slowFcpHighBytes)
        && Objects.equals(
            this.slowInteractionLongTasks, signalsProblemsDetections.slowInteractionLongTasks)
        && Objects.equals(
            this.uncompressedResources, signalsProblemsDetections.uncompressedResources)
        && Objects.equals(
            this.additionalProperties, signalsProblemsDetections.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        highFrozenFrameRates,
        highScriptEvaluations,
        lowCacheHitRates,
        mobileScrollFrictions,
        slowFcpHighBytes,
        slowInteractionLongTasks,
        uncompressedResources,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignalsProblemsDetections {\n");
    sb.append("    highFrozenFrameRates: ")
        .append(toIndentedString(highFrozenFrameRates))
        .append("\n");
    sb.append("    highScriptEvaluations: ")
        .append(toIndentedString(highScriptEvaluations))
        .append("\n");
    sb.append("    lowCacheHitRates: ").append(toIndentedString(lowCacheHitRates)).append("\n");
    sb.append("    mobileScrollFrictions: ")
        .append(toIndentedString(mobileScrollFrictions))
        .append("\n");
    sb.append("    slowFcpHighBytes: ").append(toIndentedString(slowFcpHighBytes)).append("\n");
    sb.append("    slowInteractionLongTasks: ")
        .append(toIndentedString(slowInteractionLongTasks))
        .append("\n");
    sb.append("    uncompressedResources: ")
        .append(toIndentedString(uncompressedResources))
        .append("\n");
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

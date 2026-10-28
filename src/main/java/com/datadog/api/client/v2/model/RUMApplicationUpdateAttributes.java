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

/**
 * RUM application update attributes. Only the attributes you provide are changed, omitted
 * attributes keep their current value. Changing <code>product_analytics_retention_state</code> or
 * <code>product_analytics_replay_sample_rate</code> requires the <code>product_analytics_apps_write
 * </code> permission.
 */
@JsonPropertyOrder({
  RUMApplicationUpdateAttributes.JSON_PROPERTY_APM_RUM_FLAT_SAMPLING_REPLAY_ENABLED,
  RUMApplicationUpdateAttributes.JSON_PROPERTY_APM_RUM_FLAT_SAMPLING_REPLAY_SAMPLE_RATE,
  RUMApplicationUpdateAttributes.JSON_PROPERTY_ERROR_TRACKING_EXCLUSION_FILTER_ENABLED,
  RUMApplicationUpdateAttributes.JSON_PROPERTY_INSTRUMENTATION_TYPE,
  RUMApplicationUpdateAttributes.JSON_PROPERTY_NAME,
  RUMApplicationUpdateAttributes.JSON_PROPERTY_PRODUCT_ANALYTICS_REPLAY_SAMPLE_RATE,
  RUMApplicationUpdateAttributes.JSON_PROPERTY_PRODUCT_ANALYTICS_RETENTION_STATE,
  RUMApplicationUpdateAttributes.JSON_PROPERTY_REMOTE_CONFIG_ID,
  RUMApplicationUpdateAttributes.JSON_PROPERTY_RUM_EVENT_PROCESSING_STATE,
  RUMApplicationUpdateAttributes.JSON_PROPERTY_TAGS,
  RUMApplicationUpdateAttributes.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RUMApplicationUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APM_RUM_FLAT_SAMPLING_REPLAY_ENABLED =
      "apm_rum_flat_sampling_replay_enabled";
  private Boolean apmRumFlatSamplingReplayEnabled;

  public static final String JSON_PROPERTY_APM_RUM_FLAT_SAMPLING_REPLAY_SAMPLE_RATE =
      "apm_rum_flat_sampling_replay_sample_rate";
  private Double apmRumFlatSamplingReplaySampleRate;

  public static final String JSON_PROPERTY_ERROR_TRACKING_EXCLUSION_FILTER_ENABLED =
      "error_tracking_exclusion_filter_enabled";
  private Boolean errorTrackingExclusionFilterEnabled;

  public static final String JSON_PROPERTY_INSTRUMENTATION_TYPE = "instrumentation_type";
  private String instrumentationType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PRODUCT_ANALYTICS_REPLAY_SAMPLE_RATE =
      "product_analytics_replay_sample_rate";
  private Integer productAnalyticsReplaySampleRate;

  public static final String JSON_PROPERTY_PRODUCT_ANALYTICS_RETENTION_STATE =
      "product_analytics_retention_state";
  private RUMProductAnalyticsRetentionState productAnalyticsRetentionState;

  public static final String JSON_PROPERTY_REMOTE_CONFIG_ID = "remote_config_id";
  private String remoteConfigId;

  public static final String JSON_PROPERTY_RUM_EVENT_PROCESSING_STATE =
      "rum_event_processing_state";
  private RUMEventProcessingState rumEventProcessingState;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public RUMApplicationUpdateAttributes apmRumFlatSamplingReplayEnabled(
      Boolean apmRumFlatSamplingReplayEnabled) {
    this.apmRumFlatSamplingReplayEnabled = apmRumFlatSamplingReplayEnabled;
    return this;
  }

  /**
   * Indicates if flat sampling of Session Replay for APM-correlated RUM sessions is enabled.
   *
   * @return apmRumFlatSamplingReplayEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_RUM_FLAT_SAMPLING_REPLAY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getApmRumFlatSamplingReplayEnabled() {
    return apmRumFlatSamplingReplayEnabled;
  }

  public void setApmRumFlatSamplingReplayEnabled(Boolean apmRumFlatSamplingReplayEnabled) {
    this.apmRumFlatSamplingReplayEnabled = apmRumFlatSamplingReplayEnabled;
  }

  public RUMApplicationUpdateAttributes apmRumFlatSamplingReplaySampleRate(
      Double apmRumFlatSamplingReplaySampleRate) {
    this.apmRumFlatSamplingReplaySampleRate = apmRumFlatSamplingReplaySampleRate;
    return this;
  }

  /**
   * Sample rate (0-100) of Session Replay for APM-correlated RUM sessions when flat sampling is
   * enabled.
   *
   * @return apmRumFlatSamplingReplaySampleRate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_RUM_FLAT_SAMPLING_REPLAY_SAMPLE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getApmRumFlatSamplingReplaySampleRate() {
    return apmRumFlatSamplingReplaySampleRate;
  }

  public void setApmRumFlatSamplingReplaySampleRate(Double apmRumFlatSamplingReplaySampleRate) {
    this.apmRumFlatSamplingReplaySampleRate = apmRumFlatSamplingReplaySampleRate;
  }

  public RUMApplicationUpdateAttributes errorTrackingExclusionFilterEnabled(
      Boolean errorTrackingExclusionFilterEnabled) {
    this.errorTrackingExclusionFilterEnabled = errorTrackingExclusionFilterEnabled;
    return this;
  }

  /**
   * Indicates if Error Tracking exclusion filters are enabled for the application.
   *
   * @return errorTrackingExclusionFilterEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_TRACKING_EXCLUSION_FILTER_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getErrorTrackingExclusionFilterEnabled() {
    return errorTrackingExclusionFilterEnabled;
  }

  public void setErrorTrackingExclusionFilterEnabled(Boolean errorTrackingExclusionFilterEnabled) {
    this.errorTrackingExclusionFilterEnabled = errorTrackingExclusionFilterEnabled;
  }

  public RUMApplicationUpdateAttributes instrumentationType(String instrumentationType) {
    this.instrumentationType = instrumentationType;
    return this;
  }

  /**
   * Instrumentation type of the RUM application.
   *
   * @return instrumentationType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTRUMENTATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInstrumentationType() {
    return instrumentationType;
  }

  public void setInstrumentationType(String instrumentationType) {
    this.instrumentationType = instrumentationType;
  }

  public RUMApplicationUpdateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * New name of the RUM application.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RUMApplicationUpdateAttributes productAnalyticsReplaySampleRate(
      Integer productAnalyticsReplaySampleRate) {
    this.productAnalyticsReplaySampleRate = productAnalyticsReplaySampleRate;
    return this;
  }

  /**
   * Sample rate (0-100) of Session Replay for Product Analytics sessions. maximum: 2147483647
   *
   * @return productAnalyticsReplaySampleRate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_ANALYTICS_REPLAY_SAMPLE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getProductAnalyticsReplaySampleRate() {
    return productAnalyticsReplaySampleRate;
  }

  public void setProductAnalyticsReplaySampleRate(Integer productAnalyticsReplaySampleRate) {
    this.productAnalyticsReplaySampleRate = productAnalyticsReplaySampleRate;
  }

  public RUMApplicationUpdateAttributes productAnalyticsRetentionState(
      RUMProductAnalyticsRetentionState productAnalyticsRetentionState) {
    this.productAnalyticsRetentionState = productAnalyticsRetentionState;
    this.unparsed |= !productAnalyticsRetentionState.isValid();
    return this;
  }

  /**
   * Controls the retention policy for Product Analytics data derived from RUM events. Requests also
   * accept <code>PREVIEW</code> (the initial state of a new application, reported as <code>NONE
   * </code> in responses). Setting <code>MAX</code> requires the <code>product_analytics_apps_write
   * </code> permission.
   *
   * @return productAnalyticsRetentionState
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_ANALYTICS_RETENTION_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RUMProductAnalyticsRetentionState getProductAnalyticsRetentionState() {
    return productAnalyticsRetentionState;
  }

  public void setProductAnalyticsRetentionState(
      RUMProductAnalyticsRetentionState productAnalyticsRetentionState) {
    if (!productAnalyticsRetentionState.isValid()) {
      this.unparsed = true;
    }
    this.productAnalyticsRetentionState = productAnalyticsRetentionState;
  }

  public RUMApplicationUpdateAttributes remoteConfigId(String remoteConfigId) {
    this.remoteConfigId = remoteConfigId;
    return this;
  }

  /**
   * ID of the RUM SDK remote configuration to associate with the application.
   *
   * @return remoteConfigId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMOTE_CONFIG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRemoteConfigId() {
    return remoteConfigId;
  }

  public void setRemoteConfigId(String remoteConfigId) {
    this.remoteConfigId = remoteConfigId;
  }

  public RUMApplicationUpdateAttributes rumEventProcessingState(
      RUMEventProcessingState rumEventProcessingState) {
    this.rumEventProcessingState = rumEventProcessingState;
    this.unparsed |= !rumEventProcessingState.isValid();
    return this;
  }

  /**
   * Configures which RUM events are processed and stored for the application. Defaults to <code>ALL
   * </code> when creating an application.
   *
   * @return rumEventProcessingState
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUM_EVENT_PROCESSING_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RUMEventProcessingState getRumEventProcessingState() {
    return rumEventProcessingState;
  }

  public void setRumEventProcessingState(RUMEventProcessingState rumEventProcessingState) {
    if (!rumEventProcessingState.isValid()) {
      this.unparsed = true;
    }
    this.rumEventProcessingState = rumEventProcessingState;
  }

  public RUMApplicationUpdateAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public RUMApplicationUpdateAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * New list of tags of the RUM application, in <code>key:value</code> format. Replaces the
   * existing tags.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public RUMApplicationUpdateAttributes type(String type) {
    this.type = type;
    return this;
  }

  /**
   * New type of the RUM application. Supported values are <code>browser</code>, <code>ios</code>,
   * <code>android</code>, <code>react-native</code>, <code>flutter</code>, <code>roku</code>,
   * <code>electron</code>, <code>unity</code>, <code>kotlin-multiplatform</code>, <code>react
   * </code>, <code>nextjs</code>, <code>angular</code>, <code>vuejs</code>, <code>nuxt</code>,
   * <code>tanstack</code>, <code>maui</code>, <code>salesforce-lwc</code>, <code>shopify</code>,
   * <code>cpp</code>, <code>rum-cpp</code>, <code>unreal</code>.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
   * @return RUMApplicationUpdateAttributes
   */
  @JsonAnySetter
  public RUMApplicationUpdateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RUMApplicationUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMApplicationUpdateAttributes rumApplicationUpdateAttributes =
        (RUMApplicationUpdateAttributes) o;
    return Objects.equals(
            this.apmRumFlatSamplingReplayEnabled,
            rumApplicationUpdateAttributes.apmRumFlatSamplingReplayEnabled)
        && Objects.equals(
            this.apmRumFlatSamplingReplaySampleRate,
            rumApplicationUpdateAttributes.apmRumFlatSamplingReplaySampleRate)
        && Objects.equals(
            this.errorTrackingExclusionFilterEnabled,
            rumApplicationUpdateAttributes.errorTrackingExclusionFilterEnabled)
        && Objects.equals(
            this.instrumentationType, rumApplicationUpdateAttributes.instrumentationType)
        && Objects.equals(this.name, rumApplicationUpdateAttributes.name)
        && Objects.equals(
            this.productAnalyticsReplaySampleRate,
            rumApplicationUpdateAttributes.productAnalyticsReplaySampleRate)
        && Objects.equals(
            this.productAnalyticsRetentionState,
            rumApplicationUpdateAttributes.productAnalyticsRetentionState)
        && Objects.equals(this.remoteConfigId, rumApplicationUpdateAttributes.remoteConfigId)
        && Objects.equals(
            this.rumEventProcessingState, rumApplicationUpdateAttributes.rumEventProcessingState)
        && Objects.equals(this.tags, rumApplicationUpdateAttributes.tags)
        && Objects.equals(this.type, rumApplicationUpdateAttributes.type)
        && Objects.equals(
            this.additionalProperties, rumApplicationUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        apmRumFlatSamplingReplayEnabled,
        apmRumFlatSamplingReplaySampleRate,
        errorTrackingExclusionFilterEnabled,
        instrumentationType,
        name,
        productAnalyticsReplaySampleRate,
        productAnalyticsRetentionState,
        remoteConfigId,
        rumEventProcessingState,
        tags,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMApplicationUpdateAttributes {\n");
    sb.append("    apmRumFlatSamplingReplayEnabled: ")
        .append(toIndentedString(apmRumFlatSamplingReplayEnabled))
        .append("\n");
    sb.append("    apmRumFlatSamplingReplaySampleRate: ")
        .append(toIndentedString(apmRumFlatSamplingReplaySampleRate))
        .append("\n");
    sb.append("    errorTrackingExclusionFilterEnabled: ")
        .append(toIndentedString(errorTrackingExclusionFilterEnabled))
        .append("\n");
    sb.append("    instrumentationType: ")
        .append(toIndentedString(instrumentationType))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productAnalyticsReplaySampleRate: ")
        .append(toIndentedString(productAnalyticsReplaySampleRate))
        .append("\n");
    sb.append("    productAnalyticsRetentionState: ")
        .append(toIndentedString(productAnalyticsRetentionState))
        .append("\n");
    sb.append("    remoteConfigId: ").append(toIndentedString(remoteConfigId)).append("\n");
    sb.append("    rumEventProcessingState: ")
        .append(toIndentedString(rumEventProcessingState))
        .append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

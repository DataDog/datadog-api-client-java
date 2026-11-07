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

/**
 * RUM application creation attributes. When <code>rum_event_processing_state</code> is omitted, it
 * defaults to <code>ALL</code>. When <code>product_analytics_retention_state</code> is omitted,
 * Product Analytics is not enabled. Setting it to <code>MAX</code> requires the <code>
 * product_analytics_apps_write</code> permission.
 */
@JsonPropertyOrder({
  RUMApplicationCreateAttributes.JSON_PROPERTY_APM_RUM_FLAT_SAMPLING_REPLAY_ENABLED,
  RUMApplicationCreateAttributes.JSON_PROPERTY_APM_RUM_FLAT_SAMPLING_REPLAY_SAMPLE_RATE,
  RUMApplicationCreateAttributes.JSON_PROPERTY_CREATE_DEFAULT_RETENTION_FILTERS,
  RUMApplicationCreateAttributes.JSON_PROPERTY_ERROR_TRACKING_EXCLUSION_FILTER_ENABLED,
  RUMApplicationCreateAttributes.JSON_PROPERTY_NAME,
  RUMApplicationCreateAttributes.JSON_PROPERTY_PRODUCT_ANALYTICS_REPLAY_SAMPLE_RATE,
  RUMApplicationCreateAttributes.JSON_PROPERTY_PRODUCT_ANALYTICS_RETENTION_STATE,
  RUMApplicationCreateAttributes.JSON_PROPERTY_RUM_EVENT_PROCESSING_STATE,
  RUMApplicationCreateAttributes.JSON_PROPERTY_TAGS,
  RUMApplicationCreateAttributes.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RUMApplicationCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APM_RUM_FLAT_SAMPLING_REPLAY_ENABLED =
      "apm_rum_flat_sampling_replay_enabled";
  private Boolean apmRumFlatSamplingReplayEnabled;

  public static final String JSON_PROPERTY_APM_RUM_FLAT_SAMPLING_REPLAY_SAMPLE_RATE =
      "apm_rum_flat_sampling_replay_sample_rate";
  private Double apmRumFlatSamplingReplaySampleRate;

  public static final String JSON_PROPERTY_CREATE_DEFAULT_RETENTION_FILTERS =
      "create_default_retention_filters";
  private Boolean createDefaultRetentionFilters = true;

  public static final String JSON_PROPERTY_ERROR_TRACKING_EXCLUSION_FILTER_ENABLED =
      "error_tracking_exclusion_filter_enabled";
  private Boolean errorTrackingExclusionFilterEnabled;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PRODUCT_ANALYTICS_REPLAY_SAMPLE_RATE =
      "product_analytics_replay_sample_rate";
  private Integer productAnalyticsReplaySampleRate;

  public static final String JSON_PROPERTY_PRODUCT_ANALYTICS_RETENTION_STATE =
      "product_analytics_retention_state";
  private RUMProductAnalyticsRetentionState productAnalyticsRetentionState;

  public static final String JSON_PROPERTY_RUM_EVENT_PROCESSING_STATE =
      "rum_event_processing_state";
  private RUMEventProcessingState rumEventProcessingState;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public RUMApplicationCreateAttributes() {}

  @JsonCreator
  public RUMApplicationCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public RUMApplicationCreateAttributes apmRumFlatSamplingReplayEnabled(
      Boolean apmRumFlatSamplingReplayEnabled) {
    this.apmRumFlatSamplingReplayEnabled = apmRumFlatSamplingReplayEnabled;
    return this;
  }

  /**
   * Indicates if flat sampling of Session Replay for APM-correlated RUM sessions is enabled.
   * Defaults to <code>true</code>.
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

  public RUMApplicationCreateAttributes apmRumFlatSamplingReplaySampleRate(
      Double apmRumFlatSamplingReplaySampleRate) {
    this.apmRumFlatSamplingReplaySampleRate = apmRumFlatSamplingReplaySampleRate;
    return this;
  }

  /**
   * Sample rate (0-100) of Session Replay for APM-correlated RUM sessions when flat sampling is
   * enabled. Defaults to <code>1</code>.
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

  public RUMApplicationCreateAttributes createDefaultRetentionFilters(
      Boolean createDefaultRetentionFilters) {
    this.createDefaultRetentionFilters = createDefaultRetentionFilters;
    return this;
  }

  /**
   * Whether to create the default retention filters when the application is created: <code>
   * Sessions with errors</code> and <code>Sessions</code>, each with a 100% retention rate. Set to
   * <code>false</code> to create the application without them, for example when you add your own
   * retention filters right after creating it. Until you add retention filters, the application
   * only retains sessions matched by its <a
   * href="https://docs.datadoghq.com/real_user_monitoring/rum_without_limits/retention_filters/#permanent-retention-filters">permanent
   * retention filters</a>. This setting doesn't affect permanent retention filters (sessions with
   * forced replays, Synthetics sessions and RUM-APM flat sampling).
   *
   * @return createDefaultRetentionFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_DEFAULT_RETENTION_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCreateDefaultRetentionFilters() {
    return createDefaultRetentionFilters;
  }

  public void setCreateDefaultRetentionFilters(Boolean createDefaultRetentionFilters) {
    this.createDefaultRetentionFilters = createDefaultRetentionFilters;
  }

  public RUMApplicationCreateAttributes errorTrackingExclusionFilterEnabled(
      Boolean errorTrackingExclusionFilterEnabled) {
    this.errorTrackingExclusionFilterEnabled = errorTrackingExclusionFilterEnabled;
    return this;
  }

  /**
   * Indicates if Error Tracking exclusion filters are enabled for the application. Defaults to
   * <code>false</code>.
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

  public RUMApplicationCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the RUM application. Between 1 and 255 characters.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RUMApplicationCreateAttributes productAnalyticsReplaySampleRate(
      Integer productAnalyticsReplaySampleRate) {
    this.productAnalyticsReplaySampleRate = productAnalyticsReplaySampleRate;
    return this;
  }

  /**
   * Sample rate (0-100) of Session Replay for Product Analytics sessions. Defaults to <code>100
   * </code>. maximum: 2147483647
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

  public RUMApplicationCreateAttributes productAnalyticsRetentionState(
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

  public RUMApplicationCreateAttributes rumEventProcessingState(
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

  public RUMApplicationCreateAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public RUMApplicationCreateAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * List of tags to associate with the RUM application, in <code>key:value</code> format.
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

  public RUMApplicationCreateAttributes type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the RUM application. Defaults to <code>browser</code>. Supported values are <code>
   * browser</code>, <code>ios</code>, <code>android</code>, <code>react-native</code>, <code>
   * flutter</code>, <code>roku</code>, <code>electron</code>, <code>unity</code>, <code>
   * kotlin-multiplatform</code>, <code>react</code>, <code>nextjs</code>, <code>angular</code>,
   * <code>vuejs</code>, <code>nuxt</code>, <code>tanstack</code>, <code>maui</code>, <code>
   * salesforce-lwc</code>, <code>shopify</code>, <code>cpp</code>, <code>rum-cpp</code>, <code>
   * unreal</code>.
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
   * @return RUMApplicationCreateAttributes
   */
  @JsonAnySetter
  public RUMApplicationCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RUMApplicationCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMApplicationCreateAttributes rumApplicationCreateAttributes =
        (RUMApplicationCreateAttributes) o;
    return Objects.equals(
            this.apmRumFlatSamplingReplayEnabled,
            rumApplicationCreateAttributes.apmRumFlatSamplingReplayEnabled)
        && Objects.equals(
            this.apmRumFlatSamplingReplaySampleRate,
            rumApplicationCreateAttributes.apmRumFlatSamplingReplaySampleRate)
        && Objects.equals(
            this.createDefaultRetentionFilters,
            rumApplicationCreateAttributes.createDefaultRetentionFilters)
        && Objects.equals(
            this.errorTrackingExclusionFilterEnabled,
            rumApplicationCreateAttributes.errorTrackingExclusionFilterEnabled)
        && Objects.equals(this.name, rumApplicationCreateAttributes.name)
        && Objects.equals(
            this.productAnalyticsReplaySampleRate,
            rumApplicationCreateAttributes.productAnalyticsReplaySampleRate)
        && Objects.equals(
            this.productAnalyticsRetentionState,
            rumApplicationCreateAttributes.productAnalyticsRetentionState)
        && Objects.equals(
            this.rumEventProcessingState, rumApplicationCreateAttributes.rumEventProcessingState)
        && Objects.equals(this.tags, rumApplicationCreateAttributes.tags)
        && Objects.equals(this.type, rumApplicationCreateAttributes.type)
        && Objects.equals(
            this.additionalProperties, rumApplicationCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        apmRumFlatSamplingReplayEnabled,
        apmRumFlatSamplingReplaySampleRate,
        createDefaultRetentionFilters,
        errorTrackingExclusionFilterEnabled,
        name,
        productAnalyticsReplaySampleRate,
        productAnalyticsRetentionState,
        rumEventProcessingState,
        tags,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMApplicationCreateAttributes {\n");
    sb.append("    apmRumFlatSamplingReplayEnabled: ")
        .append(toIndentedString(apmRumFlatSamplingReplayEnabled))
        .append("\n");
    sb.append("    apmRumFlatSamplingReplaySampleRate: ")
        .append(toIndentedString(apmRumFlatSamplingReplaySampleRate))
        .append("\n");
    sb.append("    createDefaultRetentionFilters: ")
        .append(toIndentedString(createDefaultRetentionFilters))
        .append("\n");
    sb.append("    errorTrackingExclusionFilterEnabled: ")
        .append(toIndentedString(errorTrackingExclusionFilterEnabled))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productAnalyticsReplaySampleRate: ")
        .append(toIndentedString(productAnalyticsReplaySampleRate))
        .append("\n");
    sb.append("    productAnalyticsRetentionState: ")
        .append(toIndentedString(productAnalyticsRetentionState))
        .append("\n");
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

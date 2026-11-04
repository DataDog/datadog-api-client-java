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

/** RUM application list attributes. */
@JsonPropertyOrder({
  RUMApplicationListAttributes.JSON_PROPERTY_API_KEY_ID,
  RUMApplicationListAttributes.JSON_PROPERTY_APM_RUM_FLAT_SAMPLING_REPLAY_ENABLED,
  RUMApplicationListAttributes.JSON_PROPERTY_APM_RUM_FLAT_SAMPLING_REPLAY_SAMPLE_RATE,
  RUMApplicationListAttributes.JSON_PROPERTY_APPLICATION_ID,
  RUMApplicationListAttributes.JSON_PROPERTY_CREATED_AT,
  RUMApplicationListAttributes.JSON_PROPERTY_CREATED_BY_HANDLE,
  RUMApplicationListAttributes.JSON_PROPERTY_DISABLED_AT,
  RUMApplicationListAttributes.JSON_PROPERTY_DISABLED_BY_HANDLE,
  RUMApplicationListAttributes.JSON_PROPERTY_ERROR_TRACKING_EXCLUSION_FILTER_ENABLED,
  RUMApplicationListAttributes.JSON_PROPERTY_EXTERNAL_FEEDS,
  RUMApplicationListAttributes.JSON_PROPERTY_HASH,
  RUMApplicationListAttributes.JSON_PROPERTY_IS_ACTIVE,
  RUMApplicationListAttributes.JSON_PROPERTY_NAME,
  RUMApplicationListAttributes.JSON_PROPERTY_OOTB_METRICS_INSTALLED,
  RUMApplicationListAttributes.JSON_PROPERTY_ORG_ID,
  RUMApplicationListAttributes.JSON_PROPERTY_PRODUCT_ANALYTICS_PREVIEW_DISABLED,
  RUMApplicationListAttributes.JSON_PROPERTY_PRODUCT_ANALYTICS_REPLAY_SAMPLE_RATE,
  RUMApplicationListAttributes.JSON_PROPERTY_PRODUCT_SCALES,
  RUMApplicationListAttributes.JSON_PROPERTY_REMOTE_CONFIG_ID,
  RUMApplicationListAttributes.JSON_PROPERTY_SHORT_NAME,
  RUMApplicationListAttributes.JSON_PROPERTY_TAGS,
  RUMApplicationListAttributes.JSON_PROPERTY_TYPE,
  RUMApplicationListAttributes.JSON_PROPERTY_UPDATED_AT,
  RUMApplicationListAttributes.JSON_PROPERTY_UPDATED_BY_HANDLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RUMApplicationListAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_KEY_ID = "api_key_id";
  private Integer apiKeyId;

  public static final String JSON_PROPERTY_APM_RUM_FLAT_SAMPLING_REPLAY_ENABLED =
      "apm_rum_flat_sampling_replay_enabled";
  private Boolean apmRumFlatSamplingReplayEnabled;

  public static final String JSON_PROPERTY_APM_RUM_FLAT_SAMPLING_REPLAY_SAMPLE_RATE =
      "apm_rum_flat_sampling_replay_sample_rate";
  private Double apmRumFlatSamplingReplaySampleRate;

  public static final String JSON_PROPERTY_APPLICATION_ID = "application_id";
  private String applicationId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_CREATED_BY_HANDLE = "created_by_handle";
  private String createdByHandle;

  public static final String JSON_PROPERTY_DISABLED_AT = "disabled_at";
  private Long disabledAt;

  public static final String JSON_PROPERTY_DISABLED_BY_HANDLE = "disabled_by_handle";
  private String disabledByHandle;

  public static final String JSON_PROPERTY_ERROR_TRACKING_EXCLUSION_FILTER_ENABLED =
      "error_tracking_exclusion_filter_enabled";
  private Boolean errorTrackingExclusionFilterEnabled;

  public static final String JSON_PROPERTY_EXTERNAL_FEEDS = "external_feeds";
  private List<String> externalFeeds = null;

  public static final String JSON_PROPERTY_HASH = "hash";
  private String hash;

  public static final String JSON_PROPERTY_IS_ACTIVE = "is_active";
  private Boolean isActive;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OOTB_METRICS_INSTALLED = "ootb_metrics_installed";
  private Boolean ootbMetricsInstalled;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Integer orgId;

  public static final String JSON_PROPERTY_PRODUCT_ANALYTICS_PREVIEW_DISABLED =
      "product_analytics_preview_disabled";
  private Boolean productAnalyticsPreviewDisabled;

  public static final String JSON_PROPERTY_PRODUCT_ANALYTICS_REPLAY_SAMPLE_RATE =
      "product_analytics_replay_sample_rate";
  private Integer productAnalyticsReplaySampleRate;

  public static final String JSON_PROPERTY_PRODUCT_SCALES = "product_scales";
  private RUMProductScales productScales;

  public static final String JSON_PROPERTY_REMOTE_CONFIG_ID = "remote_config_id";
  private String remoteConfigId;

  public static final String JSON_PROPERTY_SHORT_NAME = "short_name";
  private String shortName;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Long updatedAt;

  public static final String JSON_PROPERTY_UPDATED_BY_HANDLE = "updated_by_handle";
  private String updatedByHandle;

  public RUMApplicationListAttributes() {}

  @JsonCreator
  public RUMApplicationListAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_APPLICATION_ID) String applicationId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) Long createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY_HANDLE)
          String createdByHandle,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORG_ID) Integer orgId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) Long updatedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_BY_HANDLE)
          String updatedByHandle) {
    this.applicationId = applicationId;
    this.createdAt = createdAt;
    this.createdByHandle = createdByHandle;
    this.name = name;
    this.orgId = orgId;
    this.type = type;
    this.updatedAt = updatedAt;
    this.updatedByHandle = updatedByHandle;
  }

  public RUMApplicationListAttributes apiKeyId(Integer apiKeyId) {
    this.apiKeyId = apiKeyId;
    return this;
  }

  /**
   * ID of the API key associated with the application. maximum: 2147483647
   *
   * @return apiKeyId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getApiKeyId() {
    return apiKeyId;
  }

  public void setApiKeyId(Integer apiKeyId) {
    this.apiKeyId = apiKeyId;
  }

  public RUMApplicationListAttributes apmRumFlatSamplingReplayEnabled(
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

  public RUMApplicationListAttributes apmRumFlatSamplingReplaySampleRate(
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

  public RUMApplicationListAttributes applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * ID of the RUM application.
   *
   * @return applicationId
   */
  @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public RUMApplicationListAttributes createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp in ms of the creation date.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public RUMApplicationListAttributes createdByHandle(String createdByHandle) {
    this.createdByHandle = createdByHandle;
    return this;
  }

  /**
   * Handle of the creator user.
   *
   * @return createdByHandle
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedByHandle() {
    return createdByHandle;
  }

  public void setCreatedByHandle(String createdByHandle) {
    this.createdByHandle = createdByHandle;
  }

  public RUMApplicationListAttributes disabledAt(Long disabledAt) {
    this.disabledAt = disabledAt;
    return this;
  }

  /**
   * Timestamp in ms of the date the RUM application was disabled. Only present if the application
   * was disabled.
   *
   * @return disabledAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDisabledAt() {
    return disabledAt;
  }

  public void setDisabledAt(Long disabledAt) {
    this.disabledAt = disabledAt;
  }

  public RUMApplicationListAttributes disabledByHandle(String disabledByHandle) {
    this.disabledByHandle = disabledByHandle;
    return this;
  }

  /**
   * Handle of the user who disabled the RUM application. Only present if the application was
   * disabled.
   *
   * @return disabledByHandle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLED_BY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisabledByHandle() {
    return disabledByHandle;
  }

  public void setDisabledByHandle(String disabledByHandle) {
    this.disabledByHandle = disabledByHandle;
  }

  public RUMApplicationListAttributes errorTrackingExclusionFilterEnabled(
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

  public RUMApplicationListAttributes externalFeeds(List<String> externalFeeds) {
    this.externalFeeds = externalFeeds;
    return this;
  }

  public RUMApplicationListAttributes addExternalFeedsItem(String externalFeedsItem) {
    if (this.externalFeeds == null) {
      this.externalFeeds = new ArrayList<>();
    }
    this.externalFeeds.add(externalFeedsItem);
    return this;
  }

  /**
   * Non-native ingestion paths the RUM application sends its data through. <code>otel</code> means
   * the application sends RUM data through OpenTelemetry instead of the Datadog RUM SDK.
   *
   * @return externalFeeds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_FEEDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getExternalFeeds() {
    return externalFeeds;
  }

  public void setExternalFeeds(List<String> externalFeeds) {
    this.externalFeeds = externalFeeds;
  }

  public RUMApplicationListAttributes hash(String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * Hash of the RUM application. Optional.
   *
   * @return hash
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public RUMApplicationListAttributes isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Indicates if the RUM application is active.
   *
   * @return isActive
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public RUMApplicationListAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the RUM application.
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

  public RUMApplicationListAttributes ootbMetricsInstalled(Boolean ootbMetricsInstalled) {
    this.ootbMetricsInstalled = ootbMetricsInstalled;
    return this;
  }

  /**
   * Indicates if the out-of-the-box RUM metrics are installed for the application.
   *
   * @return ootbMetricsInstalled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OOTB_METRICS_INSTALLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getOotbMetricsInstalled() {
    return ootbMetricsInstalled;
  }

  public void setOotbMetricsInstalled(Boolean ootbMetricsInstalled) {
    this.ootbMetricsInstalled = ootbMetricsInstalled;
  }

  public RUMApplicationListAttributes orgId(Integer orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * Org ID of the RUM application. maximum: 2147483647
   *
   * @return orgId
   */
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getOrgId() {
    return orgId;
  }

  public void setOrgId(Integer orgId) {
    this.orgId = orgId;
  }

  public RUMApplicationListAttributes productAnalyticsPreviewDisabled(
      Boolean productAnalyticsPreviewDisabled) {
    this.productAnalyticsPreviewDisabled = productAnalyticsPreviewDisabled;
    return this;
  }

  /**
   * Indicates that the Product Analytics preview is disabled for the application. Only present (and
   * <code>true</code>) when the Product Analytics retention state is not preview.
   *
   * @return productAnalyticsPreviewDisabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_ANALYTICS_PREVIEW_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getProductAnalyticsPreviewDisabled() {
    return productAnalyticsPreviewDisabled;
  }

  public void setProductAnalyticsPreviewDisabled(Boolean productAnalyticsPreviewDisabled) {
    this.productAnalyticsPreviewDisabled = productAnalyticsPreviewDisabled;
  }

  public RUMApplicationListAttributes productAnalyticsReplaySampleRate(
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

  public RUMApplicationListAttributes productScales(RUMProductScales productScales) {
    this.productScales = productScales;
    this.unparsed |= productScales.unparsed;
    return this;
  }

  /**
   * Product Scales configuration for the RUM application.
   *
   * @return productScales
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_SCALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RUMProductScales getProductScales() {
    return productScales;
  }

  public void setProductScales(RUMProductScales productScales) {
    this.productScales = productScales;
    if (productScales != null) {
      this.unparsed |= productScales.unparsed;
    }
  }

  public RUMApplicationListAttributes remoteConfigId(String remoteConfigId) {
    this.remoteConfigId = remoteConfigId;
    return this;
  }

  /**
   * ID of the RUM SDK remote configuration for the application, if one exists.
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

  public RUMApplicationListAttributes shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * Short name of the RUM application.
   *
   * @return shortName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public RUMApplicationListAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public RUMApplicationListAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * List of tags associated with the RUM application.
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

  public RUMApplicationListAttributes type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the RUM application. Possible values are <code>browser</code>, <code>ios</code>, <code>
   * android</code>, <code>react-native</code>, <code>flutter</code>, <code>roku</code>, <code>
   * electron</code>, <code>unity</code>, <code>kotlin-multiplatform</code>, <code>react</code>,
   * <code>nextjs</code>, <code>angular</code>, <code>vuejs</code>, <code>nuxt</code>, <code>
   * tanstack</code>, <code>maui</code>, <code>salesforce-lwc</code>, <code>shopify</code>, <code>
   * cpp</code>, <code>rum-cpp</code>, <code>unreal</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RUMApplicationListAttributes updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp in ms of the last update date.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }

  public RUMApplicationListAttributes updatedByHandle(String updatedByHandle) {
    this.updatedByHandle = updatedByHandle;
    return this;
  }

  /**
   * Handle of the updater user.
   *
   * @return updatedByHandle
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_BY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUpdatedByHandle() {
    return updatedByHandle;
  }

  public void setUpdatedByHandle(String updatedByHandle) {
    this.updatedByHandle = updatedByHandle;
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
   * @return RUMApplicationListAttributes
   */
  @JsonAnySetter
  public RUMApplicationListAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RUMApplicationListAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMApplicationListAttributes rumApplicationListAttributes = (RUMApplicationListAttributes) o;
    return Objects.equals(this.apiKeyId, rumApplicationListAttributes.apiKeyId)
        && Objects.equals(
            this.apmRumFlatSamplingReplayEnabled,
            rumApplicationListAttributes.apmRumFlatSamplingReplayEnabled)
        && Objects.equals(
            this.apmRumFlatSamplingReplaySampleRate,
            rumApplicationListAttributes.apmRumFlatSamplingReplaySampleRate)
        && Objects.equals(this.applicationId, rumApplicationListAttributes.applicationId)
        && Objects.equals(this.createdAt, rumApplicationListAttributes.createdAt)
        && Objects.equals(this.createdByHandle, rumApplicationListAttributes.createdByHandle)
        && Objects.equals(this.disabledAt, rumApplicationListAttributes.disabledAt)
        && Objects.equals(this.disabledByHandle, rumApplicationListAttributes.disabledByHandle)
        && Objects.equals(
            this.errorTrackingExclusionFilterEnabled,
            rumApplicationListAttributes.errorTrackingExclusionFilterEnabled)
        && Objects.equals(this.externalFeeds, rumApplicationListAttributes.externalFeeds)
        && Objects.equals(this.hash, rumApplicationListAttributes.hash)
        && Objects.equals(this.isActive, rumApplicationListAttributes.isActive)
        && Objects.equals(this.name, rumApplicationListAttributes.name)
        && Objects.equals(
            this.ootbMetricsInstalled, rumApplicationListAttributes.ootbMetricsInstalled)
        && Objects.equals(this.orgId, rumApplicationListAttributes.orgId)
        && Objects.equals(
            this.productAnalyticsPreviewDisabled,
            rumApplicationListAttributes.productAnalyticsPreviewDisabled)
        && Objects.equals(
            this.productAnalyticsReplaySampleRate,
            rumApplicationListAttributes.productAnalyticsReplaySampleRate)
        && Objects.equals(this.productScales, rumApplicationListAttributes.productScales)
        && Objects.equals(this.remoteConfigId, rumApplicationListAttributes.remoteConfigId)
        && Objects.equals(this.shortName, rumApplicationListAttributes.shortName)
        && Objects.equals(this.tags, rumApplicationListAttributes.tags)
        && Objects.equals(this.type, rumApplicationListAttributes.type)
        && Objects.equals(this.updatedAt, rumApplicationListAttributes.updatedAt)
        && Objects.equals(this.updatedByHandle, rumApplicationListAttributes.updatedByHandle)
        && Objects.equals(
            this.additionalProperties, rumApplicationListAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        apiKeyId,
        apmRumFlatSamplingReplayEnabled,
        apmRumFlatSamplingReplaySampleRate,
        applicationId,
        createdAt,
        createdByHandle,
        disabledAt,
        disabledByHandle,
        errorTrackingExclusionFilterEnabled,
        externalFeeds,
        hash,
        isActive,
        name,
        ootbMetricsInstalled,
        orgId,
        productAnalyticsPreviewDisabled,
        productAnalyticsReplaySampleRate,
        productScales,
        remoteConfigId,
        shortName,
        tags,
        type,
        updatedAt,
        updatedByHandle,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMApplicationListAttributes {\n");
    sb.append("    apiKeyId: ").append(toIndentedString(apiKeyId)).append("\n");
    sb.append("    apmRumFlatSamplingReplayEnabled: ")
        .append(toIndentedString(apmRumFlatSamplingReplayEnabled))
        .append("\n");
    sb.append("    apmRumFlatSamplingReplaySampleRate: ")
        .append(toIndentedString(apmRumFlatSamplingReplaySampleRate))
        .append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdByHandle: ").append(toIndentedString(createdByHandle)).append("\n");
    sb.append("    disabledAt: ").append(toIndentedString(disabledAt)).append("\n");
    sb.append("    disabledByHandle: ").append(toIndentedString(disabledByHandle)).append("\n");
    sb.append("    errorTrackingExclusionFilterEnabled: ")
        .append(toIndentedString(errorTrackingExclusionFilterEnabled))
        .append("\n");
    sb.append("    externalFeeds: ").append(toIndentedString(externalFeeds)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ootbMetricsInstalled: ")
        .append(toIndentedString(ootbMetricsInstalled))
        .append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    productAnalyticsPreviewDisabled: ")
        .append(toIndentedString(productAnalyticsPreviewDisabled))
        .append("\n");
    sb.append("    productAnalyticsReplaySampleRate: ")
        .append(toIndentedString(productAnalyticsReplaySampleRate))
        .append("\n");
    sb.append("    productScales: ").append(toIndentedString(productScales)).append("\n");
    sb.append("    remoteConfigId: ").append(toIndentedString(remoteConfigId)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedByHandle: ").append(toIndentedString(updatedByHandle)).append("\n");
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

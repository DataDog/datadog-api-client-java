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

/** The RUM SDK settings for a configuration. */
@JsonPropertyOrder({
  RumSdkConfigRumAttributes.JSON_PROPERTY_ALLOWED_TRACING_URLS,
  RumSdkConfigRumAttributes.JSON_PROPERTY_ALLOWED_TRACKING_ORIGINS,
  RumSdkConfigRumAttributes.JSON_PROPERTY_APPLICATION_ID,
  RumSdkConfigRumAttributes.JSON_PROPERTY_CONTEXT,
  RumSdkConfigRumAttributes.JSON_PROPERTY_DEFAULT_PRIVACY_LEVEL,
  RumSdkConfigRumAttributes.JSON_PROPERTY_ENABLE_PRIVACY_FOR_ACTION_NAME,
  RumSdkConfigRumAttributes.JSON_PROPERTY_ENV,
  RumSdkConfigRumAttributes.JSON_PROPERTY_SERVICE,
  RumSdkConfigRumAttributes.JSON_PROPERTY_SESSION_REPLAY_SAMPLE_RATE,
  RumSdkConfigRumAttributes.JSON_PROPERTY_SESSION_SAMPLE_RATE,
  RumSdkConfigRumAttributes.JSON_PROPERTY_TRACE_SAMPLE_RATE,
  RumSdkConfigRumAttributes.JSON_PROPERTY_TRACK_SESSION_ACROSS_SUBDOMAINS,
  RumSdkConfigRumAttributes.JSON_PROPERTY_USER,
  RumSdkConfigRumAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumSdkConfigRumAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOWED_TRACING_URLS = "allowed_tracing_urls";
  private List<RumSdkConfigTracingUrlConfig> allowedTracingUrls = null;

  public static final String JSON_PROPERTY_ALLOWED_TRACKING_ORIGINS = "allowed_tracking_origins";
  private List<RumSdkConfigMatchOption> allowedTrackingOrigins = null;

  public static final String JSON_PROPERTY_APPLICATION_ID = "application_id";
  private String applicationId;

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private List<RumSdkConfigDynamicOptionPair> context = null;

  public static final String JSON_PROPERTY_DEFAULT_PRIVACY_LEVEL = "default_privacy_level";
  private String defaultPrivacyLevel;

  public static final String JSON_PROPERTY_ENABLE_PRIVACY_FOR_ACTION_NAME =
      "enable_privacy_for_action_name";
  private Boolean enablePrivacyForActionName;

  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_SESSION_REPLAY_SAMPLE_RATE =
      "session_replay_sample_rate";
  private Long sessionReplaySampleRate;

  public static final String JSON_PROPERTY_SESSION_SAMPLE_RATE = "session_sample_rate";
  private Long sessionSampleRate;

  public static final String JSON_PROPERTY_TRACE_SAMPLE_RATE = "trace_sample_rate";
  private Long traceSampleRate;

  public static final String JSON_PROPERTY_TRACK_SESSION_ACROSS_SUBDOMAINS =
      "track_session_across_subdomains";
  private Boolean trackSessionAcrossSubdomains;

  public static final String JSON_PROPERTY_USER = "user";
  private List<RumSdkConfigDynamicOptionPair> user = null;

  public static final String JSON_PROPERTY_VERSION = "version";
  private RumSdkConfigDynamicOption version;

  public RumSdkConfigRumAttributes() {}

  @JsonCreator
  public RumSdkConfigRumAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_APPLICATION_ID) String applicationId,
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFAULT_PRIVACY_LEVEL)
          String defaultPrivacyLevel,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLE_PRIVACY_FOR_ACTION_NAME)
          Boolean enablePrivacyForActionName,
      @JsonProperty(required = true, value = JSON_PROPERTY_SESSION_REPLAY_SAMPLE_RATE)
          Long sessionReplaySampleRate,
      @JsonProperty(required = true, value = JSON_PROPERTY_SESSION_SAMPLE_RATE)
          Long sessionSampleRate) {
    this.applicationId = applicationId;
    this.defaultPrivacyLevel = defaultPrivacyLevel;
    this.enablePrivacyForActionName = enablePrivacyForActionName;
    this.sessionReplaySampleRate = sessionReplaySampleRate;
    this.sessionSampleRate = sessionSampleRate;
  }

  public RumSdkConfigRumAttributes allowedTracingUrls(
      List<RumSdkConfigTracingUrlConfig> allowedTracingUrls) {
    this.allowedTracingUrls = allowedTracingUrls;
    for (RumSdkConfigTracingUrlConfig item : allowedTracingUrls) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public RumSdkConfigRumAttributes addAllowedTracingUrlsItem(
      RumSdkConfigTracingUrlConfig allowedTracingUrlsItem) {
    if (this.allowedTracingUrls == null) {
      this.allowedTracingUrls = new ArrayList<>();
    }
    this.allowedTracingUrls.add(allowedTracingUrlsItem);
    this.unparsed |= allowedTracingUrlsItem.unparsed;
    return this;
  }

  /**
   * A list of URL configurations for distributed tracing.
   *
   * @return allowedTracingUrls
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_TRACING_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RumSdkConfigTracingUrlConfig> getAllowedTracingUrls() {
    return allowedTracingUrls;
  }

  public void setAllowedTracingUrls(List<RumSdkConfigTracingUrlConfig> allowedTracingUrls) {
    this.allowedTracingUrls = allowedTracingUrls;
    if (allowedTracingUrls != null) {
      for (RumSdkConfigTracingUrlConfig item : allowedTracingUrls) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public RumSdkConfigRumAttributes allowedTrackingOrigins(
      List<RumSdkConfigMatchOption> allowedTrackingOrigins) {
    this.allowedTrackingOrigins = allowedTrackingOrigins;
    for (RumSdkConfigMatchOption item : allowedTrackingOrigins) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public RumSdkConfigRumAttributes addAllowedTrackingOriginsItem(
      RumSdkConfigMatchOption allowedTrackingOriginsItem) {
    if (this.allowedTrackingOrigins == null) {
      this.allowedTrackingOrigins = new ArrayList<>();
    }
    this.allowedTrackingOrigins.add(allowedTrackingOriginsItem);
    this.unparsed |= allowedTrackingOriginsItem.unparsed;
    return this;
  }

  /**
   * A list of origin patterns allowed for cross-origin session tracking.
   *
   * @return allowedTrackingOrigins
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_TRACKING_ORIGINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RumSdkConfigMatchOption> getAllowedTrackingOrigins() {
    return allowedTrackingOrigins;
  }

  public void setAllowedTrackingOrigins(List<RumSdkConfigMatchOption> allowedTrackingOrigins) {
    this.allowedTrackingOrigins = allowedTrackingOrigins;
    if (allowedTrackingOrigins != null) {
      for (RumSdkConfigMatchOption item : allowedTrackingOrigins) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public RumSdkConfigRumAttributes applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * The ID of the RUM application this configuration belongs to.
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

  public RumSdkConfigRumAttributes context(List<RumSdkConfigDynamicOptionPair> context) {
    this.context = context;
    for (RumSdkConfigDynamicOptionPair item : context) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public RumSdkConfigRumAttributes addContextItem(RumSdkConfigDynamicOptionPair contextItem) {
    if (this.context == null) {
      this.context = new ArrayList<>();
    }
    this.context.add(contextItem);
    this.unparsed |= contextItem.unparsed;
    return this;
  }

  /**
   * A list of dynamic option key-value pairs.
   *
   * @return context
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RumSdkConfigDynamicOptionPair> getContext() {
    return context;
  }

  public void setContext(List<RumSdkConfigDynamicOptionPair> context) {
    this.context = context;
    if (context != null) {
      for (RumSdkConfigDynamicOptionPair item : context) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public RumSdkConfigRumAttributes defaultPrivacyLevel(String defaultPrivacyLevel) {
    this.defaultPrivacyLevel = defaultPrivacyLevel;
    return this;
  }

  /**
   * The default privacy masking level applied to all RUM data.
   *
   * @return defaultPrivacyLevel
   */
  @JsonProperty(JSON_PROPERTY_DEFAULT_PRIVACY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDefaultPrivacyLevel() {
    return defaultPrivacyLevel;
  }

  public void setDefaultPrivacyLevel(String defaultPrivacyLevel) {
    this.defaultPrivacyLevel = defaultPrivacyLevel;
  }

  public RumSdkConfigRumAttributes enablePrivacyForActionName(Boolean enablePrivacyForActionName) {
    this.enablePrivacyForActionName = enablePrivacyForActionName;
    return this;
  }

  /**
   * Whether to mask user-interaction action names for privacy.
   *
   * @return enablePrivacyForActionName
   */
  @JsonProperty(JSON_PROPERTY_ENABLE_PRIVACY_FOR_ACTION_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnablePrivacyForActionName() {
    return enablePrivacyForActionName;
  }

  public void setEnablePrivacyForActionName(Boolean enablePrivacyForActionName) {
    this.enablePrivacyForActionName = enablePrivacyForActionName;
  }

  public RumSdkConfigRumAttributes env(String env) {
    this.env = env;
    return this;
  }

  /**
   * The environment tag for the RUM application.
   *
   * @return env
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEnv() {
    return env;
  }

  public void setEnv(String env) {
    this.env = env;
  }

  public RumSdkConfigRumAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * The service name tag for the RUM application.
   *
   * @return service
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public RumSdkConfigRumAttributes sessionReplaySampleRate(Long sessionReplaySampleRate) {
    this.sessionReplaySampleRate = sessionReplaySampleRate;
    return this;
  }

  /**
   * The percentage of collected sessions for which a replay is captured (0–100). minimum: 0
   * maximum: 100
   *
   * @return sessionReplaySampleRate
   */
  @JsonProperty(JSON_PROPERTY_SESSION_REPLAY_SAMPLE_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSessionReplaySampleRate() {
    return sessionReplaySampleRate;
  }

  public void setSessionReplaySampleRate(Long sessionReplaySampleRate) {
    this.sessionReplaySampleRate = sessionReplaySampleRate;
  }

  public RumSdkConfigRumAttributes sessionSampleRate(Long sessionSampleRate) {
    this.sessionSampleRate = sessionSampleRate;
    return this;
  }

  /**
   * The percentage of user sessions to collect (0–100). minimum: 0 maximum: 100
   *
   * @return sessionSampleRate
   */
  @JsonProperty(JSON_PROPERTY_SESSION_SAMPLE_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSessionSampleRate() {
    return sessionSampleRate;
  }

  public void setSessionSampleRate(Long sessionSampleRate) {
    this.sessionSampleRate = sessionSampleRate;
  }

  public RumSdkConfigRumAttributes traceSampleRate(Long traceSampleRate) {
    this.traceSampleRate = traceSampleRate;
    return this;
  }

  /**
   * The percentage of requests to forward as APM traces (0–100). minimum: 0 maximum: 100
   *
   * @return traceSampleRate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACE_SAMPLE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTraceSampleRate() {
    return traceSampleRate;
  }

  public void setTraceSampleRate(Long traceSampleRate) {
    this.traceSampleRate = traceSampleRate;
  }

  public RumSdkConfigRumAttributes trackSessionAcrossSubdomains(
      Boolean trackSessionAcrossSubdomains) {
    this.trackSessionAcrossSubdomains = trackSessionAcrossSubdomains;
    return this;
  }

  /**
   * Whether to share a session across subdomains of the same site.
   *
   * @return trackSessionAcrossSubdomains
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACK_SESSION_ACROSS_SUBDOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getTrackSessionAcrossSubdomains() {
    return trackSessionAcrossSubdomains;
  }

  public void setTrackSessionAcrossSubdomains(Boolean trackSessionAcrossSubdomains) {
    this.trackSessionAcrossSubdomains = trackSessionAcrossSubdomains;
  }

  public RumSdkConfigRumAttributes user(List<RumSdkConfigDynamicOptionPair> user) {
    this.user = user;
    for (RumSdkConfigDynamicOptionPair item : user) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public RumSdkConfigRumAttributes addUserItem(RumSdkConfigDynamicOptionPair userItem) {
    if (this.user == null) {
      this.user = new ArrayList<>();
    }
    this.user.add(userItem);
    this.unparsed |= userItem.unparsed;
    return this;
  }

  /**
   * A list of dynamic option key-value pairs.
   *
   * @return user
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RumSdkConfigDynamicOptionPair> getUser() {
    return user;
  }

  public void setUser(List<RumSdkConfigDynamicOptionPair> user) {
    this.user = user;
    if (user != null) {
      for (RumSdkConfigDynamicOptionPair item : user) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public RumSdkConfigRumAttributes version(RumSdkConfigDynamicOption version) {
    this.version = version;
    this.unparsed |= version.unparsed;
    return this;
  }

  /**
   * A dynamic configuration option that extracts a value at runtime using a specified strategy.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RumSdkConfigDynamicOption getVersion() {
    return version;
  }

  public void setVersion(RumSdkConfigDynamicOption version) {
    this.version = version;
    if (version != null) {
      this.unparsed |= version.unparsed;
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
   * @return RumSdkConfigRumAttributes
   */
  @JsonAnySetter
  public RumSdkConfigRumAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumSdkConfigRumAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumSdkConfigRumAttributes rumSdkConfigRumAttributes = (RumSdkConfigRumAttributes) o;
    return Objects.equals(this.allowedTracingUrls, rumSdkConfigRumAttributes.allowedTracingUrls)
        && Objects.equals(
            this.allowedTrackingOrigins, rumSdkConfigRumAttributes.allowedTrackingOrigins)
        && Objects.equals(this.applicationId, rumSdkConfigRumAttributes.applicationId)
        && Objects.equals(this.context, rumSdkConfigRumAttributes.context)
        && Objects.equals(this.defaultPrivacyLevel, rumSdkConfigRumAttributes.defaultPrivacyLevel)
        && Objects.equals(
            this.enablePrivacyForActionName, rumSdkConfigRumAttributes.enablePrivacyForActionName)
        && Objects.equals(this.env, rumSdkConfigRumAttributes.env)
        && Objects.equals(this.service, rumSdkConfigRumAttributes.service)
        && Objects.equals(
            this.sessionReplaySampleRate, rumSdkConfigRumAttributes.sessionReplaySampleRate)
        && Objects.equals(this.sessionSampleRate, rumSdkConfigRumAttributes.sessionSampleRate)
        && Objects.equals(this.traceSampleRate, rumSdkConfigRumAttributes.traceSampleRate)
        && Objects.equals(
            this.trackSessionAcrossSubdomains,
            rumSdkConfigRumAttributes.trackSessionAcrossSubdomains)
        && Objects.equals(this.user, rumSdkConfigRumAttributes.user)
        && Objects.equals(this.version, rumSdkConfigRumAttributes.version)
        && Objects.equals(
            this.additionalProperties, rumSdkConfigRumAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowedTracingUrls,
        allowedTrackingOrigins,
        applicationId,
        context,
        defaultPrivacyLevel,
        enablePrivacyForActionName,
        env,
        service,
        sessionReplaySampleRate,
        sessionSampleRate,
        traceSampleRate,
        trackSessionAcrossSubdomains,
        user,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumSdkConfigRumAttributes {\n");
    sb.append("    allowedTracingUrls: ").append(toIndentedString(allowedTracingUrls)).append("\n");
    sb.append("    allowedTrackingOrigins: ")
        .append(toIndentedString(allowedTrackingOrigins))
        .append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    defaultPrivacyLevel: ")
        .append(toIndentedString(defaultPrivacyLevel))
        .append("\n");
    sb.append("    enablePrivacyForActionName: ")
        .append(toIndentedString(enablePrivacyForActionName))
        .append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    sessionReplaySampleRate: ")
        .append(toIndentedString(sessionReplaySampleRate))
        .append("\n");
    sb.append("    sessionSampleRate: ").append(toIndentedString(sessionSampleRate)).append("\n");
    sb.append("    traceSampleRate: ").append(toIndentedString(traceSampleRate)).append("\n");
    sb.append("    trackSessionAcrossSubdomains: ")
        .append(toIndentedString(trackSessionAcrossSubdomains))
        .append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

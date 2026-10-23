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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Object containing the information of a sample. */
@JsonPropertyOrder({
  IssueSampleAttributes.JSON_PROPERTY_APPLICATION_ID,
  IssueSampleAttributes.JSON_PROPERTY_BIASES,
  IssueSampleAttributes.JSON_PROPERTY_BUILD_ID,
  IssueSampleAttributes.JSON_PROPERTY_BUNDLE_VERSION,
  IssueSampleAttributes.JSON_PROPERTY_DATA_SOURCE,
  IssueSampleAttributes.JSON_PROPERTY_DEBUG_ID,
  IssueSampleAttributes.JSON_PROPERTY_DEBUG_INFO_CAPTURED,
  IssueSampleAttributes.JSON_PROPERTY_ERROR_SOURCE_TYPE,
  IssueSampleAttributes.JSON_PROPERTY_ERROR_STACK,
  IssueSampleAttributes.JSON_PROPERTY_EVENT,
  IssueSampleAttributes.JSON_PROPERTY_GIT_COMMIT_SHA,
  IssueSampleAttributes.JSON_PROPERTY_GIT_REPOSITORY_ID,
  IssueSampleAttributes.JSON_PROPERTY_GIT_REPOSITORY_URL,
  IssueSampleAttributes.JSON_PROPERTY_HAS_SESSION_REPLAY,
  IssueSampleAttributes.JSON_PROPERTY_LANGUAGE,
  IssueSampleAttributes.JSON_PROPERTY_LINKS,
  IssueSampleAttributes.JSON_PROPERTY_OS_NAME,
  IssueSampleAttributes.JSON_PROPERTY_SERVICE,
  IssueSampleAttributes.JSON_PROPERTY_SESSION_ID,
  IssueSampleAttributes.JSON_PROPERTY_SESSION_REPLAY_URL,
  IssueSampleAttributes.JSON_PROPERTY_SNAPSHOT_ID,
  IssueSampleAttributes.JSON_PROPERTY_SPAN_ID,
  IssueSampleAttributes.JSON_PROPERTY_TIMESTAMP,
  IssueSampleAttributes.JSON_PROPERTY_TRACE_ID,
  IssueSampleAttributes.JSON_PROPERTY_VARIANT,
  IssueSampleAttributes.JSON_PROPERTY_VERSION,
  IssueSampleAttributes.JSON_PROPERTY_VIEW_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IssueSampleAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_ID = "application_id";
  private String applicationId;

  public static final String JSON_PROPERTY_BIASES = "biases";
  private List<IssueSampleBias> biases = null;

  public static final String JSON_PROPERTY_BUILD_ID = "build_id";
  private String buildId;

  public static final String JSON_PROPERTY_BUNDLE_VERSION = "bundle_version";
  private String bundleVersion;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private IssueSampleDataSource dataSource;

  public static final String JSON_PROPERTY_DEBUG_ID = "debug_id";
  private String debugId;

  public static final String JSON_PROPERTY_DEBUG_INFO_CAPTURED = "debug_info_captured";
  private Boolean debugInfoCaptured;

  public static final String JSON_PROPERTY_ERROR_SOURCE_TYPE = "error_source_type";
  private String errorSourceType;

  public static final String JSON_PROPERTY_ERROR_STACK = "error_stack";
  private IssueSampleErrorStack errorStack;

  public static final String JSON_PROPERTY_EVENT = "event";
  private Map<String, Object> event = null;

  public static final String JSON_PROPERTY_GIT_COMMIT_SHA = "git_commit_sha";
  private String gitCommitSha;

  public static final String JSON_PROPERTY_GIT_REPOSITORY_ID = "git_repository_id";
  private String gitRepositoryId;

  public static final String JSON_PROPERTY_GIT_REPOSITORY_URL = "git_repository_url";
  private String gitRepositoryUrl;

  public static final String JSON_PROPERTY_HAS_SESSION_REPLAY = "has_session_replay";
  private Boolean hasSessionReplay;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_LINKS = "links";
  private List<IssueSampleFrameLink> links = null;

  public static final String JSON_PROPERTY_OS_NAME = "os_name";
  private String osName;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_SESSION_ID = "session_id";
  private String sessionId;

  public static final String JSON_PROPERTY_SESSION_REPLAY_URL = "session_replay_url";
  private String sessionReplayUrl;

  public static final String JSON_PROPERTY_SNAPSHOT_ID = "snapshot_id";
  private String snapshotId;

  public static final String JSON_PROPERTY_SPAN_ID = "span_id";
  private String spanId;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private OffsetDateTime timestamp;

  public static final String JSON_PROPERTY_TRACE_ID = "trace_id";
  private String traceId;

  public static final String JSON_PROPERTY_VARIANT = "variant";
  private String variant;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_VIEW_ID = "view_id";
  private String viewId;

  public IssueSampleAttributes() {}

  @JsonCreator
  public IssueSampleAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ERROR_STACK)
          IssueSampleErrorStack errorStack,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMESTAMP) OffsetDateTime timestamp) {
    this.errorStack = errorStack;
    this.unparsed |= errorStack.unparsed;
    this.timestamp = timestamp;
  }

  public IssueSampleAttributes applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * RUM application identifier of the error.
   *
   * @return applicationId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public IssueSampleAttributes biases(List<IssueSampleBias> biases) {
    this.biases = biases;
    return this;
  }

  public IssueSampleAttributes addBiasesItem(IssueSampleBias biasesItem) {
    if (this.biases == null) {
      this.biases = new ArrayList<>();
    }
    this.biases.add(biasesItem);
    this.unparsed |= !biasesItem.isValid();
    return this;
  }

  /**
   * Biases the sample satisfies. A single error can satisfy several biases.
   *
   * @return biases
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IssueSampleBias> getBiases() {
    return biases;
  }

  public void setBiases(List<IssueSampleBias> biases) {
    this.biases = biases;
  }

  public IssueSampleAttributes buildId(String buildId) {
    this.buildId = buildId;
    return this;
  }

  /**
   * Build identifier of the mobile application.
   *
   * @return buildId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBuildId() {
    return buildId;
  }

  public void setBuildId(String buildId) {
    this.buildId = buildId;
  }

  public IssueSampleAttributes bundleVersion(String bundleVersion) {
    this.bundleVersion = bundleVersion;
    return this;
  }

  /**
   * Bundle version of the mobile application.
   *
   * @return bundleVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUNDLE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBundleVersion() {
    return bundleVersion;
  }

  public void setBundleVersion(String bundleVersion) {
    this.bundleVersion = bundleVersion;
  }

  public IssueSampleAttributes dataSource(IssueSampleDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Product that reported the error. <code>NONE</code> when the error has no known origin.
   *
   * @return dataSource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IssueSampleDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(IssueSampleDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public IssueSampleAttributes debugId(String debugId) {
    this.debugId = debugId;
    return this;
  }

  /**
   * Debug identifier used to resolve the stack trace of the error to source code.
   *
   * @return debugId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEBUG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDebugId() {
    return debugId;
  }

  public void setDebugId(String debugId) {
    this.debugId = debugId;
  }

  public IssueSampleAttributes debugInfoCaptured(Boolean debugInfoCaptured) {
    this.debugInfoCaptured = debugInfoCaptured;
    return this;
  }

  /**
   * Whether an Exception Replay snapshot was captured for the error.
   *
   * @return debugInfoCaptured
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEBUG_INFO_CAPTURED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDebugInfoCaptured() {
    return debugInfoCaptured;
  }

  public void setDebugInfoCaptured(Boolean debugInfoCaptured) {
    this.debugInfoCaptured = debugInfoCaptured;
  }

  public IssueSampleAttributes errorSourceType(String errorSourceType) {
    this.errorSourceType = errorSourceType;
    return this;
  }

  /**
   * Source type set by the SDK or tracer that reported the error, such as <code>browser</code> for
   * RUM browser errors or <code>Crashtracking</code> for backend crash reports. Usually not set for
   * APM and logs errors.
   *
   * @return errorSourceType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_SOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getErrorSourceType() {
    return errorSourceType;
  }

  public void setErrorSourceType(String errorSourceType) {
    this.errorSourceType = errorSourceType;
  }

  public IssueSampleAttributes errorStack(IssueSampleErrorStack errorStack) {
    this.errorStack = errorStack;
    this.unparsed |= errorStack.unparsed;
    return this;
  }

  /**
   * Parsed stack trace of the error. Only the sample picked by the <code>git_metadata</code> bias
   * has frames.
   *
   * @return errorStack
   */
  @JsonProperty(JSON_PROPERTY_ERROR_STACK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IssueSampleErrorStack getErrorStack() {
    return errorStack;
  }

  public void setErrorStack(IssueSampleErrorStack errorStack) {
    this.errorStack = errorStack;
    if (errorStack != null) {
      this.unparsed |= errorStack.unparsed;
    }
  }

  public IssueSampleAttributes event(Map<String, Object> event) {
    this.event = event;
    return this;
  }

  public IssueSampleAttributes putEventItem(String key, Object eventItem) {
    if (this.event == null) {
      this.event = new HashMap<>();
    }
    this.event.put(key, eventItem);
    return this;
  }

  /**
   * Raw error event, as stored by its data source. Its fields differ between APM, logs, and RUM.
   *
   * @return event
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getEvent() {
    return event;
  }

  public void setEvent(Map<String, Object> event) {
    this.event = event;
  }

  public IssueSampleAttributes gitCommitSha(String gitCommitSha) {
    this.gitCommitSha = gitCommitSha;
    return this;
  }

  /**
   * Git commit SHA of the service version.
   *
   * @return gitCommitSha
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GIT_COMMIT_SHA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGitCommitSha() {
    return gitCommitSha;
  }

  public void setGitCommitSha(String gitCommitSha) {
    this.gitCommitSha = gitCommitSha;
  }

  public IssueSampleAttributes gitRepositoryId(String gitRepositoryId) {
    this.gitRepositoryId = gitRepositoryId;
    return this;
  }

  /**
   * Git repository identifier of the service.
   *
   * @return gitRepositoryId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GIT_REPOSITORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGitRepositoryId() {
    return gitRepositoryId;
  }

  public void setGitRepositoryId(String gitRepositoryId) {
    this.gitRepositoryId = gitRepositoryId;
  }

  public IssueSampleAttributes gitRepositoryUrl(String gitRepositoryUrl) {
    this.gitRepositoryUrl = gitRepositoryUrl;
    return this;
  }

  /**
   * Git repository URL of the service.
   *
   * @return gitRepositoryUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GIT_REPOSITORY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGitRepositoryUrl() {
    return gitRepositoryUrl;
  }

  public void setGitRepositoryUrl(String gitRepositoryUrl) {
    this.gitRepositoryUrl = gitRepositoryUrl;
  }

  public IssueSampleAttributes hasSessionReplay(Boolean hasSessionReplay) {
    this.hasSessionReplay = hasSessionReplay;
    return this;
  }

  /**
   * Whether a RUM session replay is available for the error.
   *
   * @return hasSessionReplay
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_SESSION_REPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasSessionReplay() {
    return hasSessionReplay;
  }

  public void setHasSessionReplay(Boolean hasSessionReplay) {
    this.hasSessionReplay = hasSessionReplay;
  }

  public IssueSampleAttributes language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Programming language of the service.
   *
   * @return language
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public IssueSampleAttributes links(List<IssueSampleFrameLink> links) {
    this.links = links;
    if (links != null) {
      for (IssueSampleFrameLink item : links) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public IssueSampleAttributes addLinksItem(IssueSampleFrameLink linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    this.unparsed |= linksItem.unparsed;
    return this;
  }

  /**
   * Source code locations of the stack frames that resolve to a repository file.
   *
   * @return links
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IssueSampleFrameLink> getLinks() {
    return links;
  }

  public void setLinks(List<IssueSampleFrameLink> links) {
    this.links = links;
    if (links != null) {
      for (IssueSampleFrameLink item : links) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public IssueSampleAttributes osName(String osName) {
    this.osName = osName;
    return this;
  }

  /**
   * Operating system of the device that reported the error.
   *
   * @return osName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOsName() {
    return osName;
  }

  public void setOsName(String osName) {
    this.osName = osName;
  }

  public IssueSampleAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * Service name.
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

  public IssueSampleAttributes sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * RUM session identifier of the error.
   *
   * @return sessionId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public IssueSampleAttributes sessionReplayUrl(String sessionReplayUrl) {
    this.sessionReplayUrl = sessionReplayUrl;
    return this;
  }

  /**
   * URL of the RUM session replay of the error.
   *
   * @return sessionReplayUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSION_REPLAY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSessionReplayUrl() {
    return sessionReplayUrl;
  }

  public void setSessionReplayUrl(String sessionReplayUrl) {
    this.sessionReplayUrl = sessionReplayUrl;
  }

  public IssueSampleAttributes snapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }

  /**
   * Identifier of the Exception Replay snapshot of the error.
   *
   * @return snapshotId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNAPSHOT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSnapshotId() {
    return snapshotId;
  }

  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }

  public IssueSampleAttributes spanId(String spanId) {
    this.spanId = spanId;
    return this;
  }

  /**
   * APM span identifier of the error.
   *
   * @return spanId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSpanId() {
    return spanId;
  }

  public void setSpanId(String spanId) {
    this.spanId = spanId;
  }

  public IssueSampleAttributes timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Timestamp of the error.
   *
   * @return timestamp
   */
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public IssueSampleAttributes traceId(String traceId) {
    this.traceId = traceId;
    return this;
  }

  /**
   * APM trace identifier of the error.
   *
   * @return traceId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTraceId() {
    return traceId;
  }

  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }

  public IssueSampleAttributes variant(String variant) {
    this.variant = variant;
    return this;
  }

  /**
   * Build variant of the mobile application.
   *
   * @return variant
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVariant() {
    return variant;
  }

  public void setVariant(String variant) {
    this.variant = variant;
  }

  public IssueSampleAttributes version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the service.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public IssueSampleAttributes viewId(String viewId) {
    this.viewId = viewId;
    return this;
  }

  /**
   * RUM view identifier of the error.
   *
   * @return viewId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIEW_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getViewId() {
    return viewId;
  }

  public void setViewId(String viewId) {
    this.viewId = viewId;
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
   * @return IssueSampleAttributes
   */
  @JsonAnySetter
  public IssueSampleAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IssueSampleAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueSampleAttributes issueSampleAttributes = (IssueSampleAttributes) o;
    return Objects.equals(this.applicationId, issueSampleAttributes.applicationId)
        && Objects.equals(this.biases, issueSampleAttributes.biases)
        && Objects.equals(this.buildId, issueSampleAttributes.buildId)
        && Objects.equals(this.bundleVersion, issueSampleAttributes.bundleVersion)
        && Objects.equals(this.dataSource, issueSampleAttributes.dataSource)
        && Objects.equals(this.debugId, issueSampleAttributes.debugId)
        && Objects.equals(this.debugInfoCaptured, issueSampleAttributes.debugInfoCaptured)
        && Objects.equals(this.errorSourceType, issueSampleAttributes.errorSourceType)
        && Objects.equals(this.errorStack, issueSampleAttributes.errorStack)
        && Objects.equals(this.event, issueSampleAttributes.event)
        && Objects.equals(this.gitCommitSha, issueSampleAttributes.gitCommitSha)
        && Objects.equals(this.gitRepositoryId, issueSampleAttributes.gitRepositoryId)
        && Objects.equals(this.gitRepositoryUrl, issueSampleAttributes.gitRepositoryUrl)
        && Objects.equals(this.hasSessionReplay, issueSampleAttributes.hasSessionReplay)
        && Objects.equals(this.language, issueSampleAttributes.language)
        && Objects.equals(this.links, issueSampleAttributes.links)
        && Objects.equals(this.osName, issueSampleAttributes.osName)
        && Objects.equals(this.service, issueSampleAttributes.service)
        && Objects.equals(this.sessionId, issueSampleAttributes.sessionId)
        && Objects.equals(this.sessionReplayUrl, issueSampleAttributes.sessionReplayUrl)
        && Objects.equals(this.snapshotId, issueSampleAttributes.snapshotId)
        && Objects.equals(this.spanId, issueSampleAttributes.spanId)
        && Objects.equals(this.timestamp, issueSampleAttributes.timestamp)
        && Objects.equals(this.traceId, issueSampleAttributes.traceId)
        && Objects.equals(this.variant, issueSampleAttributes.variant)
        && Objects.equals(this.version, issueSampleAttributes.version)
        && Objects.equals(this.viewId, issueSampleAttributes.viewId)
        && Objects.equals(this.additionalProperties, issueSampleAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        applicationId,
        biases,
        buildId,
        bundleVersion,
        dataSource,
        debugId,
        debugInfoCaptured,
        errorSourceType,
        errorStack,
        event,
        gitCommitSha,
        gitRepositoryId,
        gitRepositoryUrl,
        hasSessionReplay,
        language,
        links,
        osName,
        service,
        sessionId,
        sessionReplayUrl,
        snapshotId,
        spanId,
        timestamp,
        traceId,
        variant,
        version,
        viewId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueSampleAttributes {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    biases: ").append(toIndentedString(biases)).append("\n");
    sb.append("    buildId: ").append(toIndentedString(buildId)).append("\n");
    sb.append("    bundleVersion: ").append(toIndentedString(bundleVersion)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    debugId: ").append(toIndentedString(debugId)).append("\n");
    sb.append("    debugInfoCaptured: ").append(toIndentedString(debugInfoCaptured)).append("\n");
    sb.append("    errorSourceType: ").append(toIndentedString(errorSourceType)).append("\n");
    sb.append("    errorStack: ").append(toIndentedString(errorStack)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    gitCommitSha: ").append(toIndentedString(gitCommitSha)).append("\n");
    sb.append("    gitRepositoryId: ").append(toIndentedString(gitRepositoryId)).append("\n");
    sb.append("    gitRepositoryUrl: ").append(toIndentedString(gitRepositoryUrl)).append("\n");
    sb.append("    hasSessionReplay: ").append(toIndentedString(hasSessionReplay)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    sessionReplayUrl: ").append(toIndentedString(sessionReplayUrl)).append("\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    spanId: ").append(toIndentedString(spanId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    viewId: ").append(toIndentedString(viewId)).append("\n");
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

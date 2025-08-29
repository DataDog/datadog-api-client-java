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

/** Object containing the information of an issue. */
@JsonPropertyOrder({
  IssueAttributes.JSON_PROPERTY_ERROR_MESSAGE,
  IssueAttributes.JSON_PROPERTY_ERROR_TYPE,
  IssueAttributes.JSON_PROPERTY_FILE_PATH,
  IssueAttributes.JSON_PROPERTY_FIRST_SEEN,
  IssueAttributes.JSON_PROPERTY_FIRST_SEEN_VERSION,
  IssueAttributes.JSON_PROPERTY_FUNCTION_NAME,
  IssueAttributes.JSON_PROPERTY_IS_CRASH,
  IssueAttributes.JSON_PROPERTY_LANGUAGES,
  IssueAttributes.JSON_PROPERTY_LAST_SEEN,
  IssueAttributes.JSON_PROPERTY_LAST_SEEN_VERSION,
  IssueAttributes.JSON_PROPERTY_PLATFORM,
  IssueAttributes.JSON_PROPERTY_SERVICE,
  IssueAttributes.JSON_PROPERTY_STATE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IssueAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private String errorMessage;

  public static final String JSON_PROPERTY_ERROR_TYPE = "error_type";
  private String errorType;

  public static final String JSON_PROPERTY_FILE_PATH = "file_path";
  private String filePath;

  public static final String JSON_PROPERTY_FIRST_SEEN = "first_seen";
  private Long firstSeen;

  public static final String JSON_PROPERTY_FIRST_SEEN_VERSION = "first_seen_version";
  private String firstSeenVersion;

  public static final String JSON_PROPERTY_FUNCTION_NAME = "function_name";
  private String functionName;

  public static final String JSON_PROPERTY_IS_CRASH = "is_crash";
  private Boolean isCrash;

  public static final String JSON_PROPERTY_LANGUAGES = "languages";
  private List<IssueLanguage> languages = null;

  public static final String JSON_PROPERTY_LAST_SEEN = "last_seen";
  private Long lastSeen;

  public static final String JSON_PROPERTY_LAST_SEEN_VERSION = "last_seen_version";
  private String lastSeenVersion;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private IssuePlatform platform;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_STATE = "state";
  private IssueState state;

  public IssueAttributes errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Error message associated with the issue.
   *
   * @return errorMessage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public IssueAttributes errorType(String errorType) {
    this.errorType = errorType;
    return this;
  }

  /**
   * Type of the error that matches the issue.
   *
   * @return errorType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getErrorType() {
    return errorType;
  }

  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }

  public IssueAttributes filePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

  /**
   * Path of the file where the issue occurred.
   *
   * @return filePath
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  public IssueAttributes firstSeen(Long firstSeen) {
    this.firstSeen = firstSeen;
    return this;
  }

  /**
   * Timestamp of the first seen error in milliseconds since the Unix epoch.
   *
   * @return firstSeen
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFirstSeen() {
    return firstSeen;
  }

  public void setFirstSeen(Long firstSeen) {
    this.firstSeen = firstSeen;
  }

  public IssueAttributes firstSeenVersion(String firstSeenVersion) {
    this.firstSeenVersion = firstSeenVersion;
    return this;
  }

  /**
   * The application version (for example, git commit hash) where the issue was first observed.
   *
   * @return firstSeenVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_SEEN_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFirstSeenVersion() {
    return firstSeenVersion;
  }

  public void setFirstSeenVersion(String firstSeenVersion) {
    this.firstSeenVersion = firstSeenVersion;
  }

  public IssueAttributes functionName(String functionName) {
    this.functionName = functionName;
    return this;
  }

  /**
   * Name of the function where the issue occurred.
   *
   * @return functionName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FUNCTION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFunctionName() {
    return functionName;
  }

  public void setFunctionName(String functionName) {
    this.functionName = functionName;
  }

  public IssueAttributes isCrash(Boolean isCrash) {
    this.isCrash = isCrash;
    return this;
  }

  /**
   * Error is a crash.
   *
   * @return isCrash
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_CRASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsCrash() {
    return isCrash;
  }

  public void setIsCrash(Boolean isCrash) {
    this.isCrash = isCrash;
  }

  public IssueAttributes languages(List<IssueLanguage> languages) {
    this.languages = languages;
    return this;
  }

  public IssueAttributes addLanguagesItem(IssueLanguage languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<>();
    }
    this.languages.add(languagesItem);
    this.unparsed |= !languagesItem.isValid();
    return this;
  }

  /**
   * Array of programming languages associated with the issue.
   *
   * @return languages
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IssueLanguage> getLanguages() {
    return languages;
  }

  public void setLanguages(List<IssueLanguage> languages) {
    this.languages = languages;
  }

  public IssueAttributes lastSeen(Long lastSeen) {
    this.lastSeen = lastSeen;
    return this;
  }

  /**
   * Timestamp of the last seen error in milliseconds since the Unix epoch.
   *
   * @return lastSeen
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLastSeen() {
    return lastSeen;
  }

  public void setLastSeen(Long lastSeen) {
    this.lastSeen = lastSeen;
  }

  public IssueAttributes lastSeenVersion(String lastSeenVersion) {
    this.lastSeenVersion = lastSeenVersion;
    return this;
  }

  /**
   * The application version (for example, git commit hash) where the issue was last observed.
   *
   * @return lastSeenVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_SEEN_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLastSeenVersion() {
    return lastSeenVersion;
  }

  public void setLastSeenVersion(String lastSeenVersion) {
    this.lastSeenVersion = lastSeenVersion;
  }

  public IssueAttributes platform(IssuePlatform platform) {
    this.platform = platform;
    this.unparsed |= !platform.isValid();
    return this;
  }

  /**
   * Platform associated with the issue.
   *
   * @return platform
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IssuePlatform getPlatform() {
    return platform;
  }

  public void setPlatform(IssuePlatform platform) {
    if (!platform.isValid()) {
      this.unparsed = true;
    }
    this.platform = platform;
  }

  public IssueAttributes service(String service) {
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

  public IssueAttributes state(IssueState state) {
    this.state = state;
    this.unparsed |= !state.isValid();
    return this;
  }

  /**
   * State of the issue
   *
   * @return state
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IssueState getState() {
    return state;
  }

  public void setState(IssueState state) {
    if (!state.isValid()) {
      this.unparsed = true;
    }
    this.state = state;
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
   * @return IssueAttributes
   */
  @JsonAnySetter
  public IssueAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IssueAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueAttributes issueAttributes = (IssueAttributes) o;
    return Objects.equals(this.errorMessage, issueAttributes.errorMessage)
        && Objects.equals(this.errorType, issueAttributes.errorType)
        && Objects.equals(this.filePath, issueAttributes.filePath)
        && Objects.equals(this.firstSeen, issueAttributes.firstSeen)
        && Objects.equals(this.firstSeenVersion, issueAttributes.firstSeenVersion)
        && Objects.equals(this.functionName, issueAttributes.functionName)
        && Objects.equals(this.isCrash, issueAttributes.isCrash)
        && Objects.equals(this.languages, issueAttributes.languages)
        && Objects.equals(this.lastSeen, issueAttributes.lastSeen)
        && Objects.equals(this.lastSeenVersion, issueAttributes.lastSeenVersion)
        && Objects.equals(this.platform, issueAttributes.platform)
        && Objects.equals(this.service, issueAttributes.service)
        && Objects.equals(this.state, issueAttributes.state)
        && Objects.equals(this.additionalProperties, issueAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        errorMessage,
        errorType,
        filePath,
        firstSeen,
        firstSeenVersion,
        functionName,
        isCrash,
        languages,
        lastSeen,
        lastSeenVersion,
        platform,
        service,
        state,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueAttributes {\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    firstSeen: ").append(toIndentedString(firstSeen)).append("\n");
    sb.append("    firstSeenVersion: ").append(toIndentedString(firstSeenVersion)).append("\n");
    sb.append("    functionName: ").append(toIndentedString(functionName)).append("\n");
    sb.append("    isCrash: ").append(toIndentedString(isCrash)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    lastSeenVersion: ").append(toIndentedString(lastSeenVersion)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

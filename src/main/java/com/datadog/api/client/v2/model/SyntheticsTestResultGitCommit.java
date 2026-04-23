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

/** Details of the Git commit associated with the test result. */
@JsonPropertyOrder({
  SyntheticsTestResultGitCommit.JSON_PROPERTY_AUTHOR,
  SyntheticsTestResultGitCommit.JSON_PROPERTY_COMMITTER,
  SyntheticsTestResultGitCommit.JSON_PROPERTY_MESSAGE,
  SyntheticsTestResultGitCommit.JSON_PROPERTY_SHA,
  SyntheticsTestResultGitCommit.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultGitCommit {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private SyntheticsTestResultGitUser author;

  public static final String JSON_PROPERTY_COMMITTER = "committer";
  private SyntheticsTestResultGitUser committer;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_SHA = "sha";
  private String sha;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public SyntheticsTestResultGitCommit author(SyntheticsTestResultGitUser author) {
    this.author = author;
    this.unparsed |= author.unparsed;
    return this;
  }

  /**
   * A Git user (author or committer).
   *
   * @return author
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultGitUser getAuthor() {
    return author;
  }

  public void setAuthor(SyntheticsTestResultGitUser author) {
    this.author = author;
  }

  public SyntheticsTestResultGitCommit committer(SyntheticsTestResultGitUser committer) {
    this.committer = committer;
    this.unparsed |= committer.unparsed;
    return this;
  }

  /**
   * A Git user (author or committer).
   *
   * @return committer
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMITTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultGitUser getCommitter() {
    return committer;
  }

  public void setCommitter(SyntheticsTestResultGitUser committer) {
    this.committer = committer;
  }

  public SyntheticsTestResultGitCommit message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Commit message.
   *
   * @return message
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public SyntheticsTestResultGitCommit sha(String sha) {
    this.sha = sha;
    return this;
  }

  /**
   * Commit SHA.
   *
   * @return sha
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSha() {
    return sha;
  }

  public void setSha(String sha) {
    this.sha = sha;
  }

  public SyntheticsTestResultGitCommit url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the commit.
   *
   * @return url
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
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
   * @return SyntheticsTestResultGitCommit
   */
  @JsonAnySetter
  public SyntheticsTestResultGitCommit putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultGitCommit object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultGitCommit syntheticsTestResultGitCommit = (SyntheticsTestResultGitCommit) o;
    return Objects.equals(this.author, syntheticsTestResultGitCommit.author)
        && Objects.equals(this.committer, syntheticsTestResultGitCommit.committer)
        && Objects.equals(this.message, syntheticsTestResultGitCommit.message)
        && Objects.equals(this.sha, syntheticsTestResultGitCommit.sha)
        && Objects.equals(this.url, syntheticsTestResultGitCommit.url)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultGitCommit.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, committer, message, sha, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultGitCommit {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

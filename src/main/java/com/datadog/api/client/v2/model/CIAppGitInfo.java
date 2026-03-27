/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>If pipelines are triggered due to actions to a Git repository, then all payloads must contain this.
   * Note that either <code>tag</code> or <code>branch</code> has to be provided, but not both.</p>
 */
@JsonPropertyOrder({
  CIAppGitInfo.JSON_PROPERTY_AUTHOR_EMAIL,
  CIAppGitInfo.JSON_PROPERTY_AUTHOR_NAME,
  CIAppGitInfo.JSON_PROPERTY_AUTHOR_TIME,
  CIAppGitInfo.JSON_PROPERTY_BRANCH,
  CIAppGitInfo.JSON_PROPERTY_COMMIT_TIME,
  CIAppGitInfo.JSON_PROPERTY_COMMITTER_EMAIL,
  CIAppGitInfo.JSON_PROPERTY_COMMITTER_NAME,
  CIAppGitInfo.JSON_PROPERTY_DEFAULT_BRANCH,
  CIAppGitInfo.JSON_PROPERTY_MESSAGE,
  CIAppGitInfo.JSON_PROPERTY_REPOSITORY_URL,
  CIAppGitInfo.JSON_PROPERTY_SHA,
  CIAppGitInfo.JSON_PROPERTY_TAG
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppGitInfo {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR_EMAIL = "author_email";
  private String authorEmail;

  public static final String JSON_PROPERTY_AUTHOR_NAME = "author_name";
  private JsonNullable<String> authorName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AUTHOR_TIME = "author_time";
  private JsonNullable<String> authorTime = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BRANCH = "branch";
  private JsonNullable<String> branch = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COMMIT_TIME = "commit_time";
  private JsonNullable<String> commitTime = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COMMITTER_EMAIL = "committer_email";
  private JsonNullable<String> committerEmail = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COMMITTER_NAME = "committer_name";
  private JsonNullable<String> committerName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEFAULT_BRANCH = "default_branch";
  private JsonNullable<String> defaultBranch = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private JsonNullable<String> message = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REPOSITORY_URL = "repository_url";
  private String repositoryUrl;

  public static final String JSON_PROPERTY_SHA = "sha";
  private String sha;

  public static final String JSON_PROPERTY_TAG = "tag";
  private JsonNullable<String> tag = JsonNullable.<String>undefined();

  public CIAppGitInfo() {}

  @JsonCreator
  public CIAppGitInfo(
            @JsonProperty(required=true, value=JSON_PROPERTY_AUTHOR_EMAIL)String authorEmail,
            @JsonProperty(required=true, value=JSON_PROPERTY_REPOSITORY_URL)String repositoryUrl,
            @JsonProperty(required=true, value=JSON_PROPERTY_SHA)String sha) {
        this.authorEmail = authorEmail;
        this.repositoryUrl = repositoryUrl;
        this.sha = sha;
  }
  public CIAppGitInfo authorEmail(String authorEmail) {
    this.authorEmail = authorEmail;
    return this;
  }

  /**
   * <p>The commit author email.</p>
   * @return authorEmail
  **/
      @JsonProperty(JSON_PROPERTY_AUTHOR_EMAIL)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getAuthorEmail() {
        return authorEmail;
      }
  public void setAuthorEmail(String authorEmail) {
    this.authorEmail = authorEmail;
  }
  public CIAppGitInfo authorName(String authorName) {
    this.authorName = JsonNullable.<String>of(authorName);
    return this;
  }

  /**
   * <p>The commit author name.</p>
   * @return authorName
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getAuthorName() {
        return authorName.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_AUTHOR_NAME)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAuthorName_JsonNullable() {
    return authorName;
  }
  @JsonProperty(JSON_PROPERTY_AUTHOR_NAME)public void setAuthorName_JsonNullable(JsonNullable<String> authorName) {
    this.authorName = authorName;
  }
  public void setAuthorName(String authorName) {
    this.authorName = JsonNullable.<String>of(authorName);
  }
  public CIAppGitInfo authorTime(String authorTime) {
    this.authorTime = JsonNullable.<String>of(authorTime);
    return this;
  }

  /**
   * <p>The commit author timestamp in RFC3339 format.</p>
   * @return authorTime
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getAuthorTime() {
        return authorTime.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_AUTHOR_TIME)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAuthorTime_JsonNullable() {
    return authorTime;
  }
  @JsonProperty(JSON_PROPERTY_AUTHOR_TIME)public void setAuthorTime_JsonNullable(JsonNullable<String> authorTime) {
    this.authorTime = authorTime;
  }
  public void setAuthorTime(String authorTime) {
    this.authorTime = JsonNullable.<String>of(authorTime);
  }
  public CIAppGitInfo branch(String branch) {
    this.branch = JsonNullable.<String>of(branch);
    return this;
  }

  /**
   * <p>The branch name (if a tag use the tag parameter).</p>
   * @return branch
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getBranch() {
        return branch.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_BRANCH)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getBranch_JsonNullable() {
    return branch;
  }
  @JsonProperty(JSON_PROPERTY_BRANCH)public void setBranch_JsonNullable(JsonNullable<String> branch) {
    this.branch = branch;
  }
  public void setBranch(String branch) {
    this.branch = JsonNullable.<String>of(branch);
  }
  public CIAppGitInfo commitTime(String commitTime) {
    this.commitTime = JsonNullable.<String>of(commitTime);
    return this;
  }

  /**
   * <p>The commit timestamp in RFC3339 format.</p>
   * @return commitTime
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getCommitTime() {
        return commitTime.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_COMMIT_TIME)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCommitTime_JsonNullable() {
    return commitTime;
  }
  @JsonProperty(JSON_PROPERTY_COMMIT_TIME)public void setCommitTime_JsonNullable(JsonNullable<String> commitTime) {
    this.commitTime = commitTime;
  }
  public void setCommitTime(String commitTime) {
    this.commitTime = JsonNullable.<String>of(commitTime);
  }
  public CIAppGitInfo committerEmail(String committerEmail) {
    this.committerEmail = JsonNullable.<String>of(committerEmail);
    return this;
  }

  /**
   * <p>The committer email.</p>
   * @return committerEmail
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getCommitterEmail() {
        return committerEmail.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_COMMITTER_EMAIL)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCommitterEmail_JsonNullable() {
    return committerEmail;
  }
  @JsonProperty(JSON_PROPERTY_COMMITTER_EMAIL)public void setCommitterEmail_JsonNullable(JsonNullable<String> committerEmail) {
    this.committerEmail = committerEmail;
  }
  public void setCommitterEmail(String committerEmail) {
    this.committerEmail = JsonNullable.<String>of(committerEmail);
  }
  public CIAppGitInfo committerName(String committerName) {
    this.committerName = JsonNullable.<String>of(committerName);
    return this;
  }

  /**
   * <p>The committer name.</p>
   * @return committerName
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getCommitterName() {
        return committerName.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_COMMITTER_NAME)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCommitterName_JsonNullable() {
    return committerName;
  }
  @JsonProperty(JSON_PROPERTY_COMMITTER_NAME)public void setCommitterName_JsonNullable(JsonNullable<String> committerName) {
    this.committerName = committerName;
  }
  public void setCommitterName(String committerName) {
    this.committerName = JsonNullable.<String>of(committerName);
  }
  public CIAppGitInfo defaultBranch(String defaultBranch) {
    this.defaultBranch = JsonNullable.<String>of(defaultBranch);
    return this;
  }

  /**
   * <p>The Git repository's default branch.</p>
   * @return defaultBranch
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getDefaultBranch() {
        return defaultBranch.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_DEFAULT_BRANCH)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDefaultBranch_JsonNullable() {
    return defaultBranch;
  }
  @JsonProperty(JSON_PROPERTY_DEFAULT_BRANCH)public void setDefaultBranch_JsonNullable(JsonNullable<String> defaultBranch) {
    this.defaultBranch = defaultBranch;
  }
  public void setDefaultBranch(String defaultBranch) {
    this.defaultBranch = JsonNullable.<String>of(defaultBranch);
  }
  public CIAppGitInfo message(String message) {
    this.message = JsonNullable.<String>of(message);
    return this;
  }

  /**
   * <p>The commit message.</p>
   * @return message
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getMessage() {
        return message.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getMessage_JsonNullable() {
    return message;
  }
  @JsonProperty(JSON_PROPERTY_MESSAGE)public void setMessage_JsonNullable(JsonNullable<String> message) {
    this.message = message;
  }
  public void setMessage(String message) {
    this.message = JsonNullable.<String>of(message);
  }
  public CIAppGitInfo repositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
    return this;
  }

  /**
   * <p>The URL of the repository.</p>
   * @return repositoryUrl
  **/
      @JsonProperty(JSON_PROPERTY_REPOSITORY_URL)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getRepositoryUrl() {
        return repositoryUrl;
      }
  public void setRepositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
  }
  public CIAppGitInfo sha(String sha) {
    this.sha = sha;
    return this;
  }

  /**
   * <p>The git commit SHA.</p>
   * @return sha
  **/
      @JsonProperty(JSON_PROPERTY_SHA)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getSha() {
        return sha;
      }
  public void setSha(String sha) {
    this.sha = sha;
  }
  public CIAppGitInfo tag(String tag) {
    this.tag = JsonNullable.<String>of(tag);
    return this;
  }

  /**
   * <p>The tag name (if a branch use the branch parameter).</p>
   * @return tag
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getTag() {
        return tag.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTag_JsonNullable() {
    return tag;
  }
  @JsonProperty(JSON_PROPERTY_TAG)public void setTag_JsonNullable(JsonNullable<String> tag) {
    this.tag = tag;
  }
  public void setTag(String tag) {
    this.tag = JsonNullable.<String>of(tag);
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return CIAppGitInfo
   */
  @JsonAnySetter
  public CIAppGitInfo putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this CIAppGitInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppGitInfo ciAppGitInfo = (CIAppGitInfo) o;
    return Objects.equals(this.authorEmail, ciAppGitInfo.authorEmail) && Objects.equals(this.authorName, ciAppGitInfo.authorName) && Objects.equals(this.authorTime, ciAppGitInfo.authorTime) && Objects.equals(this.branch, ciAppGitInfo.branch) && Objects.equals(this.commitTime, ciAppGitInfo.commitTime) && Objects.equals(this.committerEmail, ciAppGitInfo.committerEmail) && Objects.equals(this.committerName, ciAppGitInfo.committerName) && Objects.equals(this.defaultBranch, ciAppGitInfo.defaultBranch) && Objects.equals(this.message, ciAppGitInfo.message) && Objects.equals(this.repositoryUrl, ciAppGitInfo.repositoryUrl) && Objects.equals(this.sha, ciAppGitInfo.sha) && Objects.equals(this.tag, ciAppGitInfo.tag) && Objects.equals(this.additionalProperties, ciAppGitInfo.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(authorEmail,authorName,authorTime,branch,commitTime,committerEmail,committerName,defaultBranch,message,repositoryUrl,sha,tag, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppGitInfo {\n");
    sb.append("    authorEmail: ").append(toIndentedString(authorEmail)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    authorTime: ").append(toIndentedString(authorTime)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    commitTime: ").append(toIndentedString(commitTime)).append("\n");
    sb.append("    committerEmail: ").append(toIndentedString(committerEmail)).append("\n");
    sb.append("    committerName: ").append(toIndentedString(committerName)).append("\n");
    sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

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

 */
@JsonPropertyOrder({
  ScaRequestDataAttributesCommit.JSON_PROPERTY_AUTHOR_DATE,
  ScaRequestDataAttributesCommit.JSON_PROPERTY_AUTHOR_EMAIL,
  ScaRequestDataAttributesCommit.JSON_PROPERTY_AUTHOR_NAME,
  ScaRequestDataAttributesCommit.JSON_PROPERTY_BRANCH,
  ScaRequestDataAttributesCommit.JSON_PROPERTY_COMMITTER_EMAIL,
  ScaRequestDataAttributesCommit.JSON_PROPERTY_COMMITTER_NAME,
  ScaRequestDataAttributesCommit.JSON_PROPERTY_SHA
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScaRequestDataAttributesCommit {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR_DATE = "author_date";
  private String authorDate;

  public static final String JSON_PROPERTY_AUTHOR_EMAIL = "author_email";
  private String authorEmail;

  public static final String JSON_PROPERTY_AUTHOR_NAME = "author_name";
  private String authorName;

  public static final String JSON_PROPERTY_BRANCH = "branch";
  private String branch;

  public static final String JSON_PROPERTY_COMMITTER_EMAIL = "committer_email";
  private String committerEmail;

  public static final String JSON_PROPERTY_COMMITTER_NAME = "committer_name";
  private String committerName;

  public static final String JSON_PROPERTY_SHA = "sha";
  private String sha;

  public ScaRequestDataAttributesCommit authorDate(String authorDate) {
    this.authorDate = authorDate;
    return this;
  }

  /**
   * <p>GetauthorDate</p>
   * @return authorDate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTHOR_DATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAuthorDate() {
        return authorDate;
      }
  public void setAuthorDate(String authorDate) {
    this.authorDate = authorDate;
  }
  public ScaRequestDataAttributesCommit authorEmail(String authorEmail) {
    this.authorEmail = authorEmail;
    return this;
  }

  /**
   * <p>GetauthorEmail</p>
   * @return authorEmail
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTHOR_EMAIL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAuthorEmail() {
        return authorEmail;
      }
  public void setAuthorEmail(String authorEmail) {
    this.authorEmail = authorEmail;
  }
  public ScaRequestDataAttributesCommit authorName(String authorName) {
    this.authorName = authorName;
    return this;
  }

  /**
   * <p>GetauthorName</p>
   * @return authorName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTHOR_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAuthorName() {
        return authorName;
      }
  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }
  public ScaRequestDataAttributesCommit branch(String branch) {
    this.branch = branch;
    return this;
  }

  /**
   * <p>Getbranch</p>
   * @return branch
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BRANCH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getBranch() {
        return branch;
      }
  public void setBranch(String branch) {
    this.branch = branch;
  }
  public ScaRequestDataAttributesCommit committerEmail(String committerEmail) {
    this.committerEmail = committerEmail;
    return this;
  }

  /**
   * <p>GetcommitterEmail</p>
   * @return committerEmail
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COMMITTER_EMAIL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCommitterEmail() {
        return committerEmail;
      }
  public void setCommitterEmail(String committerEmail) {
    this.committerEmail = committerEmail;
  }
  public ScaRequestDataAttributesCommit committerName(String committerName) {
    this.committerName = committerName;
    return this;
  }

  /**
   * <p>GetcommitterName</p>
   * @return committerName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COMMITTER_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCommitterName() {
        return committerName;
      }
  public void setCommitterName(String committerName) {
    this.committerName = committerName;
  }
  public ScaRequestDataAttributesCommit sha(String sha) {
    this.sha = sha;
    return this;
  }

  /**
   * <p>Getsha</p>
   * @return sha
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SHA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSha() {
        return sha;
      }
  public void setSha(String sha) {
    this.sha = sha;
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
   * @return ScaRequestDataAttributesCommit
   */
  @JsonAnySetter
  public ScaRequestDataAttributesCommit putAdditionalProperty(String key, Object value) {
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
   * Return true if this ScaRequestDataAttributesCommit object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScaRequestDataAttributesCommit scaRequestDataAttributesCommit = (ScaRequestDataAttributesCommit) o;
    return Objects.equals(this.authorDate, scaRequestDataAttributesCommit.authorDate) && Objects.equals(this.authorEmail, scaRequestDataAttributesCommit.authorEmail) && Objects.equals(this.authorName, scaRequestDataAttributesCommit.authorName) && Objects.equals(this.branch, scaRequestDataAttributesCommit.branch) && Objects.equals(this.committerEmail, scaRequestDataAttributesCommit.committerEmail) && Objects.equals(this.committerName, scaRequestDataAttributesCommit.committerName) && Objects.equals(this.sha, scaRequestDataAttributesCommit.sha) && Objects.equals(this.additionalProperties, scaRequestDataAttributesCommit.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(authorDate,authorEmail,authorName,branch,committerEmail,committerName,sha, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScaRequestDataAttributesCommit {\n");
    sb.append("    authorDate: ").append(toIndentedString(authorDate)).append("\n");
    sb.append("    authorEmail: ").append(toIndentedString(authorEmail)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    committerEmail: ").append(toIndentedString(committerEmail)).append("\n");
    sb.append("    committerName: ").append(toIndentedString(committerName)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
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

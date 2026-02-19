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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes for creating a change request branch. */
@JsonPropertyOrder({
  ChangeRequestBranchCreateAttributes.JSON_PROPERTY_BRANCH_NAME,
  ChangeRequestBranchCreateAttributes.JSON_PROPERTY_REPO_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChangeRequestBranchCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BRANCH_NAME = "branch_name";
  private String branchName;

  public static final String JSON_PROPERTY_REPO_ID = "repo_id";
  private String repoId;

  public ChangeRequestBranchCreateAttributes() {}

  @JsonCreator
  public ChangeRequestBranchCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_BRANCH_NAME) String branchName,
      @JsonProperty(required = true, value = JSON_PROPERTY_REPO_ID) String repoId) {
    this.branchName = branchName;
    this.repoId = repoId;
  }

  public ChangeRequestBranchCreateAttributes branchName(String branchName) {
    this.branchName = branchName;
    return this;
  }

  /**
   * The name of the branch to create.
   *
   * @return branchName
   */
  @JsonProperty(JSON_PROPERTY_BRANCH_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getBranchName() {
    return branchName;
  }

  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }

  public ChangeRequestBranchCreateAttributes repoId(String repoId) {
    this.repoId = repoId;
    return this;
  }

  /**
   * The repository identifier in the format owner/repository.
   *
   * @return repoId
   */
  @JsonProperty(JSON_PROPERTY_REPO_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRepoId() {
    return repoId;
  }

  public void setRepoId(String repoId) {
    this.repoId = repoId;
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
   * @return ChangeRequestBranchCreateAttributes
   */
  @JsonAnySetter
  public ChangeRequestBranchCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ChangeRequestBranchCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeRequestBranchCreateAttributes changeRequestBranchCreateAttributes =
        (ChangeRequestBranchCreateAttributes) o;
    return Objects.equals(this.branchName, changeRequestBranchCreateAttributes.branchName)
        && Objects.equals(this.repoId, changeRequestBranchCreateAttributes.repoId)
        && Objects.equals(
            this.additionalProperties, changeRequestBranchCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchName, repoId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeRequestBranchCreateAttributes {\n");
    sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
    sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
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

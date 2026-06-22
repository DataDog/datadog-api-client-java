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

/** A linked code session (for example, a pull request) for the investigation. */
@JsonPropertyOrder({
  RemediationCodeSession.JSON_PROPERTY_ID,
  RemediationCodeSession.JSON_PROPERTY_PULL_REQUEST_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RemediationCodeSession {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PULL_REQUEST_STATUS = "pull_request_status";
  private RemediationPullRequestStatus pullRequestStatus;

  public RemediationCodeSession id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Code session ID.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RemediationCodeSession pullRequestStatus(RemediationPullRequestStatus pullRequestStatus) {
    this.pullRequestStatus = pullRequestStatus;
    this.unparsed |= !pullRequestStatus.isValid();
    return this;
  }

  /**
   * Pull request status for a linked code session.
   *
   * @return pullRequestStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PULL_REQUEST_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RemediationPullRequestStatus getPullRequestStatus() {
    return pullRequestStatus;
  }

  public void setPullRequestStatus(RemediationPullRequestStatus pullRequestStatus) {
    if (!pullRequestStatus.isValid()) {
      this.unparsed = true;
    }
    this.pullRequestStatus = pullRequestStatus;
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
   * @return RemediationCodeSession
   */
  @JsonAnySetter
  public RemediationCodeSession putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RemediationCodeSession object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemediationCodeSession remediationCodeSession = (RemediationCodeSession) o;
    return Objects.equals(this.id, remediationCodeSession.id)
        && Objects.equals(this.pullRequestStatus, remediationCodeSession.pullRequestStatus)
        && Objects.equals(this.additionalProperties, remediationCodeSession.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pullRequestStatus, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemediationCodeSession {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pullRequestStatus: ").append(toIndentedString(pullRequestStatus)).append("\n");
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

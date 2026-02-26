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
   * <p>A single history entry representing a status change for a flaky test.</p>
 */
@JsonPropertyOrder({
  FlakyTestHistory.JSON_PROPERTY_COMMIT_SHA,
  FlakyTestHistory.JSON_PROPERTY_STATUS,
  FlakyTestHistory.JSON_PROPERTY_TIMESTAMP
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FlakyTestHistory {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMMIT_SHA = "commit_sha";
  private String commitSha;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public FlakyTestHistory() {}

  @JsonCreator
  public FlakyTestHistory(
            @JsonProperty(required=true, value=JSON_PROPERTY_COMMIT_SHA)String commitSha,
            @JsonProperty(required=true, value=JSON_PROPERTY_STATUS)String status,
            @JsonProperty(required=true, value=JSON_PROPERTY_TIMESTAMP)Long timestamp) {
        this.commitSha = commitSha;
        this.status = status;
        this.timestamp = timestamp;
  }
  public FlakyTestHistory commitSha(String commitSha) {
    this.commitSha = commitSha;
    return this;
  }

  /**
   * <p>The commit SHA associated with this status change. Will be an empty string if the commit SHA is not available.</p>
   * @return commitSha
  **/
      @JsonProperty(JSON_PROPERTY_COMMIT_SHA)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getCommitSha() {
        return commitSha;
      }
  public void setCommitSha(String commitSha) {
    this.commitSha = commitSha;
  }
  public FlakyTestHistory status(String status) {
    this.status = status;
    return this;
  }

  /**
   * <p>The test status at this point in history.</p>
   * @return status
  **/
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getStatus() {
        return status;
      }
  public void setStatus(String status) {
    this.status = status;
  }
  public FlakyTestHistory timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * <p>Unix timestamp in milliseconds when this status change occurred.</p>
   * @return timestamp
  **/
      @JsonProperty(JSON_PROPERTY_TIMESTAMP)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getTimestamp() {
        return timestamp;
      }
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
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
   * @return FlakyTestHistory
   */
  @JsonAnySetter
  public FlakyTestHistory putAdditionalProperty(String key, Object value) {
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
   * Return true if this FlakyTestHistory object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlakyTestHistory flakyTestHistory = (FlakyTestHistory) o;
    return Objects.equals(this.commitSha, flakyTestHistory.commitSha) && Objects.equals(this.status, flakyTestHistory.status) && Objects.equals(this.timestamp, flakyTestHistory.timestamp) && Objects.equals(this.additionalProperties, flakyTestHistory.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(commitSha,status,timestamp, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlakyTestHistory {\n");
    sb.append("    commitSha: ").append(toIndentedString(commitSha)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Request used to create a GitHub cloud authentication persona mapping. */
@JsonPropertyOrder({GitHubCloudAuthPersonaMappingCreateRequest.JSON_PROPERTY_DATA})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GitHubCloudAuthPersonaMappingCreateRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private GitHubCloudAuthPersonaMappingCreateData data;

  public GitHubCloudAuthPersonaMappingCreateRequest() {}

  @JsonCreator
  public GitHubCloudAuthPersonaMappingCreateRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA)
          GitHubCloudAuthPersonaMappingCreateData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
  }

  public GitHubCloudAuthPersonaMappingCreateRequest data(
      GitHubCloudAuthPersonaMappingCreateData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * Data for creating a GitHub cloud authentication persona mapping.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GitHubCloudAuthPersonaMappingCreateData getData() {
    return data;
  }

  public void setData(GitHubCloudAuthPersonaMappingCreateData data) {
    this.data = data;
    if (data != null) {
      this.unparsed |= data.unparsed;
    }
  }

  /** Return true if this GitHubCloudAuthPersonaMappingCreateRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitHubCloudAuthPersonaMappingCreateRequest gitHubCloudAuthPersonaMappingCreateRequest =
        (GitHubCloudAuthPersonaMappingCreateRequest) o;
    return Objects.equals(this.data, gitHubCloudAuthPersonaMappingCreateRequest.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitHubCloudAuthPersonaMappingCreateRequest {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

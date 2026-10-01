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

/** Data for creating a GitHub cloud authentication intake mapping. */
@JsonPropertyOrder({
  GitHubCloudAuthIntakeMappingCreateData.JSON_PROPERTY_ATTRIBUTES,
  GitHubCloudAuthIntakeMappingCreateData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GitHubCloudAuthIntakeMappingCreateData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private GitHubCloudAuthIntakeMappingCreateAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private GitHubCloudAuthIntakeMappingType type;

  public GitHubCloudAuthIntakeMappingCreateData() {}

  @JsonCreator
  public GitHubCloudAuthIntakeMappingCreateData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          GitHubCloudAuthIntakeMappingCreateAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          GitHubCloudAuthIntakeMappingType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public GitHubCloudAuthIntakeMappingCreateData attributes(
      GitHubCloudAuthIntakeMappingCreateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes for creating a GitHub cloud authentication intake mapping
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GitHubCloudAuthIntakeMappingCreateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(GitHubCloudAuthIntakeMappingCreateAttributes attributes) {
    this.attributes = attributes;
    if (attributes != null) {
      this.unparsed |= attributes.unparsed;
    }
  }

  public GitHubCloudAuthIntakeMappingCreateData type(GitHubCloudAuthIntakeMappingType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type identifier for GitHub cloud authentication intake mapping.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GitHubCloudAuthIntakeMappingType getType() {
    return type;
  }

  public void setType(GitHubCloudAuthIntakeMappingType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this GitHubCloudAuthIntakeMappingCreateData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitHubCloudAuthIntakeMappingCreateData gitHubCloudAuthIntakeMappingCreateData =
        (GitHubCloudAuthIntakeMappingCreateData) o;
    return Objects.equals(this.attributes, gitHubCloudAuthIntakeMappingCreateData.attributes)
        && Objects.equals(this.type, gitHubCloudAuthIntakeMappingCreateData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitHubCloudAuthIntakeMappingCreateData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

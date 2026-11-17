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

/** Settings for creating the GitHub Costs integration account. */
@JsonPropertyOrder({
  GitHubCostsIntegrationAccountSettingsRequest.JSON_PROPERTY_ENTERPRISE_NAME,
  GitHubCostsIntegrationAccountSettingsRequest.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GitHubCostsIntegrationAccountSettingsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENTERPRISE_NAME = "enterprise_name";
  private String enterpriseName;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private String tags;

  public GitHubCostsIntegrationAccountSettingsRequest() {}

  @JsonCreator
  public GitHubCostsIntegrationAccountSettingsRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENTERPRISE_NAME) String enterpriseName) {
    this.enterpriseName = enterpriseName;
  }

  public GitHubCostsIntegrationAccountSettingsRequest enterpriseName(String enterpriseName) {
    this.enterpriseName = enterpriseName;
    return this;
  }

  /**
   * Your GitHub enterprise slug, found on the enterprise settings page (e.g. enterprise-name), or
   * an organization login (e.g. organization-name). An enterprise already covers every organization
   * it owns.
   *
   * @return enterpriseName
   */
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEnterpriseName() {
    return enterpriseName;
  }

  public void setEnterpriseName(String enterpriseName) {
    this.enterpriseName = enterpriseName;
  }

  public GitHubCostsIntegrationAccountSettingsRequest tags(String tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Comma-separated tags added to the collected costs, for example <code>env:prod,team:example
   * </code>.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  /** Return true if this GitHubCostsIntegrationAccountSettingsRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitHubCostsIntegrationAccountSettingsRequest gitHubCostsIntegrationAccountSettingsRequest =
        (GitHubCostsIntegrationAccountSettingsRequest) o;
    return Objects.equals(
            this.enterpriseName, gitHubCostsIntegrationAccountSettingsRequest.enterpriseName)
        && Objects.equals(this.tags, gitHubCostsIntegrationAccountSettingsRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enterpriseName, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitHubCostsIntegrationAccountSettingsRequest {\n");
    sb.append("    enterpriseName: ").append(toIndentedString(enterpriseName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

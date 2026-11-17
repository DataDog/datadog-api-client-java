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

/** Settings configured on the GitHub Costs integration account. */
@JsonPropertyOrder({
  GitHubCostsIntegrationAccountSettingsResponse.JSON_PROPERTY_ENTERPRISE_NAME,
  GitHubCostsIntegrationAccountSettingsResponse.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GitHubCostsIntegrationAccountSettingsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENTERPRISE_NAME = "enterprise_name";
  private String enterpriseName;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private String tags;

  public GitHubCostsIntegrationAccountSettingsResponse() {}

  @JsonCreator
  public GitHubCostsIntegrationAccountSettingsResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENTERPRISE_NAME) String enterpriseName) {
    this.enterpriseName = enterpriseName;
  }

  public GitHubCostsIntegrationAccountSettingsResponse enterpriseName(String enterpriseName) {
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

  public GitHubCostsIntegrationAccountSettingsResponse tags(String tags) {
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
   * @return GitHubCostsIntegrationAccountSettingsResponse
   */
  @JsonAnySetter
  public GitHubCostsIntegrationAccountSettingsResponse putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this GitHubCostsIntegrationAccountSettingsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitHubCostsIntegrationAccountSettingsResponse gitHubCostsIntegrationAccountSettingsResponse =
        (GitHubCostsIntegrationAccountSettingsResponse) o;
    return Objects.equals(
            this.enterpriseName, gitHubCostsIntegrationAccountSettingsResponse.enterpriseName)
        && Objects.equals(this.tags, gitHubCostsIntegrationAccountSettingsResponse.tags)
        && Objects.equals(
            this.additionalProperties,
            gitHubCostsIntegrationAccountSettingsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enterpriseName, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitHubCostsIntegrationAccountSettingsResponse {\n");
    sb.append("    enterpriseName: ").append(toIndentedString(enterpriseName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

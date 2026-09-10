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

/** Attributes for requesting code coverage summary for a pull request. */
@JsonPropertyOrder({
  PRCoverageSummaryRequestAttributes.JSON_PROPERTY_PR_NUMBER,
  PRCoverageSummaryRequestAttributes.JSON_PROPERTY_REPOSITORY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PRCoverageSummaryRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PR_NUMBER = "pr_number";
  private Long prNumber;

  public static final String JSON_PROPERTY_REPOSITORY_URL = "repository_url";
  private String repositoryUrl;

  public PRCoverageSummaryRequestAttributes() {}

  @JsonCreator
  public PRCoverageSummaryRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_PR_NUMBER) Long prNumber,
      @JsonProperty(required = true, value = JSON_PROPERTY_REPOSITORY_URL) String repositoryUrl) {
    this.prNumber = prNumber;
    this.repositoryUrl = repositoryUrl;
  }

  public PRCoverageSummaryRequestAttributes prNumber(Long prNumber) {
    this.prNumber = prNumber;
    return this;
  }

  /**
   * The pull request number. Must be a positive integer. minimum: 1
   *
   * @return prNumber
   */
  @JsonProperty(JSON_PROPERTY_PR_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPrNumber() {
    return prNumber;
  }

  public void setPrNumber(Long prNumber) {
    this.prNumber = prNumber;
  }

  public PRCoverageSummaryRequestAttributes repositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
    return this;
  }

  /**
   * The repository URL. Accepts a full URL with or without a scheme (for example, <code>
   * https://github.com/org/repo</code> or <code>github.com/org/repo</code>).
   *
   * @return repositoryUrl
   */
  @JsonProperty(JSON_PROPERTY_REPOSITORY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRepositoryUrl() {
    return repositoryUrl;
  }

  public void setRepositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
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
   * @return PRCoverageSummaryRequestAttributes
   */
  @JsonAnySetter
  public PRCoverageSummaryRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this PRCoverageSummaryRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PRCoverageSummaryRequestAttributes prCoverageSummaryRequestAttributes =
        (PRCoverageSummaryRequestAttributes) o;
    return Objects.equals(this.prNumber, prCoverageSummaryRequestAttributes.prNumber)
        && Objects.equals(this.repositoryUrl, prCoverageSummaryRequestAttributes.repositoryUrl)
        && Objects.equals(
            this.additionalProperties, prCoverageSummaryRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prNumber, repositoryUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PRCoverageSummaryRequestAttributes {\n");
    sb.append("    prNumber: ").append(toIndentedString(prNumber)).append("\n");
    sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
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

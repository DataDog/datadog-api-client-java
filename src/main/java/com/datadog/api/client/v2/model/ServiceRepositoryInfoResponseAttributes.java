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

/** Attributes of the service repository information. */
@JsonPropertyOrder({
  ServiceRepositoryInfoResponseAttributes.JSON_PROPERTY_COMMIT_SHA,
  ServiceRepositoryInfoResponseAttributes.JSON_PROPERTY_REPOSITORY_URL,
  ServiceRepositoryInfoResponseAttributes.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceRepositoryInfoResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMMIT_SHA = "commit_sha";
  private String commitSha;

  public static final String JSON_PROPERTY_REPOSITORY_URL = "repository_url";
  private String repositoryUrl;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ServiceRepositoryInfoStatus status;

  public ServiceRepositoryInfoResponseAttributes() {}

  @JsonCreator
  public ServiceRepositoryInfoResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          ServiceRepositoryInfoStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public ServiceRepositoryInfoResponseAttributes commitSha(String commitSha) {
    this.commitSha = commitSha;
    return this;
  }

  /**
   * The SHA of the commit associated with the service version.
   *
   * @return commitSha
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMIT_SHA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCommitSha() {
    return commitSha;
  }

  public void setCommitSha(String commitSha) {
    this.commitSha = commitSha;
  }

  public ServiceRepositoryInfoResponseAttributes repositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
    return this;
  }

  /**
   * The URL of the source code repository.
   *
   * @return repositoryUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPOSITORY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRepositoryUrl() {
    return repositoryUrl;
  }

  public void setRepositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
  }

  public ServiceRepositoryInfoResponseAttributes status(ServiceRepositoryInfoStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of the service repository info lookup.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ServiceRepositoryInfoStatus getStatus() {
    return status;
  }

  public void setStatus(ServiceRepositoryInfoStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
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
   * @return ServiceRepositoryInfoResponseAttributes
   */
  @JsonAnySetter
  public ServiceRepositoryInfoResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ServiceRepositoryInfoResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceRepositoryInfoResponseAttributes serviceRepositoryInfoResponseAttributes =
        (ServiceRepositoryInfoResponseAttributes) o;
    return Objects.equals(this.commitSha, serviceRepositoryInfoResponseAttributes.commitSha)
        && Objects.equals(this.repositoryUrl, serviceRepositoryInfoResponseAttributes.repositoryUrl)
        && Objects.equals(this.status, serviceRepositoryInfoResponseAttributes.status)
        && Objects.equals(
            this.additionalProperties,
            serviceRepositoryInfoResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commitSha, repositoryUrl, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceRepositoryInfoResponseAttributes {\n");
    sb.append("    commitSha: ").append(toIndentedString(commitSha)).append("\n");
    sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

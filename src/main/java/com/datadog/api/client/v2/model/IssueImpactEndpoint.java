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

/** An endpoint whose traces have the issue's errors. */
@JsonPropertyOrder({
  IssueImpactEndpoint.JSON_PROPERTY_ERROR_COUNTS,
  IssueImpactEndpoint.JSON_PROPERTY_RESOURCE_NAME,
  IssueImpactEndpoint.JSON_PROPERTY_SERVICE,
  IssueImpactEndpoint.JSON_PROPERTY_SIGNIFICANT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IssueImpactEndpoint {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERROR_COUNTS = "error_counts";
  private IssueImpactErrorCounts errorCounts;

  public static final String JSON_PROPERTY_RESOURCE_NAME = "resource_name";
  private String resourceName;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_SIGNIFICANT = "significant";
  private Boolean significant;

  public IssueImpactEndpoint() {}

  @JsonCreator
  public IssueImpactEndpoint(
      @JsonProperty(required = true, value = JSON_PROPERTY_ERROR_COUNTS)
          IssueImpactErrorCounts errorCounts,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_NAME) String resourceName,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE) String service,
      @JsonProperty(required = true, value = JSON_PROPERTY_SIGNIFICANT) Boolean significant) {
    this.errorCounts = errorCounts;
    this.unparsed |= errorCounts.unparsed;
    this.resourceName = resourceName;
    this.service = service;
    this.significant = significant;
  }

  public IssueImpactEndpoint errorCounts(IssueImpactErrorCounts errorCounts) {
    this.errorCounts = errorCounts;
    this.unparsed |= errorCounts.unparsed;
    return this;
  }

  /**
   * Number of errors reported by each source. Several sources can report the same error, such as an
   * APM span and a log, so the counts overlap: don't add them together.
   *
   * @return errorCounts
   */
  @JsonProperty(JSON_PROPERTY_ERROR_COUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IssueImpactErrorCounts getErrorCounts() {
    return errorCounts;
  }

  public void setErrorCounts(IssueImpactErrorCounts errorCounts) {
    this.errorCounts = errorCounts;
    if (errorCounts != null) {
      this.unparsed |= errorCounts.unparsed;
    }
  }

  public IssueImpactEndpoint resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Resource name of the trace's root span.
   *
   * @return resourceName
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  public IssueImpactEndpoint service(String service) {
    this.service = service;
    return this;
  }

  /**
   * Service of the trace's root span.
   *
   * @return service
   */
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public IssueImpactEndpoint significant(Boolean significant) {
    this.significant = significant;
    return this;
  }

  /**
   * Whether the entry stands out as a likely driver of the issue, because it accounts for most of
   * the issue's errors or for far more errors than the other listed entries.
   *
   * @return significant
   */
  @JsonProperty(JSON_PROPERTY_SIGNIFICANT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getSignificant() {
    return significant;
  }

  public void setSignificant(Boolean significant) {
    this.significant = significant;
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
   * @return IssueImpactEndpoint
   */
  @JsonAnySetter
  public IssueImpactEndpoint putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IssueImpactEndpoint object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueImpactEndpoint issueImpactEndpoint = (IssueImpactEndpoint) o;
    return Objects.equals(this.errorCounts, issueImpactEndpoint.errorCounts)
        && Objects.equals(this.resourceName, issueImpactEndpoint.resourceName)
        && Objects.equals(this.service, issueImpactEndpoint.service)
        && Objects.equals(this.significant, issueImpactEndpoint.significant)
        && Objects.equals(this.additionalProperties, issueImpactEndpoint.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCounts, resourceName, service, significant, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueImpactEndpoint {\n");
    sb.append("    errorCounts: ").append(toIndentedString(errorCounts)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    significant: ").append(toIndentedString(significant)).append("\n");
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

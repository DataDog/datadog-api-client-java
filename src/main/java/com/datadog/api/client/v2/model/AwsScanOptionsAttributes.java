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

/** Attributes for the AWS scan options. */
@JsonPropertyOrder({
  AwsScanOptionsAttributes.JSON_PROPERTY_LAMBDA,
  AwsScanOptionsAttributes.JSON_PROPERTY_SENSITIVE_DATA,
  AwsScanOptionsAttributes.JSON_PROPERTY_VULN_CONTAINERS_OS,
  AwsScanOptionsAttributes.JSON_PROPERTY_VULN_HOST_OS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AwsScanOptionsAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LAMBDA = "lambda";
  private Boolean lambda;

  public static final String JSON_PROPERTY_SENSITIVE_DATA = "sensitive_data";
  private Boolean sensitiveData;

  public static final String JSON_PROPERTY_VULN_CONTAINERS_OS = "vuln_containers_os";
  private Boolean vulnContainersOs;

  public static final String JSON_PROPERTY_VULN_HOST_OS = "vuln_host_os";
  private Boolean vulnHostOs;

  public AwsScanOptionsAttributes lambda(Boolean lambda) {
    this.lambda = lambda;
    return this;
  }

  /**
   * Indicates if scanning of Lambda functions is enabled.
   *
   * @return lambda
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAMBDA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getLambda() {
    return lambda;
  }

  public void setLambda(Boolean lambda) {
    this.lambda = lambda;
  }

  public AwsScanOptionsAttributes sensitiveData(Boolean sensitiveData) {
    this.sensitiveData = sensitiveData;
    return this;
  }

  /**
   * Indicates if scanning for sensitive data is enabled.
   *
   * @return sensitiveData
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENSITIVE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSensitiveData() {
    return sensitiveData;
  }

  public void setSensitiveData(Boolean sensitiveData) {
    this.sensitiveData = sensitiveData;
  }

  public AwsScanOptionsAttributes vulnContainersOs(Boolean vulnContainersOs) {
    this.vulnContainersOs = vulnContainersOs;
    return this;
  }

  /**
   * Indicates if scanning for vulnerabilities in containers is enabled.
   *
   * @return vulnContainersOs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VULN_CONTAINERS_OS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getVulnContainersOs() {
    return vulnContainersOs;
  }

  public void setVulnContainersOs(Boolean vulnContainersOs) {
    this.vulnContainersOs = vulnContainersOs;
  }

  public AwsScanOptionsAttributes vulnHostOs(Boolean vulnHostOs) {
    this.vulnHostOs = vulnHostOs;
    return this;
  }

  /**
   * Indicates if scanning for vulnerabilities in hosts is enabled.
   *
   * @return vulnHostOs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VULN_HOST_OS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getVulnHostOs() {
    return vulnHostOs;
  }

  public void setVulnHostOs(Boolean vulnHostOs) {
    this.vulnHostOs = vulnHostOs;
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
   * @return AwsScanOptionsAttributes
   */
  @JsonAnySetter
  public AwsScanOptionsAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AwsScanOptionsAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsScanOptionsAttributes awsScanOptionsAttributes = (AwsScanOptionsAttributes) o;
    return Objects.equals(this.lambda, awsScanOptionsAttributes.lambda)
        && Objects.equals(this.sensitiveData, awsScanOptionsAttributes.sensitiveData)
        && Objects.equals(this.vulnContainersOs, awsScanOptionsAttributes.vulnContainersOs)
        && Objects.equals(this.vulnHostOs, awsScanOptionsAttributes.vulnHostOs)
        && Objects.equals(this.additionalProperties, awsScanOptionsAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lambda, sensitiveData, vulnContainersOs, vulnHostOs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsScanOptionsAttributes {\n");
    sb.append("    lambda: ").append(toIndentedString(lambda)).append("\n");
    sb.append("    sensitiveData: ").append(toIndentedString(sensitiveData)).append("\n");
    sb.append("    vulnContainersOs: ").append(toIndentedString(vulnContainersOs)).append("\n");
    sb.append("    vulnHostOs: ").append(toIndentedString(vulnHostOs)).append("\n");
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

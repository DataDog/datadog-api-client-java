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

/** Options on cloud configuration rules. */
@JsonPropertyOrder({CloudConfigurationRuleOptions.JSON_PROPERTY_COMPLIANCE_RULE_OPTIONS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudConfigurationRuleOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPLIANCE_RULE_OPTIONS = "complianceRuleOptions";
  private CloudConfigurationComplianceRuleOptions complianceRuleOptions;

  public CloudConfigurationRuleOptions() {}

  @JsonCreator
  public CloudConfigurationRuleOptions(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPLIANCE_RULE_OPTIONS)
          CloudConfigurationComplianceRuleOptions complianceRuleOptions) {
    this.complianceRuleOptions = complianceRuleOptions;
    this.unparsed |= complianceRuleOptions.unparsed;
  }

  public CloudConfigurationRuleOptions complianceRuleOptions(
      CloudConfigurationComplianceRuleOptions complianceRuleOptions) {
    this.complianceRuleOptions = complianceRuleOptions;
    this.unparsed |= complianceRuleOptions.unparsed;
    return this;
  }

  /**
   * Options for cloud_configuration rules.
   *
   * @return complianceRuleOptions
   */
  @JsonProperty(JSON_PROPERTY_COMPLIANCE_RULE_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CloudConfigurationComplianceRuleOptions getComplianceRuleOptions() {
    return complianceRuleOptions;
  }

  public void setComplianceRuleOptions(
      CloudConfigurationComplianceRuleOptions complianceRuleOptions) {
    this.complianceRuleOptions = complianceRuleOptions;
  }

  /** Return true if this CloudConfigurationRuleOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudConfigurationRuleOptions cloudConfigurationRuleOptions = (CloudConfigurationRuleOptions) o;
    return Objects.equals(
        this.complianceRuleOptions, cloudConfigurationRuleOptions.complianceRuleOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complianceRuleOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudConfigurationRuleOptions {\n");
    sb.append("    complianceRuleOptions: ")
        .append(toIndentedString(complianceRuleOptions))
        .append("\n");
    sb.append("}");
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

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
@JsonPropertyOrder({CloudConfigurationRuleOptions.JSON_PROPERTY_REGO_RULE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudConfigurationRuleOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_REGO_RULE = "regoRule";
  private CloudConfigurationRegoRule regoRule;

  public CloudConfigurationRuleOptions() {}

  @JsonCreator
  public CloudConfigurationRuleOptions(
      @JsonProperty(required = true, value = JSON_PROPERTY_REGO_RULE)
          CloudConfigurationRegoRule regoRule) {
    this.regoRule = regoRule;
    this.unparsed |= regoRule.unparsed;
  }

  public CloudConfigurationRuleOptions regoRule(CloudConfigurationRegoRule regoRule) {
    this.regoRule = regoRule;
    this.unparsed |= regoRule.unparsed;
    return this;
  }

  /**
   * Rego rule details.
   *
   * @return regoRule
   */
  @JsonProperty(JSON_PROPERTY_REGO_RULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CloudConfigurationRegoRule getRegoRule() {
    return regoRule;
  }

  public void setRegoRule(CloudConfigurationRegoRule regoRule) {
    this.regoRule = regoRule;
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
    return Objects.equals(this.regoRule, cloudConfigurationRuleOptions.regoRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regoRule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudConfigurationRuleOptions {\n");
    sb.append("    regoRule: ").append(toIndentedString(regoRule)).append("\n");
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

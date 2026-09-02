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

/** Counts of findings for the rule, grouped by their evaluation status. */
@JsonPropertyOrder({
  RuleBasedViewRuleStats.JSON_PROPERTY_FAIL,
  RuleBasedViewRuleStats.JSON_PROPERTY_MUTED,
  RuleBasedViewRuleStats.JSON_PROPERTY_PASS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RuleBasedViewRuleStats {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FAIL = "fail";
  private Long fail;

  public static final String JSON_PROPERTY_MUTED = "muted";
  private Long muted;

  public static final String JSON_PROPERTY_PASS = "pass";
  private Long pass;

  public RuleBasedViewRuleStats() {}

  @JsonCreator
  public RuleBasedViewRuleStats(
      @JsonProperty(required = true, value = JSON_PROPERTY_FAIL) Long fail,
      @JsonProperty(required = true, value = JSON_PROPERTY_MUTED) Long muted,
      @JsonProperty(required = true, value = JSON_PROPERTY_PASS) Long pass) {
    this.fail = fail;
    this.muted = muted;
    this.pass = pass;
  }

  public RuleBasedViewRuleStats fail(Long fail) {
    this.fail = fail;
    return this;
  }

  /**
   * Number of findings that failed evaluation.
   *
   * @return fail
   */
  @JsonProperty(JSON_PROPERTY_FAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFail() {
    return fail;
  }

  public void setFail(Long fail) {
    this.fail = fail;
  }

  public RuleBasedViewRuleStats muted(Long muted) {
    this.muted = muted;
    return this;
  }

  /**
   * Number of findings that have been muted.
   *
   * @return muted
   */
  @JsonProperty(JSON_PROPERTY_MUTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getMuted() {
    return muted;
  }

  public void setMuted(Long muted) {
    this.muted = muted;
  }

  public RuleBasedViewRuleStats pass(Long pass) {
    this.pass = pass;
    return this;
  }

  /**
   * Number of findings that passed evaluation.
   *
   * @return pass
   */
  @JsonProperty(JSON_PROPERTY_PASS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPass() {
    return pass;
  }

  public void setPass(Long pass) {
    this.pass = pass;
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
   * @return RuleBasedViewRuleStats
   */
  @JsonAnySetter
  public RuleBasedViewRuleStats putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RuleBasedViewRuleStats object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleBasedViewRuleStats ruleBasedViewRuleStats = (RuleBasedViewRuleStats) o;
    return Objects.equals(this.fail, ruleBasedViewRuleStats.fail)
        && Objects.equals(this.muted, ruleBasedViewRuleStats.muted)
        && Objects.equals(this.pass, ruleBasedViewRuleStats.pass)
        && Objects.equals(this.additionalProperties, ruleBasedViewRuleStats.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fail, muted, pass, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleBasedViewRuleStats {\n");
    sb.append("    fail: ").append(toIndentedString(fail)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    pass: ").append(toIndentedString(pass)).append("\n");
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

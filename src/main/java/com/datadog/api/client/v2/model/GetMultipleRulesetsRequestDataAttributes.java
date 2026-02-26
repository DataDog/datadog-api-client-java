/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**

 */
@JsonPropertyOrder({
  GetMultipleRulesetsRequestDataAttributes.JSON_PROPERTY_INCLUDE_TESTING_RULES,
  GetMultipleRulesetsRequestDataAttributes.JSON_PROPERTY_INCLUDE_TESTS,
  GetMultipleRulesetsRequestDataAttributes.JSON_PROPERTY_RULESETS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GetMultipleRulesetsRequestDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCLUDE_TESTING_RULES = "include_testing_rules";
  private Boolean includeTestingRules;

  public static final String JSON_PROPERTY_INCLUDE_TESTS = "include_tests";
  private Boolean includeTests;

  public static final String JSON_PROPERTY_RULESETS = "rulesets";
  private List<String> rulesets = null;

  public GetMultipleRulesetsRequestDataAttributes includeTestingRules(Boolean includeTestingRules) {
    this.includeTestingRules = includeTestingRules;
    return this;
  }

  /**
   * <p>GetincludeTestingRules</p>
   * @return includeTestingRules
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INCLUDE_TESTING_RULES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIncludeTestingRules() {
        return includeTestingRules;
      }
  public void setIncludeTestingRules(Boolean includeTestingRules) {
    this.includeTestingRules = includeTestingRules;
  }
  public GetMultipleRulesetsRequestDataAttributes includeTests(Boolean includeTests) {
    this.includeTests = includeTests;
    return this;
  }

  /**
   * <p>GetincludeTests</p>
   * @return includeTests
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INCLUDE_TESTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIncludeTests() {
        return includeTests;
      }
  public void setIncludeTests(Boolean includeTests) {
    this.includeTests = includeTests;
  }
  public GetMultipleRulesetsRequestDataAttributes rulesets(List<String> rulesets) {
    this.rulesets = rulesets;
    return this;
  }
  public GetMultipleRulesetsRequestDataAttributes addRulesetsItem(String rulesetsItem) {
    if (this.rulesets == null) {
      this.rulesets = new ArrayList<>();
    }
    this.rulesets.add(rulesetsItem);
    return this;
  }

  /**
   * <p>Getrulesets</p>
   * @return rulesets
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RULESETS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getRulesets() {
        return rulesets;
      }
  public void setRulesets(List<String> rulesets) {
    this.rulesets = rulesets;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return GetMultipleRulesetsRequestDataAttributes
   */
  @JsonAnySetter
  public GetMultipleRulesetsRequestDataAttributes putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this GetMultipleRulesetsRequestDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMultipleRulesetsRequestDataAttributes getMultipleRulesetsRequestDataAttributes = (GetMultipleRulesetsRequestDataAttributes) o;
    return Objects.equals(this.includeTestingRules, getMultipleRulesetsRequestDataAttributes.includeTestingRules) && Objects.equals(this.includeTests, getMultipleRulesetsRequestDataAttributes.includeTests) && Objects.equals(this.rulesets, getMultipleRulesetsRequestDataAttributes.rulesets) && Objects.equals(this.additionalProperties, getMultipleRulesetsRequestDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(includeTestingRules,includeTests,rulesets, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMultipleRulesetsRequestDataAttributes {\n");
    sb.append("    includeTestingRules: ").append(toIndentedString(includeTestingRules)).append("\n");
    sb.append("    includeTests: ").append(toIndentedString(includeTests)).append("\n");
    sb.append("    rulesets: ").append(toIndentedString(rulesets)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

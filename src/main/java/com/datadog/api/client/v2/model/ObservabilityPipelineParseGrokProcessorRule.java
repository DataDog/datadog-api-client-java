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
   * <p>A Grok parsing rule used in the <code>parse_grok</code> processor. Each rule defines how to extract structured fields
   * from a specific log field using Grok patterns.</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineParseGrokProcessorRule.JSON_PROPERTY_MATCH_RULES,
  ObservabilityPipelineParseGrokProcessorRule.JSON_PROPERTY_SOURCE,
  ObservabilityPipelineParseGrokProcessorRule.JSON_PROPERTY_SUPPORT_RULES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineParseGrokProcessorRule {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_MATCH_RULES = "match_rules";
  private List<ObservabilityPipelineParseGrokProcessorRuleMatchRule> matchRules = new ArrayList<>();

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_SUPPORT_RULES = "support_rules";
  private List<ObservabilityPipelineParseGrokProcessorRuleSupportRule> supportRules = null;

  public ObservabilityPipelineParseGrokProcessorRule() {}

  @JsonCreator
  public ObservabilityPipelineParseGrokProcessorRule(
            @JsonProperty(required=true, value=JSON_PROPERTY_MATCH_RULES)List<ObservabilityPipelineParseGrokProcessorRuleMatchRule> matchRules,
            @JsonProperty(required=true, value=JSON_PROPERTY_SOURCE)String source) {
        this.matchRules = matchRules;
        this.source = source;
  }
  public ObservabilityPipelineParseGrokProcessorRule matchRules(List<ObservabilityPipelineParseGrokProcessorRuleMatchRule> matchRules) {
    this.matchRules = matchRules;
    for (ObservabilityPipelineParseGrokProcessorRuleMatchRule item : matchRules) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ObservabilityPipelineParseGrokProcessorRule addMatchRulesItem(ObservabilityPipelineParseGrokProcessorRuleMatchRule matchRulesItem) {
    this.matchRules.add(matchRulesItem);
    this.unparsed |= matchRulesItem.unparsed;
    return this;
  }

  /**
   * <p>A list of Grok parsing rules that define how to extract fields from the source field.
   * Each rule must contain a name and a valid Grok pattern.</p>
   * @return matchRules
  **/
      @JsonProperty(JSON_PROPERTY_MATCH_RULES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<ObservabilityPipelineParseGrokProcessorRuleMatchRule> getMatchRules() {
        return matchRules;
      }
  public void setMatchRules(List<ObservabilityPipelineParseGrokProcessorRuleMatchRule> matchRules) {
    this.matchRules = matchRules;
  }
  public ObservabilityPipelineParseGrokProcessorRule source(String source) {
    this.source = source;
    return this;
  }

  /**
   * <p>The name of the field in the log event to apply the Grok rules to.</p>
   * @return source
  **/
      @JsonProperty(JSON_PROPERTY_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getSource() {
        return source;
      }
  public void setSource(String source) {
    this.source = source;
  }
  public ObservabilityPipelineParseGrokProcessorRule supportRules(List<ObservabilityPipelineParseGrokProcessorRuleSupportRule> supportRules) {
    this.supportRules = supportRules;
    for (ObservabilityPipelineParseGrokProcessorRuleSupportRule item : supportRules) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ObservabilityPipelineParseGrokProcessorRule addSupportRulesItem(ObservabilityPipelineParseGrokProcessorRuleSupportRule supportRulesItem) {
    if (this.supportRules == null) {
      this.supportRules = new ArrayList<>();
    }
    this.supportRules.add(supportRulesItem);
    this.unparsed |= supportRulesItem.unparsed;
    return this;
  }

  /**
   * <p>A list of Grok helper rules that can be referenced by the parsing rules.</p>
   * @return supportRules
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SUPPORT_RULES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ObservabilityPipelineParseGrokProcessorRuleSupportRule> getSupportRules() {
        return supportRules;
      }
  public void setSupportRules(List<ObservabilityPipelineParseGrokProcessorRuleSupportRule> supportRules) {
    this.supportRules = supportRules;
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
   * @return ObservabilityPipelineParseGrokProcessorRule
   */
  @JsonAnySetter
  public ObservabilityPipelineParseGrokProcessorRule putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineParseGrokProcessorRule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineParseGrokProcessorRule observabilityPipelineParseGrokProcessorRule = (ObservabilityPipelineParseGrokProcessorRule) o;
    return Objects.equals(this.matchRules, observabilityPipelineParseGrokProcessorRule.matchRules) && Objects.equals(this.source, observabilityPipelineParseGrokProcessorRule.source) && Objects.equals(this.supportRules, observabilityPipelineParseGrokProcessorRule.supportRules) && Objects.equals(this.additionalProperties, observabilityPipelineParseGrokProcessorRule.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(matchRules,source,supportRules, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineParseGrokProcessorRule {\n");
    sb.append("    matchRules: ").append(toIndentedString(matchRules)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    supportRules: ").append(toIndentedString(supportRules)).append("\n");
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

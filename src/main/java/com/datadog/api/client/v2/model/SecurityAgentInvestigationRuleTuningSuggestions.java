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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Suggestions to tune the detection rule that generated the signal. */
@JsonPropertyOrder({
  SecurityAgentInvestigationRuleTuningSuggestions.JSON_PROPERTY_OCCURRENCE_WINDOW_DAYS,
  SecurityAgentInvestigationRuleTuningSuggestions.JSON_PROPERTY_REASONING,
  SecurityAgentInvestigationRuleTuningSuggestions.JSON_PROPERTY_RULE_ID,
  SecurityAgentInvestigationRuleTuningSuggestions.JSON_PROPERTY_RULE_NAME,
  SecurityAgentInvestigationRuleTuningSuggestions.JSON_PROPERTY_RULE_SIGNAL_TOTAL,
  SecurityAgentInvestigationRuleTuningSuggestions.JSON_PROPERTY_SUGGESTIONS,
  SecurityAgentInvestigationRuleTuningSuggestions.JSON_PROPERTY_SUMMARY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityAgentInvestigationRuleTuningSuggestions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OCCURRENCE_WINDOW_DAYS = "occurrence_window_days";
  private Long occurrenceWindowDays;

  public static final String JSON_PROPERTY_REASONING = "reasoning";
  private String reasoning;

  public static final String JSON_PROPERTY_RULE_ID = "rule_id";
  private String ruleId;

  public static final String JSON_PROPERTY_RULE_NAME = "rule_name";
  private String ruleName;

  public static final String JSON_PROPERTY_RULE_SIGNAL_TOTAL = "rule_signal_total";
  private Long ruleSignalTotal;

  public static final String JSON_PROPERTY_SUGGESTIONS = "suggestions";
  private List<SecurityAgentInvestigationRuleTuningSuggestion> suggestions = new ArrayList<>();

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private String summary;

  public SecurityAgentInvestigationRuleTuningSuggestions() {}

  @JsonCreator
  public SecurityAgentInvestigationRuleTuningSuggestions(
      @JsonProperty(required = true, value = JSON_PROPERTY_OCCURRENCE_WINDOW_DAYS)
          Long occurrenceWindowDays,
      @JsonProperty(required = true, value = JSON_PROPERTY_REASONING) String reasoning,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_ID) String ruleId,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_NAME) String ruleName,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_SIGNAL_TOTAL) Long ruleSignalTotal,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUGGESTIONS)
          List<SecurityAgentInvestigationRuleTuningSuggestion> suggestions,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUMMARY) String summary) {
    this.occurrenceWindowDays = occurrenceWindowDays;
    this.reasoning = reasoning;
    this.ruleId = ruleId;
    this.ruleName = ruleName;
    this.ruleSignalTotal = ruleSignalTotal;
    this.suggestions = suggestions;
    for (SecurityAgentInvestigationRuleTuningSuggestion item : suggestions) {
      this.unparsed |= item.unparsed;
    }
    this.summary = summary;
  }

  public SecurityAgentInvestigationRuleTuningSuggestions occurrenceWindowDays(
      Long occurrenceWindowDays) {
    this.occurrenceWindowDays = occurrenceWindowDays;
    return this;
  }

  /**
   * Length of the window, in days.
   *
   * @return occurrenceWindowDays
   */
  @JsonProperty(JSON_PROPERTY_OCCURRENCE_WINDOW_DAYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getOccurrenceWindowDays() {
    return occurrenceWindowDays;
  }

  public void setOccurrenceWindowDays(Long occurrenceWindowDays) {
    this.occurrenceWindowDays = occurrenceWindowDays;
  }

  public SecurityAgentInvestigationRuleTuningSuggestions reasoning(String reasoning) {
    this.reasoning = reasoning;
    return this;
  }

  /**
   * Why tuning the rule is suggested.
   *
   * @return reasoning
   */
  @JsonProperty(JSON_PROPERTY_REASONING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getReasoning() {
    return reasoning;
  }

  public void setReasoning(String reasoning) {
    this.reasoning = reasoning;
  }

  public SecurityAgentInvestigationRuleTuningSuggestions ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  /**
   * ID of the detection rule.
   *
   * @return ruleId
   */
  @JsonProperty(JSON_PROPERTY_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  public SecurityAgentInvestigationRuleTuningSuggestions ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

  /**
   * Name of the detection rule.
   *
   * @return ruleName
   */
  @JsonProperty(JSON_PROPERTY_RULE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }

  public SecurityAgentInvestigationRuleTuningSuggestions ruleSignalTotal(Long ruleSignalTotal) {
    this.ruleSignalTotal = ruleSignalTotal;
    return this;
  }

  /**
   * Number of signals the rule generated in the window.
   *
   * @return ruleSignalTotal
   */
  @JsonProperty(JSON_PROPERTY_RULE_SIGNAL_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getRuleSignalTotal() {
    return ruleSignalTotal;
  }

  public void setRuleSignalTotal(Long ruleSignalTotal) {
    this.ruleSignalTotal = ruleSignalTotal;
  }

  public SecurityAgentInvestigationRuleTuningSuggestions suggestions(
      List<SecurityAgentInvestigationRuleTuningSuggestion> suggestions) {
    this.suggestions = suggestions;
    for (SecurityAgentInvestigationRuleTuningSuggestion item : suggestions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityAgentInvestigationRuleTuningSuggestions addSuggestionsItem(
      SecurityAgentInvestigationRuleTuningSuggestion suggestionsItem) {
    this.suggestions.add(suggestionsItem);
    this.unparsed |= suggestionsItem.unparsed;
    return this;
  }

  /**
   * The tuning suggestions.
   *
   * @return suggestions
   */
  @JsonProperty(JSON_PROPERTY_SUGGESTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SecurityAgentInvestigationRuleTuningSuggestion> getSuggestions() {
    return suggestions;
  }

  public void setSuggestions(List<SecurityAgentInvestigationRuleTuningSuggestion> suggestions) {
    this.suggestions = suggestions;
    if (suggestions != null) {
      for (SecurityAgentInvestigationRuleTuningSuggestion item : suggestions) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SecurityAgentInvestigationRuleTuningSuggestions summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Summary of the suggestions.
   *
   * @return summary
   */
  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
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
   * @return SecurityAgentInvestigationRuleTuningSuggestions
   */
  @JsonAnySetter
  public SecurityAgentInvestigationRuleTuningSuggestions putAdditionalProperty(
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

  /** Return true if this SecurityAgentInvestigationRuleTuningSuggestions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityAgentInvestigationRuleTuningSuggestions
        securityAgentInvestigationRuleTuningSuggestions =
            (SecurityAgentInvestigationRuleTuningSuggestions) o;
    return Objects.equals(
            this.occurrenceWindowDays,
            securityAgentInvestigationRuleTuningSuggestions.occurrenceWindowDays)
        && Objects.equals(this.reasoning, securityAgentInvestigationRuleTuningSuggestions.reasoning)
        && Objects.equals(this.ruleId, securityAgentInvestigationRuleTuningSuggestions.ruleId)
        && Objects.equals(this.ruleName, securityAgentInvestigationRuleTuningSuggestions.ruleName)
        && Objects.equals(
            this.ruleSignalTotal, securityAgentInvestigationRuleTuningSuggestions.ruleSignalTotal)
        && Objects.equals(
            this.suggestions, securityAgentInvestigationRuleTuningSuggestions.suggestions)
        && Objects.equals(this.summary, securityAgentInvestigationRuleTuningSuggestions.summary)
        && Objects.equals(
            this.additionalProperties,
            securityAgentInvestigationRuleTuningSuggestions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        occurrenceWindowDays,
        reasoning,
        ruleId,
        ruleName,
        ruleSignalTotal,
        suggestions,
        summary,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityAgentInvestigationRuleTuningSuggestions {\n");
    sb.append("    occurrenceWindowDays: ")
        .append(toIndentedString(occurrenceWindowDays))
        .append("\n");
    sb.append("    reasoning: ").append(toIndentedString(reasoning)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    ruleSignalTotal: ").append(toIndentedString(ruleSignalTotal)).append("\n");
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

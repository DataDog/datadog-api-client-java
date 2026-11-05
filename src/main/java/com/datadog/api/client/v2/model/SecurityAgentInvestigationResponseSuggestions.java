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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Suggested responses to the signal. */
@JsonPropertyOrder({
  SecurityAgentInvestigationResponseSuggestions.JSON_PROPERTY_MITIGATION_SUGGESTIONS,
  SecurityAgentInvestigationResponseSuggestions.JSON_PROPERTY_RULE_TUNING_SUGGESTIONS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityAgentInvestigationResponseSuggestions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MITIGATION_SUGGESTIONS = "mitigation_suggestions";
  private List<SecurityAgentInvestigationMitigationSuggestion> mitigationSuggestions = null;

  public static final String JSON_PROPERTY_RULE_TUNING_SUGGESTIONS = "rule_tuning_suggestions";
  private SecurityAgentInvestigationRuleTuningSuggestions ruleTuningSuggestions;

  public SecurityAgentInvestigationResponseSuggestions mitigationSuggestions(
      List<SecurityAgentInvestigationMitigationSuggestion> mitigationSuggestions) {
    this.mitigationSuggestions = mitigationSuggestions;
    if (mitigationSuggestions != null) {
      for (SecurityAgentInvestigationMitigationSuggestion item : mitigationSuggestions) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public SecurityAgentInvestigationResponseSuggestions addMitigationSuggestionsItem(
      SecurityAgentInvestigationMitigationSuggestion mitigationSuggestionsItem) {
    if (this.mitigationSuggestions == null) {
      this.mitigationSuggestions = new ArrayList<>();
    }
    this.mitigationSuggestions.add(mitigationSuggestionsItem);
    this.unparsed |= mitigationSuggestionsItem.unparsed;
    return this;
  }

  /**
   * Suggested mitigations, in the order to apply them.
   *
   * @return mitigationSuggestions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MITIGATION_SUGGESTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecurityAgentInvestigationMitigationSuggestion> getMitigationSuggestions() {
    return mitigationSuggestions;
  }

  public void setMitigationSuggestions(
      List<SecurityAgentInvestigationMitigationSuggestion> mitigationSuggestions) {
    this.mitigationSuggestions = mitigationSuggestions;
    if (mitigationSuggestions != null) {
      for (SecurityAgentInvestigationMitigationSuggestion item : mitigationSuggestions) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SecurityAgentInvestigationResponseSuggestions ruleTuningSuggestions(
      SecurityAgentInvestigationRuleTuningSuggestions ruleTuningSuggestions) {
    this.ruleTuningSuggestions = ruleTuningSuggestions;
    this.unparsed |= ruleTuningSuggestions.unparsed;
    return this;
  }

  /**
   * Suggestions to tune the detection rule that generated the signal.
   *
   * @return ruleTuningSuggestions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_TUNING_SUGGESTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityAgentInvestigationRuleTuningSuggestions getRuleTuningSuggestions() {
    return ruleTuningSuggestions;
  }

  public void setRuleTuningSuggestions(
      SecurityAgentInvestigationRuleTuningSuggestions ruleTuningSuggestions) {
    this.ruleTuningSuggestions = ruleTuningSuggestions;
    if (ruleTuningSuggestions != null) {
      this.unparsed |= ruleTuningSuggestions.unparsed;
    }
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
   * @return SecurityAgentInvestigationResponseSuggestions
   */
  @JsonAnySetter
  public SecurityAgentInvestigationResponseSuggestions putAdditionalProperty(
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

  /** Return true if this SecurityAgentInvestigationResponseSuggestions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityAgentInvestigationResponseSuggestions securityAgentInvestigationResponseSuggestions =
        (SecurityAgentInvestigationResponseSuggestions) o;
    return Objects.equals(
            this.mitigationSuggestions,
            securityAgentInvestigationResponseSuggestions.mitigationSuggestions)
        && Objects.equals(
            this.ruleTuningSuggestions,
            securityAgentInvestigationResponseSuggestions.ruleTuningSuggestions)
        && Objects.equals(
            this.additionalProperties,
            securityAgentInvestigationResponseSuggestions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mitigationSuggestions, ruleTuningSuggestions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityAgentInvestigationResponseSuggestions {\n");
    sb.append("    mitigationSuggestions: ")
        .append(toIndentedString(mitigationSuggestions))
        .append("\n");
    sb.append("    ruleTuningSuggestions: ")
        .append(toIndentedString(ruleTuningSuggestions))
        .append("\n");
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

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

/** One package the Supply Chain Firewall evaluated, with the outcome and every matched rule. */
@JsonPropertyOrder({
  AIGuardScfwPackageFinding.JSON_PROPERTY_ECOSYSTEM,
  AIGuardScfwPackageFinding.JSON_PROPERTY_MATCHED_RULES,
  AIGuardScfwPackageFinding.JSON_PROPERTY_NAME,
  AIGuardScfwPackageFinding.JSON_PROPERTY_OUTCOME,
  AIGuardScfwPackageFinding.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AIGuardScfwPackageFinding {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ECOSYSTEM = "ecosystem";
  private String ecosystem;

  public static final String JSON_PROPERTY_MATCHED_RULES = "matched_rules";
  private List<AIGuardScfwMatchedRule> matchedRules = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OUTCOME = "outcome";
  private AIGuardScfwOutcome outcome;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public AIGuardScfwPackageFinding() {}

  @JsonCreator
  public AIGuardScfwPackageFinding(
      @JsonProperty(required = true, value = JSON_PROPERTY_ECOSYSTEM) String ecosystem,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_OUTCOME) AIGuardScfwOutcome outcome,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) String version) {
    this.ecosystem = ecosystem;
    this.name = name;
    this.outcome = outcome;
    this.unparsed |= !outcome.isValid();
    this.version = version;
  }

  public AIGuardScfwPackageFinding ecosystem(String ecosystem) {
    this.ecosystem = ecosystem;
    return this;
  }

  /**
   * The package ecosystem the firewall evaluated, such as <code>PyPI</code>, <code>npm</code>, or
   * <code>crates.io</code>.
   *
   * @return ecosystem
   */
  @JsonProperty(JSON_PROPERTY_ECOSYSTEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEcosystem() {
    return ecosystem;
  }

  public void setEcosystem(String ecosystem) {
    this.ecosystem = ecosystem;
  }

  public AIGuardScfwPackageFinding matchedRules(List<AIGuardScfwMatchedRule> matchedRules) {
    this.matchedRules = matchedRules;
    if (matchedRules != null) {
      for (AIGuardScfwMatchedRule item : matchedRules) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public AIGuardScfwPackageFinding addMatchedRulesItem(AIGuardScfwMatchedRule matchedRulesItem) {
    if (this.matchedRules == null) {
      this.matchedRules = new ArrayList<>();
    }
    this.matchedRules.add(matchedRulesItem);
    this.unparsed |= matchedRulesItem.unparsed;
    return this;
  }

  /**
   * Every rule the firewall matched on the package.
   *
   * @return matchedRules
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATCHED_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AIGuardScfwMatchedRule> getMatchedRules() {
    return matchedRules;
  }

  public void setMatchedRules(List<AIGuardScfwMatchedRule> matchedRules) {
    this.matchedRules = matchedRules;
    if (matchedRules != null) {
      for (AIGuardScfwMatchedRule item : matchedRules) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AIGuardScfwPackageFinding name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the package.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AIGuardScfwPackageFinding outcome(AIGuardScfwOutcome outcome) {
    this.outcome = outcome;
    this.unparsed |= !outcome.isValid();
    return this;
  }

  /**
   * The Supply Chain Firewall outcome for a package, a matched rule, or the whole request.
   *
   * @return outcome
   */
  @JsonProperty(JSON_PROPERTY_OUTCOME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AIGuardScfwOutcome getOutcome() {
    return outcome;
  }

  public void setOutcome(AIGuardScfwOutcome outcome) {
    if (!outcome.isValid()) {
      this.unparsed = true;
    }
    this.outcome = outcome;
  }

  public AIGuardScfwPackageFinding version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the package.
   *
   * @return version
   */
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
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
   * @return AIGuardScfwPackageFinding
   */
  @JsonAnySetter
  public AIGuardScfwPackageFinding putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AIGuardScfwPackageFinding object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AIGuardScfwPackageFinding aiGuardScfwPackageFinding = (AIGuardScfwPackageFinding) o;
    return Objects.equals(this.ecosystem, aiGuardScfwPackageFinding.ecosystem)
        && Objects.equals(this.matchedRules, aiGuardScfwPackageFinding.matchedRules)
        && Objects.equals(this.name, aiGuardScfwPackageFinding.name)
        && Objects.equals(this.outcome, aiGuardScfwPackageFinding.outcome)
        && Objects.equals(this.version, aiGuardScfwPackageFinding.version)
        && Objects.equals(
            this.additionalProperties, aiGuardScfwPackageFinding.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ecosystem, matchedRules, name, outcome, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AIGuardScfwPackageFinding {\n");
    sb.append("    ecosystem: ").append(toIndentedString(ecosystem)).append("\n");
    sb.append("    matchedRules: ").append(toIndentedString(matchedRules)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

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

/** Remediation for the issue. Omitted when no remediation is available. */
@JsonPropertyOrder({
  AgentHealthRemediation.JSON_PROPERTY_SCRIPT,
  AgentHealthRemediation.JSON_PROPERTY_STEPS,
  AgentHealthRemediation.JSON_PROPERTY_SUMMARY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AgentHealthRemediation {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SCRIPT = "script";
  private AgentHealthRemediationScript script;

  public static final String JSON_PROPERTY_STEPS = "steps";
  private List<AgentHealthRemediationStep> steps = null;

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private String summary;

  public AgentHealthRemediation script(AgentHealthRemediationScript script) {
    this.script = script;
    this.unparsed |= script.unparsed;
    return this;
  }

  /**
   * A script that can be used to remediate the issue.
   *
   * @return script
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCRIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentHealthRemediationScript getScript() {
    return script;
  }

  public void setScript(AgentHealthRemediationScript script) {
    this.script = script;
    if (script != null) {
      this.unparsed |= script.unparsed;
    }
  }

  public AgentHealthRemediation steps(List<AgentHealthRemediationStep> steps) {
    this.steps = steps;
    if (steps != null) {
      for (AgentHealthRemediationStep item : steps) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public AgentHealthRemediation addStepsItem(AgentHealthRemediationStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    this.unparsed |= stepsItem.unparsed;
    return this;
  }

  /**
   * Steps to remediate the issue.
   *
   * @return steps
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AgentHealthRemediationStep> getSteps() {
    return steps;
  }

  public void setSteps(List<AgentHealthRemediationStep> steps) {
    this.steps = steps;
    if (steps != null) {
      for (AgentHealthRemediationStep item : steps) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AgentHealthRemediation summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * A summary of how to remediate the issue.
   *
   * @return summary
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return AgentHealthRemediation
   */
  @JsonAnySetter
  public AgentHealthRemediation putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AgentHealthRemediation object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentHealthRemediation agentHealthRemediation = (AgentHealthRemediation) o;
    return Objects.equals(this.script, agentHealthRemediation.script)
        && Objects.equals(this.steps, agentHealthRemediation.steps)
        && Objects.equals(this.summary, agentHealthRemediation.summary)
        && Objects.equals(this.additionalProperties, agentHealthRemediation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(script, steps, summary, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentHealthRemediation {\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

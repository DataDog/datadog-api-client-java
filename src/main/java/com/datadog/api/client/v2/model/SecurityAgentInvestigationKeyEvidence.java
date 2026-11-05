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

/** A piece of evidence the verdict rests on. */
@JsonPropertyOrder({
  SecurityAgentInvestigationKeyEvidence.JSON_PROPERTY_CATEGORY,
  SecurityAgentInvestigationKeyEvidence.JSON_PROPERTY_FINDING,
  SecurityAgentInvestigationKeyEvidence.JSON_PROPERTY_SOURCE_STEPS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityAgentInvestigationKeyEvidence {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_FINDING = "finding";
  private String finding;

  public static final String JSON_PROPERTY_SOURCE_STEPS = "source_steps";
  private List<String> sourceSteps = null;

  public SecurityAgentInvestigationKeyEvidence() {}

  @JsonCreator
  public SecurityAgentInvestigationKeyEvidence(
      @JsonProperty(required = true, value = JSON_PROPERTY_CATEGORY) String category,
      @JsonProperty(required = true, value = JSON_PROPERTY_FINDING) String finding) {
    this.category = category;
    this.finding = finding;
  }

  public SecurityAgentInvestigationKeyEvidence category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Category of the evidence.
   *
   * @return category
   */
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public SecurityAgentInvestigationKeyEvidence finding(String finding) {
    this.finding = finding;
    return this;
  }

  /**
   * What the investigation found.
   *
   * @return finding
   */
  @JsonProperty(JSON_PROPERTY_FINDING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFinding() {
    return finding;
  }

  public void setFinding(String finding) {
    this.finding = finding;
  }

  public SecurityAgentInvestigationKeyEvidence sourceSteps(List<String> sourceSteps) {
    this.sourceSteps = sourceSteps;
    return this;
  }

  public SecurityAgentInvestigationKeyEvidence addSourceStepsItem(String sourceStepsItem) {
    if (this.sourceSteps == null) {
      this.sourceSteps = new ArrayList<>();
    }
    this.sourceSteps.add(sourceStepsItem);
    return this;
  }

  /**
   * Names of the steps the evidence comes from.
   *
   * @return sourceSteps
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getSourceSteps() {
    return sourceSteps;
  }

  public void setSourceSteps(List<String> sourceSteps) {
    this.sourceSteps = sourceSteps;
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
   * @return SecurityAgentInvestigationKeyEvidence
   */
  @JsonAnySetter
  public SecurityAgentInvestigationKeyEvidence putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityAgentInvestigationKeyEvidence object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityAgentInvestigationKeyEvidence securityAgentInvestigationKeyEvidence =
        (SecurityAgentInvestigationKeyEvidence) o;
    return Objects.equals(this.category, securityAgentInvestigationKeyEvidence.category)
        && Objects.equals(this.finding, securityAgentInvestigationKeyEvidence.finding)
        && Objects.equals(this.sourceSteps, securityAgentInvestigationKeyEvidence.sourceSteps)
        && Objects.equals(
            this.additionalProperties, securityAgentInvestigationKeyEvidence.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, finding, sourceSteps, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityAgentInvestigationKeyEvidence {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    finding: ").append(toIndentedString(finding)).append("\n");
    sb.append("    sourceSteps: ").append(toIndentedString(sourceSteps)).append("\n");
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

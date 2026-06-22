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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A recommendation-oriented summary of a candidate remediation. */
@JsonPropertyOrder({
  RemediationProposedFix.JSON_PROPERTY_DESCRIPTION,
  RemediationProposedFix.JSON_PROPERTY_REVERSIBLE,
  RemediationProposedFix.JSON_PROPERTY_RISK,
  RemediationProposedFix.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RemediationProposedFix {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_REVERSIBLE = "reversible";
  private Boolean reversible;

  public static final String JSON_PROPERTY_RISK = "risk";
  private RemediationRiskLevel risk;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public RemediationProposedFix description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Explanation of the proposed change and why it resolves the root cause. Treat as user-provided
   * content and escape before display.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RemediationProposedFix reversible(Boolean reversible) {
    this.reversible = reversible;
    return this;
  }

  /**
   * Whether the proposed fix can be reversed after execution.
   *
   * @return reversible
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVERSIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getReversible() {
    return reversible;
  }

  public void setReversible(Boolean reversible) {
    this.reversible = reversible;
  }

  public RemediationProposedFix risk(RemediationRiskLevel risk) {
    this.risk = risk;
    this.unparsed |= !risk.isValid();
    return this;
  }

  /**
   * Estimated risk of a remediation step or proposed fix.
   *
   * @return risk
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RISK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RemediationRiskLevel getRisk() {
    return risk;
  }

  public void setRisk(RemediationRiskLevel risk) {
    if (!risk.isValid()) {
      this.unparsed = true;
    }
    this.risk = risk;
  }

  public RemediationProposedFix title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Short title for the proposed fix.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
   * @return RemediationProposedFix
   */
  @JsonAnySetter
  public RemediationProposedFix putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RemediationProposedFix object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemediationProposedFix remediationProposedFix = (RemediationProposedFix) o;
    return Objects.equals(this.description, remediationProposedFix.description)
        && Objects.equals(this.reversible, remediationProposedFix.reversible)
        && Objects.equals(this.risk, remediationProposedFix.risk)
        && Objects.equals(this.title, remediationProposedFix.title)
        && Objects.equals(this.additionalProperties, remediationProposedFix.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, reversible, risk, title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemediationProposedFix {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    reversible: ").append(toIndentedString(reversible)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

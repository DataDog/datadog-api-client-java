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

/** */
@JsonPropertyOrder({
  JiraIssueDataMeta.JSON_PROPERTY_FINDINGS,
  JiraIssueDataMeta.JSON_PROPERTY_VULNERABILITIES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class JiraIssueDataMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FINDINGS = "findings";
  private List<JiraIssueFinding> findings = null;

  public static final String JSON_PROPERTY_VULNERABILITIES = "vulnerabilities";
  private List<JiraIssueFinding> vulnerabilities = null;

  public JiraIssueDataMeta findings(List<JiraIssueFinding> findings) {
    this.findings = findings;
    for (JiraIssueFinding item : findings) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public JiraIssueDataMeta addFindingsItem(JiraIssueFinding findingsItem) {
    if (this.findings == null) {
      this.findings = new ArrayList<>();
    }
    this.findings.add(findingsItem);
    this.unparsed |= findingsItem.unparsed;
    return this;
  }

  /**
   * Getfindings
   *
   * @return findings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FINDINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<JiraIssueFinding> getFindings() {
    return findings;
  }

  public void setFindings(List<JiraIssueFinding> findings) {
    this.findings = findings;
  }

  public JiraIssueDataMeta vulnerabilities(List<JiraIssueFinding> vulnerabilities) {
    this.vulnerabilities = vulnerabilities;
    for (JiraIssueFinding item : vulnerabilities) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public JiraIssueDataMeta addVulnerabilitiesItem(JiraIssueFinding vulnerabilitiesItem) {
    if (this.vulnerabilities == null) {
      this.vulnerabilities = new ArrayList<>();
    }
    this.vulnerabilities.add(vulnerabilitiesItem);
    this.unparsed |= vulnerabilitiesItem.unparsed;
    return this;
  }

  /**
   * Getvulnerabilities
   *
   * @return vulnerabilities
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VULNERABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<JiraIssueFinding> getVulnerabilities() {
    return vulnerabilities;
  }

  public void setVulnerabilities(List<JiraIssueFinding> vulnerabilities) {
    this.vulnerabilities = vulnerabilities;
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
   * @return JiraIssueDataMeta
   */
  @JsonAnySetter
  public JiraIssueDataMeta putAdditionalProperty(String key, Object value) {
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

  /** Return true if this JiraIssueDataMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraIssueDataMeta jiraIssueDataMeta = (JiraIssueDataMeta) o;
    return Objects.equals(this.findings, jiraIssueDataMeta.findings)
        && Objects.equals(this.vulnerabilities, jiraIssueDataMeta.vulnerabilities)
        && Objects.equals(this.additionalProperties, jiraIssueDataMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(findings, vulnerabilities, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraIssueDataMeta {\n");
    sb.append("    findings: ").append(toIndentedString(findings)).append("\n");
    sb.append("    vulnerabilities: ").append(toIndentedString(vulnerabilities)).append("\n");
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

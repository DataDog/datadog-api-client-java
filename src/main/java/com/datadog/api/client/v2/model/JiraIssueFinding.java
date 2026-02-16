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

/** */
@JsonPropertyOrder({
  JiraIssueFinding.JSON_PROPERTY_DESCRIPTION,
  JiraIssueFinding.JSON_PROPERTY_IDS,
  JiraIssueFinding.JSON_PROPERTY_IMPACTED,
  JiraIssueFinding.JSON_PROPERTY_REFERENCES,
  JiraIssueFinding.JSON_PROPERTY_REMEDIATION,
  JiraIssueFinding.JSON_PROPERTY_SEVERITY,
  JiraIssueFinding.JSON_PROPERTY_TITLE,
  JiraIssueFinding.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class JiraIssueFinding {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_IDS = "ids";
  private List<JiraIssueFindingId> ids = new ArrayList<>();

  public static final String JSON_PROPERTY_IMPACTED = "impacted";
  private Long impacted;

  public static final String JSON_PROPERTY_REFERENCES = "references";
  private String references;

  public static final String JSON_PROPERTY_REMEDIATION = "remediation";
  private String remediation;

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private FindingStatus severity;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public JiraIssueFinding() {}

  @JsonCreator
  public JiraIssueFinding(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_IDS) List<JiraIssueFindingId> ids,
      @JsonProperty(required = true, value = JSON_PROPERTY_REFERENCES) String references,
      @JsonProperty(required = true, value = JSON_PROPERTY_REMEDIATION) String remediation,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEVERITY) FindingStatus severity,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type) {
    this.description = description;
    this.ids = ids;
    this.references = references;
    this.remediation = remediation;
    this.severity = severity;
    this.unparsed |= !severity.isValid();
    this.title = title;
    this.type = type;
  }

  public JiraIssueFinding description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the finding.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public JiraIssueFinding ids(List<JiraIssueFindingId> ids) {
    this.ids = ids;
    for (JiraIssueFindingId item : ids) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public JiraIssueFinding addIdsItem(JiraIssueFindingId idsItem) {
    this.ids.add(idsItem);
    this.unparsed |= idsItem.unparsed;
    return this;
  }

  /**
   * Getids
   *
   * @return ids
   */
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<JiraIssueFindingId> getIds() {
    return ids;
  }

  public void setIds(List<JiraIssueFindingId> ids) {
    this.ids = ids;
  }

  public JiraIssueFinding impacted(Long impacted) {
    this.impacted = impacted;
    return this;
  }

  /**
   * Number of impacted resources.
   *
   * @return impacted
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMPACTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getImpacted() {
    return impacted;
  }

  public void setImpacted(Long impacted) {
    this.impacted = impacted;
  }

  public JiraIssueFinding references(String references) {
    this.references = references;
    return this;
  }

  /**
   * References for the finding.
   *
   * @return references
   */
  @JsonProperty(JSON_PROPERTY_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getReferences() {
    return references;
  }

  public void setReferences(String references) {
    this.references = references;
  }

  public JiraIssueFinding remediation(String remediation) {
    this.remediation = remediation;
    return this;
  }

  /**
   * Remediation instructions for the finding.
   *
   * @return remediation
   */
  @JsonProperty(JSON_PROPERTY_REMEDIATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRemediation() {
    return remediation;
  }

  public void setRemediation(String remediation) {
    this.remediation = remediation;
  }

  public JiraIssueFinding severity(FindingStatus severity) {
    this.severity = severity;
    this.unparsed |= !severity.isValid();
    return this;
  }

  /**
   * The status of the finding.
   *
   * @return severity
   */
  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FindingStatus getSeverity() {
    return severity;
  }

  public void setSeverity(FindingStatus severity) {
    if (!severity.isValid()) {
      this.unparsed = true;
    }
    this.severity = severity;
  }

  public JiraIssueFinding title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the finding.
   *
   * @return title
   */
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public JiraIssueFinding type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the finding.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
   * @return JiraIssueFinding
   */
  @JsonAnySetter
  public JiraIssueFinding putAdditionalProperty(String key, Object value) {
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

  /** Return true if this JiraIssueFinding object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraIssueFinding jiraIssueFinding = (JiraIssueFinding) o;
    return Objects.equals(this.description, jiraIssueFinding.description)
        && Objects.equals(this.ids, jiraIssueFinding.ids)
        && Objects.equals(this.impacted, jiraIssueFinding.impacted)
        && Objects.equals(this.references, jiraIssueFinding.references)
        && Objects.equals(this.remediation, jiraIssueFinding.remediation)
        && Objects.equals(this.severity, jiraIssueFinding.severity)
        && Objects.equals(this.title, jiraIssueFinding.title)
        && Objects.equals(this.type, jiraIssueFinding.type)
        && Objects.equals(this.additionalProperties, jiraIssueFinding.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        ids,
        impacted,
        references,
        remediation,
        severity,
        title,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraIssueFinding {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    impacted: ").append(toIndentedString(impacted)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    remediation: ").append(toIndentedString(remediation)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

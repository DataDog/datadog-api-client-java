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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Attributes of a remediation group. Each group includes one kind object, <code>package_update
 * </code> or <code>image_update</code>, depending on its grouping definition.
 */
@JsonPropertyOrder({
  RemediationGroupAttributes.JSON_PROPERTY_FINDINGS,
  RemediationGroupAttributes.JSON_PROPERTY_GROUPING_DEFINITION_ID,
  RemediationGroupAttributes.JSON_PROPERTY_IMAGE_UPDATE,
  RemediationGroupAttributes.JSON_PROPERTY_PACKAGE_UPDATE,
  RemediationGroupAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RemediationGroupAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FINDINGS = "findings";
  private RemediationGroupFindings findings;

  public static final String JSON_PROPERTY_GROUPING_DEFINITION_ID = "grouping_definition_id";
  private String groupingDefinitionId;

  public static final String JSON_PROPERTY_IMAGE_UPDATE = "image_update";
  private RemediationGroupImageUpdate imageUpdate;

  public static final String JSON_PROPERTY_PACKAGE_UPDATE = "package_update";
  private RemediationGroupPackageUpdate packageUpdate;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public RemediationGroupAttributes() {}

  @JsonCreator
  public RemediationGroupAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FINDINGS)
          RemediationGroupFindings findings,
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUPING_DEFINITION_ID)
          String groupingDefinitionId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title) {
    this.findings = findings;
    this.unparsed |= findings.unparsed;
    this.groupingDefinitionId = groupingDefinitionId;
    this.title = title;
  }

  public RemediationGroupAttributes findings(RemediationGroupFindings findings) {
    this.findings = findings;
    this.unparsed |= findings.unparsed;
    return this;
  }

  /**
   * Counts of the group's open findings. The counts include every finding in the group, including
   * findings that don't match <code>filter[query]</code>.
   *
   * @return findings
   */
  @JsonProperty(JSON_PROPERTY_FINDINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RemediationGroupFindings getFindings() {
    return findings;
  }

  public void setFindings(RemediationGroupFindings findings) {
    this.findings = findings;
    if (findings != null) {
      this.unparsed |= findings.unparsed;
    }
  }

  public RemediationGroupAttributes groupingDefinitionId(String groupingDefinitionId) {
    this.groupingDefinitionId = groupingDefinitionId;
    return this;
  }

  /**
   * Grouping definition that formed the group: <code>sca.package_update</code> or <code>
   * cloudvm.image_update</code>.
   *
   * @return groupingDefinitionId
   */
  @JsonProperty(JSON_PROPERTY_GROUPING_DEFINITION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getGroupingDefinitionId() {
    return groupingDefinitionId;
  }

  public void setGroupingDefinitionId(String groupingDefinitionId) {
    this.groupingDefinitionId = groupingDefinitionId;
  }

  public RemediationGroupAttributes imageUpdate(RemediationGroupImageUpdate imageUpdate) {
    this.imageUpdate = imageUpdate;
    this.unparsed |= imageUpdate.unparsed;
    return this;
  }

  /**
   * An image or package to upgrade, for a group of host and container vulnerabilities (<code>
   * cloudvm.image_update</code>). The group gathers the open vulnerabilities of running production
   * images that have a fix available, and groups them by <code>grouping_location</code>, <code>
   * remediation_kind</code>, and <code>action</code>.
   *
   * @return imageUpdate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RemediationGroupImageUpdate getImageUpdate() {
    return imageUpdate;
  }

  public void setImageUpdate(RemediationGroupImageUpdate imageUpdate) {
    this.imageUpdate = imageUpdate;
    if (imageUpdate != null) {
      this.unparsed |= imageUpdate.unparsed;
    }
  }

  public RemediationGroupAttributes packageUpdate(RemediationGroupPackageUpdate packageUpdate) {
    this.packageUpdate = packageUpdate;
    this.unparsed |= packageUpdate.unparsed;
    return this;
  }

  /**
   * A package to update in a repository, for a group of library vulnerabilities (<code>
   * sca.package_update</code>). The group gathers the open vulnerabilities of direct dependencies
   * that have a recommended fix, and groups them by <code>@git.repository_id</code>, <code>
   * @vulnerability.stack.ecosystem</code>, and <code>@remediation.recommended.name</code>.
   *
   * @return packageUpdate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PACKAGE_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RemediationGroupPackageUpdate getPackageUpdate() {
    return packageUpdate;
  }

  public void setPackageUpdate(RemediationGroupPackageUpdate packageUpdate) {
    this.packageUpdate = packageUpdate;
    if (packageUpdate != null) {
      this.unparsed |= packageUpdate.unparsed;
    }
  }

  public RemediationGroupAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the group, which describes the change to make.
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
   * @return RemediationGroupAttributes
   */
  @JsonAnySetter
  public RemediationGroupAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RemediationGroupAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemediationGroupAttributes remediationGroupAttributes = (RemediationGroupAttributes) o;
    return Objects.equals(this.findings, remediationGroupAttributes.findings)
        && Objects.equals(
            this.groupingDefinitionId, remediationGroupAttributes.groupingDefinitionId)
        && Objects.equals(this.imageUpdate, remediationGroupAttributes.imageUpdate)
        && Objects.equals(this.packageUpdate, remediationGroupAttributes.packageUpdate)
        && Objects.equals(this.title, remediationGroupAttributes.title)
        && Objects.equals(
            this.additionalProperties, remediationGroupAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        findings, groupingDefinitionId, imageUpdate, packageUpdate, title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemediationGroupAttributes {\n");
    sb.append("    findings: ").append(toIndentedString(findings)).append("\n");
    sb.append("    groupingDefinitionId: ")
        .append(toIndentedString(groupingDefinitionId))
        .append("\n");
    sb.append("    imageUpdate: ").append(toIndentedString(imageUpdate)).append("\n");
    sb.append("    packageUpdate: ").append(toIndentedString(packageUpdate)).append("\n");
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

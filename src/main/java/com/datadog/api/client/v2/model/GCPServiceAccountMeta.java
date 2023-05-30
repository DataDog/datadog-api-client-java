/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Additional information related to your service account. */
@JsonPropertyOrder({GCPServiceAccountMeta.JSON_PROPERTY_ACCESSIBLE_PROJECTS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GCPServiceAccountMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCESSIBLE_PROJECTS = "accessible_projects";
  private List<String> accessibleProjects = null;

  public GCPServiceAccountMeta accessibleProjects(List<String> accessibleProjects) {
    this.accessibleProjects = accessibleProjects;
    return this;
  }

  public GCPServiceAccountMeta addAccessibleProjectsItem(String accessibleProjectsItem) {
    if (this.accessibleProjects == null) {
      this.accessibleProjects = new ArrayList<>();
    }
    this.accessibleProjects.add(accessibleProjectsItem);
    return this;
  }

  /**
   * The current list of projects accessible from your service account.
   *
   * @return accessibleProjects
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESSIBLE_PROJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getAccessibleProjects() {
    return accessibleProjects;
  }

  public void setAccessibleProjects(List<String> accessibleProjects) {
    this.accessibleProjects = accessibleProjects;
  }

  /** Return true if this GCPServiceAccountMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPServiceAccountMeta gcpServiceAccountMeta = (GCPServiceAccountMeta) o;
    return Objects.equals(this.accessibleProjects, gcpServiceAccountMeta.accessibleProjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessibleProjects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPServiceAccountMeta {\n");
    sb.append("    accessibleProjects: ").append(toIndentedString(accessibleProjects)).append("\n");
    sb.append("}");
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

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

/** Contains information of the host running the pipeline, stage, job, or step. */
@JsonPropertyOrder({
  CIAppHostInfo.JSON_PROPERTY_HOSTNAME,
  CIAppHostInfo.JSON_PROPERTY_LABELS,
  CIAppHostInfo.JSON_PROPERTY_NAME,
  CIAppHostInfo.JSON_PROPERTY_WORKSPACE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppHostInfo {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private String hostname;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<String> labels = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_WORKSPACE = "workspace";
  private String workspace;

  public CIAppHostInfo hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * FQDN of the host.
   *
   * @return hostname
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public CIAppHostInfo labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public CIAppHostInfo addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * A list of labels used to select or identify the node.
   *
   * @return labels
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public CIAppHostInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name for the host.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CIAppHostInfo workspace(String workspace) {
    this.workspace = workspace;
    return this;
  }

  /**
   * The path where the code is checked out.
   *
   * @return workspace
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKSPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWorkspace() {
    return workspace;
  }

  public void setWorkspace(String workspace) {
    this.workspace = workspace;
  }

  /** Return true if this CIAppHostInfo object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppHostInfo ciAppHostInfo = (CIAppHostInfo) o;
    return Objects.equals(this.hostname, ciAppHostInfo.hostname)
        && Objects.equals(this.labels, ciAppHostInfo.labels)
        && Objects.equals(this.name, ciAppHostInfo.name)
        && Objects.equals(this.workspace, ciAppHostInfo.workspace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, labels, name, workspace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppHostInfo {\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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

/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Metadata for the Synthetics tests run. */
@JsonPropertyOrder({
  SyntheticsCIBatchMetadata.JSON_PROPERTY_CI,
  SyntheticsCIBatchMetadata.JSON_PROPERTY_GIT
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsCIBatchMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CI = "ci";
  private SyntheticsCIBatchMetadataCI ci;

  public static final String JSON_PROPERTY_GIT = "git";
  private SyntheticsCIBatchMetadataGit git;

  public SyntheticsCIBatchMetadata ci(SyntheticsCIBatchMetadataCI ci) {
    this.ci = ci;
    this.unparsed |= ci.unparsed;
    return this;
  }

  /**
   * Description of the CI provider.
   *
   * @return ci
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsCIBatchMetadataCI getCi() {
    return ci;
  }

  public void setCi(SyntheticsCIBatchMetadataCI ci) {
    this.ci = ci;
  }

  public SyntheticsCIBatchMetadata git(SyntheticsCIBatchMetadataGit git) {
    this.git = git;
    this.unparsed |= git.unparsed;
    return this;
  }

  /**
   * Git information.
   *
   * @return git
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsCIBatchMetadataGit getGit() {
    return git;
  }

  public void setGit(SyntheticsCIBatchMetadataGit git) {
    this.git = git;
  }

  /** Return true if this SyntheticsCIBatchMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsCIBatchMetadata syntheticsCiBatchMetadata = (SyntheticsCIBatchMetadata) o;
    return Objects.equals(this.ci, syntheticsCiBatchMetadata.ci)
        && Objects.equals(this.git, syntheticsCiBatchMetadata.git);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ci, git);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsCIBatchMetadata {\n");
    sb.append("    ci: ").append(toIndentedString(ci)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
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

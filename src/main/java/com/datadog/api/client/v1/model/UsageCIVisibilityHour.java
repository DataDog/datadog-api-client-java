/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>CI visibility usage in a given hour.</p>
 */
@JsonPropertyOrder({
  UsageCIVisibilityHour.JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS,
  UsageCIVisibilityHour.JSON_PROPERTY_CI_TEST_INDEXED_SPANS,
  UsageCIVisibilityHour.JSON_PROPERTY_CI_VISIBILITY_PIPELINE_COMMITTERS,
  UsageCIVisibilityHour.JSON_PROPERTY_CI_VISIBILITY_TEST_COMMITTERS,
  UsageCIVisibilityHour.JSON_PROPERTY_ORG_NAME,
  UsageCIVisibilityHour.JSON_PROPERTY_PUBLIC_ID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageCIVisibilityHour {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS = "ci_pipeline_indexed_spans";
  private Long ciPipelineIndexedSpans;

  public static final String JSON_PROPERTY_CI_TEST_INDEXED_SPANS = "ci_test_indexed_spans";
  private Long ciTestIndexedSpans;

  public static final String JSON_PROPERTY_CI_VISIBILITY_PIPELINE_COMMITTERS = "ci_visibility_pipeline_committers";
  private Long ciVisibilityPipelineCommitters;

  public static final String JSON_PROPERTY_CI_VISIBILITY_TEST_COMMITTERS = "ci_visibility_test_committers";
  private Long ciVisibilityTestCommitters;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public UsageCIVisibilityHour ciPipelineIndexedSpans(Long ciPipelineIndexedSpans) {
    this.ciPipelineIndexedSpans = ciPipelineIndexedSpans;
    return this;
  }

  /**
   * <p>The number of spans for pipelines in the queried hour.</p>
   * @return ciPipelineIndexedSpans
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getCiPipelineIndexedSpans() {
        return ciPipelineIndexedSpans;
      }
  public void setCiPipelineIndexedSpans(Long ciPipelineIndexedSpans) {
    this.ciPipelineIndexedSpans = ciPipelineIndexedSpans;
  }
  public UsageCIVisibilityHour ciTestIndexedSpans(Long ciTestIndexedSpans) {
    this.ciTestIndexedSpans = ciTestIndexedSpans;
    return this;
  }

  /**
   * <p>The number of spans for tests in the queried hour.</p>
   * @return ciTestIndexedSpans
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CI_TEST_INDEXED_SPANS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getCiTestIndexedSpans() {
        return ciTestIndexedSpans;
      }
  public void setCiTestIndexedSpans(Long ciTestIndexedSpans) {
    this.ciTestIndexedSpans = ciTestIndexedSpans;
  }
  public UsageCIVisibilityHour ciVisibilityPipelineCommitters(Long ciVisibilityPipelineCommitters) {
    this.ciVisibilityPipelineCommitters = ciVisibilityPipelineCommitters;
    return this;
  }

  /**
   * <p>Shows the total count of all active Git committers for Pipelines in the current month. A committer is active if they commit at least 3 times in a given month.</p>
   * @return ciVisibilityPipelineCommitters
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CI_VISIBILITY_PIPELINE_COMMITTERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getCiVisibilityPipelineCommitters() {
        return ciVisibilityPipelineCommitters;
      }
  public void setCiVisibilityPipelineCommitters(Long ciVisibilityPipelineCommitters) {
    this.ciVisibilityPipelineCommitters = ciVisibilityPipelineCommitters;
  }
  public UsageCIVisibilityHour ciVisibilityTestCommitters(Long ciVisibilityTestCommitters) {
    this.ciVisibilityTestCommitters = ciVisibilityTestCommitters;
    return this;
  }

  /**
   * <p>The total count of all active Git committers for tests in the current month. A committer is active if they commit at least 3 times in a given month.</p>
   * @return ciVisibilityTestCommitters
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CI_VISIBILITY_TEST_COMMITTERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getCiVisibilityTestCommitters() {
        return ciVisibilityTestCommitters;
      }
  public void setCiVisibilityTestCommitters(Long ciVisibilityTestCommitters) {
    this.ciVisibilityTestCommitters = ciVisibilityTestCommitters;
  }
  public UsageCIVisibilityHour orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * <p>The organization name.</p>
   * @return orgName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ORG_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getOrgName() {
        return orgName;
      }
  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }
  public UsageCIVisibilityHour publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * <p>The organization public ID.</p>
   * @return publicId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPublicId() {
        return publicId;
      }
  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  /**
   * Return true if this UsageCIVisibilityHour object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageCIVisibilityHour usageCiVisibilityHour = (UsageCIVisibilityHour) o;
    return Objects.equals(this.ciPipelineIndexedSpans, usageCiVisibilityHour.ciPipelineIndexedSpans) && Objects.equals(this.ciTestIndexedSpans, usageCiVisibilityHour.ciTestIndexedSpans) && Objects.equals(this.ciVisibilityPipelineCommitters, usageCiVisibilityHour.ciVisibilityPipelineCommitters) && Objects.equals(this.ciVisibilityTestCommitters, usageCiVisibilityHour.ciVisibilityTestCommitters) && Objects.equals(this.orgName, usageCiVisibilityHour.orgName) && Objects.equals(this.publicId, usageCiVisibilityHour.publicId);
  }


  @Override
  public int hashCode() {
    return Objects.hash(ciPipelineIndexedSpans,ciTestIndexedSpans,ciVisibilityPipelineCommitters,ciVisibilityTestCommitters,orgName,publicId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageCIVisibilityHour {\n");
    sb.append("    ciPipelineIndexedSpans: ").append(toIndentedString(ciPipelineIndexedSpans)).append("\n");
    sb.append("    ciTestIndexedSpans: ").append(toIndentedString(ciTestIndexedSpans)).append("\n");
    sb.append("    ciVisibilityPipelineCommitters: ").append(toIndentedString(ciVisibilityPipelineCommitters)).append("\n");
    sb.append("    ciVisibilityTestCommitters: ").append(toIndentedString(ciVisibilityTestCommitters)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

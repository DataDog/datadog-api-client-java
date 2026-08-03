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
import java.util.UUID;
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
  UsageCIVisibilityHour.JSON_PROPERTY_CI_VISIBILITY_ITR_COMMITTERS,
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
  private JsonNullable<Long> ciPipelineIndexedSpans = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CI_TEST_INDEXED_SPANS = "ci_test_indexed_spans";
  private JsonNullable<Long> ciTestIndexedSpans = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CI_VISIBILITY_ITR_COMMITTERS = "ci_visibility_itr_committers";
  private JsonNullable<Long> ciVisibilityItrCommitters = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CI_VISIBILITY_PIPELINE_COMMITTERS = "ci_visibility_pipeline_committers";
  private JsonNullable<Long> ciVisibilityPipelineCommitters = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CI_VISIBILITY_TEST_COMMITTERS = "ci_visibility_test_committers";
  private JsonNullable<Long> ciVisibilityTestCommitters = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public UsageCIVisibilityHour ciPipelineIndexedSpans(Long ciPipelineIndexedSpans) {
    this.ciPipelineIndexedSpans = JsonNullable.<Long>of(ciPipelineIndexedSpans);
    return this;
  }

  /**
   * <p>The number of spans for pipelines in the queried hour.</p>
   * @return ciPipelineIndexedSpans
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getCiPipelineIndexedSpans() {
        return ciPipelineIndexedSpans.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCiPipelineIndexedSpans_JsonNullable() {
    return ciPipelineIndexedSpans;
  }
  @JsonProperty(JSON_PROPERTY_CI_PIPELINE_INDEXED_SPANS)public void setCiPipelineIndexedSpans_JsonNullable(JsonNullable<Long> ciPipelineIndexedSpans) {
    this.ciPipelineIndexedSpans = ciPipelineIndexedSpans;
  }
  public void setCiPipelineIndexedSpans(Long ciPipelineIndexedSpans) {
    this.ciPipelineIndexedSpans = JsonNullable.<Long>of(ciPipelineIndexedSpans);
  }
  public UsageCIVisibilityHour ciTestIndexedSpans(Long ciTestIndexedSpans) {
    this.ciTestIndexedSpans = JsonNullable.<Long>of(ciTestIndexedSpans);
    return this;
  }

  /**
   * <p>The number of spans for tests in the queried hour.</p>
   * @return ciTestIndexedSpans
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getCiTestIndexedSpans() {
        return ciTestIndexedSpans.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_CI_TEST_INDEXED_SPANS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCiTestIndexedSpans_JsonNullable() {
    return ciTestIndexedSpans;
  }
  @JsonProperty(JSON_PROPERTY_CI_TEST_INDEXED_SPANS)public void setCiTestIndexedSpans_JsonNullable(JsonNullable<Long> ciTestIndexedSpans) {
    this.ciTestIndexedSpans = ciTestIndexedSpans;
  }
  public void setCiTestIndexedSpans(Long ciTestIndexedSpans) {
    this.ciTestIndexedSpans = JsonNullable.<Long>of(ciTestIndexedSpans);
  }
  public UsageCIVisibilityHour ciVisibilityItrCommitters(Long ciVisibilityItrCommitters) {
    this.ciVisibilityItrCommitters = JsonNullable.<Long>of(ciVisibilityItrCommitters);
    return this;
  }

  /**
   * <p>Shows the total count of all active Git committers for Intelligent Test Runner in the current month. A committer is active if they commit at least 3 times in a given month.</p>
   * @return ciVisibilityItrCommitters
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getCiVisibilityItrCommitters() {
        return ciVisibilityItrCommitters.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_CI_VISIBILITY_ITR_COMMITTERS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCiVisibilityItrCommitters_JsonNullable() {
    return ciVisibilityItrCommitters;
  }
  @JsonProperty(JSON_PROPERTY_CI_VISIBILITY_ITR_COMMITTERS)public void setCiVisibilityItrCommitters_JsonNullable(JsonNullable<Long> ciVisibilityItrCommitters) {
    this.ciVisibilityItrCommitters = ciVisibilityItrCommitters;
  }
  public void setCiVisibilityItrCommitters(Long ciVisibilityItrCommitters) {
    this.ciVisibilityItrCommitters = JsonNullable.<Long>of(ciVisibilityItrCommitters);
  }
  public UsageCIVisibilityHour ciVisibilityPipelineCommitters(Long ciVisibilityPipelineCommitters) {
    this.ciVisibilityPipelineCommitters = JsonNullable.<Long>of(ciVisibilityPipelineCommitters);
    return this;
  }

  /**
   * <p>Shows the total count of all active Git committers for Pipelines in the current month. A committer is active if they commit at least 3 times in a given month.</p>
   * @return ciVisibilityPipelineCommitters
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getCiVisibilityPipelineCommitters() {
        return ciVisibilityPipelineCommitters.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_CI_VISIBILITY_PIPELINE_COMMITTERS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCiVisibilityPipelineCommitters_JsonNullable() {
    return ciVisibilityPipelineCommitters;
  }
  @JsonProperty(JSON_PROPERTY_CI_VISIBILITY_PIPELINE_COMMITTERS)public void setCiVisibilityPipelineCommitters_JsonNullable(JsonNullable<Long> ciVisibilityPipelineCommitters) {
    this.ciVisibilityPipelineCommitters = ciVisibilityPipelineCommitters;
  }
  public void setCiVisibilityPipelineCommitters(Long ciVisibilityPipelineCommitters) {
    this.ciVisibilityPipelineCommitters = JsonNullable.<Long>of(ciVisibilityPipelineCommitters);
  }
  public UsageCIVisibilityHour ciVisibilityTestCommitters(Long ciVisibilityTestCommitters) {
    this.ciVisibilityTestCommitters = JsonNullable.<Long>of(ciVisibilityTestCommitters);
    return this;
  }

  /**
   * <p>The total count of all active Git committers for tests in the current month. A committer is active if they commit at least 3 times in a given month.</p>
   * @return ciVisibilityTestCommitters
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getCiVisibilityTestCommitters() {
        return ciVisibilityTestCommitters.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_CI_VISIBILITY_TEST_COMMITTERS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCiVisibilityTestCommitters_JsonNullable() {
    return ciVisibilityTestCommitters;
  }
  @JsonProperty(JSON_PROPERTY_CI_VISIBILITY_TEST_COMMITTERS)public void setCiVisibilityTestCommitters_JsonNullable(JsonNullable<Long> ciVisibilityTestCommitters) {
    this.ciVisibilityTestCommitters = ciVisibilityTestCommitters;
  }
  public void setCiVisibilityTestCommitters(Long ciVisibilityTestCommitters) {
    this.ciVisibilityTestCommitters = JsonNullable.<Long>of(ciVisibilityTestCommitters);
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
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return UsageCIVisibilityHour
   */
  @JsonAnySetter
  public UsageCIVisibilityHour putAdditionalProperty(String key, Object value) {
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
    return Objects.equals(this.ciPipelineIndexedSpans, usageCiVisibilityHour.ciPipelineIndexedSpans) && Objects.equals(this.ciTestIndexedSpans, usageCiVisibilityHour.ciTestIndexedSpans) && Objects.equals(this.ciVisibilityItrCommitters, usageCiVisibilityHour.ciVisibilityItrCommitters) && Objects.equals(this.ciVisibilityPipelineCommitters, usageCiVisibilityHour.ciVisibilityPipelineCommitters) && Objects.equals(this.ciVisibilityTestCommitters, usageCiVisibilityHour.ciVisibilityTestCommitters) && Objects.equals(this.orgName, usageCiVisibilityHour.orgName) && Objects.equals(this.publicId, usageCiVisibilityHour.publicId) && Objects.equals(this.additionalProperties, usageCiVisibilityHour.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(ciPipelineIndexedSpans,ciTestIndexedSpans,ciVisibilityItrCommitters,ciVisibilityPipelineCommitters,ciVisibilityTestCommitters,orgName,publicId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageCIVisibilityHour {\n");
    sb.append("    ciPipelineIndexedSpans: ").append(toIndentedString(ciPipelineIndexedSpans)).append("\n");
    sb.append("    ciTestIndexedSpans: ").append(toIndentedString(ciTestIndexedSpans)).append("\n");
    sb.append("    ciVisibilityItrCommitters: ").append(toIndentedString(ciVisibilityItrCommitters)).append("\n");
    sb.append("    ciVisibilityPipelineCommitters: ").append(toIndentedString(ciVisibilityPipelineCommitters)).append("\n");
    sb.append("    ciVisibilityTestCommitters: ").append(toIndentedString(ciVisibilityTestCommitters)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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

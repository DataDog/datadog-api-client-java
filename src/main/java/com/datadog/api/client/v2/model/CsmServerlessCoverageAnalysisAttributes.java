/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>CSM Serverless Resources Coverage Analysis attributes.</p>
 */
@JsonPropertyOrder({
  CsmServerlessCoverageAnalysisAttributes.JSON_PROPERTY_CWS_COVERAGE,
  CsmServerlessCoverageAnalysisAttributes.JSON_PROPERTY_ORG_ID,
  CsmServerlessCoverageAnalysisAttributes.JSON_PROPERTY_TOTAL_COVERAGE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CsmServerlessCoverageAnalysisAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CWS_COVERAGE = "cws_coverage";
  private CsmCoverageAnalysis cwsCoverage;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_TOTAL_COVERAGE = "total_coverage";
  private CsmCoverageAnalysis totalCoverage;

  public CsmServerlessCoverageAnalysisAttributes cwsCoverage(CsmCoverageAnalysis cwsCoverage) {
    this.cwsCoverage = cwsCoverage;
    this.unparsed |= cwsCoverage.unparsed;
    return this;
  }

  /**
   * <p>CSM Coverage Analysis.</p>
   * @return cwsCoverage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CWS_COVERAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CsmCoverageAnalysis getCwsCoverage() {
        return cwsCoverage;
      }
  public void setCwsCoverage(CsmCoverageAnalysis cwsCoverage) {
    this.cwsCoverage = cwsCoverage;
  }
  public CsmServerlessCoverageAnalysisAttributes orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * <p>The ID of your organization.</p>
   * @return orgId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ORG_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getOrgId() {
        return orgId;
      }
  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }
  public CsmServerlessCoverageAnalysisAttributes totalCoverage(CsmCoverageAnalysis totalCoverage) {
    this.totalCoverage = totalCoverage;
    this.unparsed |= totalCoverage.unparsed;
    return this;
  }

  /**
   * <p>CSM Coverage Analysis.</p>
   * @return totalCoverage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TOTAL_COVERAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CsmCoverageAnalysis getTotalCoverage() {
        return totalCoverage;
      }
  public void setTotalCoverage(CsmCoverageAnalysis totalCoverage) {
    this.totalCoverage = totalCoverage;
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
   * @return CsmServerlessCoverageAnalysisAttributes
   */
  @JsonAnySetter
  public CsmServerlessCoverageAnalysisAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this CsmServerlessCoverageAnalysisAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsmServerlessCoverageAnalysisAttributes csmServerlessCoverageAnalysisAttributes = (CsmServerlessCoverageAnalysisAttributes) o;
    return Objects.equals(this.cwsCoverage, csmServerlessCoverageAnalysisAttributes.cwsCoverage) && Objects.equals(this.orgId, csmServerlessCoverageAnalysisAttributes.orgId) && Objects.equals(this.totalCoverage, csmServerlessCoverageAnalysisAttributes.totalCoverage) && Objects.equals(this.additionalProperties, csmServerlessCoverageAnalysisAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(cwsCoverage,orgId,totalCoverage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsmServerlessCoverageAnalysisAttributes {\n");
    sb.append("    cwsCoverage: ").append(toIndentedString(cwsCoverage)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    totalCoverage: ").append(toIndentedString(totalCoverage)).append("\n");
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

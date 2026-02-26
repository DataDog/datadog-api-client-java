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
   * <p>CSM Cloud Accounts Coverage Analysis attributes.</p>
 */
@JsonPropertyOrder({
  CsmCloudAccountsCoverageAnalysisAttributes.JSON_PROPERTY_AWS_COVERAGE,
  CsmCloudAccountsCoverageAnalysisAttributes.JSON_PROPERTY_AZURE_COVERAGE,
  CsmCloudAccountsCoverageAnalysisAttributes.JSON_PROPERTY_GCP_COVERAGE,
  CsmCloudAccountsCoverageAnalysisAttributes.JSON_PROPERTY_ORG_ID,
  CsmCloudAccountsCoverageAnalysisAttributes.JSON_PROPERTY_TOTAL_COVERAGE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CsmCloudAccountsCoverageAnalysisAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AWS_COVERAGE = "aws_coverage";
  private CsmCoverageAnalysis awsCoverage;

  public static final String JSON_PROPERTY_AZURE_COVERAGE = "azure_coverage";
  private CsmCoverageAnalysis azureCoverage;

  public static final String JSON_PROPERTY_GCP_COVERAGE = "gcp_coverage";
  private CsmCoverageAnalysis gcpCoverage;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_TOTAL_COVERAGE = "total_coverage";
  private CsmCoverageAnalysis totalCoverage;

  public CsmCloudAccountsCoverageAnalysisAttributes awsCoverage(CsmCoverageAnalysis awsCoverage) {
    this.awsCoverage = awsCoverage;
    this.unparsed |= awsCoverage.unparsed;
    return this;
  }

  /**
   * <p>CSM Coverage Analysis.</p>
   * @return awsCoverage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AWS_COVERAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CsmCoverageAnalysis getAwsCoverage() {
        return awsCoverage;
      }
  public void setAwsCoverage(CsmCoverageAnalysis awsCoverage) {
    this.awsCoverage = awsCoverage;
  }
  public CsmCloudAccountsCoverageAnalysisAttributes azureCoverage(CsmCoverageAnalysis azureCoverage) {
    this.azureCoverage = azureCoverage;
    this.unparsed |= azureCoverage.unparsed;
    return this;
  }

  /**
   * <p>CSM Coverage Analysis.</p>
   * @return azureCoverage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AZURE_COVERAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CsmCoverageAnalysis getAzureCoverage() {
        return azureCoverage;
      }
  public void setAzureCoverage(CsmCoverageAnalysis azureCoverage) {
    this.azureCoverage = azureCoverage;
  }
  public CsmCloudAccountsCoverageAnalysisAttributes gcpCoverage(CsmCoverageAnalysis gcpCoverage) {
    this.gcpCoverage = gcpCoverage;
    this.unparsed |= gcpCoverage.unparsed;
    return this;
  }

  /**
   * <p>CSM Coverage Analysis.</p>
   * @return gcpCoverage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GCP_COVERAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CsmCoverageAnalysis getGcpCoverage() {
        return gcpCoverage;
      }
  public void setGcpCoverage(CsmCoverageAnalysis gcpCoverage) {
    this.gcpCoverage = gcpCoverage;
  }
  public CsmCloudAccountsCoverageAnalysisAttributes orgId(Long orgId) {
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
  public CsmCloudAccountsCoverageAnalysisAttributes totalCoverage(CsmCoverageAnalysis totalCoverage) {
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
   * @return CsmCloudAccountsCoverageAnalysisAttributes
   */
  @JsonAnySetter
  public CsmCloudAccountsCoverageAnalysisAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this CsmCloudAccountsCoverageAnalysisAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsmCloudAccountsCoverageAnalysisAttributes csmCloudAccountsCoverageAnalysisAttributes = (CsmCloudAccountsCoverageAnalysisAttributes) o;
    return Objects.equals(this.awsCoverage, csmCloudAccountsCoverageAnalysisAttributes.awsCoverage) && Objects.equals(this.azureCoverage, csmCloudAccountsCoverageAnalysisAttributes.azureCoverage) && Objects.equals(this.gcpCoverage, csmCloudAccountsCoverageAnalysisAttributes.gcpCoverage) && Objects.equals(this.orgId, csmCloudAccountsCoverageAnalysisAttributes.orgId) && Objects.equals(this.totalCoverage, csmCloudAccountsCoverageAnalysisAttributes.totalCoverage) && Objects.equals(this.additionalProperties, csmCloudAccountsCoverageAnalysisAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(awsCoverage,azureCoverage,gcpCoverage,orgId,totalCoverage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsmCloudAccountsCoverageAnalysisAttributes {\n");
    sb.append("    awsCoverage: ").append(toIndentedString(awsCoverage)).append("\n");
    sb.append("    azureCoverage: ").append(toIndentedString(azureCoverage)).append("\n");
    sb.append("    gcpCoverage: ").append(toIndentedString(gcpCoverage)).append("\n");
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

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
   * <p>Attributes for AWS CUR config Post Request.</p>
 */
@JsonPropertyOrder({
  AwsCURConfigPostRequestAttributes.JSON_PROPERTY_ACCOUNT_FILTERS,
  AwsCURConfigPostRequestAttributes.JSON_PROPERTY_ACCOUNT_ID,
  AwsCURConfigPostRequestAttributes.JSON_PROPERTY_BUCKET_NAME,
  AwsCURConfigPostRequestAttributes.JSON_PROPERTY_BUCKET_REGION,
  AwsCURConfigPostRequestAttributes.JSON_PROPERTY_MONTHS,
  AwsCURConfigPostRequestAttributes.JSON_PROPERTY_REPORT_NAME,
  AwsCURConfigPostRequestAttributes.JSON_PROPERTY_REPORT_PREFIX
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AwsCURConfigPostRequestAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_FILTERS = "account_filters";
  private AccountFilteringConfig accountFilters;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_BUCKET_NAME = "bucket_name";
  private String bucketName;

  public static final String JSON_PROPERTY_BUCKET_REGION = "bucket_region";
  private String bucketRegion;

  public static final String JSON_PROPERTY_MONTHS = "months";
  private Integer months;

  public static final String JSON_PROPERTY_REPORT_NAME = "report_name";
  private String reportName;

  public static final String JSON_PROPERTY_REPORT_PREFIX = "report_prefix";
  private String reportPrefix;

  public AwsCURConfigPostRequestAttributes() {}

  @JsonCreator
  public AwsCURConfigPostRequestAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_ACCOUNT_ID)String accountId,
            @JsonProperty(required=true, value=JSON_PROPERTY_BUCKET_NAME)String bucketName,
            @JsonProperty(required=true, value=JSON_PROPERTY_REPORT_NAME)String reportName,
            @JsonProperty(required=true, value=JSON_PROPERTY_REPORT_PREFIX)String reportPrefix) {
        this.accountId = accountId;
        this.bucketName = bucketName;
        this.reportName = reportName;
        this.reportPrefix = reportPrefix;
  }
  public AwsCURConfigPostRequestAttributes accountFilters(AccountFilteringConfig accountFilters) {
    this.accountFilters = accountFilters;
    this.unparsed |= accountFilters.unparsed;
    return this;
  }

  /**
   * <p>The account filtering configuration.</p>
   * @return accountFilters
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACCOUNT_FILTERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AccountFilteringConfig getAccountFilters() {
        return accountFilters;
      }
  public void setAccountFilters(AccountFilteringConfig accountFilters) {
    this.accountFilters = accountFilters;
  }
  public AwsCURConfigPostRequestAttributes accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <p>The AWS account ID.</p>
   * @return accountId
  **/
      @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getAccountId() {
        return accountId;
      }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }
  public AwsCURConfigPostRequestAttributes bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  /**
   * <p>The AWS bucket name used to store the Cost and Usage Report.</p>
   * @return bucketName
  **/
      @JsonProperty(JSON_PROPERTY_BUCKET_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getBucketName() {
        return bucketName;
      }
  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }
  public AwsCURConfigPostRequestAttributes bucketRegion(String bucketRegion) {
    this.bucketRegion = bucketRegion;
    return this;
  }

  /**
   * <p>The region the bucket is located in.</p>
   * @return bucketRegion
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BUCKET_REGION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getBucketRegion() {
        return bucketRegion;
      }
  public void setBucketRegion(String bucketRegion) {
    this.bucketRegion = bucketRegion;
  }
  public AwsCURConfigPostRequestAttributes months(Integer months) {
    this.months = months;
    return this;
  }

  /**
   * <p>The month of the report.</p>
   * maximum: 36
   * @return months
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MONTHS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getMonths() {
        return months;
      }
  public void setMonths(Integer months) {
    this.months = months;
  }
  public AwsCURConfigPostRequestAttributes reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

  /**
   * <p>The name of the Cost and Usage Report.</p>
   * @return reportName
  **/
      @JsonProperty(JSON_PROPERTY_REPORT_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getReportName() {
        return reportName;
      }
  public void setReportName(String reportName) {
    this.reportName = reportName;
  }
  public AwsCURConfigPostRequestAttributes reportPrefix(String reportPrefix) {
    this.reportPrefix = reportPrefix;
    return this;
  }

  /**
   * <p>The report prefix used for the Cost and Usage Report.</p>
   * @return reportPrefix
  **/
      @JsonProperty(JSON_PROPERTY_REPORT_PREFIX)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getReportPrefix() {
        return reportPrefix;
      }
  public void setReportPrefix(String reportPrefix) {
    this.reportPrefix = reportPrefix;
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
   * @return AwsCURConfigPostRequestAttributes
   */
  @JsonAnySetter
  public AwsCURConfigPostRequestAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this AwsCURConfigPostRequestAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsCURConfigPostRequestAttributes awsCurConfigPostRequestAttributes = (AwsCURConfigPostRequestAttributes) o;
    return Objects.equals(this.accountFilters, awsCurConfigPostRequestAttributes.accountFilters) && Objects.equals(this.accountId, awsCurConfigPostRequestAttributes.accountId) && Objects.equals(this.bucketName, awsCurConfigPostRequestAttributes.bucketName) && Objects.equals(this.bucketRegion, awsCurConfigPostRequestAttributes.bucketRegion) && Objects.equals(this.months, awsCurConfigPostRequestAttributes.months) && Objects.equals(this.reportName, awsCurConfigPostRequestAttributes.reportName) && Objects.equals(this.reportPrefix, awsCurConfigPostRequestAttributes.reportPrefix) && Objects.equals(this.additionalProperties, awsCurConfigPostRequestAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(accountFilters,accountId,bucketName,bucketRegion,months,reportName,reportPrefix, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsCURConfigPostRequestAttributes {\n");
    sb.append("    accountFilters: ").append(toIndentedString(accountFilters)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    bucketRegion: ").append(toIndentedString(bucketRegion)).append("\n");
    sb.append("    months: ").append(toIndentedString(months)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    reportPrefix: ").append(toIndentedString(reportPrefix)).append("\n");
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

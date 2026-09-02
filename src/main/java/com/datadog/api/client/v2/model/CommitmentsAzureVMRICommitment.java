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

/** Azure Virtual Machine Reserved Instance commitment details. */
@JsonPropertyOrder({
  CommitmentsAzureVMRICommitment.JSON_PROPERTY_BENEFIT_NAME,
  CommitmentsAzureVMRICommitment.JSON_PROPERTY_COMMITMENT_ID,
  CommitmentsAzureVMRICommitment.JSON_PROPERTY_EXPIRATION_DATE,
  CommitmentsAzureVMRICommitment.JSON_PROPERTY_INSTANCE_TYPE,
  CommitmentsAzureVMRICommitment.JSON_PROPERTY_METER_SUB_CATEGORY,
  CommitmentsAzureVMRICommitment.JSON_PROPERTY_REGION,
  CommitmentsAzureVMRICommitment.JSON_PROPERTY_START_DATE,
  CommitmentsAzureVMRICommitment.JSON_PROPERTY_STATUS,
  CommitmentsAzureVMRICommitment.JSON_PROPERTY_TERM_LENGTH,
  CommitmentsAzureVMRICommitment.JSON_PROPERTY_UTILIZATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CommitmentsAzureVMRICommitment {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BENEFIT_NAME = "benefit_name";
  private String benefitName;

  public static final String JSON_PROPERTY_COMMITMENT_ID = "commitment_id";
  private String commitmentId;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expiration_date";
  private String expirationDate;

  public static final String JSON_PROPERTY_INSTANCE_TYPE = "instance_type";
  private String instanceType;

  public static final String JSON_PROPERTY_METER_SUB_CATEGORY = "meter_sub_category";
  private String meterSubCategory;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private String startDate;

  public static final String JSON_PROPERTY_STATUS = "status";
  private CommitmentsAzureVMRIStatus status;

  public static final String JSON_PROPERTY_TERM_LENGTH = "term_length";
  private Double termLength;

  public static final String JSON_PROPERTY_UTILIZATION = "utilization";
  private Double utilization;

  public CommitmentsAzureVMRICommitment() {}

  @JsonCreator
  public CommitmentsAzureVMRICommitment(
      @JsonProperty(required = true, value = JSON_PROPERTY_BENEFIT_NAME) String benefitName,
      @JsonProperty(required = true, value = JSON_PROPERTY_COMMITMENT_ID) String commitmentId,
      @JsonProperty(required = true, value = JSON_PROPERTY_INSTANCE_TYPE) String instanceType,
      @JsonProperty(required = true, value = JSON_PROPERTY_METER_SUB_CATEGORY)
          String meterSubCategory,
      @JsonProperty(required = true, value = JSON_PROPERTY_REGION) String region,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          CommitmentsAzureVMRIStatus status) {
    this.benefitName = benefitName;
    this.commitmentId = commitmentId;
    this.instanceType = instanceType;
    this.meterSubCategory = meterSubCategory;
    this.region = region;
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public CommitmentsAzureVMRICommitment benefitName(String benefitName) {
    this.benefitName = benefitName;
    return this;
  }

  /**
   * The display name of the Azure reservation.
   *
   * @return benefitName
   */
  @JsonProperty(JSON_PROPERTY_BENEFIT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getBenefitName() {
    return benefitName;
  }

  public void setBenefitName(String benefitName) {
    this.benefitName = benefitName;
  }

  public CommitmentsAzureVMRICommitment commitmentId(String commitmentId) {
    this.commitmentId = commitmentId;
    return this;
  }

  /**
   * The unique identifier of the Reserved Instance.
   *
   * @return commitmentId
   */
  @JsonProperty(JSON_PROPERTY_COMMITMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCommitmentId() {
    return commitmentId;
  }

  public void setCommitmentId(String commitmentId) {
    this.commitmentId = commitmentId;
  }

  public CommitmentsAzureVMRICommitment expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * The expiration date of the commitment.
   *
   * @return expirationDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public CommitmentsAzureVMRICommitment instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

  /**
   * The Azure VM instance type.
   *
   * @return instanceType
   */
  @JsonProperty(JSON_PROPERTY_INSTANCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  public CommitmentsAzureVMRICommitment meterSubCategory(String meterSubCategory) {
    this.meterSubCategory = meterSubCategory;
    return this;
  }

  /**
   * The Azure meter sub-category for the reservation.
   *
   * @return meterSubCategory
   */
  @JsonProperty(JSON_PROPERTY_METER_SUB_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMeterSubCategory() {
    return meterSubCategory;
  }

  public void setMeterSubCategory(String meterSubCategory) {
    this.meterSubCategory = meterSubCategory;
  }

  public CommitmentsAzureVMRICommitment region(String region) {
    this.region = region;
    return this;
  }

  /**
   * The Azure region of the Reserved Instance.
   *
   * @return region
   */
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public CommitmentsAzureVMRICommitment startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The start date of the commitment.
   *
   * @return startDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public CommitmentsAzureVMRICommitment status(CommitmentsAzureVMRIStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Status of an Azure VM Reserved Instance.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CommitmentsAzureVMRIStatus getStatus() {
    return status;
  }

  public void setStatus(CommitmentsAzureVMRIStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public CommitmentsAzureVMRICommitment termLength(Double termLength) {
    this.termLength = termLength;
    return this;
  }

  /**
   * The term length in years.
   *
   * @return termLength
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERM_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTermLength() {
    return termLength;
  }

  public void setTermLength(Double termLength) {
    this.termLength = termLength;
  }

  public CommitmentsAzureVMRICommitment utilization(Double utilization) {
    this.utilization = utilization;
    return this;
  }

  /**
   * The utilization percentage of the commitment.
   *
   * @return utilization
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UTILIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getUtilization() {
    return utilization;
  }

  public void setUtilization(Double utilization) {
    this.utilization = utilization;
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
   * @return CommitmentsAzureVMRICommitment
   */
  @JsonAnySetter
  public CommitmentsAzureVMRICommitment putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CommitmentsAzureVMRICommitment object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitmentsAzureVMRICommitment commitmentsAzureVmriCommitment =
        (CommitmentsAzureVMRICommitment) o;
    return Objects.equals(this.benefitName, commitmentsAzureVmriCommitment.benefitName)
        && Objects.equals(this.commitmentId, commitmentsAzureVmriCommitment.commitmentId)
        && Objects.equals(this.expirationDate, commitmentsAzureVmriCommitment.expirationDate)
        && Objects.equals(this.instanceType, commitmentsAzureVmriCommitment.instanceType)
        && Objects.equals(this.meterSubCategory, commitmentsAzureVmriCommitment.meterSubCategory)
        && Objects.equals(this.region, commitmentsAzureVmriCommitment.region)
        && Objects.equals(this.startDate, commitmentsAzureVmriCommitment.startDate)
        && Objects.equals(this.status, commitmentsAzureVmriCommitment.status)
        && Objects.equals(this.termLength, commitmentsAzureVmriCommitment.termLength)
        && Objects.equals(this.utilization, commitmentsAzureVmriCommitment.utilization)
        && Objects.equals(
            this.additionalProperties, commitmentsAzureVmriCommitment.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        benefitName,
        commitmentId,
        expirationDate,
        instanceType,
        meterSubCategory,
        region,
        startDate,
        status,
        termLength,
        utilization,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitmentsAzureVMRICommitment {\n");
    sb.append("    benefitName: ").append(toIndentedString(benefitName)).append("\n");
    sb.append("    commitmentId: ").append(toIndentedString(commitmentId)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    meterSubCategory: ").append(toIndentedString(meterSubCategory)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    termLength: ").append(toIndentedString(termLength)).append("\n");
    sb.append("    utilization: ").append(toIndentedString(utilization)).append("\n");
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

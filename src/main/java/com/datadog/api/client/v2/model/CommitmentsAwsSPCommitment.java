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

/** AWS Savings Plan commitment details. */
@JsonPropertyOrder({
  CommitmentsAwsSPCommitment.JSON_PROPERTY_COMMITMENT_ID,
  CommitmentsAwsSPCommitment.JSON_PROPERTY_COMMITTED_SPEND_PER_HOUR,
  CommitmentsAwsSPCommitment.JSON_PROPERTY_EXPIRATION_DATE,
  CommitmentsAwsSPCommitment.JSON_PROPERTY_PURCHASE_OPTION,
  CommitmentsAwsSPCommitment.JSON_PROPERTY_SAVINGS_PLAN_TYPE,
  CommitmentsAwsSPCommitment.JSON_PROPERTY_START_DATE,
  CommitmentsAwsSPCommitment.JSON_PROPERTY_TERM_LENGTH,
  CommitmentsAwsSPCommitment.JSON_PROPERTY_UTILIZATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CommitmentsAwsSPCommitment {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMMITMENT_ID = "commitment_id";
  private String commitmentId;

  public static final String JSON_PROPERTY_COMMITTED_SPEND_PER_HOUR = "committed_spend_per_hour";
  private Double committedSpendPerHour;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expiration_date";
  private String expirationDate;

  public static final String JSON_PROPERTY_PURCHASE_OPTION = "purchase_option";
  private String purchaseOption;

  public static final String JSON_PROPERTY_SAVINGS_PLAN_TYPE = "savings_plan_type";
  private String savingsPlanType;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private String startDate;

  public static final String JSON_PROPERTY_TERM_LENGTH = "term_length";
  private Double termLength;

  public static final String JSON_PROPERTY_UTILIZATION = "utilization";
  private Double utilization;

  public CommitmentsAwsSPCommitment() {}

  @JsonCreator
  public CommitmentsAwsSPCommitment(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMMITMENT_ID) String commitmentId,
      @JsonProperty(required = true, value = JSON_PROPERTY_PURCHASE_OPTION) String purchaseOption,
      @JsonProperty(required = true, value = JSON_PROPERTY_SAVINGS_PLAN_TYPE)
          String savingsPlanType) {
    this.commitmentId = commitmentId;
    this.purchaseOption = purchaseOption;
    this.savingsPlanType = savingsPlanType;
  }

  public CommitmentsAwsSPCommitment commitmentId(String commitmentId) {
    this.commitmentId = commitmentId;
    return this;
  }

  /**
   * The unique identifier of the Savings Plan.
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

  public CommitmentsAwsSPCommitment committedSpendPerHour(Double committedSpendPerHour) {
    this.committedSpendPerHour = committedSpendPerHour;
    return this;
  }

  /**
   * The hourly committed spend for the Savings Plan.
   *
   * @return committedSpendPerHour
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMITTED_SPEND_PER_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCommittedSpendPerHour() {
    return committedSpendPerHour;
  }

  public void setCommittedSpendPerHour(Double committedSpendPerHour) {
    this.committedSpendPerHour = committedSpendPerHour;
  }

  public CommitmentsAwsSPCommitment expirationDate(String expirationDate) {
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

  public CommitmentsAwsSPCommitment purchaseOption(String purchaseOption) {
    this.purchaseOption = purchaseOption;
    return this;
  }

  /**
   * The payment option for the Savings Plan.
   *
   * @return purchaseOption
   */
  @JsonProperty(JSON_PROPERTY_PURCHASE_OPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPurchaseOption() {
    return purchaseOption;
  }

  public void setPurchaseOption(String purchaseOption) {
    this.purchaseOption = purchaseOption;
  }

  public CommitmentsAwsSPCommitment savingsPlanType(String savingsPlanType) {
    this.savingsPlanType = savingsPlanType;
    return this;
  }

  /**
   * The Savings Plan type.
   *
   * @return savingsPlanType
   */
  @JsonProperty(JSON_PROPERTY_SAVINGS_PLAN_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSavingsPlanType() {
    return savingsPlanType;
  }

  public void setSavingsPlanType(String savingsPlanType) {
    this.savingsPlanType = savingsPlanType;
  }

  public CommitmentsAwsSPCommitment startDate(String startDate) {
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

  public CommitmentsAwsSPCommitment termLength(Double termLength) {
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

  public CommitmentsAwsSPCommitment utilization(Double utilization) {
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
   * @return CommitmentsAwsSPCommitment
   */
  @JsonAnySetter
  public CommitmentsAwsSPCommitment putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CommitmentsAwsSPCommitment object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitmentsAwsSPCommitment commitmentsAwsSpCommitment = (CommitmentsAwsSPCommitment) o;
    return Objects.equals(this.commitmentId, commitmentsAwsSpCommitment.commitmentId)
        && Objects.equals(
            this.committedSpendPerHour, commitmentsAwsSpCommitment.committedSpendPerHour)
        && Objects.equals(this.expirationDate, commitmentsAwsSpCommitment.expirationDate)
        && Objects.equals(this.purchaseOption, commitmentsAwsSpCommitment.purchaseOption)
        && Objects.equals(this.savingsPlanType, commitmentsAwsSpCommitment.savingsPlanType)
        && Objects.equals(this.startDate, commitmentsAwsSpCommitment.startDate)
        && Objects.equals(this.termLength, commitmentsAwsSpCommitment.termLength)
        && Objects.equals(this.utilization, commitmentsAwsSpCommitment.utilization)
        && Objects.equals(
            this.additionalProperties, commitmentsAwsSpCommitment.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        commitmentId,
        committedSpendPerHour,
        expirationDate,
        purchaseOption,
        savingsPlanType,
        startDate,
        termLength,
        utilization,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitmentsAwsSPCommitment {\n");
    sb.append("    commitmentId: ").append(toIndentedString(commitmentId)).append("\n");
    sb.append("    committedSpendPerHour: ")
        .append(toIndentedString(committedSpendPerHour))
        .append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    purchaseOption: ").append(toIndentedString(purchaseOption)).append("\n");
    sb.append("    savingsPlanType: ").append(toIndentedString(savingsPlanType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

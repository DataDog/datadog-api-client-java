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

/** AWS ElastiCache Reserved Instance commitment details. */
@JsonPropertyOrder({
  CommitmentsAwsElasticacheRICommitment.JSON_PROPERTY_CACHE_ENGINE,
  CommitmentsAwsElasticacheRICommitment.JSON_PROPERTY_COMMITMENT_ID,
  CommitmentsAwsElasticacheRICommitment.JSON_PROPERTY_EXPIRATION_DATE,
  CommitmentsAwsElasticacheRICommitment.JSON_PROPERTY_INSTANCE_TYPE,
  CommitmentsAwsElasticacheRICommitment.JSON_PROPERTY_NUMBER_OF_NFUS,
  CommitmentsAwsElasticacheRICommitment.JSON_PROPERTY_NUMBER_OF_RESERVATIONS,
  CommitmentsAwsElasticacheRICommitment.JSON_PROPERTY_PURCHASE_OPTION,
  CommitmentsAwsElasticacheRICommitment.JSON_PROPERTY_REGION,
  CommitmentsAwsElasticacheRICommitment.JSON_PROPERTY_START_DATE,
  CommitmentsAwsElasticacheRICommitment.JSON_PROPERTY_TERM_LENGTH,
  CommitmentsAwsElasticacheRICommitment.JSON_PROPERTY_UTILIZATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CommitmentsAwsElasticacheRICommitment {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CACHE_ENGINE = "cache_engine";
  private String cacheEngine;

  public static final String JSON_PROPERTY_COMMITMENT_ID = "commitment_id";
  private String commitmentId;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expiration_date";
  private String expirationDate;

  public static final String JSON_PROPERTY_INSTANCE_TYPE = "instance_type";
  private String instanceType;

  public static final String JSON_PROPERTY_NUMBER_OF_NFUS = "number_of_nfus";
  private Double numberOfNfus;

  public static final String JSON_PROPERTY_NUMBER_OF_RESERVATIONS = "number_of_reservations";
  private Double numberOfReservations;

  public static final String JSON_PROPERTY_PURCHASE_OPTION = "purchase_option";
  private String purchaseOption;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private String startDate;

  public static final String JSON_PROPERTY_TERM_LENGTH = "term_length";
  private Double termLength;

  public static final String JSON_PROPERTY_UTILIZATION = "utilization";
  private Double utilization;

  public CommitmentsAwsElasticacheRICommitment() {}

  @JsonCreator
  public CommitmentsAwsElasticacheRICommitment(
      @JsonProperty(required = true, value = JSON_PROPERTY_CACHE_ENGINE) String cacheEngine,
      @JsonProperty(required = true, value = JSON_PROPERTY_COMMITMENT_ID) String commitmentId,
      @JsonProperty(required = true, value = JSON_PROPERTY_INSTANCE_TYPE) String instanceType,
      @JsonProperty(required = true, value = JSON_PROPERTY_PURCHASE_OPTION) String purchaseOption,
      @JsonProperty(required = true, value = JSON_PROPERTY_REGION) String region) {
    this.cacheEngine = cacheEngine;
    this.commitmentId = commitmentId;
    this.instanceType = instanceType;
    this.purchaseOption = purchaseOption;
    this.region = region;
  }

  public CommitmentsAwsElasticacheRICommitment cacheEngine(String cacheEngine) {
    this.cacheEngine = cacheEngine;
    return this;
  }

  /**
   * The cache engine type of the Reserved Instance.
   *
   * @return cacheEngine
   */
  @JsonProperty(JSON_PROPERTY_CACHE_ENGINE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCacheEngine() {
    return cacheEngine;
  }

  public void setCacheEngine(String cacheEngine) {
    this.cacheEngine = cacheEngine;
  }

  public CommitmentsAwsElasticacheRICommitment commitmentId(String commitmentId) {
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

  public CommitmentsAwsElasticacheRICommitment expirationDate(String expirationDate) {
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

  public CommitmentsAwsElasticacheRICommitment instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

  /**
   * The ElastiCache instance type.
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

  public CommitmentsAwsElasticacheRICommitment numberOfNfus(Double numberOfNfus) {
    this.numberOfNfus = numberOfNfus;
    return this;
  }

  /**
   * The number of Normalized Capacity Units.
   *
   * @return numberOfNfus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_NFUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNumberOfNfus() {
    return numberOfNfus;
  }

  public void setNumberOfNfus(Double numberOfNfus) {
    this.numberOfNfus = numberOfNfus;
  }

  public CommitmentsAwsElasticacheRICommitment numberOfReservations(Double numberOfReservations) {
    this.numberOfReservations = numberOfReservations;
    return this;
  }

  /**
   * The number of reserved instances.
   *
   * @return numberOfReservations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_RESERVATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNumberOfReservations() {
    return numberOfReservations;
  }

  public void setNumberOfReservations(Double numberOfReservations) {
    this.numberOfReservations = numberOfReservations;
  }

  public CommitmentsAwsElasticacheRICommitment purchaseOption(String purchaseOption) {
    this.purchaseOption = purchaseOption;
    return this;
  }

  /**
   * The payment option for the Reserved Instance.
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

  public CommitmentsAwsElasticacheRICommitment region(String region) {
    this.region = region;
    return this;
  }

  /**
   * The AWS region of the Reserved Instance.
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

  public CommitmentsAwsElasticacheRICommitment startDate(String startDate) {
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

  public CommitmentsAwsElasticacheRICommitment termLength(Double termLength) {
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

  public CommitmentsAwsElasticacheRICommitment utilization(Double utilization) {
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
   * @return CommitmentsAwsElasticacheRICommitment
   */
  @JsonAnySetter
  public CommitmentsAwsElasticacheRICommitment putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CommitmentsAwsElasticacheRICommitment object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitmentsAwsElasticacheRICommitment commitmentsAwsElasticacheRiCommitment =
        (CommitmentsAwsElasticacheRICommitment) o;
    return Objects.equals(this.cacheEngine, commitmentsAwsElasticacheRiCommitment.cacheEngine)
        && Objects.equals(this.commitmentId, commitmentsAwsElasticacheRiCommitment.commitmentId)
        && Objects.equals(this.expirationDate, commitmentsAwsElasticacheRiCommitment.expirationDate)
        && Objects.equals(this.instanceType, commitmentsAwsElasticacheRiCommitment.instanceType)
        && Objects.equals(this.numberOfNfus, commitmentsAwsElasticacheRiCommitment.numberOfNfus)
        && Objects.equals(
            this.numberOfReservations, commitmentsAwsElasticacheRiCommitment.numberOfReservations)
        && Objects.equals(this.purchaseOption, commitmentsAwsElasticacheRiCommitment.purchaseOption)
        && Objects.equals(this.region, commitmentsAwsElasticacheRiCommitment.region)
        && Objects.equals(this.startDate, commitmentsAwsElasticacheRiCommitment.startDate)
        && Objects.equals(this.termLength, commitmentsAwsElasticacheRiCommitment.termLength)
        && Objects.equals(this.utilization, commitmentsAwsElasticacheRiCommitment.utilization)
        && Objects.equals(
            this.additionalProperties, commitmentsAwsElasticacheRiCommitment.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cacheEngine,
        commitmentId,
        expirationDate,
        instanceType,
        numberOfNfus,
        numberOfReservations,
        purchaseOption,
        region,
        startDate,
        termLength,
        utilization,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitmentsAwsElasticacheRICommitment {\n");
    sb.append("    cacheEngine: ").append(toIndentedString(cacheEngine)).append("\n");
    sb.append("    commitmentId: ").append(toIndentedString(commitmentId)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    numberOfNfus: ").append(toIndentedString(numberOfNfus)).append("\n");
    sb.append("    numberOfReservations: ")
        .append(toIndentedString(numberOfReservations))
        .append("\n");
    sb.append("    purchaseOption: ").append(toIndentedString(purchaseOption)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

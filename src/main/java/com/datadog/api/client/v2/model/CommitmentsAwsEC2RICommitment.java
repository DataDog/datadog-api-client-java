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

/** AWS EC2 Reserved Instance commitment details. */
@JsonPropertyOrder({
  CommitmentsAwsEC2RICommitment.JSON_PROPERTY_AVAILABILITY_ZONE,
  CommitmentsAwsEC2RICommitment.JSON_PROPERTY_COMMITMENT_ID,
  CommitmentsAwsEC2RICommitment.JSON_PROPERTY_EXPIRATION_DATE,
  CommitmentsAwsEC2RICommitment.JSON_PROPERTY_INSTANCE_TYPE,
  CommitmentsAwsEC2RICommitment.JSON_PROPERTY_NUMBER_OF_NFUS,
  CommitmentsAwsEC2RICommitment.JSON_PROPERTY_NUMBER_OF_RESERVATIONS,
  CommitmentsAwsEC2RICommitment.JSON_PROPERTY_OFFERING_CLASS,
  CommitmentsAwsEC2RICommitment.JSON_PROPERTY_OPERATING_SYSTEM,
  CommitmentsAwsEC2RICommitment.JSON_PROPERTY_PURCHASE_OPTION,
  CommitmentsAwsEC2RICommitment.JSON_PROPERTY_REGION,
  CommitmentsAwsEC2RICommitment.JSON_PROPERTY_START_DATE,
  CommitmentsAwsEC2RICommitment.JSON_PROPERTY_TERM_LENGTH,
  CommitmentsAwsEC2RICommitment.JSON_PROPERTY_UTILIZATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CommitmentsAwsEC2RICommitment {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVAILABILITY_ZONE = "availability_zone";
  private String availabilityZone;

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

  public static final String JSON_PROPERTY_OFFERING_CLASS = "offering_class";
  private String offeringClass;

  public static final String JSON_PROPERTY_OPERATING_SYSTEM = "operating_system";
  private String operatingSystem;

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

  public CommitmentsAwsEC2RICommitment() {}

  @JsonCreator
  public CommitmentsAwsEC2RICommitment(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMMITMENT_ID) String commitmentId,
      @JsonProperty(required = true, value = JSON_PROPERTY_INSTANCE_TYPE) String instanceType,
      @JsonProperty(required = true, value = JSON_PROPERTY_OFFERING_CLASS) String offeringClass,
      @JsonProperty(required = true, value = JSON_PROPERTY_OPERATING_SYSTEM) String operatingSystem,
      @JsonProperty(required = true, value = JSON_PROPERTY_PURCHASE_OPTION) String purchaseOption,
      @JsonProperty(required = true, value = JSON_PROPERTY_REGION) String region) {
    this.commitmentId = commitmentId;
    this.instanceType = instanceType;
    this.offeringClass = offeringClass;
    this.operatingSystem = operatingSystem;
    this.purchaseOption = purchaseOption;
    this.region = region;
  }

  public CommitmentsAwsEC2RICommitment availabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
    return this;
  }

  /**
   * The availability zone of the reservation.
   *
   * @return availabilityZone
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAvailabilityZone() {
    return availabilityZone;
  }

  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  public CommitmentsAwsEC2RICommitment commitmentId(String commitmentId) {
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

  public CommitmentsAwsEC2RICommitment expirationDate(String expirationDate) {
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

  public CommitmentsAwsEC2RICommitment instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

  /**
   * The EC2 instance type.
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

  public CommitmentsAwsEC2RICommitment numberOfNfus(Double numberOfNfus) {
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

  public CommitmentsAwsEC2RICommitment numberOfReservations(Double numberOfReservations) {
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

  public CommitmentsAwsEC2RICommitment offeringClass(String offeringClass) {
    this.offeringClass = offeringClass;
    return this;
  }

  /**
   * The offering class of the Reserved Instance.
   *
   * @return offeringClass
   */
  @JsonProperty(JSON_PROPERTY_OFFERING_CLASS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOfferingClass() {
    return offeringClass;
  }

  public void setOfferingClass(String offeringClass) {
    this.offeringClass = offeringClass;
  }

  public CommitmentsAwsEC2RICommitment operatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

  /**
   * The operating system of the Reserved Instance.
   *
   * @return operatingSystem
   */
  @JsonProperty(JSON_PROPERTY_OPERATING_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public CommitmentsAwsEC2RICommitment purchaseOption(String purchaseOption) {
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

  public CommitmentsAwsEC2RICommitment region(String region) {
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

  public CommitmentsAwsEC2RICommitment startDate(String startDate) {
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

  public CommitmentsAwsEC2RICommitment termLength(Double termLength) {
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

  public CommitmentsAwsEC2RICommitment utilization(Double utilization) {
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
   * @return CommitmentsAwsEC2RICommitment
   */
  @JsonAnySetter
  public CommitmentsAwsEC2RICommitment putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CommitmentsAwsEC2RICommitment object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitmentsAwsEC2RICommitment commitmentsAwsEC2RiCommitment = (CommitmentsAwsEC2RICommitment) o;
    return Objects.equals(this.availabilityZone, commitmentsAwsEC2RiCommitment.availabilityZone)
        && Objects.equals(this.commitmentId, commitmentsAwsEC2RiCommitment.commitmentId)
        && Objects.equals(this.expirationDate, commitmentsAwsEC2RiCommitment.expirationDate)
        && Objects.equals(this.instanceType, commitmentsAwsEC2RiCommitment.instanceType)
        && Objects.equals(this.numberOfNfus, commitmentsAwsEC2RiCommitment.numberOfNfus)
        && Objects.equals(
            this.numberOfReservations, commitmentsAwsEC2RiCommitment.numberOfReservations)
        && Objects.equals(this.offeringClass, commitmentsAwsEC2RiCommitment.offeringClass)
        && Objects.equals(this.operatingSystem, commitmentsAwsEC2RiCommitment.operatingSystem)
        && Objects.equals(this.purchaseOption, commitmentsAwsEC2RiCommitment.purchaseOption)
        && Objects.equals(this.region, commitmentsAwsEC2RiCommitment.region)
        && Objects.equals(this.startDate, commitmentsAwsEC2RiCommitment.startDate)
        && Objects.equals(this.termLength, commitmentsAwsEC2RiCommitment.termLength)
        && Objects.equals(this.utilization, commitmentsAwsEC2RiCommitment.utilization)
        && Objects.equals(
            this.additionalProperties, commitmentsAwsEC2RiCommitment.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        availabilityZone,
        commitmentId,
        expirationDate,
        instanceType,
        numberOfNfus,
        numberOfReservations,
        offeringClass,
        operatingSystem,
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
    sb.append("class CommitmentsAwsEC2RICommitment {\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    commitmentId: ").append(toIndentedString(commitmentId)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    numberOfNfus: ").append(toIndentedString(numberOfNfus)).append("\n");
    sb.append("    numberOfReservations: ")
        .append(toIndentedString(numberOfReservations))
        .append("\n");
    sb.append("    offeringClass: ").append(toIndentedString(offeringClass)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
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

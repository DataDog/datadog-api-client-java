/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of hourly usage for a product family for an org for a time period. */
@JsonPropertyOrder({
  HourlyUsageAttributes.JSON_PROPERTY_ACCOUNT_NAME,
  HourlyUsageAttributes.JSON_PROPERTY_ACCOUNT_PUBLIC_ID,
  HourlyUsageAttributes.JSON_PROPERTY_MEASUREMENTS,
  HourlyUsageAttributes.JSON_PROPERTY_ORG_NAME,
  HourlyUsageAttributes.JSON_PROPERTY_PRODUCT_FAMILY,
  HourlyUsageAttributes.JSON_PROPERTY_PUBLIC_ID,
  HourlyUsageAttributes.JSON_PROPERTY_REGION,
  HourlyUsageAttributes.JSON_PROPERTY_TIMESTAMP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HourlyUsageAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_NAME = "account_name";
  private String accountName;

  public static final String JSON_PROPERTY_ACCOUNT_PUBLIC_ID = "account_public_id";
  private String accountPublicId;

  public static final String JSON_PROPERTY_MEASUREMENTS = "measurements";
  private List<HourlyUsageMeasurement> measurements = null;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PRODUCT_FAMILY = "product_family";
  private String productFamily;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private OffsetDateTime timestamp;

  public HourlyUsageAttributes accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * The account name.
   *
   * @return accountName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public HourlyUsageAttributes accountPublicId(String accountPublicId) {
    this.accountPublicId = accountPublicId;
    return this;
  }

  /**
   * The account public ID.
   *
   * @return accountPublicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountPublicId() {
    return accountPublicId;
  }

  public void setAccountPublicId(String accountPublicId) {
    this.accountPublicId = accountPublicId;
  }

  public HourlyUsageAttributes measurements(List<HourlyUsageMeasurement> measurements) {
    this.measurements = measurements;
    for (HourlyUsageMeasurement item : measurements) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public HourlyUsageAttributes addMeasurementsItem(HourlyUsageMeasurement measurementsItem) {
    if (this.measurements == null) {
      this.measurements = new ArrayList<>();
    }
    this.measurements.add(measurementsItem);
    this.unparsed |= measurementsItem.unparsed;
    return this;
  }

  /**
   * List of the measured usage values for the product family for the org for the time period.
   *
   * @return measurements
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<HourlyUsageMeasurement> getMeasurements() {
    return measurements;
  }

  public void setMeasurements(List<HourlyUsageMeasurement> measurements) {
    this.measurements = measurements;
  }

  public HourlyUsageAttributes orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * The organization name.
   *
   * @return orgName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public HourlyUsageAttributes productFamily(String productFamily) {
    this.productFamily = productFamily;
    return this;
  }

  /**
   * The product for which usage is being reported.
   *
   * @return productFamily
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_FAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProductFamily() {
    return productFamily;
  }

  public void setProductFamily(String productFamily) {
    this.productFamily = productFamily;
  }

  public HourlyUsageAttributes publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * The organization public ID.
   *
   * @return publicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  public HourlyUsageAttributes region(String region) {
    this.region = region;
    return this;
  }

  /**
   * The region of the Datadog instance that the organization belongs to.
   *
   * @return region
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public HourlyUsageAttributes timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Datetime in ISO-8601 format, UTC. The hour for the usage.
   *
   * @return timestamp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
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
   * @return HourlyUsageAttributes
   */
  @JsonAnySetter
  public HourlyUsageAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this HourlyUsageAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HourlyUsageAttributes hourlyUsageAttributes = (HourlyUsageAttributes) o;
    return Objects.equals(this.accountName, hourlyUsageAttributes.accountName)
        && Objects.equals(this.accountPublicId, hourlyUsageAttributes.accountPublicId)
        && Objects.equals(this.measurements, hourlyUsageAttributes.measurements)
        && Objects.equals(this.orgName, hourlyUsageAttributes.orgName)
        && Objects.equals(this.productFamily, hourlyUsageAttributes.productFamily)
        && Objects.equals(this.publicId, hourlyUsageAttributes.publicId)
        && Objects.equals(this.region, hourlyUsageAttributes.region)
        && Objects.equals(this.timestamp, hourlyUsageAttributes.timestamp)
        && Objects.equals(this.additionalProperties, hourlyUsageAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountName,
        accountPublicId,
        measurements,
        orgName,
        productFamily,
        publicId,
        region,
        timestamp,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HourlyUsageAttributes {\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountPublicId: ").append(toIndentedString(accountPublicId)).append("\n");
    sb.append("    measurements: ").append(toIndentedString(measurements)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    productFamily: ").append(toIndentedString(productFamily)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

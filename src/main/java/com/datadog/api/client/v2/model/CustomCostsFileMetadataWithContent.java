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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Schema of a cost file's metadata. */
@JsonPropertyOrder({
  CustomCostsFileMetadataWithContent.JSON_PROPERTY_BILLED_COST,
  CustomCostsFileMetadataWithContent.JSON_PROPERTY_BILLING_CURRENCY,
  CustomCostsFileMetadataWithContent.JSON_PROPERTY_CHARGE_PERIOD,
  CustomCostsFileMetadataWithContent.JSON_PROPERTY_CONTENT,
  CustomCostsFileMetadataWithContent.JSON_PROPERTY_NAME,
  CustomCostsFileMetadataWithContent.JSON_PROPERTY_PROVIDER_NAMES,
  CustomCostsFileMetadataWithContent.JSON_PROPERTY_STATUS,
  CustomCostsFileMetadataWithContent.JSON_PROPERTY_UPLOADED_AT,
  CustomCostsFileMetadataWithContent.JSON_PROPERTY_UPLOADED_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomCostsFileMetadataWithContent {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BILLED_COST = "billed_cost";
  private Double billedCost;

  public static final String JSON_PROPERTY_BILLING_CURRENCY = "billing_currency";
  private String billingCurrency;

  public static final String JSON_PROPERTY_CHARGE_PERIOD = "charge_period";
  private CustomCostsFileUsageChargePeriod chargePeriod;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private List<CustomCostsFileLineItem> content = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROVIDER_NAMES = "provider_names";
  private List<String> providerNames = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_UPLOADED_AT = "uploaded_at";
  private Double uploadedAt;

  public static final String JSON_PROPERTY_UPLOADED_BY = "uploaded_by";
  private CustomCostsUser uploadedBy;

  public CustomCostsFileMetadataWithContent billedCost(Double billedCost) {
    this.billedCost = billedCost;
    return this;
  }

  /**
   * Total cost in the cost file.
   *
   * @return billedCost
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLED_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getBilledCost() {
    return billedCost;
  }

  public void setBilledCost(Double billedCost) {
    this.billedCost = billedCost;
  }

  public CustomCostsFileMetadataWithContent billingCurrency(String billingCurrency) {
    this.billingCurrency = billingCurrency;
    return this;
  }

  /**
   * Currency used in the Custom Costs file.
   *
   * @return billingCurrency
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBillingCurrency() {
    return billingCurrency;
  }

  public void setBillingCurrency(String billingCurrency) {
    this.billingCurrency = billingCurrency;
  }

  public CustomCostsFileMetadataWithContent chargePeriod(
      CustomCostsFileUsageChargePeriod chargePeriod) {
    this.chargePeriod = chargePeriod;
    this.unparsed |= chargePeriod.unparsed;
    return this;
  }

  /**
   * Usage charge period of a Custom Costs file.
   *
   * @return chargePeriod
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHARGE_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomCostsFileUsageChargePeriod getChargePeriod() {
    return chargePeriod;
  }

  public void setChargePeriod(CustomCostsFileUsageChargePeriod chargePeriod) {
    this.chargePeriod = chargePeriod;
  }

  public CustomCostsFileMetadataWithContent content(List<CustomCostsFileLineItem> content) {
    this.content = content;
    for (CustomCostsFileLineItem item : content) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CustomCostsFileMetadataWithContent addContentItem(CustomCostsFileLineItem contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    this.unparsed |= contentItem.unparsed;
    return this;
  }

  /**
   * Detail of the line items from the Custom Costs file.
   *
   * @return content
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<CustomCostsFileLineItem> getContent() {
    return content;
  }

  public void setContent(List<CustomCostsFileLineItem> content) {
    this.content = content;
  }

  public CustomCostsFileMetadataWithContent name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the Custom Costs file.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomCostsFileMetadataWithContent providerNames(List<String> providerNames) {
    this.providerNames = providerNames;
    return this;
  }

  public CustomCostsFileMetadataWithContent addProviderNamesItem(String providerNamesItem) {
    if (this.providerNames == null) {
      this.providerNames = new ArrayList<>();
    }
    this.providerNames.add(providerNamesItem);
    return this;
  }

  /**
   * Providers contained in the Custom Costs file.
   *
   * @return providerNames
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getProviderNames() {
    return providerNames;
  }

  public void setProviderNames(List<String> providerNames) {
    this.providerNames = providerNames;
  }

  public CustomCostsFileMetadataWithContent status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the Custom Costs file.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CustomCostsFileMetadataWithContent uploadedAt(Double uploadedAt) {
    this.uploadedAt = uploadedAt;
    return this;
  }

  /**
   * Timestamp in millisecond of the upload time of the Custom Costs file.
   *
   * @return uploadedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPLOADED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getUploadedAt() {
    return uploadedAt;
  }

  public void setUploadedAt(Double uploadedAt) {
    this.uploadedAt = uploadedAt;
  }

  public CustomCostsFileMetadataWithContent uploadedBy(CustomCostsUser uploadedBy) {
    this.uploadedBy = uploadedBy;
    this.unparsed |= uploadedBy.unparsed;
    return this;
  }

  /**
   * Metadata of the user that has uploaded the Custom Costs file.
   *
   * @return uploadedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPLOADED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomCostsUser getUploadedBy() {
    return uploadedBy;
  }

  public void setUploadedBy(CustomCostsUser uploadedBy) {
    this.uploadedBy = uploadedBy;
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
   * @return CustomCostsFileMetadataWithContent
   */
  @JsonAnySetter
  public CustomCostsFileMetadataWithContent putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CustomCostsFileMetadataWithContent object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomCostsFileMetadataWithContent customCostsFileMetadataWithContent =
        (CustomCostsFileMetadataWithContent) o;
    return Objects.equals(this.billedCost, customCostsFileMetadataWithContent.billedCost)
        && Objects.equals(this.billingCurrency, customCostsFileMetadataWithContent.billingCurrency)
        && Objects.equals(this.chargePeriod, customCostsFileMetadataWithContent.chargePeriod)
        && Objects.equals(this.content, customCostsFileMetadataWithContent.content)
        && Objects.equals(this.name, customCostsFileMetadataWithContent.name)
        && Objects.equals(this.providerNames, customCostsFileMetadataWithContent.providerNames)
        && Objects.equals(this.status, customCostsFileMetadataWithContent.status)
        && Objects.equals(this.uploadedAt, customCostsFileMetadataWithContent.uploadedAt)
        && Objects.equals(this.uploadedBy, customCostsFileMetadataWithContent.uploadedBy)
        && Objects.equals(
            this.additionalProperties, customCostsFileMetadataWithContent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        billedCost,
        billingCurrency,
        chargePeriod,
        content,
        name,
        providerNames,
        status,
        uploadedAt,
        uploadedBy,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomCostsFileMetadataWithContent {\n");
    sb.append("    billedCost: ").append(toIndentedString(billedCost)).append("\n");
    sb.append("    billingCurrency: ").append(toIndentedString(billingCurrency)).append("\n");
    sb.append("    chargePeriod: ").append(toIndentedString(chargePeriod)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    providerNames: ").append(toIndentedString(providerNames)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uploadedAt: ").append(toIndentedString(uploadedAt)).append("\n");
    sb.append("    uploadedBy: ").append(toIndentedString(uploadedBy)).append("\n");
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

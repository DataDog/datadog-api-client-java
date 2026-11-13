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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Resource usage and organization details for the requested month. */
@JsonPropertyOrder({
  MonthlyResourceAttributes.JSON_PROPERTY_DATA_DATE,
  MonthlyResourceAttributes.JSON_PROPERTY_ORG_NAME,
  MonthlyResourceAttributes.JSON_PROPERTY_PUBLIC_ID,
  MonthlyResourceAttributes.JSON_PROPERTY_RESOURCE_NAME,
  MonthlyResourceAttributes.JSON_PROPERTY_TAGS,
  MonthlyResourceAttributes.JSON_PROPERTY_TIMESTAMP,
  MonthlyResourceAttributes.JSON_PROPERTY_USAGE_TYPE,
  MonthlyResourceAttributes.JSON_PROPERTY_USAGE_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonthlyResourceAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_DATE = "data_date";
  private String dataDate;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_RESOURCE_NAME = "resource_name";
  private String resourceName;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = null;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private String timestamp;

  public static final String JSON_PROPERTY_USAGE_TYPE = "usage_type";
  private String usageType;

  public static final String JSON_PROPERTY_USAGE_VALUE = "usage_value";
  private JsonNullable<Double> usageValue = JsonNullable.<Double>undefined();

  public MonthlyResourceAttributes dataDate(String dataDate) {
    this.dataDate = dataDate;
    return this;
  }

  /**
   * Date of the source usage data. May be empty when unavailable.
   *
   * @return dataDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDataDate() {
    return dataDate;
  }

  public void setDataDate(String dataDate) {
    this.dataDate = dataDate;
  }

  public MonthlyResourceAttributes orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * Name of the organization that owns the resource.
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

  public MonthlyResourceAttributes publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * Public ID of the organization that owns the resource.
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

  public MonthlyResourceAttributes resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Name of the resource, such as a host name, metric name, or log index.
   *
   * @return resourceName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  public MonthlyResourceAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public MonthlyResourceAttributes putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Resource tags when available. Empty for resource types without tag data.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  public MonthlyResourceAttributes timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Selected billing hour for percentile usage, or the first day of the month for monthly usage.
   * May be empty when unavailable.
   *
   * @return timestamp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public MonthlyResourceAttributes usageType(String usageType) {
    this.usageType = usageType;
    return this;
  }

  /**
   * Usage type of the resource. Values depend on the billing dimension and are not limited to host
   * types.
   *
   * @return usageType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUsageType() {
    return usageType;
  }

  public void setUsageType(String usageType) {
    this.usageType = usageType;
  }

  public MonthlyResourceAttributes usageValue(Double usageValue) {
    this.usageValue = JsonNullable.<Double>of(usageValue);
    return this;
  }

  /**
   * Usage attributed to the resource in the units of the requested billing dimension. Values can be
   * fractional.
   *
   * @return usageValue
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getUsageValue() {
    return usageValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USAGE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getUsageValue_JsonNullable() {
    return usageValue;
  }

  @JsonProperty(JSON_PROPERTY_USAGE_VALUE)
  public void setUsageValue_JsonNullable(JsonNullable<Double> usageValue) {
    this.usageValue = usageValue;
  }

  public void setUsageValue(Double usageValue) {
    this.usageValue = JsonNullable.<Double>of(usageValue);
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
   * @return MonthlyResourceAttributes
   */
  @JsonAnySetter
  public MonthlyResourceAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MonthlyResourceAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonthlyResourceAttributes monthlyResourceAttributes = (MonthlyResourceAttributes) o;
    return Objects.equals(this.dataDate, monthlyResourceAttributes.dataDate)
        && Objects.equals(this.orgName, monthlyResourceAttributes.orgName)
        && Objects.equals(this.publicId, monthlyResourceAttributes.publicId)
        && Objects.equals(this.resourceName, monthlyResourceAttributes.resourceName)
        && Objects.equals(this.tags, monthlyResourceAttributes.tags)
        && Objects.equals(this.timestamp, monthlyResourceAttributes.timestamp)
        && Objects.equals(this.usageType, monthlyResourceAttributes.usageType)
        && Objects.equals(this.usageValue, monthlyResourceAttributes.usageValue)
        && Objects.equals(
            this.additionalProperties, monthlyResourceAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dataDate,
        orgName,
        publicId,
        resourceName,
        tags,
        timestamp,
        usageType,
        usageValue,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonthlyResourceAttributes {\n");
    sb.append("    dataDate: ").append(toIndentedString(dataDate)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
    sb.append("    usageValue: ").append(toIndentedString(usageValue)).append("\n");
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

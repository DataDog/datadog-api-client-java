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
   * <p>Usage attributes data.</p>
 */
@JsonPropertyOrder({
  UsageAttributesObject.JSON_PROPERTY_ORG_NAME,
  UsageAttributesObject.JSON_PROPERTY_PRODUCT_FAMILY,
  UsageAttributesObject.JSON_PROPERTY_PUBLIC_ID,
  UsageAttributesObject.JSON_PROPERTY_REGION,
  UsageAttributesObject.JSON_PROPERTY_TIMESERIES,
  UsageAttributesObject.JSON_PROPERTY_USAGE_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageAttributesObject {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PRODUCT_FAMILY = "product_family";
  private String productFamily;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_TIMESERIES = "timeseries";
  private List<UsageTimeSeriesObject> timeseries = null;

  public static final String JSON_PROPERTY_USAGE_TYPE = "usage_type";
  private HourlyUsageType usageType;

  public UsageAttributesObject orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * <p>The organization name.</p>
   * @return orgName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ORG_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getOrgName() {
        return orgName;
      }
  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }
  public UsageAttributesObject productFamily(String productFamily) {
    this.productFamily = productFamily;
    return this;
  }

  /**
   * <p>The product for which usage is being reported.</p>
   * @return productFamily
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRODUCT_FAMILY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getProductFamily() {
        return productFamily;
      }
  public void setProductFamily(String productFamily) {
    this.productFamily = productFamily;
  }
  public UsageAttributesObject publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * <p>The organization public ID.</p>
   * @return publicId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPublicId() {
        return publicId;
      }
  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }
  public UsageAttributesObject region(String region) {
    this.region = region;
    return this;
  }

  /**
   * <p>The region of the Datadog instance that the organization belongs to.</p>
   * @return region
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REGION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getRegion() {
        return region;
      }
  public void setRegion(String region) {
    this.region = region;
  }
  public UsageAttributesObject timeseries(List<UsageTimeSeriesObject> timeseries) {
    this.timeseries = timeseries;
    for (UsageTimeSeriesObject item : timeseries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public UsageAttributesObject addTimeseriesItem(UsageTimeSeriesObject timeseriesItem) {
    if (this.timeseries == null) {
      this.timeseries = new ArrayList<>();
    }
    this.timeseries.add(timeseriesItem);
    this.unparsed |= timeseriesItem.unparsed;
    return this;
  }

  /**
   * <p>List of usage data reported for each requested hour.</p>
   * @return timeseries
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMESERIES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<UsageTimeSeriesObject> getTimeseries() {
        return timeseries;
      }
  public void setTimeseries(List<UsageTimeSeriesObject> timeseries) {
    this.timeseries = timeseries;
  }
  public UsageAttributesObject usageType(HourlyUsageType usageType) {
    this.usageType = usageType;
    this.unparsed |= !usageType.isValid();
    return this;
  }

  /**
   * <p>Usage type that is being measured.</p>
   * @return usageType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_USAGE_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public HourlyUsageType getUsageType() {
        return usageType;
      }
  public void setUsageType(HourlyUsageType usageType) {
    if (!usageType.isValid()) {
        this.unparsed = true;
    }
    this.usageType = usageType;
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
   * @return UsageAttributesObject
   */
  @JsonAnySetter
  public UsageAttributesObject putAdditionalProperty(String key, Object value) {
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
   * Return true if this UsageAttributesObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageAttributesObject usageAttributesObject = (UsageAttributesObject) o;
    return Objects.equals(this.orgName, usageAttributesObject.orgName) && Objects.equals(this.productFamily, usageAttributesObject.productFamily) && Objects.equals(this.publicId, usageAttributesObject.publicId) && Objects.equals(this.region, usageAttributesObject.region) && Objects.equals(this.timeseries, usageAttributesObject.timeseries) && Objects.equals(this.usageType, usageAttributesObject.usageType) && Objects.equals(this.additionalProperties, usageAttributesObject.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(orgName,productFamily,publicId,region,timeseries,usageType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageAttributesObject {\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    productFamily: ").append(toIndentedString(productFamily)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    timeseries: ").append(toIndentedString(timeseries)).append("\n");
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
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

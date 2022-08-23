/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Usage attributes data. */
@JsonPropertyOrder({
  UsageAttributesObject.JSON_PROPERTY_ORG_NAME,
  UsageAttributesObject.JSON_PROPERTY_PRODUCT_FAMILY,
  UsageAttributesObject.JSON_PROPERTY_PUBLIC_ID,
  UsageAttributesObject.JSON_PROPERTY_TIMESERIES,
  UsageAttributesObject.JSON_PROPERTY_USAGE_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageAttributesObject {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PRODUCT_FAMILY = "product_family";
  private String productFamily;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_TIMESERIES = "timeseries";
  private List<UsageTimeSeriesObject> timeseries = null;

  public static final String JSON_PROPERTY_USAGE_TYPE = "usage_type";
  private HourlyUsageType usageType;

  public UsageAttributesObject orgName(String orgName) {
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

  public UsageAttributesObject productFamily(String productFamily) {
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

  public UsageAttributesObject publicId(String publicId) {
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
   * List of usage data reported for each requested hour.
   *
   * @return timeseries
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * Usage type that is being measured.
   *
   * @return usageType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HourlyUsageType getUsageType() {
    return usageType;
  }

  public void setUsageType(HourlyUsageType usageType) {
    if (!usageType.isValid()) {
      this.unparsed = true;
    }
    this.usageType = usageType;
  }

  /** Return true if this UsageAttributesObject object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageAttributesObject usageAttributesObject = (UsageAttributesObject) o;
    return Objects.equals(this.orgName, usageAttributesObject.orgName)
        && Objects.equals(this.productFamily, usageAttributesObject.productFamily)
        && Objects.equals(this.publicId, usageAttributesObject.publicId)
        && Objects.equals(this.timeseries, usageAttributesObject.timeseries)
        && Objects.equals(this.usageType, usageAttributesObject.usageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgName, productFamily, publicId, timeseries, usageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageAttributesObject {\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    productFamily: ").append(toIndentedString(productFamily)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    timeseries: ").append(toIndentedString(timeseries)).append("\n");
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
    sb.append("}");
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

/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Number of RUM Units used for each hour for a given organization (data available as of November 1,
 * 2021).
 */
@JsonPropertyOrder({
  UsageRumUnitsHour.JSON_PROPERTY_BROWSER_RUM_UNITS,
  UsageRumUnitsHour.JSON_PROPERTY_MOBILE_RUM_UNITS,
  UsageRumUnitsHour.JSON_PROPERTY_ORG_NAME,
  UsageRumUnitsHour.JSON_PROPERTY_PUBLIC_ID,
  UsageRumUnitsHour.JSON_PROPERTY_RUM_UNITS
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageRumUnitsHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BROWSER_RUM_UNITS = "browser_rum_units";
  private Long browserRumUnits;

  public static final String JSON_PROPERTY_MOBILE_RUM_UNITS = "mobile_rum_units";
  private Long mobileRumUnits;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_RUM_UNITS = "rum_units";
  private JsonNullable<Long> rumUnits = JsonNullable.<Long>undefined();

  public UsageRumUnitsHour browserRumUnits(Long browserRumUnits) {
    this.browserRumUnits = browserRumUnits;
    return this;
  }

  /**
   * The number of browser RUM units.
   *
   * @return browserRumUnits
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BROWSER_RUM_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBrowserRumUnits() {
    return browserRumUnits;
  }

  public void setBrowserRumUnits(Long browserRumUnits) {
    this.browserRumUnits = browserRumUnits;
  }

  public UsageRumUnitsHour mobileRumUnits(Long mobileRumUnits) {
    this.mobileRumUnits = mobileRumUnits;
    return this;
  }

  /**
   * The number of mobile RUM units.
   *
   * @return mobileRumUnits
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumUnits() {
    return mobileRumUnits;
  }

  public void setMobileRumUnits(Long mobileRumUnits) {
    this.mobileRumUnits = mobileRumUnits;
  }

  public UsageRumUnitsHour orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * The organization name.
   *
   * @return orgName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public UsageRumUnitsHour publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * The organization public ID.
   *
   * @return publicId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  public UsageRumUnitsHour rumUnits(Long rumUnits) {
    this.rumUnits = JsonNullable.<Long>of(rumUnits);
    return this;
  }

  /**
   * Total RUM units across mobile and browser RUM.
   *
   * @return rumUnits
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Long getRumUnits() {
    return rumUnits.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RUM_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getRumUnits_JsonNullable() {
    return rumUnits;
  }

  @JsonProperty(JSON_PROPERTY_RUM_UNITS)
  public void setRumUnits_JsonNullable(JsonNullable<Long> rumUnits) {
    this.rumUnits = rumUnits;
  }

  public void setRumUnits(Long rumUnits) {
    this.rumUnits = JsonNullable.<Long>of(rumUnits);
  }

  /** Return true if this UsageRumUnitsHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageRumUnitsHour usageRumUnitsHour = (UsageRumUnitsHour) o;
    return Objects.equals(this.browserRumUnits, usageRumUnitsHour.browserRumUnits)
        && Objects.equals(this.mobileRumUnits, usageRumUnitsHour.mobileRumUnits)
        && Objects.equals(this.orgName, usageRumUnitsHour.orgName)
        && Objects.equals(this.publicId, usageRumUnitsHour.publicId)
        && Objects.equals(this.rumUnits, usageRumUnitsHour.rumUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(browserRumUnits, mobileRumUnits, orgName, publicId, rumUnits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageRumUnitsHour {\n");
    sb.append("    browserRumUnits: ").append(toIndentedString(browserRumUnits)).append("\n");
    sb.append("    mobileRumUnits: ").append(toIndentedString(mobileRumUnits)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    rumUnits: ").append(toIndentedString(rumUnits)).append("\n");
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

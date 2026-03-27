/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Number of RUM Units used for each hour for a given organization (data available as of November 1, 2021).</p>
 */
@JsonPropertyOrder({
  UsageRumUnitsHour.JSON_PROPERTY_BROWSER_RUM_UNITS,
  UsageRumUnitsHour.JSON_PROPERTY_MOBILE_RUM_UNITS,
  UsageRumUnitsHour.JSON_PROPERTY_ORG_NAME,
  UsageRumUnitsHour.JSON_PROPERTY_PUBLIC_ID,
  UsageRumUnitsHour.JSON_PROPERTY_RUM_UNITS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageRumUnitsHour {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BROWSER_RUM_UNITS = "browser_rum_units";
  private JsonNullable<Long> browserRumUnits = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_MOBILE_RUM_UNITS = "mobile_rum_units";
  private JsonNullable<Long> mobileRumUnits = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_RUM_UNITS = "rum_units";
  private JsonNullable<Long> rumUnits = JsonNullable.<Long>undefined();

  public UsageRumUnitsHour browserRumUnits(Long browserRumUnits) {
    this.browserRumUnits = JsonNullable.<Long>of(browserRumUnits);
    return this;
  }

  /**
   * <p>The number of browser RUM units.</p>
   * @return browserRumUnits
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getBrowserRumUnits() {
        return browserRumUnits.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_BROWSER_RUM_UNITS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getBrowserRumUnits_JsonNullable() {
    return browserRumUnits;
  }
  @JsonProperty(JSON_PROPERTY_BROWSER_RUM_UNITS)public void setBrowserRumUnits_JsonNullable(JsonNullable<Long> browserRumUnits) {
    this.browserRumUnits = browserRumUnits;
  }
  public void setBrowserRumUnits(Long browserRumUnits) {
    this.browserRumUnits = JsonNullable.<Long>of(browserRumUnits);
  }
  public UsageRumUnitsHour mobileRumUnits(Long mobileRumUnits) {
    this.mobileRumUnits = JsonNullable.<Long>of(mobileRumUnits);
    return this;
  }

  /**
   * <p>The number of mobile RUM units.</p>
   * @return mobileRumUnits
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getMobileRumUnits() {
        return mobileRumUnits.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_UNITS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getMobileRumUnits_JsonNullable() {
    return mobileRumUnits;
  }
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_UNITS)public void setMobileRumUnits_JsonNullable(JsonNullable<Long> mobileRumUnits) {
    this.mobileRumUnits = mobileRumUnits;
  }
  public void setMobileRumUnits(Long mobileRumUnits) {
    this.mobileRumUnits = JsonNullable.<Long>of(mobileRumUnits);
  }
  public UsageRumUnitsHour orgName(String orgName) {
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
  public UsageRumUnitsHour publicId(String publicId) {
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
  public UsageRumUnitsHour rumUnits(Long rumUnits) {
    this.rumUnits = JsonNullable.<Long>of(rumUnits);
    return this;
  }

  /**
   * <p>Total RUM units across mobile and browser RUM.</p>
   * @return rumUnits
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getRumUnits() {
        return rumUnits.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_RUM_UNITS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getRumUnits_JsonNullable() {
    return rumUnits;
  }
  @JsonProperty(JSON_PROPERTY_RUM_UNITS)public void setRumUnits_JsonNullable(JsonNullable<Long> rumUnits) {
    this.rumUnits = rumUnits;
  }
  public void setRumUnits(Long rumUnits) {
    this.rumUnits = JsonNullable.<Long>of(rumUnits);
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
   * @return UsageRumUnitsHour
   */
  @JsonAnySetter
  public UsageRumUnitsHour putAdditionalProperty(String key, Object value) {
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
   * Return true if this UsageRumUnitsHour object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageRumUnitsHour usageRumUnitsHour = (UsageRumUnitsHour) o;
    return Objects.equals(this.browserRumUnits, usageRumUnitsHour.browserRumUnits) && Objects.equals(this.mobileRumUnits, usageRumUnitsHour.mobileRumUnits) && Objects.equals(this.orgName, usageRumUnitsHour.orgName) && Objects.equals(this.publicId, usageRumUnitsHour.publicId) && Objects.equals(this.rumUnits, usageRumUnitsHour.rumUnits) && Objects.equals(this.additionalProperties, usageRumUnitsHour.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(browserRumUnits,mobileRumUnits,orgName,publicId,rumUnits, additionalProperties);
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

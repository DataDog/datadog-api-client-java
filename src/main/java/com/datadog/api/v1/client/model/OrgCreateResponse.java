/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v1.client.model.ApiKey;
import com.datadog.api.v1.client.model.ApplicationKey;
import com.datadog.api.v1.client.model.Org;
import com.datadog.api.v1.client.model.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * OrgCreateResponse
 */
@JsonPropertyOrder({
  OrgCreateResponse.JSON_PROPERTY_API_KEY,
  OrgCreateResponse.JSON_PROPERTY_APPLICATION_KEY,
  OrgCreateResponse.JSON_PROPERTY_ORG,
  OrgCreateResponse.JSON_PROPERTY_USER
})

public class OrgCreateResponse {
  public static final String JSON_PROPERTY_API_KEY = "api_key";
  private ApiKey apiKey;

  public static final String JSON_PROPERTY_APPLICATION_KEY = "application_key";
  private ApplicationKey applicationKey;

  public static final String JSON_PROPERTY_ORG = "org";
  private Org org;

  public static final String JSON_PROPERTY_USER = "user";
  private User user;


  public OrgCreateResponse apiKey(ApiKey apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiKey getApiKey() {
    return apiKey;
  }


  public void setApiKey(ApiKey apiKey) {
    this.apiKey = apiKey;
  }


  public OrgCreateResponse applicationKey(ApplicationKey applicationKey) {
    
    this.applicationKey = applicationKey;
    return this;
  }

   /**
   * Get applicationKey
   * @return applicationKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPLICATION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApplicationKey getApplicationKey() {
    return applicationKey;
  }


  public void setApplicationKey(ApplicationKey applicationKey) {
    this.applicationKey = applicationKey;
  }


  public OrgCreateResponse org(Org org) {
    
    this.org = org;
    return this;
  }

   /**
   * Get org
   * @return org
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Org getOrg() {
    return org;
  }


  public void setOrg(Org org) {
    this.org = org;
  }


  public OrgCreateResponse user(User user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public User getUser() {
    return user;
  }


  public void setUser(User user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgCreateResponse orgCreateResponse = (OrgCreateResponse) o;
    return Objects.equals(this.apiKey, orgCreateResponse.apiKey) &&
        Objects.equals(this.applicationKey, orgCreateResponse.applicationKey) &&
        Objects.equals(this.org, orgCreateResponse.org) &&
        Objects.equals(this.user, orgCreateResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, applicationKey, org, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgCreateResponse {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    applicationKey: ").append(toIndentedString(applicationKey)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


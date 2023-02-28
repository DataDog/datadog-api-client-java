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
   * <p>Object describing an organization to create.</p>
 */
@JsonPropertyOrder({
  OrganizationCreateBody.JSON_PROPERTY_BILLING,
  OrganizationCreateBody.JSON_PROPERTY_NAME,
  OrganizationCreateBody.JSON_PROPERTY_SUBSCRIPTION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrganizationCreateBody {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BILLING = "billing";
  private OrganizationBilling billing;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SUBSCRIPTION = "subscription";
  private OrganizationSubscription subscription;

  public OrganizationCreateBody() {}

  @JsonCreator
  public OrganizationCreateBody(
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name) {
        this.name = name;
  }
  public OrganizationCreateBody billing(OrganizationBilling billing) {
    this.billing = billing;
    this.unparsed |= billing.unparsed;
    return this;
  }

  /**
   * <p>A JSON array of billing type.</p>
   * @return billing
   * @deprecated
  **/
      @Deprecated
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BILLING)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OrganizationBilling getBilling() {
        return billing;
      }
  @Deprecated
  public void setBilling(OrganizationBilling billing) {
    this.billing = billing;
  }
  public OrganizationCreateBody name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the new child-organization, limited to 32 characters.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public OrganizationCreateBody subscription(OrganizationSubscription subscription) {
    this.subscription = subscription;
    this.unparsed |= subscription.unparsed;
    return this;
  }

  /**
   * <p>Subscription definition.</p>
   * @return subscription
   * @deprecated
  **/
      @Deprecated
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OrganizationSubscription getSubscription() {
        return subscription;
      }
  @Deprecated
  public void setSubscription(OrganizationSubscription subscription) {
    this.subscription = subscription;
  }

  /**
   * Return true if this OrganizationCreateBody object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationCreateBody organizationCreateBody = (OrganizationCreateBody) o;
    return Objects.equals(this.billing, organizationCreateBody.billing) && Objects.equals(this.name, organizationCreateBody.name) && Objects.equals(this.subscription, organizationCreateBody.subscription);
  }


  @Override
  public int hashCode() {
    return Objects.hash(billing,name,subscription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationCreateBody {\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("}");
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

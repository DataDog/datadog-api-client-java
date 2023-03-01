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
   * <p>Attributes object of a Cloudflare account.</p>
 */
@JsonPropertyOrder({
  CloudflareAccountResponseAttributes.JSON_PROPERTY_EMAIL,
  CloudflareAccountResponseAttributes.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudflareAccountResponseAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public CloudflareAccountResponseAttributes() {}

  @JsonCreator
  public CloudflareAccountResponseAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name) {
        this.name = name;
  }
  public CloudflareAccountResponseAttributes email(String email) {
    this.email = email;
    return this;
  }

  /**
   * <p>The email associated with the Cloudflare account.</p>
   * @return email
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EMAIL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getEmail() {
        return email;
      }
  public void setEmail(String email) {
    this.email = email;
  }
  public CloudflareAccountResponseAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the Cloudflare account.</p>
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

  /**
   * Return true if this CloudflareAccountResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareAccountResponseAttributes cloudflareAccountResponseAttributes = (CloudflareAccountResponseAttributes) o;
    return Objects.equals(this.email, cloudflareAccountResponseAttributes.email) && Objects.equals(this.name, cloudflareAccountResponseAttributes.name);
  }


  @Override
  public int hashCode() {
    return Objects.hash(email,name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareAccountResponseAttributes {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Attributes of the created user. */
@JsonPropertyOrder({
  ServiceAccountCreateAttributes.JSON_PROPERTY_EMAIL,
  ServiceAccountCreateAttributes.JSON_PROPERTY_NAME,
  ServiceAccountCreateAttributes.JSON_PROPERTY_SERVICE_ACCOUNT,
  ServiceAccountCreateAttributes.JSON_PROPERTY_TITLE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceAccountCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SERVICE_ACCOUNT = "service_account";
  private Boolean serviceAccount;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public ServiceAccountCreateAttributes() {}

  @JsonCreator
  public ServiceAccountCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_EMAIL) String email,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE_ACCOUNT)
          Boolean serviceAccount) {
    this.email = email;
    this.serviceAccount = serviceAccount;
  }

  public ServiceAccountCreateAttributes email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email of the user.
   *
   * @return email
   */
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ServiceAccountCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the user.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServiceAccountCreateAttributes serviceAccount(Boolean serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Whether the user is a service account. Must be true.
   *
   * @return serviceAccount
   */
  @JsonProperty(JSON_PROPERTY_SERVICE_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getServiceAccount() {
    return serviceAccount;
  }

  public void setServiceAccount(Boolean serviceAccount) {
    this.serviceAccount = serviceAccount;
  }

  public ServiceAccountCreateAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the user.
   *
   * @return title
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /** Return true if this ServiceAccountCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceAccountCreateAttributes serviceAccountCreateAttributes =
        (ServiceAccountCreateAttributes) o;
    return Objects.equals(this.email, serviceAccountCreateAttributes.email)
        && Objects.equals(this.name, serviceAccountCreateAttributes.name)
        && Objects.equals(this.serviceAccount, serviceAccountCreateAttributes.serviceAccount)
        && Objects.equals(this.title, serviceAccountCreateAttributes.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, name, serviceAccount, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceAccountCreateAttributes {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

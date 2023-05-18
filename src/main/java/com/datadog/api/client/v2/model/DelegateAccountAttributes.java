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
import java.util.Objects;

/** Your delegate account attributes. */
@JsonPropertyOrder({DelegateAccountAttributes.JSON_PROPERTY_DELEGATE_ACCOUNT_EMAIL})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DelegateAccountAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DELEGATE_ACCOUNT_EMAIL = "delegate_account_email";
  private String delegateAccountEmail;

  public DelegateAccountAttributes delegateAccountEmail(String delegateAccountEmail) {
    this.delegateAccountEmail = delegateAccountEmail;
    return this;
  }

  /**
   * Your organization's Datadog principal email address.
   *
   * @return delegateAccountEmail
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELEGATE_ACCOUNT_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDelegateAccountEmail() {
    return delegateAccountEmail;
  }

  public void setDelegateAccountEmail(String delegateAccountEmail) {
    this.delegateAccountEmail = delegateAccountEmail;
  }

  /** Return true if this DelegateAccountAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DelegateAccountAttributes delegateAccountAttributes = (DelegateAccountAttributes) o;
    return Objects.equals(
        this.delegateAccountEmail, delegateAccountAttributes.delegateAccountEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delegateAccountEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelegateAccountAttributes {\n");
    sb.append("    delegateAccountEmail: ")
        .append(toIndentedString(delegateAccountEmail))
        .append("\n");
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

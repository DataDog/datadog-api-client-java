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

/** Contact information about the service. */
@JsonPropertyOrder({
  ServiceDefinitionV1Contact.JSON_PROPERTY_EMAIL,
  ServiceDefinitionV1Contact.JSON_PROPERTY_SLACK
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceDefinitionV1Contact {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_SLACK = "slack";
  private String slack;

  public ServiceDefinitionV1Contact email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Service owner’s email.
   *
   * @return email
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ServiceDefinitionV1Contact slack(String slack) {
    this.slack = slack;
    return this;
  }

  /**
   * Service owner’s Slack channel.
   *
   * @return slack
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSlack() {
    return slack;
  }

  public void setSlack(String slack) {
    this.slack = slack;
  }

  /** Return true if this ServiceDefinitionV1Contact object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDefinitionV1Contact serviceDefinitionV1Contact = (ServiceDefinitionV1Contact) o;
    return Objects.equals(this.email, serviceDefinitionV1Contact.email)
        && Objects.equals(this.slack, serviceDefinitionV1Contact.slack);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, slack);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinitionV1Contact {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    slack: ").append(toIndentedString(slack)).append("\n");
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

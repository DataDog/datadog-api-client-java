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

/** Service owner's email. */
@JsonPropertyOrder({
  ServiceDefinitionV2Email.JSON_PROPERTY_CONTACT,
  ServiceDefinitionV2Email.JSON_PROPERTY_NAME,
  ServiceDefinitionV2Email.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceDefinitionV2Email {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTACT = "contact";
  private String contact;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ServiceDefinitionV2EmailType type;

  public ServiceDefinitionV2Email() {}

  @JsonCreator
  public ServiceDefinitionV2Email(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTACT) String contact,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ServiceDefinitionV2EmailType type) {
    this.contact = contact;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ServiceDefinitionV2Email contact(String contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Contact value.
   *
   * @return contact
   */
  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public ServiceDefinitionV2Email name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Contact email.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServiceDefinitionV2Email type(ServiceDefinitionV2EmailType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Contact type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ServiceDefinitionV2EmailType getType() {
    return type;
  }

  public void setType(ServiceDefinitionV2EmailType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this ServiceDefinitionV2Email object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDefinitionV2Email serviceDefinitionV2Email = (ServiceDefinitionV2Email) o;
    return Objects.equals(this.contact, serviceDefinitionV2Email.contact)
        && Objects.equals(this.name, serviceDefinitionV2Email.name)
        && Objects.equals(this.type, serviceDefinitionV2Email.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contact, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinitionV2Email {\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

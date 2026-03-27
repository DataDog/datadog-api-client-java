/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Basic access authentication. */
@JsonPropertyOrder({
  CustomDestinationHttpDestinationAuthBasic.JSON_PROPERTY_PASSWORD,
  CustomDestinationHttpDestinationAuthBasic.JSON_PROPERTY_TYPE,
  CustomDestinationHttpDestinationAuthBasic.JSON_PROPERTY_USERNAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomDestinationHttpDestinationAuthBasic {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CustomDestinationHttpDestinationAuthBasicType type =
      CustomDestinationHttpDestinationAuthBasicType.BASIC;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public CustomDestinationHttpDestinationAuthBasic() {}

  @JsonCreator
  public CustomDestinationHttpDestinationAuthBasic(
      @JsonProperty(required = true, value = JSON_PROPERTY_PASSWORD) String password,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          CustomDestinationHttpDestinationAuthBasicType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_USERNAME) String username) {
    this.password = password;
    this.type = type;
    this.unparsed |= !type.isValid();
    this.username = username;
  }

  public CustomDestinationHttpDestinationAuthBasic password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The password of the authentication. This field is not returned by the API.
   *
   * @return password
   */
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CustomDestinationHttpDestinationAuthBasic type(
      CustomDestinationHttpDestinationAuthBasicType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the basic access authentication.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CustomDestinationHttpDestinationAuthBasicType getType() {
    return type;
  }

  public void setType(CustomDestinationHttpDestinationAuthBasicType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public CustomDestinationHttpDestinationAuthBasic username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The username of the authentication. This field is not returned by the API.
   *
   * @return username
   */
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return CustomDestinationHttpDestinationAuthBasic
   */
  @JsonAnySetter
  public CustomDestinationHttpDestinationAuthBasic putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CustomDestinationHttpDestinationAuthBasic object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomDestinationHttpDestinationAuthBasic customDestinationHttpDestinationAuthBasic =
        (CustomDestinationHttpDestinationAuthBasic) o;
    return Objects.equals(this.password, customDestinationHttpDestinationAuthBasic.password)
        && Objects.equals(this.type, customDestinationHttpDestinationAuthBasic.type)
        && Objects.equals(this.username, customDestinationHttpDestinationAuthBasic.username)
        && Objects.equals(
            this.additionalProperties,
            customDestinationHttpDestinationAuthBasic.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, type, username, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomDestinationHttpDestinationAuthBasic {\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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

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
   * <p>Key/Value pair of attributes used in SAML assertion attributes.</p>
 */
@JsonPropertyOrder({
  SAMLAssertionAttributeAttributes.JSON_PROPERTY_ATTRIBUTE_KEY,
  SAMLAssertionAttributeAttributes.JSON_PROPERTY_ATTRIBUTE_VALUE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SAMLAssertionAttributeAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTE_KEY = "attribute_key";
  private String attributeKey;

  public static final String JSON_PROPERTY_ATTRIBUTE_VALUE = "attribute_value";
  private String attributeValue;

  public SAMLAssertionAttributeAttributes attributeKey(String attributeKey) {
    this.attributeKey = attributeKey;
    return this;
  }

  /**
   * <p>Key portion of a key/value pair of the attribute sent from the Identity Provider.</p>
   * @return attributeKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ATTRIBUTE_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAttributeKey() {
        return attributeKey;
      }
  public void setAttributeKey(String attributeKey) {
    this.attributeKey = attributeKey;
  }
  public SAMLAssertionAttributeAttributes attributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
    return this;
  }

  /**
   * <p>Value portion of a key/value pair of the attribute sent from the Identity Provider.</p>
   * @return attributeValue
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ATTRIBUTE_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAttributeValue() {
        return attributeValue;
      }
  public void setAttributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
  }

  /**
   * Return true if this SAMLAssertionAttributeAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SAMLAssertionAttributeAttributes samlAssertionAttributeAttributes = (SAMLAssertionAttributeAttributes) o;
    return Objects.equals(this.attributeKey, samlAssertionAttributeAttributes.attributeKey) && Objects.equals(this.attributeValue, samlAssertionAttributeAttributes.attributeValue);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attributeKey,attributeValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SAMLAssertionAttributeAttributes {\n");
    sb.append("    attributeKey: ").append(toIndentedString(attributeKey)).append("\n");
    sb.append("    attributeValue: ").append(toIndentedString(attributeValue)).append("\n");
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

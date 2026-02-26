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
   * <p>Input from the request on which the condition should apply.</p>
 */
@JsonPropertyOrder({
  ApplicationSecurityWafCustomRuleConditionInput.JSON_PROPERTY_ADDRESS,
  ApplicationSecurityWafCustomRuleConditionInput.JSON_PROPERTY_KEY_PATH
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationSecurityWafCustomRuleConditionInput {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private ApplicationSecurityWafCustomRuleConditionInputAddress address;

  public static final String JSON_PROPERTY_KEY_PATH = "key_path";
  private List<String> keyPath = null;

  public ApplicationSecurityWafCustomRuleConditionInput() {}

  @JsonCreator
  public ApplicationSecurityWafCustomRuleConditionInput(
            @JsonProperty(required=true, value=JSON_PROPERTY_ADDRESS)ApplicationSecurityWafCustomRuleConditionInputAddress address) {
        this.address = address;
        this.unparsed |= !address.isValid();
  }
  public ApplicationSecurityWafCustomRuleConditionInput address(ApplicationSecurityWafCustomRuleConditionInputAddress address) {
    this.address = address;
    this.unparsed |= !address.isValid();
    return this;
  }

  /**
   * <p>Input from the request on which the condition should apply.</p>
   * @return address
  **/
      @JsonProperty(JSON_PROPERTY_ADDRESS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ApplicationSecurityWafCustomRuleConditionInputAddress getAddress() {
        return address;
      }
  public void setAddress(ApplicationSecurityWafCustomRuleConditionInputAddress address) {
    if (!address.isValid()) {
        this.unparsed = true;
    }
    this.address = address;
  }
  public ApplicationSecurityWafCustomRuleConditionInput keyPath(List<String> keyPath) {
    this.keyPath = keyPath;
    return this;
  }
  public ApplicationSecurityWafCustomRuleConditionInput addKeyPathItem(String keyPathItem) {
    if (this.keyPath == null) {
      this.keyPath = new ArrayList<>();
    }
    this.keyPath.add(keyPathItem);
    return this;
  }

  /**
   * <p>Specific path for the input.</p>
   * @return keyPath
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_KEY_PATH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getKeyPath() {
        return keyPath;
      }
  public void setKeyPath(List<String> keyPath) {
    this.keyPath = keyPath;
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
   * @return ApplicationSecurityWafCustomRuleConditionInput
   */
  @JsonAnySetter
  public ApplicationSecurityWafCustomRuleConditionInput putAdditionalProperty(String key, Object value) {
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
   * Return true if this ApplicationSecurityWafCustomRuleConditionInput object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationSecurityWafCustomRuleConditionInput applicationSecurityWafCustomRuleConditionInput = (ApplicationSecurityWafCustomRuleConditionInput) o;
    return Objects.equals(this.address, applicationSecurityWafCustomRuleConditionInput.address) && Objects.equals(this.keyPath, applicationSecurityWafCustomRuleConditionInput.keyPath) && Objects.equals(this.additionalProperties, applicationSecurityWafCustomRuleConditionInput.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(address,keyPath, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSecurityWafCustomRuleConditionInput {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    keyPath: ").append(toIndentedString(keyPath)).append("\n");
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

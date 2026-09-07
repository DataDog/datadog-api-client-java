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
   * <p>Multi-network hop assertion for a Network Path test.</p>
 */
@JsonPropertyOrder({
  SyntheticsNetworkAssertionMultiNetworkHop.JSON_PROPERTY_OPERATOR,
  SyntheticsNetworkAssertionMultiNetworkHop.JSON_PROPERTY_PROPERTY,
  SyntheticsNetworkAssertionMultiNetworkHop.JSON_PROPERTY_TARGET,
  SyntheticsNetworkAssertionMultiNetworkHop.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsNetworkAssertionMultiNetworkHop {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private SyntheticsNetworkAssertionOperator operator;

  public static final String JSON_PROPERTY_PROPERTY = "property";
  private SyntheticsNetworkAssertionProperty property;

  public static final String JSON_PROPERTY_TARGET = "target";
  private Double target;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsNetworkAssertionMultiNetworkHopType type = SyntheticsNetworkAssertionMultiNetworkHopType.MULTI_NETWORK_HOP;

  public SyntheticsNetworkAssertionMultiNetworkHop() {}

  @JsonCreator
  public SyntheticsNetworkAssertionMultiNetworkHop(
            @JsonProperty(required=true, value=JSON_PROPERTY_OPERATOR)SyntheticsNetworkAssertionOperator operator,
            @JsonProperty(required=true, value=JSON_PROPERTY_PROPERTY)SyntheticsNetworkAssertionProperty property,
            @JsonProperty(required=true, value=JSON_PROPERTY_TARGET)Double target,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)SyntheticsNetworkAssertionMultiNetworkHopType type) {
        this.operator = operator;
        this.unparsed |= !operator.isValid();
        this.property = property;
        this.unparsed |= !property.isValid();
        this.target = target;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public SyntheticsNetworkAssertionMultiNetworkHop operator(SyntheticsNetworkAssertionOperator operator) {
    this.operator = operator;
    this.unparsed |= !operator.isValid();
    return this;
  }

  /**
   * <p>Assertion operator to apply.</p>
   * @return operator
  **/
      @JsonProperty(JSON_PROPERTY_OPERATOR)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SyntheticsNetworkAssertionOperator getOperator() {
        return operator;
      }
  public void setOperator(SyntheticsNetworkAssertionOperator operator) {
    if (!operator.isValid()) {
        this.unparsed = true;
    }
    this.operator = operator;
  }
  public SyntheticsNetworkAssertionMultiNetworkHop property(SyntheticsNetworkAssertionProperty property) {
    this.property = property;
    this.unparsed |= !property.isValid();
    return this;
  }

  /**
   * <p>The associated assertion property.</p>
   * @return property
  **/
      @JsonProperty(JSON_PROPERTY_PROPERTY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SyntheticsNetworkAssertionProperty getProperty() {
        return property;
      }
  public void setProperty(SyntheticsNetworkAssertionProperty property) {
    if (!property.isValid()) {
        this.unparsed = true;
    }
    this.property = property;
  }
  public SyntheticsNetworkAssertionMultiNetworkHop target(Double target) {
    this.target = target;
    return this;
  }

  /**
   * <p>Target value in number of hops.</p>
   * @return target
  **/
      @JsonProperty(JSON_PROPERTY_TARGET)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Double getTarget() {
        return target;
      }
  public void setTarget(Double target) {
    this.target = target;
  }
  public SyntheticsNetworkAssertionMultiNetworkHop type(SyntheticsNetworkAssertionMultiNetworkHopType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the multi-network hop assertion.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SyntheticsNetworkAssertionMultiNetworkHopType getType() {
        return type;
      }
  public void setType(SyntheticsNetworkAssertionMultiNetworkHopType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
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
   * @return SyntheticsNetworkAssertionMultiNetworkHop
   */
  @JsonAnySetter
  public SyntheticsNetworkAssertionMultiNetworkHop putAdditionalProperty(String key, Object value) {
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
   * Return true if this SyntheticsNetworkAssertionMultiNetworkHop object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsNetworkAssertionMultiNetworkHop syntheticsNetworkAssertionMultiNetworkHop = (SyntheticsNetworkAssertionMultiNetworkHop) o;
    return Objects.equals(this.operator, syntheticsNetworkAssertionMultiNetworkHop.operator) && Objects.equals(this.property, syntheticsNetworkAssertionMultiNetworkHop.property) && Objects.equals(this.target, syntheticsNetworkAssertionMultiNetworkHop.target) && Objects.equals(this.type, syntheticsNetworkAssertionMultiNetworkHop.type) && Objects.equals(this.additionalProperties, syntheticsNetworkAssertionMultiNetworkHop.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(operator,property,target,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsNetworkAssertionMultiNetworkHop {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

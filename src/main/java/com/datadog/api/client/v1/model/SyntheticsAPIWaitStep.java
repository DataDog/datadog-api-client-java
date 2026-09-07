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
   * <p>The Wait step used in a Synthetic multi-step API test.</p>
 */
@JsonPropertyOrder({
  SyntheticsAPIWaitStep.JSON_PROPERTY_ID,
  SyntheticsAPIWaitStep.JSON_PROPERTY_NAME,
  SyntheticsAPIWaitStep.JSON_PROPERTY_SUBTYPE,
  SyntheticsAPIWaitStep.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsAPIWaitStep {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SUBTYPE = "subtype";
  private SyntheticsAPIWaitStepSubtype subtype;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Integer value;

  public SyntheticsAPIWaitStep() {}

  @JsonCreator
  public SyntheticsAPIWaitStep(
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_SUBTYPE)SyntheticsAPIWaitStepSubtype subtype,
            @JsonProperty(required=true, value=JSON_PROPERTY_VALUE)Integer value) {
        this.name = name;
        this.subtype = subtype;
        this.unparsed |= !subtype.isValid();
        this.value = value;
  }

  /**
   * <p>ID of the step.</p>
   * @return id
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getId() {
        return id;
      }
  public SyntheticsAPIWaitStep name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the step.</p>
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
  public SyntheticsAPIWaitStep subtype(SyntheticsAPIWaitStepSubtype subtype) {
    this.subtype = subtype;
    this.unparsed |= !subtype.isValid();
    return this;
  }

  /**
   * <p>The subtype of the Synthetic multi-step API wait step.</p>
   * @return subtype
  **/
      @JsonProperty(JSON_PROPERTY_SUBTYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SyntheticsAPIWaitStepSubtype getSubtype() {
        return subtype;
      }
  public void setSubtype(SyntheticsAPIWaitStepSubtype subtype) {
    if (!subtype.isValid()) {
        this.unparsed = true;
    }
    this.subtype = subtype;
  }
  public SyntheticsAPIWaitStep value(Integer value) {
    this.value = value;
    return this;
  }

  /**
   * <p>The time to wait in seconds. Minimum value: 0. Maximum value: 180.</p>
   * minimum: 0
   * maximum: 180
   * @return value
  **/
      @JsonProperty(JSON_PROPERTY_VALUE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Integer getValue() {
        return value;
      }
  public void setValue(Integer value) {
    this.value = value;
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
   * @return SyntheticsAPIWaitStep
   */
  @JsonAnySetter
  public SyntheticsAPIWaitStep putAdditionalProperty(String key, Object value) {
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
   * Return true if this SyntheticsAPIWaitStep object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsAPIWaitStep syntheticsApiWaitStep = (SyntheticsAPIWaitStep) o;
    return Objects.equals(this.id, syntheticsApiWaitStep.id) && Objects.equals(this.name, syntheticsApiWaitStep.name) && Objects.equals(this.subtype, syntheticsApiWaitStep.subtype) && Objects.equals(this.value, syntheticsApiWaitStep.value) && Objects.equals(this.additionalProperties, syntheticsApiWaitStep.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(id,name,subtype,value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsAPIWaitStep {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

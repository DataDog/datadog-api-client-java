/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.datadog.api.v1.client.JSON;


/**
 * Custom variable for Webhook integration.
 */
@ApiModel(description = "Custom variable for Webhook integration.")
@JsonPropertyOrder({
  WebhooksIntegrationCustomVariable.JSON_PROPERTY_IS_SECRET,
  WebhooksIntegrationCustomVariable.JSON_PROPERTY_NAME,
  WebhooksIntegrationCustomVariable.JSON_PROPERTY_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class WebhooksIntegrationCustomVariable {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_SECRET = "is_secret";
  private Boolean isSecret;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public WebhooksIntegrationCustomVariable() {}

  @JsonCreator
  public WebhooksIntegrationCustomVariable(
            @JsonProperty(required=true, value=JSON_PROPERTY_IS_SECRET) Boolean isSecret,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME) String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_VALUE) String value
            ) {
        this.isSecret = isSecret;
        this.name = name;
        this.value = value;
  }

  public WebhooksIntegrationCustomVariable isSecret(Boolean isSecret) {
    this.isSecret = isSecret;
    return this;
  }

   /**
   * Make custom variable is secret or not. If the custom variable is secret, the value is not returned in the response payload.
   * @return isSecret
  **/
  @ApiModelProperty(example = "true", required = true, value = "Make custom variable is secret or not. If the custom variable is secret, the value is not returned in the response payload.")
  @JsonProperty(JSON_PROPERTY_IS_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsSecret() {
    return isSecret;
  }


  public void setIsSecret(Boolean isSecret) {
    this.isSecret = isSecret;
  }


  public WebhooksIntegrationCustomVariable name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the variable. It corresponds with &#x60;&lt;CUSTOM_VARIABLE_NAME&gt;&#x60;.
   * @return name
  **/
  @ApiModelProperty(example = "CUSTOM_VARIABLE_NAME", required = true, value = "The name of the variable. It corresponds with `<CUSTOM_VARIABLE_NAME>`.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WebhooksIntegrationCustomVariable value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value of the custom variable.
   * @return value
  **/
  @ApiModelProperty(example = "CUSTOM_VARIABLE_VALUE", required = true, value = "Value of the custom variable.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Return true if this WebhooksIntegrationCustomVariable object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhooksIntegrationCustomVariable webhooksIntegrationCustomVariable = (WebhooksIntegrationCustomVariable) o;
    return Objects.equals(this.isSecret, webhooksIntegrationCustomVariable.isSecret) &&
        Objects.equals(this.name, webhooksIntegrationCustomVariable.name) &&
        Objects.equals(this.value, webhooksIntegrationCustomVariable.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSecret, name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhooksIntegrationCustomVariable {\n");
    sb.append("    isSecret: ").append(toIndentedString(isSecret)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


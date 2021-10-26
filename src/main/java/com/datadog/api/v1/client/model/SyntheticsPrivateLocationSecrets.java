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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * Secrets for the private location. Only present in the response when creating the private
 * location.
 */
@ApiModel(
    description =
        "Secrets for the private location. Only present in the response when creating the private"
            + " location.")
@JsonPropertyOrder({
  SyntheticsPrivateLocationSecrets.JSON_PROPERTY_AUTHENTICATION,
  SyntheticsPrivateLocationSecrets.JSON_PROPERTY_CONFIG_DECRYPTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyntheticsPrivateLocationSecrets {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHENTICATION = "authentication";
  private SyntheticsPrivateLocationSecretsAuthentication authentication;

  public static final String JSON_PROPERTY_CONFIG_DECRYPTION = "config_decryption";
  private SyntheticsPrivateLocationSecretsConfigDecryption configDecryption;

  public SyntheticsPrivateLocationSecrets authentication(
      SyntheticsPrivateLocationSecretsAuthentication authentication) {
    this.authentication = authentication;
    this.unparsed |= authentication.unparsed;
    return this;
  }

  /**
   * Get authentication
   *
   * @return authentication
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsPrivateLocationSecretsAuthentication getAuthentication() {
    return authentication;
  }

  public void setAuthentication(SyntheticsPrivateLocationSecretsAuthentication authentication) {
    this.authentication = authentication;
  }

  public SyntheticsPrivateLocationSecrets configDecryption(
      SyntheticsPrivateLocationSecretsConfigDecryption configDecryption) {
    this.configDecryption = configDecryption;
    this.unparsed |= configDecryption.unparsed;
    return this;
  }

  /**
   * Get configDecryption
   *
   * @return configDecryption
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFIG_DECRYPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsPrivateLocationSecretsConfigDecryption getConfigDecryption() {
    return configDecryption;
  }

  public void setConfigDecryption(
      SyntheticsPrivateLocationSecretsConfigDecryption configDecryption) {
    this.configDecryption = configDecryption;
  }

  /** Return true if this SyntheticsPrivateLocation_secrets object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsPrivateLocationSecrets syntheticsPrivateLocationSecrets =
        (SyntheticsPrivateLocationSecrets) o;
    return Objects.equals(this.authentication, syntheticsPrivateLocationSecrets.authentication)
        && Objects.equals(this.configDecryption, syntheticsPrivateLocationSecrets.configDecryption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, configDecryption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsPrivateLocationSecrets {\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    configDecryption: ").append(toIndentedString(configDecryption)).append("\n");
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

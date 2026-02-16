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

/** */
@JsonPropertyOrder({ExternalSecretsManagerOneOf.JSON_PROPERTY_AWS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExternalSecretsManagerOneOf {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AWS = "aws";
  private AWSSecretManager aws;

  public ExternalSecretsManagerOneOf() {}

  @JsonCreator
  public ExternalSecretsManagerOneOf(
      @JsonProperty(required = true, value = JSON_PROPERTY_AWS) AWSSecretManager aws) {
    this.aws = aws;
    this.unparsed |= aws.unparsed;
  }

  public ExternalSecretsManagerOneOf aws(AWSSecretManager aws) {
    this.aws = aws;
    this.unparsed |= aws.unparsed;
    return this;
  }

  /**
   * AWS Secrets Manager configuration.
   *
   * @return aws
   */
  @JsonProperty(JSON_PROPERTY_AWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AWSSecretManager getAws() {
    return aws;
  }

  public void setAws(AWSSecretManager aws) {
    this.aws = aws;
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
   * @return ExternalSecretsManagerOneOf
   */
  @JsonAnySetter
  public ExternalSecretsManagerOneOf putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExternalSecretsManagerOneOf object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalSecretsManagerOneOf externalSecretsManagerOneOf = (ExternalSecretsManagerOneOf) o;
    return Objects.equals(this.aws, externalSecretsManagerOneOf.aws)
        && Objects.equals(
            this.additionalProperties, externalSecretsManagerOneOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aws, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalSecretsManagerOneOf {\n");
    sb.append("    aws: ").append(toIndentedString(aws)).append("\n");
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

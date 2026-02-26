/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The objects used to delete an AWS tag filter entry. */
@JsonPropertyOrder({
  AWSTagFilterDeleteRequest.JSON_PROPERTY_ACCOUNT_ID,
  AWSTagFilterDeleteRequest.JSON_PROPERTY_NAMESPACE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSTagFilterDeleteRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_NAMESPACE = "namespace";
  private AWSNamespace namespace;

  public AWSTagFilterDeleteRequest accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The unique identifier of your AWS account.
   *
   * @return accountId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public AWSTagFilterDeleteRequest namespace(AWSNamespace namespace) {
    this.namespace = namespace;
    this.unparsed |= !namespace.isValid();
    return this;
  }

  /**
   * The namespace associated with the tag filter entry.
   *
   * @return namespace
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAMESPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AWSNamespace getNamespace() {
    return namespace;
  }

  public void setNamespace(AWSNamespace namespace) {
    if (!namespace.isValid()) {
      this.unparsed = true;
    }
    this.namespace = namespace;
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
   * @return AWSTagFilterDeleteRequest
   */
  @JsonAnySetter
  public AWSTagFilterDeleteRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AWSTagFilterDeleteRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSTagFilterDeleteRequest awsTagFilterDeleteRequest = (AWSTagFilterDeleteRequest) o;
    return Objects.equals(this.accountId, awsTagFilterDeleteRequest.accountId)
        && Objects.equals(this.namespace, awsTagFilterDeleteRequest.namespace)
        && Objects.equals(
            this.additionalProperties, awsTagFilterDeleteRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, namespace, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSTagFilterDeleteRequest {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

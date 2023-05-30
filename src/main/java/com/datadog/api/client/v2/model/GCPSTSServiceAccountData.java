/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Additional metadata on your generated service account. */
@JsonPropertyOrder({
  GCPSTSServiceAccountData.JSON_PROPERTY_ATTRIBUTES,
  GCPSTSServiceAccountData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GCPSTSServiceAccountData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private GCPSTSServiceAccountAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private GCPServiceAccountType type = GCPServiceAccountType.GCP_SERVICE_ACCOUNT;

  public GCPSTSServiceAccountData attributes(GCPSTSServiceAccountAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes associated with your service account.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GCPSTSServiceAccountAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(GCPSTSServiceAccountAttributes attributes) {
    this.attributes = attributes;
  }

  public GCPSTSServiceAccountData type(GCPServiceAccountType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of account.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GCPServiceAccountType getType() {
    return type;
  }

  public void setType(GCPServiceAccountType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this GCPSTSServiceAccountData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPSTSServiceAccountData gcpstsServiceAccountData = (GCPSTSServiceAccountData) o;
    return Objects.equals(this.attributes, gcpstsServiceAccountData.attributes)
        && Objects.equals(this.type, gcpstsServiceAccountData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPSTSServiceAccountData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

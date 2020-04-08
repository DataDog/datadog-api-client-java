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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Available prefix information for the APM endpoints.
 */
@ApiModel(description = "Available prefix information for the APM endpoints.")
@JsonPropertyOrder({
  IPAPMPrefixes.JSON_PROPERTY_PREFIXES_IPV4,
  IPAPMPrefixes.JSON_PROPERTY_PREFIXES_IPV6
})

public class IPAPMPrefixes {
  public static final String JSON_PROPERTY_PREFIXES_IPV4 = "prefixes_ipv4";
  private List<String> prefixesIpv4 = null;

  public static final String JSON_PROPERTY_PREFIXES_IPV6 = "prefixes_ipv6";
  private List<String> prefixesIpv6 = null;


  public IPAPMPrefixes prefixesIpv4(List<String> prefixesIpv4) {
    
    this.prefixesIpv4 = prefixesIpv4;
    return this;
  }

  public IPAPMPrefixes addPrefixesIpv4Item(String prefixesIpv4Item) {
    if (this.prefixesIpv4 == null) {
      this.prefixesIpv4 = new ArrayList<>();
    }
    this.prefixesIpv4.add(prefixesIpv4Item);
    return this;
  }

   /**
   * List of IPv4 prefixes.
   * @return prefixesIpv4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of IPv4 prefixes.")
  @JsonProperty(JSON_PROPERTY_PREFIXES_IPV4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPrefixesIpv4() {
    return prefixesIpv4;
  }


  public void setPrefixesIpv4(List<String> prefixesIpv4) {
    this.prefixesIpv4 = prefixesIpv4;
  }


  public IPAPMPrefixes prefixesIpv6(List<String> prefixesIpv6) {
    
    this.prefixesIpv6 = prefixesIpv6;
    return this;
  }

  public IPAPMPrefixes addPrefixesIpv6Item(String prefixesIpv6Item) {
    if (this.prefixesIpv6 == null) {
      this.prefixesIpv6 = new ArrayList<>();
    }
    this.prefixesIpv6.add(prefixesIpv6Item);
    return this;
  }

   /**
   * List of IPv6 prefixes.
   * @return prefixesIpv6
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of IPv6 prefixes.")
  @JsonProperty(JSON_PROPERTY_PREFIXES_IPV6)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPrefixesIpv6() {
    return prefixesIpv6;
  }


  public void setPrefixesIpv6(List<String> prefixesIpv6) {
    this.prefixesIpv6 = prefixesIpv6;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPAPMPrefixes ipAPMPrefixes = (IPAPMPrefixes) o;
    return Objects.equals(this.prefixesIpv4, ipAPMPrefixes.prefixesIpv4) &&
        Objects.equals(this.prefixesIpv6, ipAPMPrefixes.prefixesIpv6);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefixesIpv4, prefixesIpv6);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAPMPrefixes {\n");
    sb.append("    prefixesIpv4: ").append(toIndentedString(prefixesIpv4)).append("\n");
    sb.append("    prefixesIpv6: ").append(toIndentedString(prefixesIpv6)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


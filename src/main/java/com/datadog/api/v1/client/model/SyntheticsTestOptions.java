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
import com.datadog.api.v1.client.model.SyntheticsDeviceID;
import com.datadog.api.v1.client.model.SyntheticsTestOptionsRetry;
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
 * SyntheticsTestOptions
 */
@JsonPropertyOrder({
  SyntheticsTestOptions.JSON_PROPERTY_ACCEPT_SELF_SIGNED,
  SyntheticsTestOptions.JSON_PROPERTY_DEVICE_IDS,
  SyntheticsTestOptions.JSON_PROPERTY_FOLLOW_REDIRECTS,
  SyntheticsTestOptions.JSON_PROPERTY_MIN_LOCATION_FAILED,
  SyntheticsTestOptions.JSON_PROPERTY_RETRY,
  SyntheticsTestOptions.JSON_PROPERTY_TICK_EVERY
})

public class SyntheticsTestOptions {
  public static final String JSON_PROPERTY_ACCEPT_SELF_SIGNED = "accept_self_signed";
  private Boolean acceptSelfSigned;

  public static final String JSON_PROPERTY_DEVICE_IDS = "device_ids";
  private List<SyntheticsDeviceID> deviceIds = null;

  public static final String JSON_PROPERTY_FOLLOW_REDIRECTS = "follow_redirects";
  private Boolean followRedirects;

  public static final String JSON_PROPERTY_MIN_LOCATION_FAILED = "min_location_failed";
  private Long minLocationFailed;

  public static final String JSON_PROPERTY_RETRY = "retry";
  private SyntheticsTestOptionsRetry retry;

  /**
   * Gets or Sets tickEvery
   */
  public enum TickEveryEnum {
    NUMBER_60(60l),
    
    NUMBER_300(300l),
    
    NUMBER_900(900l),
    
    NUMBER_1800(1800l),
    
    NUMBER_3600(3600l),
    
    NUMBER_21600(21600l),
    
    NUMBER_43200(43200l),
    
    NUMBER_86400(86400l),
    
    NUMBER_604800(604800l);

    private Long value;

    TickEveryEnum(Long value) {
      this.value = value;
    }

    @JsonValue
    public Long getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TickEveryEnum fromValue(Long value) {
      for (TickEveryEnum b : TickEveryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TICK_EVERY = "tick_every";
  private TickEveryEnum tickEvery;


  public SyntheticsTestOptions acceptSelfSigned(Boolean acceptSelfSigned) {
    
    this.acceptSelfSigned = acceptSelfSigned;
    return this;
  }

   /**
   * Get acceptSelfSigned
   * @return acceptSelfSigned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCEPT_SELF_SIGNED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAcceptSelfSigned() {
    return acceptSelfSigned;
  }


  public void setAcceptSelfSigned(Boolean acceptSelfSigned) {
    this.acceptSelfSigned = acceptSelfSigned;
  }


  public SyntheticsTestOptions deviceIds(List<SyntheticsDeviceID> deviceIds) {
    
    this.deviceIds = deviceIds;
    return this;
  }

  public SyntheticsTestOptions addDeviceIdsItem(SyntheticsDeviceID deviceIdsItem) {
    if (this.deviceIds == null) {
      this.deviceIds = new ArrayList<>();
    }
    this.deviceIds.add(deviceIdsItem);
    return this;
  }

   /**
   * Get deviceIds
   * @return deviceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SyntheticsDeviceID> getDeviceIds() {
    return deviceIds;
  }


  public void setDeviceIds(List<SyntheticsDeviceID> deviceIds) {
    this.deviceIds = deviceIds;
  }


  public SyntheticsTestOptions followRedirects(Boolean followRedirects) {
    
    this.followRedirects = followRedirects;
    return this;
  }

   /**
   * Get followRedirects
   * @return followRedirects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FOLLOW_REDIRECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFollowRedirects() {
    return followRedirects;
  }


  public void setFollowRedirects(Boolean followRedirects) {
    this.followRedirects = followRedirects;
  }


  public SyntheticsTestOptions minLocationFailed(Long minLocationFailed) {
    
    this.minLocationFailed = minLocationFailed;
    return this;
  }

   /**
   * Get minLocationFailed
   * @return minLocationFailed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MIN_LOCATION_FAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMinLocationFailed() {
    return minLocationFailed;
  }


  public void setMinLocationFailed(Long minLocationFailed) {
    this.minLocationFailed = minLocationFailed;
  }


  public SyntheticsTestOptions retry(SyntheticsTestOptionsRetry retry) {
    
    this.retry = retry;
    return this;
  }

   /**
   * Get retry
   * @return retry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SyntheticsTestOptionsRetry getRetry() {
    return retry;
  }


  public void setRetry(SyntheticsTestOptionsRetry retry) {
    this.retry = retry;
  }


  public SyntheticsTestOptions tickEvery(TickEveryEnum tickEvery) {
    
    this.tickEvery = tickEvery;
    return this;
  }

   /**
   * Get tickEvery
   * @return tickEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TICK_EVERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TickEveryEnum getTickEvery() {
    return tickEvery;
  }


  public void setTickEvery(TickEveryEnum tickEvery) {
    this.tickEvery = tickEvery;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestOptions syntheticsTestOptions = (SyntheticsTestOptions) o;
    return Objects.equals(this.acceptSelfSigned, syntheticsTestOptions.acceptSelfSigned) &&
        Objects.equals(this.deviceIds, syntheticsTestOptions.deviceIds) &&
        Objects.equals(this.followRedirects, syntheticsTestOptions.followRedirects) &&
        Objects.equals(this.minLocationFailed, syntheticsTestOptions.minLocationFailed) &&
        Objects.equals(this.retry, syntheticsTestOptions.retry) &&
        Objects.equals(this.tickEvery, syntheticsTestOptions.tickEvery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptSelfSigned, deviceIds, followRedirects, minLocationFailed, retry, tickEvery);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestOptions {\n");
    sb.append("    acceptSelfSigned: ").append(toIndentedString(acceptSelfSigned)).append("\n");
    sb.append("    deviceIds: ").append(toIndentedString(deviceIds)).append("\n");
    sb.append("    followRedirects: ").append(toIndentedString(followRedirects)).append("\n");
    sb.append("    minLocationFailed: ").append(toIndentedString(minLocationFailed)).append("\n");
    sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
    sb.append("    tickEvery: ").append(toIndentedString(tickEvery)).append("\n");
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


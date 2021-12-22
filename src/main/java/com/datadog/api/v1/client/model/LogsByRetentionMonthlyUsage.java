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
import com.datadog.api.v1.client.model.LogsRetentionSumUsage;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.datadog.api.v1.client.JSON;


/**
 * Object containing a summary of indexed logs usage by retention period for a single month.
 */
@ApiModel(description = "Object containing a summary of indexed logs usage by retention period for a single month.")
@JsonPropertyOrder({
  LogsByRetentionMonthlyUsage.JSON_PROPERTY_DATE,
  LogsByRetentionMonthlyUsage.JSON_PROPERTY_USAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LogsByRetentionMonthlyUsage {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATE = "date";
  private String date;

  public static final String JSON_PROPERTY_USAGE = "usage";
  private List<LogsRetentionSumUsage> usage = null;


  public LogsByRetentionMonthlyUsage date(String date) {
    this.date = date;
    return this;
  }

   /**
   * The month for the usage.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The month for the usage.")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public LogsByRetentionMonthlyUsage usage(List<LogsRetentionSumUsage> usage) {
    this.usage = usage;
    for (LogsRetentionSumUsage item : usage) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LogsByRetentionMonthlyUsage addUsageItem(LogsRetentionSumUsage usageItem) {
    if (this.usage == null) {
      this.usage = new ArrayList<>();
    }
    this.usage.add(usageItem);
    this.unparsed |= usageItem.unparsed;
    return this;
  }

   /**
   * Indexed logs usage for each active retention for the month.
   * @return usage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indexed logs usage for each active retention for the month.")
  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LogsRetentionSumUsage> getUsage() {
    return usage;
  }


  public void setUsage(List<LogsRetentionSumUsage> usage) {
    this.usage = usage;
  }


  /**
   * Return true if this LogsByRetentionMonthlyUsage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsByRetentionMonthlyUsage logsByRetentionMonthlyUsage = (LogsByRetentionMonthlyUsage) o;
    return Objects.equals(this.date, logsByRetentionMonthlyUsage.date) &&
        Objects.equals(this.usage, logsByRetentionMonthlyUsage.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsByRetentionMonthlyUsage {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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


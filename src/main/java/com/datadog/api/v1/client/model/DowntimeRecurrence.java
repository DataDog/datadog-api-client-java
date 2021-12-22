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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.datadog.api.v1.client.JSON;


/**
 * An object defining the recurrence of the downtime.
 */
@ApiModel(description = "An object defining the recurrence of the downtime.")
@JsonPropertyOrder({
  DowntimeRecurrence.JSON_PROPERTY_PERIOD,
  DowntimeRecurrence.JSON_PROPERTY_RRULE,
  DowntimeRecurrence.JSON_PROPERTY_TYPE,
  DowntimeRecurrence.JSON_PROPERTY_UNTIL_DATE,
  DowntimeRecurrence.JSON_PROPERTY_UNTIL_OCCURRENCES,
  DowntimeRecurrence.JSON_PROPERTY_WEEK_DAYS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class DowntimeRecurrence {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_PERIOD = "period";
  private Integer period;

  public static final String JSON_PROPERTY_RRULE = "rrule";
  private String rrule;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_UNTIL_DATE = "until_date";
  private JsonNullable<Long> untilDate = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_UNTIL_OCCURRENCES = "until_occurrences";
  private JsonNullable<Integer> untilOccurrences = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_WEEK_DAYS = "week_days";
  private List<String> weekDays = null;


  public DowntimeRecurrence period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * How often to repeat as an integer. For example, to repeat every 3 days, select a type of &#x60;days&#x60; and a period of &#x60;3&#x60;.
   * maximum: 2147483647
   * @return period
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "How often to repeat as an integer. For example, to repeat every 3 days, select a type of `days` and a period of `3`.")
  @JsonProperty(JSON_PROPERTY_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPeriod() {
    return period;
  }


  public void setPeriod(Integer period) {
    this.period = period;
  }


  public DowntimeRecurrence rrule(String rrule) {
    this.rrule = rrule;
    return this;
  }

   /**
   * The &#x60;RRULE&#x60; standard for defining recurring events (**requires to set \&quot;type\&quot; to rrule**) For example, to have a recurring event on the first day of each month, set the type to &#x60;rrule&#x60; and set the &#x60;FREQ&#x60; to &#x60;MONTHLY&#x60; and &#x60;BYMONTHDAY&#x60; to &#x60;1&#x60;. Most common &#x60;rrule&#x60; options from the [iCalendar Spec](https://tools.ietf.org/html/rfc5545) are supported.  **Note**: Attributes specifying the duration in &#x60;RRULE&#x60; are not supported (for example, &#x60;DTSTART&#x60;, &#x60;DTEND&#x60;, &#x60;DURATION&#x60;). More examples available in this [downtime guide](https://docs.datadoghq.com/monitors/guide/suppress-alert-with-downtimes/?tab&#x3D;api)
   * @return rrule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FREQ=MONTHLY;BYSETPOS=3;BYDAY=WE;INTERVAL=1", value = "The `RRULE` standard for defining recurring events (**requires to set \"type\" to rrule**) For example, to have a recurring event on the first day of each month, set the type to `rrule` and set the `FREQ` to `MONTHLY` and `BYMONTHDAY` to `1`. Most common `rrule` options from the [iCalendar Spec](https://tools.ietf.org/html/rfc5545) are supported.  **Note**: Attributes specifying the duration in `RRULE` are not supported (for example, `DTSTART`, `DTEND`, `DURATION`). More examples available in this [downtime guide](https://docs.datadoghq.com/monitors/guide/suppress-alert-with-downtimes/?tab=api)")
  @JsonProperty(JSON_PROPERTY_RRULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRrule() {
    return rrule;
  }


  public void setRrule(String rrule) {
    this.rrule = rrule;
  }


  public DowntimeRecurrence type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of recurrence. Choose from &#x60;days&#x60;, &#x60;weeks&#x60;, &#x60;months&#x60;, &#x60;years&#x60;, &#x60;rrule&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "weeks", value = "The type of recurrence. Choose from `days`, `weeks`, `months`, `years`, `rrule`.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public DowntimeRecurrence untilDate(Long untilDate) {
    this.untilDate = JsonNullable.<Long>of(untilDate);
    return this;
  }

   /**
   * The date at which the recurrence should end as a POSIX timestamp. &#x60;until_occurences&#x60; and &#x60;until_date&#x60; are mutually exclusive.
   * @return untilDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1447786293", value = "The date at which the recurrence should end as a POSIX timestamp. `until_occurences` and `until_date` are mutually exclusive.")
  @JsonIgnore

  public Long getUntilDate() {
        return untilDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNTIL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getUntilDate_JsonNullable() {
    return untilDate;
  }
  
  @JsonProperty(JSON_PROPERTY_UNTIL_DATE)
  public void setUntilDate_JsonNullable(JsonNullable<Long> untilDate) {
    this.untilDate = untilDate;
  }

  public void setUntilDate(Long untilDate) {
    this.untilDate = JsonNullable.<Long>of(untilDate);
  }


  public DowntimeRecurrence untilOccurrences(Integer untilOccurrences) {
    this.untilOccurrences = JsonNullable.<Integer>of(untilOccurrences);
    return this;
  }

   /**
   * How many times the downtime is rescheduled. &#x60;until_occurences&#x60; and &#x60;until_date&#x60; are mutually exclusive.
   * maximum: 2147483647
   * @return untilOccurrences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "How many times the downtime is rescheduled. `until_occurences` and `until_date` are mutually exclusive.")
  @JsonIgnore

  public Integer getUntilOccurrences() {
        return untilOccurrences.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNTIL_OCCURRENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getUntilOccurrences_JsonNullable() {
    return untilOccurrences;
  }
  
  @JsonProperty(JSON_PROPERTY_UNTIL_OCCURRENCES)
  public void setUntilOccurrences_JsonNullable(JsonNullable<Integer> untilOccurrences) {
    this.untilOccurrences = untilOccurrences;
  }

  public void setUntilOccurrences(Integer untilOccurrences) {
    this.untilOccurrences = JsonNullable.<Integer>of(untilOccurrences);
  }


  public DowntimeRecurrence weekDays(List<String> weekDays) {
    this.weekDays = weekDays;
    return this;
  }

  public DowntimeRecurrence addWeekDaysItem(String weekDaysItem) {
    if (this.weekDays == null) {
      this.weekDays = new ArrayList<>();
    }
    this.weekDays.add(weekDaysItem);
    return this;
  }

   /**
   * A list of week days to repeat on. Choose from &#x60;Mon&#x60;, &#x60;Tue&#x60;, &#x60;Wed&#x60;, &#x60;Thu&#x60;, &#x60;Fri&#x60;, &#x60;Sat&#x60; or &#x60;Sun&#x60;. Only applicable when type is weeks. First letter must be capitalized.
   * @return weekDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"Mon\",\"Tue\"]", value = "A list of week days to repeat on. Choose from `Mon`, `Tue`, `Wed`, `Thu`, `Fri`, `Sat` or `Sun`. Only applicable when type is weeks. First letter must be capitalized.")
  @JsonProperty(JSON_PROPERTY_WEEK_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getWeekDays() {
    return weekDays;
  }


  public void setWeekDays(List<String> weekDays) {
    this.weekDays = weekDays;
  }


  /**
   * Return true if this DowntimeRecurrence object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeRecurrence downtimeRecurrence = (DowntimeRecurrence) o;
    return Objects.equals(this.period, downtimeRecurrence.period) &&
        Objects.equals(this.rrule, downtimeRecurrence.rrule) &&
        Objects.equals(this.type, downtimeRecurrence.type) &&
        Objects.equals(this.untilDate, downtimeRecurrence.untilDate) &&
        Objects.equals(this.untilOccurrences, downtimeRecurrence.untilOccurrences) &&
        Objects.equals(this.weekDays, downtimeRecurrence.weekDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, rrule, type, untilDate, untilOccurrences, weekDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeRecurrence {\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    rrule: ").append(toIndentedString(rrule)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    untilDate: ").append(toIndentedString(untilDate)).append("\n");
    sb.append("    untilOccurrences: ").append(toIndentedString(untilOccurrences)).append("\n");
    sb.append("    weekDays: ").append(toIndentedString(weekDays)).append("\n");
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


/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** An object defining the recurrence of the downtime. */
@JsonPropertyOrder({
  DowntimeRecurrence.JSON_PROPERTY_PERIOD,
  DowntimeRecurrence.JSON_PROPERTY_RRULE,
  DowntimeRecurrence.JSON_PROPERTY_TYPE,
  DowntimeRecurrence.JSON_PROPERTY_UNTIL_DATE,
  DowntimeRecurrence.JSON_PROPERTY_UNTIL_OCCURRENCES,
  DowntimeRecurrence.JSON_PROPERTY_WEEK_DAYS
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeRecurrence {
  @JsonIgnore public boolean unparsed = false;
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
  private JsonNullable<List<String>> weekDays = JsonNullable.<List<String>>undefined();

  public DowntimeRecurrence period(Integer period) {
    this.period = period;
    return this;
  }

  /**
   * How often to repeat as an integer. For example, to repeat every 3 days, select a type of <code>
   * days</code> and a period of <code>3</code>. maximum: 2147483647
   *
   * @return period
   */
  @javax.annotation.Nullable
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
   * The <code>RRULE</code> standard for defining recurring events (<strong>requires to set "type"
   * to rrule</strong>) For example, to have a recurring event on the first day of each month, set
   * the type to <code>rrule</code> and set the <code>FREQ</code> to <code>MONTHLY</code> and <code>
   * BYMONTHDAY</code> to <code>1</code>. Most common <code>rrule</code> options from the <a
   * href="https://tools.ietf.org/html/rfc5545">iCalendar Spec</a> are supported.
   *
   * <p><strong>Note</strong>: Attributes specifying the duration in <code>RRULE</code> are not
   * supported (for example, <code>DTSTART</code>, <code>DTEND</code>, <code>DURATION</code>). More
   * examples available in this <a
   * href="https://docs.datadoghq.com/monitors/guide/suppress-alert-with-downtimes/?tab=api">downtime
   * guide</a>
   *
   * @return rrule
   */
  @javax.annotation.Nullable
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
   * The type of recurrence. Choose from <code>days</code>, <code>weeks</code>, <code>months</code>,
   * <code>years</code>, <code>rrule</code>.
   *
   * @return type
   */
  @javax.annotation.Nullable
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
   * The date at which the recurrence should end as a POSIX timestamp. <code>until_occurences</code>
   * and <code>until_date</code> are mutually exclusive.
   *
   * @return untilDate
   */
  @javax.annotation.Nullable
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
   * How many times the downtime is rescheduled. <code>until_occurences</code> and <code>until_date
   * </code> are mutually exclusive. maximum: 2147483647
   *
   * @return untilOccurrences
   */
  @javax.annotation.Nullable
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
    this.weekDays = JsonNullable.<List<String>>of(weekDays);
    return this;
  }

  public DowntimeRecurrence addWeekDaysItem(String weekDaysItem) {
    if (this.weekDays == null || !this.weekDays.isPresent()) {
      this.weekDays = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.weekDays.get().add(weekDaysItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * A list of week days to repeat on. Choose from <code>Mon</code>, <code>Tue</code>, <code>Wed
   * </code>, <code>Thu</code>, <code>Fri</code>, <code>Sat</code> or <code>Sun</code>. Only
   * applicable when type is weeks. First letter must be capitalized.
   *
   * @return weekDays
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public List<String> getWeekDays() {
    return weekDays.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEEK_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getWeekDays_JsonNullable() {
    return weekDays;
  }

  @JsonProperty(JSON_PROPERTY_WEEK_DAYS)
  public void setWeekDays_JsonNullable(JsonNullable<List<String>> weekDays) {
    this.weekDays = weekDays;
  }

  public void setWeekDays(List<String> weekDays) {
    this.weekDays = JsonNullable.<List<String>>of(weekDays);
  }

  /** Return true if this DowntimeRecurrence object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeRecurrence downtimeRecurrence = (DowntimeRecurrence) o;
    return Objects.equals(this.period, downtimeRecurrence.period)
        && Objects.equals(this.rrule, downtimeRecurrence.rrule)
        && Objects.equals(this.type, downtimeRecurrence.type)
        && Objects.equals(this.untilDate, downtimeRecurrence.untilDate)
        && Objects.equals(this.untilOccurrences, downtimeRecurrence.untilOccurrences)
        && Objects.equals(this.weekDays, downtimeRecurrence.weekDays);
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

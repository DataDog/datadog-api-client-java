/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Class that add parsing/formatting support for Java 8+ {@code OffsetDateTime} class. It's
 * generated for java clients when {@code AbstractJavaCodegen#dateLibrary} specified as {@code
 * java8}.
 */
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class JavaTimeFormatter {

  private DateTimeFormatter offsetDateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

  /**
   * Get the date format used to parse/format {@code OffsetDateTime} parameters.
   *
   * @return DateTimeFormatter
   */
  public DateTimeFormatter getOffsetDateTimeFormatter() {
    return offsetDateTimeFormatter;
  }

  /**
   * Set the date format used to parse/format {@code OffsetDateTime} parameters.
   *
   * @param offsetDateTimeFormatter {@code DateTimeFormatter}
   */
  public void setOffsetDateTimeFormatter(DateTimeFormatter offsetDateTimeFormatter) {
    this.offsetDateTimeFormatter = offsetDateTimeFormatter;
  }

  /**
   * Parse the given string into {@code OffsetDateTime} object.
   *
   * @param str String
   * @return {@code OffsetDateTime}
   */
  public OffsetDateTime parseOffsetDateTime(String str) {
    try {
      return OffsetDateTime.parse(str, offsetDateTimeFormatter);
    } catch (DateTimeParseException e) {
      throw new RuntimeException(e);
    }
  }
  /**
   * Format the given {@code OffsetDateTime} object into string.
   *
   * @param offsetDateTime {@code OffsetDateTime}
   * @return {@code OffsetDateTime} in string format
   */
  public String formatOffsetDateTime(OffsetDateTime offsetDateTime) {
    return offsetDateTimeFormatter.format(offsetDateTime);
  }
}

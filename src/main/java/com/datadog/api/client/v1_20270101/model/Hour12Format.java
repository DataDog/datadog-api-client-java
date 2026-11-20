/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(using = Hour12Format.Hour12FormatSerializer.class)
public class Hour12Format extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "12am", "1am", "2am", "3am", "4am", "5am", "6am", "7am", "8am", "9am", "10am", "11am",
              "12pm", "1pm", "2pm", "3pm", "4pm", "5pm", "6pm", "7pm", "8pm", "9pm", "10pm",
              "11pm"));

  public static final Hour12Format TWELVE_AM = new Hour12Format("12am");
  public static final Hour12Format ONE_AM = new Hour12Format("1am");
  public static final Hour12Format TWO_AM = new Hour12Format("2am");
  public static final Hour12Format THREE_AM = new Hour12Format("3am");
  public static final Hour12Format FOUR_AM = new Hour12Format("4am");
  public static final Hour12Format FIVE_AM = new Hour12Format("5am");
  public static final Hour12Format SIX_AM = new Hour12Format("6am");
  public static final Hour12Format SEVEN_AM = new Hour12Format("7am");
  public static final Hour12Format EIGHT_AM = new Hour12Format("8am");
  public static final Hour12Format NINE_AM = new Hour12Format("9am");
  public static final Hour12Format TEN_AM = new Hour12Format("10am");
  public static final Hour12Format ELEVEN_AM = new Hour12Format("11am");
  public static final Hour12Format TWELVE_PM = new Hour12Format("12pm");
  public static final Hour12Format ONE_PM = new Hour12Format("1pm");
  public static final Hour12Format TWO_PM = new Hour12Format("2pm");
  public static final Hour12Format THREE_PM = new Hour12Format("3pm");
  public static final Hour12Format FOUR_PM = new Hour12Format("4pm");
  public static final Hour12Format FIVE_PM = new Hour12Format("5pm");
  public static final Hour12Format SIX_PM = new Hour12Format("6pm");
  public static final Hour12Format SEVEN_PM = new Hour12Format("7pm");
  public static final Hour12Format EIGHT_PM = new Hour12Format("8pm");
  public static final Hour12Format NINE_PM = new Hour12Format("9pm");
  public static final Hour12Format TEN_PM = new Hour12Format("10pm");
  public static final Hour12Format ELEVEN_PM = new Hour12Format("11pm");

  Hour12Format(String value) {
    super(value, allowedValues);
  }

  public static class Hour12FormatSerializer extends StdSerializer<Hour12Format> {
    public Hour12FormatSerializer(Class<Hour12Format> t) {
      super(t);
    }

    public Hour12FormatSerializer() {
      this(null);
    }

    @Override
    public void serialize(Hour12Format value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static Hour12Format fromValue(String value) {
    return new Hour12Format(value);
  }
}

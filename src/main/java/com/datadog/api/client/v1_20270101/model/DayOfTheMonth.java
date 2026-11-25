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
@JsonSerialize(using = DayOfTheMonth.DayOfTheMonthSerializer.class)
public class DayOfTheMonth extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th",
              "13th", "14th", "15th", "16th", "17th", "18th", "19th", "20th", "21st", "22nd",
              "23rd", "24th", "25th", "26th", "27th", "28th", "29th", "30th", "31st"));

  public static final DayOfTheMonth ONE_ST = new DayOfTheMonth("1st");
  public static final DayOfTheMonth TWO_ND = new DayOfTheMonth("2nd");
  public static final DayOfTheMonth THREE_RD = new DayOfTheMonth("3rd");
  public static final DayOfTheMonth FOUR_TH = new DayOfTheMonth("4th");
  public static final DayOfTheMonth FIVE_TH = new DayOfTheMonth("5th");
  public static final DayOfTheMonth SIX_TH = new DayOfTheMonth("6th");
  public static final DayOfTheMonth SEVEN_TH = new DayOfTheMonth("7th");
  public static final DayOfTheMonth EIGHT_TH = new DayOfTheMonth("8th");
  public static final DayOfTheMonth NINE_TH = new DayOfTheMonth("9th");
  public static final DayOfTheMonth TEN_TH = new DayOfTheMonth("10th");
  public static final DayOfTheMonth ELEVEN_TH = new DayOfTheMonth("11th");
  public static final DayOfTheMonth TWELVE_TH = new DayOfTheMonth("12th");
  public static final DayOfTheMonth THIRTEEN_TH = new DayOfTheMonth("13th");
  public static final DayOfTheMonth FOURTEEN_TH = new DayOfTheMonth("14th");
  public static final DayOfTheMonth FIFTEEN_TH = new DayOfTheMonth("15th");
  public static final DayOfTheMonth SIXTEEN_TH = new DayOfTheMonth("16th");
  public static final DayOfTheMonth SEVENTEEN_TH = new DayOfTheMonth("17th");
  public static final DayOfTheMonth EIGHTEEN_TH = new DayOfTheMonth("18th");
  public static final DayOfTheMonth NINETEEN_TH = new DayOfTheMonth("19th");
  public static final DayOfTheMonth TWENTY_TH = new DayOfTheMonth("20th");
  public static final DayOfTheMonth TWENTY_ONE_ST = new DayOfTheMonth("21st");
  public static final DayOfTheMonth TWENTY_TWO_ND = new DayOfTheMonth("22nd");
  public static final DayOfTheMonth TWENTY_THREE_RD = new DayOfTheMonth("23rd");
  public static final DayOfTheMonth TWENTY_FOUR_TH = new DayOfTheMonth("24th");
  public static final DayOfTheMonth TWENTY_FIVE_TH = new DayOfTheMonth("25th");
  public static final DayOfTheMonth TWENTY_SIX_TH = new DayOfTheMonth("26th");
  public static final DayOfTheMonth TWENTY_SEVEN_TH = new DayOfTheMonth("27th");
  public static final DayOfTheMonth TWENTY_EIGHT_TH = new DayOfTheMonth("28th");
  public static final DayOfTheMonth TWENTY_NINE_TH = new DayOfTheMonth("29th");
  public static final DayOfTheMonth THIRTY_TH = new DayOfTheMonth("30th");
  public static final DayOfTheMonth THIRTY_ONE_ST = new DayOfTheMonth("31st");

  DayOfTheMonth(String value) {
    super(value, allowedValues);
  }

  public static class DayOfTheMonthSerializer extends StdSerializer<DayOfTheMonth> {
    public DayOfTheMonthSerializer(Class<DayOfTheMonth> t) {
      super(t);
    }

    public DayOfTheMonthSerializer() {
      this(null);
    }

    @Override
    public void serialize(DayOfTheMonth value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DayOfTheMonth fromValue(String value) {
    return new DayOfTheMonth(value);
  }
}

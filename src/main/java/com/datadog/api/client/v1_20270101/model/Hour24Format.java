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
@JsonSerialize(using = Hour24Format.Hour24FormatSerializer.class)
public class Hour24Format extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
              "16", "17", "18", "19", "20", "21", "22", "23"));

  public static final Hour24Format ZERO = new Hour24Format("0");
  public static final Hour24Format ONE = new Hour24Format("1");
  public static final Hour24Format TWO = new Hour24Format("2");
  public static final Hour24Format THREE = new Hour24Format("3");
  public static final Hour24Format FOUR = new Hour24Format("4");
  public static final Hour24Format FIVE = new Hour24Format("5");
  public static final Hour24Format SIX = new Hour24Format("6");
  public static final Hour24Format SEVEN = new Hour24Format("7");
  public static final Hour24Format EIGHT = new Hour24Format("8");
  public static final Hour24Format NINE = new Hour24Format("9");
  public static final Hour24Format TEN = new Hour24Format("10");
  public static final Hour24Format ELEVEN = new Hour24Format("11");
  public static final Hour24Format TWELVE = new Hour24Format("12");
  public static final Hour24Format THIRTEEN = new Hour24Format("13");
  public static final Hour24Format FOURTEEN = new Hour24Format("14");
  public static final Hour24Format FIFTEEN = new Hour24Format("15");
  public static final Hour24Format SIXTEEN = new Hour24Format("16");
  public static final Hour24Format SEVENTEEN = new Hour24Format("17");
  public static final Hour24Format EIGHTEEN = new Hour24Format("18");
  public static final Hour24Format NINETEEN = new Hour24Format("19");
  public static final Hour24Format TWENTY = new Hour24Format("20");
  public static final Hour24Format TWENTY_ONE = new Hour24Format("21");
  public static final Hour24Format TWENTY_TWO = new Hour24Format("22");
  public static final Hour24Format TWENTY_THREE = new Hour24Format("23");

  Hour24Format(String value) {
    super(value, allowedValues);
  }

  public static class Hour24FormatSerializer extends StdSerializer<Hour24Format> {
    public Hour24FormatSerializer(Class<Hour24Format> t) {
      super(t);
    }

    public Hour24FormatSerializer() {
      this(null);
    }

    @Override
    public void serialize(Hour24Format value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static Hour24Format fromValue(String value) {
    return new Hour24Format(value);
  }
}

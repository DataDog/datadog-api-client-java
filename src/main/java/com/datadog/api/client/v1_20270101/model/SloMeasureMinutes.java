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
@JsonSerialize(using = SloMeasureMinutes.SloMeasureMinutesSerializer.class)
public class SloMeasureMinutes extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("good_minutes", "bad_minutes"));

  public static final SloMeasureMinutes GOOD_MINUTES = new SloMeasureMinutes("good_minutes");
  public static final SloMeasureMinutes BAD_MINUTES = new SloMeasureMinutes("bad_minutes");

  SloMeasureMinutes(String value) {
    super(value, allowedValues);
  }

  public static class SloMeasureMinutesSerializer extends StdSerializer<SloMeasureMinutes> {
    public SloMeasureMinutesSerializer(Class<SloMeasureMinutes> t) {
      super(t);
    }

    public SloMeasureMinutesSerializer() {
      this(null);
    }

    @Override
    public void serialize(SloMeasureMinutes value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SloMeasureMinutes fromValue(String value) {
    return new SloMeasureMinutes(value);
  }
}

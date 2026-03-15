/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** The source of a segment. */
@JsonSerialize(using = RumSegmentSource.RumSegmentSourceSerializer.class)
public class RumSegmentSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("user_created", "initial"));

  public static final RumSegmentSource USER_CREATED = new RumSegmentSource("user_created");
  public static final RumSegmentSource INITIAL = new RumSegmentSource("initial");

  RumSegmentSource(String value) {
    super(value, allowedValues);
  }

  public static class RumSegmentSourceSerializer extends StdSerializer<RumSegmentSource> {
    public RumSegmentSourceSerializer(Class<RumSegmentSource> t) {
      super(t);
    }

    public RumSegmentSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(RumSegmentSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumSegmentSource fromValue(String value) {
    return new RumSegmentSource(value);
  }
}

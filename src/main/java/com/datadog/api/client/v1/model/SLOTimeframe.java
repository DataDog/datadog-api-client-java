/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/**
 * The SLO time window options. Note that "custom" is not a valid option for creating or updating
 * SLOs. It is only used when querying SLO history over custom timeframes.
 */
@JsonSerialize(using = SLOTimeframe.SLOTimeframeSerializer.class)
public class SLOTimeframe extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("7d", "30d", "90d", "custom"));

  public static final SLOTimeframe SEVEN_DAYS = new SLOTimeframe("7d");
  public static final SLOTimeframe THIRTY_DAYS = new SLOTimeframe("30d");
  public static final SLOTimeframe NINETY_DAYS = new SLOTimeframe("90d");
  public static final SLOTimeframe CUSTOM = new SLOTimeframe("custom");

  SLOTimeframe(String value) {
    super(value, allowedValues);
  }

  public static class SLOTimeframeSerializer extends StdSerializer<SLOTimeframe> {
    public SLOTimeframeSerializer(Class<SLOTimeframe> t) {
      super(t);
    }

    public SLOTimeframeSerializer() {
      this(null);
    }

    @Override
    public void serialize(SLOTimeframe value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SLOTimeframe fromValue(String value) {
    return new SLOTimeframe(value);
  }
}

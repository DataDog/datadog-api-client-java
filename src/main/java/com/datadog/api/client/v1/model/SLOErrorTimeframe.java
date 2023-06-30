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
 * The timeframe of the threshold associated with this error or "all" if all thresholds are
 * affected.
 */
@JsonSerialize(using = SLOErrorTimeframe.SLOErrorTimeframeSerializer.class)
public class SLOErrorTimeframe extends ModelEnum<String> {

  public static final SLOErrorTimeframe SEVEN_DAYS = new SLOErrorTimeframe("7d");
  public static final SLOErrorTimeframe THIRTY_DAYS = new SLOErrorTimeframe("30d");
  public static final SLOErrorTimeframe NINETY_DAYS = new SLOErrorTimeframe("90d");
  public static final SLOErrorTimeframe ALL = new SLOErrorTimeframe("all");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("7d", "30d", "90d", "all"));

  SLOErrorTimeframe(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class SLOErrorTimeframeSerializer extends StdSerializer<SLOErrorTimeframe> {
    public SLOErrorTimeframeSerializer(Class<SLOErrorTimeframe> t) {
      super(t);
    }

    public SLOErrorTimeframeSerializer() {
      this(null);
    }

    @Override
    public void serialize(SLOErrorTimeframe value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SLOErrorTimeframe fromValue(String value) {
    return new SLOErrorTimeframe(value);
  }
}

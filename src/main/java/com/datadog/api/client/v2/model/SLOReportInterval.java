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

/** The frequency at which report data is to be generated. */
@JsonSerialize(using = SLOReportInterval.SLOReportIntervalSerializer.class)
public class SLOReportInterval extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("weekly", "monthly"));

  public static final SLOReportInterval WEEKLY = new SLOReportInterval("weekly");
  public static final SLOReportInterval MONTHLY = new SLOReportInterval("monthly");

  SLOReportInterval(String value) {
    super(value, allowedValues);
  }

  public static class SLOReportIntervalSerializer extends StdSerializer<SLOReportInterval> {
    public SLOReportIntervalSerializer(Class<SLOReportInterval> t) {
      super(t);
    }

    public SLOReportIntervalSerializer() {
      this(null);
    }

    @Override
    public void serialize(SLOReportInterval value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SLOReportInterval fromValue(String value) {
    return new SLOReportInterval(value);
  }
}

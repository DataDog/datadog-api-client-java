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

/** JSON:API resource type for report schedules. */
@JsonSerialize(using = ReportScheduleType.ReportScheduleTypeSerializer.class)
public class ReportScheduleType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("schedule"));

  public static final ReportScheduleType SCHEDULE = new ReportScheduleType("schedule");

  ReportScheduleType(String value) {
    super(value, allowedValues);
  }

  public static class ReportScheduleTypeSerializer extends StdSerializer<ReportScheduleType> {
    public ReportScheduleTypeSerializer(Class<ReportScheduleType> t) {
      super(t);
    }

    public ReportScheduleTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(ReportScheduleType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ReportScheduleType fromValue(String value) {
    return new ReportScheduleType(value);
  }
}

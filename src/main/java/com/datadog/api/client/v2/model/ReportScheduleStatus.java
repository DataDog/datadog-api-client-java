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

/**
 * Whether the schedule is currently delivering reports (<code>active</code>) or paused (<code>
 * inactive</code>).
 */
@JsonSerialize(using = ReportScheduleStatus.ReportScheduleStatusSerializer.class)
public class ReportScheduleStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("active", "inactive"));

  public static final ReportScheduleStatus ACTIVE = new ReportScheduleStatus("active");
  public static final ReportScheduleStatus INACTIVE = new ReportScheduleStatus("inactive");

  ReportScheduleStatus(String value) {
    super(value, allowedValues);
  }

  public static class ReportScheduleStatusSerializer extends StdSerializer<ReportScheduleStatus> {
    public ReportScheduleStatusSerializer(Class<ReportScheduleStatus> t) {
      super(t);
    }

    public ReportScheduleStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ReportScheduleStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ReportScheduleStatus fromValue(String value) {
    return new ReportScheduleStatus(value);
  }
}

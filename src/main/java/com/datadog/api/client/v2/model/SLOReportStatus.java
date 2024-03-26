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

/** The status of the SLO report job. */
@JsonSerialize(using = SLOReportStatus.SLOReportStatusSerializer.class)
public class SLOReportStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("IN_PROGRESS", "COMPLETED", "COMPLETED_WITH_ERRORS", "FAILED", "UNKNOWN"));

  public static final SLOReportStatus IN_PROGRESS = new SLOReportStatus("IN_PROGRESS");
  public static final SLOReportStatus COMPLETED = new SLOReportStatus("COMPLETED");
  public static final SLOReportStatus COMPLETED_WITH_ERRORS =
      new SLOReportStatus("COMPLETED_WITH_ERRORS");
  public static final SLOReportStatus FAILED = new SLOReportStatus("FAILED");
  public static final SLOReportStatus UNKNOWN = new SLOReportStatus("UNKNOWN");

  SLOReportStatus(String value) {
    super(value, allowedValues);
  }

  public static class SLOReportStatusSerializer extends StdSerializer<SLOReportStatus> {
    public SLOReportStatusSerializer(Class<SLOReportStatus> t) {
      super(t);
    }

    public SLOReportStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(SLOReportStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SLOReportStatus fromValue(String value) {
    return new SLOReportStatus(value);
  }
}

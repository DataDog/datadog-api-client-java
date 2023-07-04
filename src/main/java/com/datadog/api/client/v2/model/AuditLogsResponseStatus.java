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

/** The status of the response. */
@JsonSerialize(using = AuditLogsResponseStatus.AuditLogsResponseStatusSerializer.class)
public class AuditLogsResponseStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("done", "timeout"));

  public static final AuditLogsResponseStatus DONE = new AuditLogsResponseStatus("done");
  public static final AuditLogsResponseStatus TIMEOUT = new AuditLogsResponseStatus("timeout");

  AuditLogsResponseStatus(String value) {
    super(value, allowedValues);
  }

  public static class AuditLogsResponseStatusSerializer
      extends StdSerializer<AuditLogsResponseStatus> {
    public AuditLogsResponseStatusSerializer(Class<AuditLogsResponseStatus> t) {
      super(t);
    }

    public AuditLogsResponseStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AuditLogsResponseStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AuditLogsResponseStatus fromValue(String value) {
    return new AuditLogsResponseStatus(value);
  }
}

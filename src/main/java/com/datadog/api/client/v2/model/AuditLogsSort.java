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

/** Sort parameters when querying events. */
@JsonSerialize(using = AuditLogsSort.AuditLogsSortSerializer.class)
public class AuditLogsSort extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("timestamp", "-timestamp"));

  public static final AuditLogsSort TIMESTAMP_ASCENDING = new AuditLogsSort("timestamp");
  public static final AuditLogsSort TIMESTAMP_DESCENDING = new AuditLogsSort("-timestamp");

  AuditLogsSort(String value) {
    super(value, allowedValues);
  }

  public static class AuditLogsSortSerializer extends StdSerializer<AuditLogsSort> {
    public AuditLogsSortSerializer(Class<AuditLogsSort> t) {
      super(t);
    }

    public AuditLogsSortSerializer() {
      this(null);
    }

    @Override
    public void serialize(AuditLogsSort value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AuditLogsSort fromValue(String value) {
    return new AuditLogsSort(value);
  }
}

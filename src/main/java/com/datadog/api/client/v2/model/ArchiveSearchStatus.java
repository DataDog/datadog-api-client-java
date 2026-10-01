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

/** Current state of an Archive Search. */
@JsonSerialize(using = ArchiveSearchStatus.ArchiveSearchStatusSerializer.class)
public class ArchiveSearchStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("RUNNING", "COMPLETED", "FAILED", "CANCELLED", "QUOTA_REACHED", "EXPIRED"));

  public static final ArchiveSearchStatus RUNNING = new ArchiveSearchStatus("RUNNING");
  public static final ArchiveSearchStatus COMPLETED = new ArchiveSearchStatus("COMPLETED");
  public static final ArchiveSearchStatus FAILED = new ArchiveSearchStatus("FAILED");
  public static final ArchiveSearchStatus CANCELLED = new ArchiveSearchStatus("CANCELLED");
  public static final ArchiveSearchStatus QUOTA_REACHED = new ArchiveSearchStatus("QUOTA_REACHED");
  public static final ArchiveSearchStatus EXPIRED = new ArchiveSearchStatus("EXPIRED");

  ArchiveSearchStatus(String value) {
    super(value, allowedValues);
  }

  public static class ArchiveSearchStatusSerializer extends StdSerializer<ArchiveSearchStatus> {
    public ArchiveSearchStatusSerializer(Class<ArchiveSearchStatus> t) {
      super(t);
    }

    public ArchiveSearchStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ArchiveSearchStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ArchiveSearchStatus fromValue(String value) {
    return new ArchiveSearchStatus(value);
  }
}

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

/** Batch discovery state. QUEUED indicates that the request is waiting for processing capacity. */
@JsonSerialize(using = RumRecoveryDiscoveryStatus.RumRecoveryDiscoveryStatusSerializer.class)
public class RumRecoveryDiscoveryStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "QUEUED",
              "PENDING",
              "SLICING",
              "DISCOVERED",
              "PROCESSING",
              "COMPLETED",
              "FAILED",
              "CANCELLED"));

  public static final RumRecoveryDiscoveryStatus QUEUED = new RumRecoveryDiscoveryStatus("QUEUED");
  public static final RumRecoveryDiscoveryStatus PENDING =
      new RumRecoveryDiscoveryStatus("PENDING");
  public static final RumRecoveryDiscoveryStatus SLICING =
      new RumRecoveryDiscoveryStatus("SLICING");
  public static final RumRecoveryDiscoveryStatus DISCOVERED =
      new RumRecoveryDiscoveryStatus("DISCOVERED");
  public static final RumRecoveryDiscoveryStatus PROCESSING =
      new RumRecoveryDiscoveryStatus("PROCESSING");
  public static final RumRecoveryDiscoveryStatus COMPLETED =
      new RumRecoveryDiscoveryStatus("COMPLETED");
  public static final RumRecoveryDiscoveryStatus FAILED = new RumRecoveryDiscoveryStatus("FAILED");
  public static final RumRecoveryDiscoveryStatus CANCELLED =
      new RumRecoveryDiscoveryStatus("CANCELLED");

  RumRecoveryDiscoveryStatus(String value) {
    super(value, allowedValues);
  }

  public static class RumRecoveryDiscoveryStatusSerializer
      extends StdSerializer<RumRecoveryDiscoveryStatus> {
    public RumRecoveryDiscoveryStatusSerializer(Class<RumRecoveryDiscoveryStatus> t) {
      super(t);
    }

    public RumRecoveryDiscoveryStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumRecoveryDiscoveryStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumRecoveryDiscoveryStatus fromValue(String value) {
    return new RumRecoveryDiscoveryStatus(value);
  }
}

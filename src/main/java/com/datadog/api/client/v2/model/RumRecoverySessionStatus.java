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
 * Session availability or recovery state. <code>RECOVERED</code> indicates that the session is
 * ready to query.
 */
@JsonSerialize(using = RumRecoverySessionStatus.RumRecoverySessionStatusSerializer.class)
public class RumRecoverySessionStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "AVAILABLE",
              "PENDING",
              "PROCESSING",
              "RECOVERED",
              "FAILED",
              "RETAINED",
              "EXPIRED",
              "CANCELLED"));

  public static final RumRecoverySessionStatus AVAILABLE =
      new RumRecoverySessionStatus("AVAILABLE");
  public static final RumRecoverySessionStatus PENDING = new RumRecoverySessionStatus("PENDING");
  public static final RumRecoverySessionStatus PROCESSING =
      new RumRecoverySessionStatus("PROCESSING");
  public static final RumRecoverySessionStatus RECOVERED =
      new RumRecoverySessionStatus("RECOVERED");
  public static final RumRecoverySessionStatus FAILED = new RumRecoverySessionStatus("FAILED");
  public static final RumRecoverySessionStatus RETAINED = new RumRecoverySessionStatus("RETAINED");
  public static final RumRecoverySessionStatus EXPIRED = new RumRecoverySessionStatus("EXPIRED");
  public static final RumRecoverySessionStatus CANCELLED =
      new RumRecoverySessionStatus("CANCELLED");

  RumRecoverySessionStatus(String value) {
    super(value, allowedValues);
  }

  public static class RumRecoverySessionStatusSerializer
      extends StdSerializer<RumRecoverySessionStatus> {
    public RumRecoverySessionStatusSerializer(Class<RumRecoverySessionStatus> t) {
      super(t);
    }

    public RumRecoverySessionStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumRecoverySessionStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumRecoverySessionStatus fromValue(String value) {
    return new RumRecoverySessionStatus(value);
  }
}

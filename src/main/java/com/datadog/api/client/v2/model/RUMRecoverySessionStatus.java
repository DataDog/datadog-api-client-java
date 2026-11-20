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
@JsonSerialize(using = RUMRecoverySessionStatus.RUMRecoverySessionStatusSerializer.class)
public class RUMRecoverySessionStatus extends ModelEnum<String> {

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

  public static final RUMRecoverySessionStatus AVAILABLE =
      new RUMRecoverySessionStatus("AVAILABLE");
  public static final RUMRecoverySessionStatus PENDING = new RUMRecoverySessionStatus("PENDING");
  public static final RUMRecoverySessionStatus PROCESSING =
      new RUMRecoverySessionStatus("PROCESSING");
  public static final RUMRecoverySessionStatus RECOVERED =
      new RUMRecoverySessionStatus("RECOVERED");
  public static final RUMRecoverySessionStatus FAILED = new RUMRecoverySessionStatus("FAILED");
  public static final RUMRecoverySessionStatus RETAINED = new RUMRecoverySessionStatus("RETAINED");
  public static final RUMRecoverySessionStatus EXPIRED = new RUMRecoverySessionStatus("EXPIRED");
  public static final RUMRecoverySessionStatus CANCELLED =
      new RUMRecoverySessionStatus("CANCELLED");

  RUMRecoverySessionStatus(String value) {
    super(value, allowedValues);
  }

  public static class RUMRecoverySessionStatusSerializer
      extends StdSerializer<RUMRecoverySessionStatus> {
    public RUMRecoverySessionStatusSerializer(Class<RUMRecoverySessionStatus> t) {
      super(t);
    }

    public RUMRecoverySessionStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMRecoverySessionStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMRecoverySessionStatus fromValue(String value) {
    return new RUMRecoverySessionStatus(value);
  }
}

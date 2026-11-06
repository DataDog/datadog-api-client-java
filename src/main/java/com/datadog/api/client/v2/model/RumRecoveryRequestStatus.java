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

/** Recovery request state. */
@JsonSerialize(using = RumRecoveryRequestStatus.RumRecoveryRequestStatusSerializer.class)
public class RumRecoveryRequestStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("PENDING", "PROCESSING", "COMPLETED", "FAILED", "CANCELLED", "EXPIRED"));

  public static final RumRecoveryRequestStatus PENDING = new RumRecoveryRequestStatus("PENDING");
  public static final RumRecoveryRequestStatus PROCESSING =
      new RumRecoveryRequestStatus("PROCESSING");
  public static final RumRecoveryRequestStatus COMPLETED =
      new RumRecoveryRequestStatus("COMPLETED");
  public static final RumRecoveryRequestStatus FAILED = new RumRecoveryRequestStatus("FAILED");
  public static final RumRecoveryRequestStatus CANCELLED =
      new RumRecoveryRequestStatus("CANCELLED");
  public static final RumRecoveryRequestStatus EXPIRED = new RumRecoveryRequestStatus("EXPIRED");

  RumRecoveryRequestStatus(String value) {
    super(value, allowedValues);
  }

  public static class RumRecoveryRequestStatusSerializer
      extends StdSerializer<RumRecoveryRequestStatus> {
    public RumRecoveryRequestStatusSerializer(Class<RumRecoveryRequestStatus> t) {
      super(t);
    }

    public RumRecoveryRequestStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumRecoveryRequestStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumRecoveryRequestStatus fromValue(String value) {
    return new RumRecoveryRequestStatus(value);
  }
}

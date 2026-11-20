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
@JsonSerialize(using = RUMRecoveryRequestStatus.RUMRecoveryRequestStatusSerializer.class)
public class RUMRecoveryRequestStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("PENDING", "PROCESSING", "COMPLETED", "FAILED", "CANCELLED", "EXPIRED"));

  public static final RUMRecoveryRequestStatus PENDING = new RUMRecoveryRequestStatus("PENDING");
  public static final RUMRecoveryRequestStatus PROCESSING =
      new RUMRecoveryRequestStatus("PROCESSING");
  public static final RUMRecoveryRequestStatus COMPLETED =
      new RUMRecoveryRequestStatus("COMPLETED");
  public static final RUMRecoveryRequestStatus FAILED = new RUMRecoveryRequestStatus("FAILED");
  public static final RUMRecoveryRequestStatus CANCELLED =
      new RUMRecoveryRequestStatus("CANCELLED");
  public static final RUMRecoveryRequestStatus EXPIRED = new RUMRecoveryRequestStatus("EXPIRED");

  RUMRecoveryRequestStatus(String value) {
    super(value, allowedValues);
  }

  public static class RUMRecoveryRequestStatusSerializer
      extends StdSerializer<RUMRecoveryRequestStatus> {
    public RUMRecoveryRequestStatusSerializer(Class<RUMRecoveryRequestStatus> t) {
      super(t);
    }

    public RUMRecoveryRequestStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMRecoveryRequestStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMRecoveryRequestStatus fromValue(String value) {
    return new RUMRecoveryRequestStatus(value);
  }
}

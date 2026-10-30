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

/** The durable request decision, independent of whether its grant is still active. */
@JsonSerialize(using = TemporaryGrantRequestStatus.TemporaryGrantRequestStatusSerializer.class)
public class TemporaryGrantRequestStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("pending", "approved", "denied", "cancelled"));

  public static final TemporaryGrantRequestStatus PENDING =
      new TemporaryGrantRequestStatus("pending");
  public static final TemporaryGrantRequestStatus APPROVED =
      new TemporaryGrantRequestStatus("approved");
  public static final TemporaryGrantRequestStatus DENIED =
      new TemporaryGrantRequestStatus("denied");
  public static final TemporaryGrantRequestStatus CANCELLED =
      new TemporaryGrantRequestStatus("cancelled");

  TemporaryGrantRequestStatus(String value) {
    super(value, allowedValues);
  }

  public static class TemporaryGrantRequestStatusSerializer
      extends StdSerializer<TemporaryGrantRequestStatus> {
    public TemporaryGrantRequestStatusSerializer(Class<TemporaryGrantRequestStatus> t) {
      super(t);
    }

    public TemporaryGrantRequestStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TemporaryGrantRequestStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TemporaryGrantRequestStatus fromValue(String value) {
    return new TemporaryGrantRequestStatus(value);
  }
}

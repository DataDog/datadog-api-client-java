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
 * The status of a RUM operation strong link. Can only be set to <code>CONFIRMED</code> or <code>
 * REJECTED</code>.
 */
@JsonSerialize(
    using = RUMOperationStrongLinkUpdateStatus.RUMOperationStrongLinkUpdateStatusSerializer.class)
public class RUMOperationStrongLinkUpdateStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("CONFIRMED", "REJECTED"));

  public static final RUMOperationStrongLinkUpdateStatus CONFIRMED =
      new RUMOperationStrongLinkUpdateStatus("CONFIRMED");
  public static final RUMOperationStrongLinkUpdateStatus REJECTED =
      new RUMOperationStrongLinkUpdateStatus("REJECTED");

  RUMOperationStrongLinkUpdateStatus(String value) {
    super(value, allowedValues);
  }

  public static class RUMOperationStrongLinkUpdateStatusSerializer
      extends StdSerializer<RUMOperationStrongLinkUpdateStatus> {
    public RUMOperationStrongLinkUpdateStatusSerializer(
        Class<RUMOperationStrongLinkUpdateStatus> t) {
      super(t);
    }

    public RUMOperationStrongLinkUpdateStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMOperationStrongLinkUpdateStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMOperationStrongLinkUpdateStatus fromValue(String value) {
    return new RUMOperationStrongLinkUpdateStatus(value);
  }
}

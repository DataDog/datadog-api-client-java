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

/** The status of a RUM operation strong link. */
@JsonSerialize(using = RUMOperationStrongLinkStatus.RUMOperationStrongLinkStatusSerializer.class)
public class RUMOperationStrongLinkStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("DRAFT", "CONFIRMED", "REJECTED"));

  public static final RUMOperationStrongLinkStatus DRAFT =
      new RUMOperationStrongLinkStatus("DRAFT");
  public static final RUMOperationStrongLinkStatus CONFIRMED =
      new RUMOperationStrongLinkStatus("CONFIRMED");
  public static final RUMOperationStrongLinkStatus REJECTED =
      new RUMOperationStrongLinkStatus("REJECTED");

  RUMOperationStrongLinkStatus(String value) {
    super(value, allowedValues);
  }

  public static class RUMOperationStrongLinkStatusSerializer
      extends StdSerializer<RUMOperationStrongLinkStatus> {
    public RUMOperationStrongLinkStatusSerializer(Class<RUMOperationStrongLinkStatus> t) {
      super(t);
    }

    public RUMOperationStrongLinkStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMOperationStrongLinkStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMOperationStrongLinkStatus fromValue(String value) {
    return new RUMOperationStrongLinkStatus(value);
  }
}

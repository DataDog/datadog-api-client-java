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

/** JSON:API resource type. */
@JsonSerialize(using = RumRecoveryBatchListDataType.RumRecoveryBatchListDataTypeSerializer.class)
public class RumRecoveryBatchListDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("rum_batch_recovery_request"));

  public static final RumRecoveryBatchListDataType RUM_BATCH_RECOVERY_REQUEST =
      new RumRecoveryBatchListDataType("rum_batch_recovery_request");

  RumRecoveryBatchListDataType(String value) {
    super(value, allowedValues);
  }

  public static class RumRecoveryBatchListDataTypeSerializer
      extends StdSerializer<RumRecoveryBatchListDataType> {
    public RumRecoveryBatchListDataTypeSerializer(Class<RumRecoveryBatchListDataType> t) {
      super(t);
    }

    public RumRecoveryBatchListDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumRecoveryBatchListDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumRecoveryBatchListDataType fromValue(String value) {
    return new RumRecoveryBatchListDataType(value);
  }
}

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

/** Type of the cost anomalies collection resource. Must be <code>anomalies</code>. */
@JsonSerialize(using = CostAnomaliesResponseDataType.CostAnomaliesResponseDataTypeSerializer.class)
public class CostAnomaliesResponseDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("anomalies"));

  public static final CostAnomaliesResponseDataType ANOMALIES =
      new CostAnomaliesResponseDataType("anomalies");

  CostAnomaliesResponseDataType(String value) {
    super(value, allowedValues);
  }

  public static class CostAnomaliesResponseDataTypeSerializer
      extends StdSerializer<CostAnomaliesResponseDataType> {
    public CostAnomaliesResponseDataTypeSerializer(Class<CostAnomaliesResponseDataType> t) {
      super(t);
    }

    public CostAnomaliesResponseDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CostAnomaliesResponseDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CostAnomaliesResponseDataType fromValue(String value) {
    return new CostAnomaliesResponseDataType(value);
  }
}

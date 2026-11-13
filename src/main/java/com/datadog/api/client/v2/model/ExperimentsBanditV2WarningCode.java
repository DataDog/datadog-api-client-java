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
 * Code that identifies the warning. <code>datadog_flag_configuration_omitted</code> means the
 * caller lacks feature flag or environment read permissions, so the response leaves out <code>
 * datadog_flag_configuration</code>.
 */
@JsonSerialize(
    using = ExperimentsBanditV2WarningCode.ExperimentsBanditV2WarningCodeSerializer.class)
public class ExperimentsBanditV2WarningCode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("datadog_flag_configuration_omitted"));

  public static final ExperimentsBanditV2WarningCode DATADOG_FLAG_CONFIGURATION_OMITTED =
      new ExperimentsBanditV2WarningCode("datadog_flag_configuration_omitted");

  ExperimentsBanditV2WarningCode(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsBanditV2WarningCodeSerializer
      extends StdSerializer<ExperimentsBanditV2WarningCode> {
    public ExperimentsBanditV2WarningCodeSerializer(Class<ExperimentsBanditV2WarningCode> t) {
      super(t);
    }

    public ExperimentsBanditV2WarningCodeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsBanditV2WarningCode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsBanditV2WarningCode fromValue(String value) {
    return new ExperimentsBanditV2WarningCode(value);
  }
}

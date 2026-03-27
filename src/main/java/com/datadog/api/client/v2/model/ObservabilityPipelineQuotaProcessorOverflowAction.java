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
 * The action to take when the quota or bucket limit is exceeded. Options: - <code>drop</code>: Drop
 * the event. - <code>no_action</code>: Let the event pass through. - <code>overflow_routing</code>:
 * Route to an overflow destination.
 */
@JsonSerialize(
    using =
        ObservabilityPipelineQuotaProcessorOverflowAction
            .ObservabilityPipelineQuotaProcessorOverflowActionSerializer.class)
public class ObservabilityPipelineQuotaProcessorOverflowAction extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("drop", "no_action", "overflow_routing"));

  public static final ObservabilityPipelineQuotaProcessorOverflowAction DROP =
      new ObservabilityPipelineQuotaProcessorOverflowAction("drop");
  public static final ObservabilityPipelineQuotaProcessorOverflowAction NO_ACTION =
      new ObservabilityPipelineQuotaProcessorOverflowAction("no_action");
  public static final ObservabilityPipelineQuotaProcessorOverflowAction OVERFLOW_ROUTING =
      new ObservabilityPipelineQuotaProcessorOverflowAction("overflow_routing");

  ObservabilityPipelineQuotaProcessorOverflowAction(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineQuotaProcessorOverflowActionSerializer
      extends StdSerializer<ObservabilityPipelineQuotaProcessorOverflowAction> {
    public ObservabilityPipelineQuotaProcessorOverflowActionSerializer(
        Class<ObservabilityPipelineQuotaProcessorOverflowAction> t) {
      super(t);
    }

    public ObservabilityPipelineQuotaProcessorOverflowActionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineQuotaProcessorOverflowAction value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineQuotaProcessorOverflowAction fromValue(String value) {
    return new ObservabilityPipelineQuotaProcessorOverflowAction(value);
  }
}

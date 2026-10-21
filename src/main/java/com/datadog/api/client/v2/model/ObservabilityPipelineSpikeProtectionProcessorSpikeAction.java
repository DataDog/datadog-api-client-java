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
 * The action to take with matching logs while spike protection is active. Options: - <code>drop
 * </code>: Drop the event. - <code>no_action</code>: Let the event pass through. - <code>
 * overflow_routing</code>: Route to an overflow destination.
 *
 * <p>When <code>overflow_routing</code> is used, there must be a destination whose <code>inputs
 * </code> reference this processor with the <code>&lt;processor-id&gt;.overflow_events</code>
 * suffix to route the overflowing events.
 */
@JsonSerialize(
    using =
        ObservabilityPipelineSpikeProtectionProcessorSpikeAction
            .ObservabilityPipelineSpikeProtectionProcessorSpikeActionSerializer.class)
public class ObservabilityPipelineSpikeProtectionProcessorSpikeAction extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("drop", "no_action", "overflow_routing"));

  public static final ObservabilityPipelineSpikeProtectionProcessorSpikeAction DROP =
      new ObservabilityPipelineSpikeProtectionProcessorSpikeAction("drop");
  public static final ObservabilityPipelineSpikeProtectionProcessorSpikeAction NO_ACTION =
      new ObservabilityPipelineSpikeProtectionProcessorSpikeAction("no_action");
  public static final ObservabilityPipelineSpikeProtectionProcessorSpikeAction OVERFLOW_ROUTING =
      new ObservabilityPipelineSpikeProtectionProcessorSpikeAction("overflow_routing");

  ObservabilityPipelineSpikeProtectionProcessorSpikeAction(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineSpikeProtectionProcessorSpikeActionSerializer
      extends StdSerializer<ObservabilityPipelineSpikeProtectionProcessorSpikeAction> {
    public ObservabilityPipelineSpikeProtectionProcessorSpikeActionSerializer(
        Class<ObservabilityPipelineSpikeProtectionProcessorSpikeAction> t) {
      super(t);
    }

    public ObservabilityPipelineSpikeProtectionProcessorSpikeActionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSpikeProtectionProcessorSpikeAction value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineSpikeProtectionProcessorSpikeAction fromValue(String value) {
    return new ObservabilityPipelineSpikeProtectionProcessorSpikeAction(value);
  }
}

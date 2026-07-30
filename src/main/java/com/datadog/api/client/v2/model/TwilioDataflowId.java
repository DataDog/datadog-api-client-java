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

/** Identifier of a Twilio dataflow. */
@JsonSerialize(using = TwilioDataflowId.TwilioDataflowIdSerializer.class)
public class TwilioDataflowId extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "twilio-cloud-cost-metrics",
              "twilio-events-logs",
              "twilio-messages-logs",
              "twilio-alerts-logs",
              "twilio-call-summaries-logs"));

  public static final TwilioDataflowId CLOUD_COST_METRICS =
      new TwilioDataflowId("twilio-cloud-cost-metrics");
  public static final TwilioDataflowId EVENTS_LOGS = new TwilioDataflowId("twilio-events-logs");
  public static final TwilioDataflowId MESSAGES_LOGS = new TwilioDataflowId("twilio-messages-logs");
  public static final TwilioDataflowId ALERTS_LOGS = new TwilioDataflowId("twilio-alerts-logs");
  public static final TwilioDataflowId CALL_SUMMARIES_LOGS =
      new TwilioDataflowId("twilio-call-summaries-logs");

  TwilioDataflowId(String value) {
    super(value, allowedValues);
  }

  public static class TwilioDataflowIdSerializer extends StdSerializer<TwilioDataflowId> {
    public TwilioDataflowIdSerializer(Class<TwilioDataflowId> t) {
      super(t);
    }

    public TwilioDataflowIdSerializer() {
      this(null);
    }

    @Override
    public void serialize(TwilioDataflowId value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TwilioDataflowId fromValue(String value) {
    return new TwilioDataflowId(value);
  }
}

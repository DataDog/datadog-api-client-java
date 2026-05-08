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

/** RUM replay summary request resource type. */
@JsonSerialize(using = ReplaySummaryRequestType.ReplaySummaryRequestTypeSerializer.class)
public class ReplaySummaryRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("replay_summary_request"));

  public static final ReplaySummaryRequestType REPLAY_SUMMARY_REQUEST =
      new ReplaySummaryRequestType("replay_summary_request");

  ReplaySummaryRequestType(String value) {
    super(value, allowedValues);
  }

  public static class ReplaySummaryRequestTypeSerializer
      extends StdSerializer<ReplaySummaryRequestType> {
    public ReplaySummaryRequestTypeSerializer(Class<ReplaySummaryRequestType> t) {
      super(t);
    }

    public ReplaySummaryRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ReplaySummaryRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ReplaySummaryRequestType fromValue(String value) {
    return new ReplaySummaryRequestType(value);
  }
}

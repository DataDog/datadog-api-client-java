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

/** The status of an inferred DEM journey. */
@JsonSerialize(using = DemInferredJourneyStatus.DemInferredJourneyStatusSerializer.class)
public class DemInferredJourneyStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("candidate", "ignored"));

  public static final DemInferredJourneyStatus CANDIDATE =
      new DemInferredJourneyStatus("candidate");
  public static final DemInferredJourneyStatus IGNORED = new DemInferredJourneyStatus("ignored");

  DemInferredJourneyStatus(String value) {
    super(value, allowedValues);
  }

  public static class DemInferredJourneyStatusSerializer
      extends StdSerializer<DemInferredJourneyStatus> {
    public DemInferredJourneyStatusSerializer(Class<DemInferredJourneyStatus> t) {
      super(t);
    }

    public DemInferredJourneyStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DemInferredJourneyStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DemInferredJourneyStatus fromValue(String value) {
    return new DemInferredJourneyStatus(value);
  }
}

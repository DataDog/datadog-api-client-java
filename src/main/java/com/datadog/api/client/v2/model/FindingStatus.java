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

/** The status of the finding. */
@JsonSerialize(using = FindingStatus.FindingStatusSerializer.class)
public class FindingStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("critical", "high", "medium", "low", "info"));

  public static final FindingStatus CRITICAL = new FindingStatus("critical");
  public static final FindingStatus HIGH = new FindingStatus("high");
  public static final FindingStatus MEDIUM = new FindingStatus("medium");
  public static final FindingStatus LOW = new FindingStatus("low");
  public static final FindingStatus INFO = new FindingStatus("info");

  FindingStatus(String value) {
    super(value, allowedValues);
  }

  public static class FindingStatusSerializer extends StdSerializer<FindingStatus> {
    public FindingStatusSerializer(Class<FindingStatus> t) {
      super(t);
    }

    public FindingStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(FindingStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FindingStatus fromValue(String value) {
    return new FindingStatus(value);
  }
}

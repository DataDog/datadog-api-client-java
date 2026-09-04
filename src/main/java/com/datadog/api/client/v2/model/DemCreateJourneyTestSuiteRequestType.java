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

/** The resource type for a request to create a DEM journey test suite. */
@JsonSerialize(
    using =
        DemCreateJourneyTestSuiteRequestType.DemCreateJourneyTestSuiteRequestTypeSerializer.class)
public class DemCreateJourneyTestSuiteRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("create_test_suite_for_journey_request"));

  public static final DemCreateJourneyTestSuiteRequestType CREATE_TEST_SUITE_FOR_JOURNEY_REQUEST =
      new DemCreateJourneyTestSuiteRequestType("create_test_suite_for_journey_request");

  DemCreateJourneyTestSuiteRequestType(String value) {
    super(value, allowedValues);
  }

  public static class DemCreateJourneyTestSuiteRequestTypeSerializer
      extends StdSerializer<DemCreateJourneyTestSuiteRequestType> {
    public DemCreateJourneyTestSuiteRequestTypeSerializer(
        Class<DemCreateJourneyTestSuiteRequestType> t) {
      super(t);
    }

    public DemCreateJourneyTestSuiteRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DemCreateJourneyTestSuiteRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DemCreateJourneyTestSuiteRequestType fromValue(String value) {
    return new DemCreateJourneyTestSuiteRequestType(value);
  }
}

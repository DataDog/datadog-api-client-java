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

/** The resource type for a request to retrieve DEM journeys by test suite IDs. */
@JsonSerialize(
    using = DemBatchGetJourneysRequestType.DemBatchGetJourneysRequestTypeSerializer.class)
public class DemBatchGetJourneysRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("batch_get_journeys_by_test_suite_ids_request"));

  public static final DemBatchGetJourneysRequestType BATCH_GET_JOURNEYS_BY_TEST_SUITE_IDS_REQUEST =
      new DemBatchGetJourneysRequestType("batch_get_journeys_by_test_suite_ids_request");

  DemBatchGetJourneysRequestType(String value) {
    super(value, allowedValues);
  }

  public static class DemBatchGetJourneysRequestTypeSerializer
      extends StdSerializer<DemBatchGetJourneysRequestType> {
    public DemBatchGetJourneysRequestTypeSerializer(Class<DemBatchGetJourneysRequestType> t) {
      super(t);
    }

    public DemBatchGetJourneysRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DemBatchGetJourneysRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DemBatchGetJourneysRequestType fromValue(String value) {
    return new DemBatchGetJourneysRequestType(value);
  }
}

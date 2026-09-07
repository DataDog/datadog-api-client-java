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

/** The type of resource targeted by a dataset report schedule. */
@JsonSerialize(
    using = DatasetReportScheduleResourceType.DatasetReportScheduleResourceTypeSerializer.class)
public class DatasetReportScheduleResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("widget_dataset_list"));

  public static final DatasetReportScheduleResourceType WIDGET_DATASET_LIST =
      new DatasetReportScheduleResourceType("widget_dataset_list");

  DatasetReportScheduleResourceType(String value) {
    super(value, allowedValues);
  }

  public static class DatasetReportScheduleResourceTypeSerializer
      extends StdSerializer<DatasetReportScheduleResourceType> {
    public DatasetReportScheduleResourceTypeSerializer(Class<DatasetReportScheduleResourceType> t) {
      super(t);
    }

    public DatasetReportScheduleResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DatasetReportScheduleResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DatasetReportScheduleResourceType fromValue(String value) {
    return new DatasetReportScheduleResourceType(value);
  }
}

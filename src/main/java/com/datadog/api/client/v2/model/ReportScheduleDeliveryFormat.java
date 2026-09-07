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
 * How a PDF-export report is delivered. <code>pdf</code> attaches a PDF file, <code>png</code>
 * embeds an inline PNG image, and <code>pdf_and_png</code> delivers both.
 */
@JsonSerialize(using = ReportScheduleDeliveryFormat.ReportScheduleDeliveryFormatSerializer.class)
public class ReportScheduleDeliveryFormat extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("pdf", "png", "pdf_and_png"));

  public static final ReportScheduleDeliveryFormat PDF = new ReportScheduleDeliveryFormat("pdf");
  public static final ReportScheduleDeliveryFormat PNG = new ReportScheduleDeliveryFormat("png");
  public static final ReportScheduleDeliveryFormat PDF_AND_PNG =
      new ReportScheduleDeliveryFormat("pdf_and_png");

  ReportScheduleDeliveryFormat(String value) {
    super(value, allowedValues);
  }

  public static class ReportScheduleDeliveryFormatSerializer
      extends StdSerializer<ReportScheduleDeliveryFormat> {
    public ReportScheduleDeliveryFormatSerializer(Class<ReportScheduleDeliveryFormat> t) {
      super(t);
    }

    public ReportScheduleDeliveryFormatSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ReportScheduleDeliveryFormat value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ReportScheduleDeliveryFormat fromValue(String value) {
    return new ReportScheduleDeliveryFormat(value);
  }
}

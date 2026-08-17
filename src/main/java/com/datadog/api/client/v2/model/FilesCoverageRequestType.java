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
 * JSON:API type for files coverage request. The value must always be <code>
 * ci_app_coverage_files_request</code>.
 */
@JsonSerialize(using = FilesCoverageRequestType.FilesCoverageRequestTypeSerializer.class)
public class FilesCoverageRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ci_app_coverage_files_request"));

  public static final FilesCoverageRequestType CI_APP_COVERAGE_FILES_REQUEST =
      new FilesCoverageRequestType("ci_app_coverage_files_request");

  FilesCoverageRequestType(String value) {
    super(value, allowedValues);
  }

  public static class FilesCoverageRequestTypeSerializer
      extends StdSerializer<FilesCoverageRequestType> {
    public FilesCoverageRequestTypeSerializer(Class<FilesCoverageRequestType> t) {
      super(t);
    }

    public FilesCoverageRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FilesCoverageRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FilesCoverageRequestType fromValue(String value) {
    return new FilesCoverageRequestType(value);
  }
}

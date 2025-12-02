/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.AbstractOpenApiSchema;
import com.datadog.api.client.JSON;
import com.datadog.api.client.UnparsedObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import jakarta.ws.rs.core.GenericType;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
@JsonDeserialize(
    using =
        CreateJiraIssueRequestArrayIncluded.CreateJiraIssueRequestArrayIncludedDeserializer.class)
@JsonSerialize(
    using = CreateJiraIssueRequestArrayIncluded.CreateJiraIssueRequestArrayIncludedSerializer.class)
public class CreateJiraIssueRequestArrayIncluded extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(CreateJiraIssueRequestArrayIncluded.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class CreateJiraIssueRequestArrayIncludedSerializer
      extends StdSerializer<CreateJiraIssueRequestArrayIncluded> {
    public CreateJiraIssueRequestArrayIncludedSerializer(
        Class<CreateJiraIssueRequestArrayIncluded> t) {
      super(t);
    }

    public CreateJiraIssueRequestArrayIncludedSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CreateJiraIssueRequestArrayIncluded value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class CreateJiraIssueRequestArrayIncludedDeserializer
      extends StdDeserializer<CreateJiraIssueRequestArrayIncluded> {
    public CreateJiraIssueRequestArrayIncludedDeserializer() {
      this(CreateJiraIssueRequestArrayIncluded.class);
    }

    public CreateJiraIssueRequestArrayIncludedDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public CreateJiraIssueRequestArrayIncluded deserialize(
        JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize CreateCaseRequestData
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CreateCaseRequestData.class.equals(Integer.class)
            || CreateCaseRequestData.class.equals(Long.class)
            || CreateCaseRequestData.class.equals(Float.class)
            || CreateCaseRequestData.class.equals(Double.class)
            || CreateCaseRequestData.class.equals(Boolean.class)
            || CreateCaseRequestData.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CreateCaseRequestData.class.equals(Integer.class)
                        || CreateCaseRequestData.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CreateCaseRequestData.class.equals(Float.class)
                        || CreateCaseRequestData.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CreateCaseRequestData.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CreateCaseRequestData.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CreateCaseRequestData.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CreateCaseRequestData) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CreateCaseRequestData'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CreateCaseRequestData'", e);
      }

      // deserialize CaseManagementProjectData
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CaseManagementProjectData.class.equals(Integer.class)
            || CaseManagementProjectData.class.equals(Long.class)
            || CaseManagementProjectData.class.equals(Float.class)
            || CaseManagementProjectData.class.equals(Double.class)
            || CaseManagementProjectData.class.equals(Boolean.class)
            || CaseManagementProjectData.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CaseManagementProjectData.class.equals(Integer.class)
                        || CaseManagementProjectData.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CaseManagementProjectData.class.equals(Float.class)
                        || CaseManagementProjectData.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CaseManagementProjectData.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CaseManagementProjectData.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CaseManagementProjectData.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CaseManagementProjectData) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CaseManagementProjectData'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CaseManagementProjectData'", e);
      }

      // deserialize FindingData
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (FindingData.class.equals(Integer.class)
            || FindingData.class.equals(Long.class)
            || FindingData.class.equals(Float.class)
            || FindingData.class.equals(Double.class)
            || FindingData.class.equals(Boolean.class)
            || FindingData.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((FindingData.class.equals(Integer.class) || FindingData.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((FindingData.class.equals(Float.class) || FindingData.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (FindingData.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (FindingData.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(FindingData.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((FindingData) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'FindingData'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'FindingData'", e);
      }

      CreateJiraIssueRequestArrayIncluded ret = new CreateJiraIssueRequestArrayIncluded();
      if (match == 1) {
        ret.setActualInstance(deserialized);
      } else {
        Map<String, Object> res =
            new ObjectMapper()
                .readValue(
                    tree.traverse(jp.getCodec()).readValueAsTree().toString(),
                    new TypeReference<Map<String, Object>>() {});
        ret.setActualInstance(new UnparsedObject(res));
      }
      return ret;
    }

    /** Handle deserialization of the 'null' value. */
    @Override
    public CreateJiraIssueRequestArrayIncluded getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(
          ctxt.getParser(), "CreateJiraIssueRequestArrayIncluded cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public CreateJiraIssueRequestArrayIncluded() {
    super("oneOf", Boolean.FALSE);
  }

  public CreateJiraIssueRequestArrayIncluded(CreateCaseRequestData o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CreateJiraIssueRequestArrayIncluded(CaseManagementProjectData o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public CreateJiraIssueRequestArrayIncluded(FindingData o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("CreateCaseRequestData", new GenericType<CreateCaseRequestData>() {});
    schemas.put("CaseManagementProjectData", new GenericType<CaseManagementProjectData>() {});
    schemas.put("FindingData", new GenericType<FindingData>() {});
    JSON.registerDescendants(
        CreateJiraIssueRequestArrayIncluded.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return CreateJiraIssueRequestArrayIncluded.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: CreateCaseRequestData, CaseManagementProjectData, FindingData
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(CreateCaseRequestData.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(CaseManagementProjectData.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(FindingData.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be CreateCaseRequestData, CaseManagementProjectData,"
            + " FindingData");
  }

  /**
   * Get the actual instance, which can be the following: CreateCaseRequestData,
   * CaseManagementProjectData, FindingData
   *
   * @return The actual instance (CreateCaseRequestData, CaseManagementProjectData, FindingData)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `CreateCaseRequestData`. If the actual instance is not
   * `CreateCaseRequestData`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CreateCaseRequestData`
   * @throws ClassCastException if the instance is not `CreateCaseRequestData`
   */
  public CreateCaseRequestData getCreateCaseRequestData() throws ClassCastException {
    return (CreateCaseRequestData) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CaseManagementProjectData`. If the actual instance is not
   * `CaseManagementProjectData`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CaseManagementProjectData`
   * @throws ClassCastException if the instance is not `CaseManagementProjectData`
   */
  public CaseManagementProjectData getCaseManagementProjectData() throws ClassCastException {
    return (CaseManagementProjectData) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FindingData`. If the actual instance is not `FindingData`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `FindingData`
   * @throws ClassCastException if the instance is not `FindingData`
   */
  public FindingData getFindingData() throws ClassCastException {
    return (FindingData) super.getActualInstance();
  }
}

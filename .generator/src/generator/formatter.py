"""Data formatter."""
from functools import singledispatch
import re
import warnings

from . import openapi

KEYWORDS = {
    "abstract",
    "assert",
    "boolean",
    "break",
    "byte",
    "case",
    "catch",
    "char",
    "class",
    "const",
    "continue",
    "default",
    "double",
    "do",
    "else",
    "enum",
    "extends",
    "false",
    "final",
    "finally",
    "float",
    "for",
    "goto",
    "if",
    "implements",
    "import",
    "instanceof",
    "int",
    "interface",
    "long",
    "native",
    "new",
    "null",
    "package",
    "private",
    "protected",
    "public",
    "return",
    "short",
    "static",
    "strictfp",
    "super",
    "switch",
    "synchronized",
    "this",
    "throw",
    "throws",
    "transient",
    "true",
    "try",
    "void",
    "volatile",
    "while",
}


HTML_ESCAPE_CHARACTERS = {
    "&": "&amp;",
    "'": "&#39;",
    ">": "&gt;",
    "<": "&lt;",
    '"': "&quot;",
    "`": "&#x60;",
    "=": "&#x3D;",
    "\\": "\\\\",
}


PATTERN_DOUBLE_UNDERSCORE = re.compile(r"__+")
PATTERN_LEADING_ALPHA = re.compile(r"(.)([A-Z][a-z0-9]+)")
PATTERN_FOLLOWING_ALPHA = re.compile(r"([a-z0-9])([A-Z])")
PATTERN_WHITESPACE = re.compile(r"\W")


# TODO: revisit this and find permanent solution
# Edge cases to maintain backward compatibility with Openapi generator
SNAKE_CASE_EDGE_CASES = {
    "CN": "C_N",
    "OU": "O_U",
    "ST": "S_T",
    "C": "C",
    "O": "O",
    "L": "L",
    "logs_indexed_3day_sum": "logs_indexed3day_sum",
    "logs_indexed_7day_sum": "logs_indexed7day_sum",
    "logs_indexed_15day_sum": "logs_indexed15day_sum",
    "logs_indexed_30day_sum": "logs_indexed30day_sum",
    "logs_indexed_45day_sum": "logs_indexed45day_sum",
    "logs_indexed_60day_sum": "logs_indexed60day_sum",
    "logs_indexed_90day_sum": "logs_indexed90day_sum",
    "logs_indexed_180day_sum": "logs_indexed180day_sum",
}


def snake_case(value):
    if value in SNAKE_CASE_EDGE_CASES:
        return SNAKE_CASE_EDGE_CASES[value]

    s1 = PATTERN_LEADING_ALPHA.sub(r"\1_\2", value)
    s1 = PATTERN_FOLLOWING_ALPHA.sub(r"\1_\2", s1).lower()
    s1 = PATTERN_WHITESPACE.sub("_", s1)
    s1 = s1.rstrip("_")
    return PATTERN_DOUBLE_UNDERSCORE.sub("_", s1)


def camel_case(value):
    return "".join(upperfirst(x) if idx != 0 else x for idx, x in enumerate(snake_case(value).split("_")))


def untitle_case(value):
    return value[0].lower() + value[1:]


def upperfirst(value):
    return value[0].upper() + value[1:]


def schema_name(schema):
    if not schema:
        return None

    if hasattr(schema, "__reference__"):
        return schema.__reference__["$ref"].split("/")[-1]


def escape_reserved_keyword(word):
    """
    Escape reserved language keywords like openapi generator does it
    :param word: Word to escape
    :return: The escaped word if it was a reserved keyword, the word unchanged otherwise
    """
    if word in KEYWORDS:
        return f"_{word}"
    return word


def attribute_name(attribute):
    return escape_reserved_keyword(upperfirst(snake_case(attribute)))


def variable_name(attribute):
    return escape_reserved_keyword((camel_case(attribute)))


def format_value(value, quotes='"', schema=None, default_value=False, type_=None):
    if schema:
        if "enum" in schema and default_value:
            index = schema["enum"].index(value)
            enum_varnames = schema["x-enum-varnames"][index]
            name = schema_name(schema)
            return f"{name}.{enum_varnames}"
        if "oneOf" in schema and default_value:
            if isinstance(value, bool):
                value = "true" if value else "false"
            if type_:
                return f"new {type_}({value})"
        if schema.get("type") == "integer":
            if schema.get("format") == "int64":
                return f"{value}l"
        if schema.get("type") == "string":
            return f'"{value}"'
    if isinstance(value, str):
        return f"{quotes}{value}{quotes}"
    elif isinstance(value, bool):
        return "true" if value else "false"
    elif value is None:
        return "null"
    return value


def simple_type(schema):
    """Return the simple type of a schema.

    :param schema: The schema to extract the type from
    :return: The simple type name
    """
    type_name = schema.get("type")
    type_format = schema.get("format")

    if type_name == "integer":
        return {
            "int32": "Integer",
            "int64": "Long",
            None: "Integer",
        }[type_format]

    if type_name == "number":
        return {
            "double": "Double",
            None: "Integer",
        }[type_format]

    if type_name == "string":
        return {
            "date": "OffsetDateTime",
            "date-time": "OffsetDateTime",
            "email": "String",
            "binary": "File",
            None: "String",
        }[type_format]
    if type_name == "boolean":
        return "Boolean"

    return None


def escape_html(text):
    if not text:
        return ""
    text = " ".join(text.splitlines())
    return "".join(HTML_ESCAPE_CHARACTERS.get(c, c) for c in text)


def format_parameters(kwargs, spec, replace_values=None, has_body=False):
    parameters_spec = {p["name"]: p for p in spec.get("parameters", [])}
    required_parameters = ""
    optional_parameters = ""
    has_optional = False
    imports = set()

    parameters_spec = {p["name"]: p for p in spec.get("parameters", [])}
    if "requestBody" in spec and "multipart/form-data" in spec["requestBody"]["content"]:
        parent = spec["requestBody"]["content"]["multipart/form-data"]["schema"]
        for name, schema in parent["properties"].items():
            parameters_spec[name] = {
                "in": "form",
                "schema": schema,
                "name": name,
                "description": schema.get("description"),
                "required": name in parent.get("required", []),
            }

    for p in parameters_spec.values():
        required = p.get("required", False)
        if required:
            k = p["name"]
            v = kwargs.pop(k)  # otherwise there is a missing required parameters
            _, parameters, extra_imports = format_data_with_schema(
                v["value"],
                p["schema"],
                replace_values=replace_values,
            )
            imports |= extra_imports
            required_parameters += f", {parameters}" if required_parameters else parameters
        else:
            has_optional = True

    body_is_required = spec.get("requestBody", {"required": None}).get("required", False)
    if has_body and body_is_required:
        required_parameters += ", body" if required_parameters else "body"
    elif has_body and not body_is_required:
        if not optional_parameters:
            optional_parameters = f"new {spec.get('operationId')}OptionalParameters()"
        optional_parameters += ".body(body)"

    if has_optional:
        for k, v in kwargs.items():
            _, parameters, extra_imports = format_data_with_schema(
                v["value"],
                parameters_spec[k]["schema"],
                replace_values=replace_values,
            )
            if not optional_parameters:
                optional_parameters = f"new {spec.get('operationId')}OptionalParameters()"
            imports |= extra_imports
            optional_parameters += f".{untitle_case(camel_case(k))}({parameters})"
    return required_parameters, optional_parameters, imports


def get_name_and_imports(schema):
    imports = set()

    name = None
    if hasattr(schema, "__reference__"):
        name = schema.__reference__["$ref"].split("/")[-1]
        schema_type = schema.get("type")
        if schema_type == "array":
            if hasattr(schema["items"], "__reference__"):
                name = schema["items"].__reference__["$ref"].split("/")[-1]
                imports.add(name)
                name = f"List<{name}>"
            return name, imports
        if schema_type == "string":
            if schema.get("enum"):
                imports.add(name)
            return name, imports

        if "additionalProperties" not in schema or not schema["additionalProperties"]:
            imports.add(name)

    return name, imports


@singledispatch
def format_data_with_schema(
    data,
    schema,
    replace_values=None,
    default_name=None,
):
    name, imports = get_name_and_imports(schema)

    if "enum" in schema and data not in schema["enum"]:
        raise ValueError(f"{data} is not valid enum value {schema['enum']}")

    if replace_values and data in replace_values:
        parameters = replace_values[data]
        # date time is currently retrieved as a Long. We need to convert it to a double
        if isinstance(parameters, str) and schema.get("format") == "double":
            parameters = f"Long.valueOf({parameters}).doubleValue()"
    else:
        if schema.get("nullable") and data is None:
            parameters = "null"
        else:

            def format_string(x):
                if isinstance(x, str) and ("\n" in x or '"' in x):
                    return f'"""\n{x}\n"""'
                return f'"{x}"' if x else '""'

            def format_datetime(x):
                return f"OffsetDateTime.parse({format_string(x)})"

            schema = schema.copy()

            def format_interface(x):
                if isinstance(x, int):
                    return str(x)
                if isinstance(x, float):
                    return str(x)
                if isinstance(x, str):
                    return format_string(x)
                raise TypeError(f"{x} is not supported type {schema}")

            def format_bool(x):
                if not isinstance(x, bool):
                    raise TypeError(f"{x} is not supported type {schema}")
                return "true" if x else "false"

            def open_file(x):
                return f"new File({format_string(x)})"

            formatter = {
                "int32": lambda x: str(int(x)),
                "int64": lambda x: str(int(x)) + "L",
                "double": float,
                "date-time": format_datetime,
                "number": str,
                "integer": str,
                "boolean": format_bool,
                "string": format_string,
                "email": format_string,
                "binary": open_file,
                None: format_interface,
            }[schema.get("format", schema.get("type"))]

            parameters = formatter(data)

    if "enum" in schema and name:
        # find schema index and get name from x-enum-varnames
        index = schema["enum"].index(data)
        enum_varnames = schema["x-enum-varnames"][index]
        parameters = f"{name}.{enum_varnames}"
        imports.add(name)
        # TODO handle nullable enums if necessary and replaced data
        # parameters = f"{name}.fromValue({parameters})"

    if schema.get("nullable") and schema.get("type") is not None:
        return name, parameters, imports

    if "oneOf" in schema:
        assert name is not None
        matched = 0
        extra_imports = one_of_imports = set()
        for sub_schema in schema["oneOf"]:
            try:
                if sub_schema.get("nullable") and data is None:
                    # only one schema can be nullable
                    value = "null"
                else:
                    sub_schema["nullable"] = False
                    named, value, one_of_imports = format_data_with_schema(
                        data,
                        sub_schema,
                        replace_values=replace_values,
                    )
                if matched == 0:
                    # NOTE we do not support mixed schemas with oneOf
                    # parameters += formatted
                    parameters = value
                    extra_imports = one_of_imports
                matched += 1
            except (KeyError, ValueError, TypeError) as e:
                print(f"{e}")

        if matched == 0:
            raise ValueError(f"[{matched}] {data} is not valid for schema {name}")
        elif matched > 1:
            warnings.warn(f"[{matched}] {data} is not valid for schema {name}")

        imports |= extra_imports
        return name, f"new {name}(\n{parameters})", imports

    return name, parameters, imports


@format_data_with_schema.register(list)
def format_data_with_schema_list(
    data,
    schema,
    replace_values=None,
    default_name=None,
):
    name, imports = get_name_and_imports(schema)

    parameters = ""
    param_count = 0
    for d in data:
        _, value, extra_imports = format_data_with_schema(
            d,
            schema["items"],
            replace_values=replace_values,
            default_name=name,
        )

        parameters += f", {value}" if parameters else f"{value}"
        param_count += 1
        imports |= extra_imports

    if param_count > 1:
        parameters = f"Arrays.asList({parameters})"
    elif param_count == 1:
        parameters = f"Collections.singletonList({parameters})"

    return name, parameters, imports


@format_data_with_schema.register(dict)
def format_data_with_schema_dict(
    data,
    schema,
    replace_values=None,
    default_name=None,
):
    name, imports = get_name_and_imports(schema)

    if "properties" in schema:
        assert not schema.get("additionalProperties")
        assert "oneOf" not in schema

        if name is None:
            name = default_name
        parameters = f"new {name}()"

        for k, v in data.items():
            r, value, extra_imports = format_data_with_schema(
                v,
                schema["properties"][k],
                replace_values=replace_values,
                default_name=name + camel_case(k) if name else None,
            )
            if value:
                parameters += f"\n.{escape_reserved_keyword(untitle_case(camel_case(k)))}({value})"
                imports |= extra_imports

        if name not in imports:
            imports.add(name)

        return name, parameters, imports

    if schema.get("additionalProperties"):
        assert "oneOf" not in schema

        parameters = ""
        for k, v in data.items():
            r, value, extra_imports = format_data_with_schema(
                v,
                schema["additionalProperties"],
                replace_values=replace_values,
                default_name=name + untitle_case(camel_case(k)) if name else None,
            )
            parameters += f'Map.entry("{k}", {value}),'
            imports |= extra_imports

        # imports.add("java.util.Map")
        return (
            "Map<String, {}>".format(openapi.type_to_java(schema["additionalProperties"])),
            f"Map.ofEntries({parameters.rstrip(',')})",
            imports,
        )

    if "oneOf" in schema:
        assert name is not None
        matched = 0
        extra_imports = one_of_imports = set()
        for sub_schema in schema["oneOf"]:
            try:
                if sub_schema.get("nullable") and data is None:
                    # only one schema can be nullable
                    value = "null"
                else:
                    sub_schema["nullable"] = False
                    named, value, one_of_imports = format_data_with_schema(
                        data,
                        sub_schema,
                        replace_values=replace_values,
                    )
                if matched == 0:
                    # NOTE we do not support mixed schemas with oneOf
                    # parameters += formatted
                    parameters = value
                    extra_imports = one_of_imports
                matched += 1
            except (KeyError, ValueError) as e:
                print(f"{e}")

        if matched == 0:
            raise ValueError(f"[{matched}] {data} is not valid for schema {name}")
        elif matched > 1:
            warnings.warn(f"[{matched}] {data} is not valid for schema {name}")

        imports |= extra_imports
        return name, f"new {name}(\n{parameters})", imports

    # NOTE this is a special case for unnamed objects that should be avoided in the future
    if schema.get("type") == "object" and not data:
        return None, "new Object()", set()

    raise ValueError(f"{data} is not valid for schema {name}")


def get_response_type(schema, version):
    if "content" not in schema:
        return None, None

    response_schema = list(schema["content"].values())[0]["schema"]
    if response_schema.get("format") == "binary":
        return "File", "java.io.File"

    if response_schema.get("type") == "array":
        nested_schema = response_schema.get("items")
        name = schema_name(nested_schema)
        if name:
            api_response_type = f"List<{name}>"
        else:
            api_response_type = f"List<{simple_type(nested_schema)}>"
    else:
        name = schema_name(response_schema)
        if name:
            api_response_type = name
        else:
            api_response_type = simple_type(response_schema)

    if name:
        return api_response_type, f"com.datadog.api.{version}.client.model.{name}"
    return api_response_type, None

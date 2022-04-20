"""Data formatter."""
import re
import json
from html import escape

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


def block_comment(comment, prefix="#", first_line=True):
    lines = comment.split("\n")
    start = "" if first_line else lines[0] + "\n"
    return (start + "\n".join(f"{prefix} {line}".rstrip() for line in lines[(0 if first_line else 1) :])).rstrip()


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

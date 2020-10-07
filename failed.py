# coding: utf-8
import pathlib
import subprocess
import sys

from junitparser import JUnitXml

print('mvn test -Dtest=ScenariosTest -Dcucumber.features="@target/rerun.txt" -DfailIfNoTests=false')

for path in pathlib.Path('target').rglob('TEST-*.xml'):
    try:
        for suite in JUnitXml.fromfile(str(path)):
            if suite.result is not None and suite.result._tag != 'skipped':
                print('mvn', 'test', f'-Dtest="{suite.classname}#{suite.name}"')
    except Exception as e:
        print(f'{e}: {path}', file=sys.stderr)

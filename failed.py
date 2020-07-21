# coding: utf-8
import pathlib
import subprocess

from junitparser import JUnitXml

for path in pathlib.Path('target').rglob('TEST-*.xml'):
    for suite in JUnitXml.fromfile(path):
        if suite.result is not None and suite.result._tag != 'skipped':
            print('mvn', 'test', f'-Dtest={suite.classname}#{suite.name}')
            # subprocess.run(['mvn', 'test', f'-Dtest={suite.classname}'], shell=True, check=True)

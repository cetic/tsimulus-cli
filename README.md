[![License](http://img.shields.io/:license-Apache%202-red.svg)](http://www.apache.org/licenses/LICENSE-2.0.txt)

# rts-gen-cli
A CLI application generating random and realistic time series.

# Description

This application uses the [Realistic Time Series Generator](https://github.com/cetic/rts-gen) library for generating time series values. 

# How to use it?

1. Download it. You will only need a [Java Virtual Machine](https://java.com), since all the dependencies of this application are included in the downloadable JAR file. Alternativelly, you can also package it from the source code available on this Git repository, and then execute it: 

```bash
> sbt package
```

2. Run it. You have to provide the path to a generator configuration file (have a look at the [library documentation](http://rts-gen.readthedocs.io/en/master/) for more details and examples):

```bash
> java -jar rts-gen-cli.jar configuration.json
```

Alternativelly, you can directly run it using SBT:

```bash
> sbt run configuration.json
```


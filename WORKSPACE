kotlin_release_version="1.2.30"
rules_kotlin_version = "67f4a6050584730ebae7f8a40435a209f8e0b48e"

http_archive(
    name = "io_bazel_rules_kotlin",
    urls = ["https://github.com/bazelbuild/rules_kotlin/archive/%s.zip" % rules_kotlin_version],
    type = "zip",
    strip_prefix = "rules_kotlin-%s" % rules_kotlin_version
)

load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kotlin_repositories", "kt_register_toolchains")
kotlin_repositories(kotlin_release_version=kotlin_release_version)
kt_register_toolchains()

maven_jar(
    name = "junit_junit",
    artifact = "junit:junit:4.12",
    repository = "maven_central",
)

maven_server(
    name = "maven_central",
    url = "http://repo1.maven.org/maven2/",
)

maven_server(
    name = "sics_releases",
    url = "scpexe://kompics.i.sics.se/home/maven/repository",
)

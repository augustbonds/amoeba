java_library(
    name = "dalimplmysql",
    srcs = glob(["dalimplmysql/**/*.java"]),
    deps = ["//hops-metadata-dal:hops_metadata_dal"],
)

java_test(
    name = "dalimplmysql-test",
    size = "small",
    srcs = glob(["test/*.java"]),
    test_class = "com.augustbonds.dalimplmysql.Tests",
    deps = ["@junit_junit//jar", "//hops-metadata-dal:hops_metadata_dal", ":dalimplmysql"],
)
